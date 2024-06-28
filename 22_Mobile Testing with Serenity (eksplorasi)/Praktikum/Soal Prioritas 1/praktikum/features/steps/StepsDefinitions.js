import { Given, Then, Before, After, When } from "@cucumber/cucumber";
import assert from "assert";
import initDriver from "../../configs/driver.js";
import LoginPage from "../../pages/loginPage.js";
import RegisterPage from "../../pages/registerPage.js";
import HomePage from "../../pages/homePage.js";

let driver;
let loginPage;
let registerPage;
let homepage;

Before({ timeout: 90000 }, async () => {
  try {
    driver = await initDriver();
    loginPage = new LoginPage(driver);
    registerPage = new RegisterPage(driver);
    homepage = new HomePage(driver);
  } catch (error) {
    console.error(error);
  }
});

// Login With Valid Email
Given("I am on the login page", async () => {
  const loginTitle = await loginPage.getTitle();
  assert.equal(loginTitle, "VERSION - V4");
});

When("I input email field with valid credentials", async () => {
  const inputValidEmail = "firman@gmail.com";
  await loginPage.setEmail(inputValidEmail);
});

Then("I input password field with valid credentials", async () => {
  const inputValidPass = "kiwkiw";
  await loginPage.setPassword(inputValidPass);
});

Then("I click login button", async () => {
  await loginPage.tapLoginButton();
});

Then('I am on the homepage', { timeout: 40000 }, async function () {
  // Mendapatkan driver dari konteks World
  const driver = this.driver;

  // Membuat instansi HomePage dan meneruskan driver
  const homepage = new HomePage(driver);

  try {
    // Mendapatkan judul halaman
    const homePageTitle = await homepage.getHomePageTitle();

    // Melakukan pengecekan judul halaman
    if (homePageTitle === "Android NewLine Learning") {
      console.log("Successfully on the homepage.");
    } else {
      console.log("The homepage title does not match the expected title.");
    }
  } catch (error) {
    console.error("Error occurred while checking the homepage:", error);
  }
});

// LOGIN WITH NEGATIVE SCENARIO
// Login with all fields empty
Then('I should see an error message indicate enter valid email', { timeout: 10000 }, async function () {
  try {
    // Tunggu hingga pesan kesalahan validasi muncul
    const errorMessage = await loginPage.errorMessageElement();

    // Verifikasi pesan kesalahan
    assert.equal(errorMessage, "Enter Valid Email", "Error message doesn't match expected message.");
    console.log("Successfully validated error message.");
  } catch (error) {
    console.error("Error occurred while validating error message:", error);
    throw error; // Dilempar kembali untuk penanganan di tempat pemanggilan
  }
});


// Login with invalid email and password
When("I input email field with invalid data", async () => {
  const inputInValidEmail = "firman!@gmsil.com";
  await loginPage.setEmail(inputInValidEmail);
});

Then("I input password field with invalid data", async () => {
  const inputInValidPass = "kiwkaw";
  await loginPage.setPassword(inputInValidPass);
});

Then("I should see an error message indicate wrong email or password", { timeout: 10000 }, async () => {
  const invalidEmailAndPass = await loginPage.validateInvalidEmailAndPass();
  assert.equal(invalidEmailAndPass, "Wrong Email or Password");
});

// Register Valid Data
When("I see create account text", async () => {
  const seeCreateAccountText = await loginPage.getCreateAcountText();
  assert.ok(seeCreateAccountText, "Create Account text is visible on the page");
});

Then("I click create account", async () => {
  await loginPage.tapCreateAccountText();
});

Then("I am on the register page", async () => {
  const createAccountText = await registerPage.getRegisterPageButton();
  assert.ok(createAccountText, "Register button is visible on the page");
});

Then("I input my name with valid credentials", async () => {
  const inputName = "Rezki Fauzi Firmansyah";
  await registerPage.insertName(inputName);
});

Then("I input my email with valid credentials", async () => {
  const inputEmail = "firman@gmail.com";
  await registerPage.insertEmail(inputEmail);
});

Then("I input my password with valid credentials", async () => {
  const inputPassword = "kiwkiw";
  await registerPage.insertPassword(inputPassword);
});
Then("I confirm my password with valid credentials", { timeout: 40000 }, async () => {
  const inputPassword = "kiwkiw";
  try {
    await registerPage.insertConfirmPassword(inputPassword);
  } catch (error) {
    console.error("Error occurred while confirming password:", error);
    throw error;
  }
});

Then("I click register button", async () => {
  await registerPage.tapRegisterButton();
});

Then("I see a pop-up message indicating register success", { timeout: 10000 }, async () => {
  const successNotificationResourceId = await registerPage.getRegisterSuccessNotification();
  assert.ok(successNotificationResourceId, "Register success notification is visible.");
});

// Register All Fields Empty
When("I click register button without filling any fields", async () => {
  await registerPage.tapRegisterButton();
});

Then("I see an error message indicating to enter full name first", { timeout: 10000 }, async () => {
  const errorMessage = await registerPage.validateErrorMessageAllFieldEmpty();
  assert.equal(errorMessage, "Enter Full Name");
});

// Register with wrong format email
Then("I input my email with invalid format", async () => {
  const inputWrongEmail = "firman1!@gmail.com";
  await registerPage.insertEmail(inputWrongEmail);
});

Then("I see an error message indicate please enter valid email", { timeout: 10000 }, async () => {
  const errorMessageInvalidEmail = await registerPage.validateErrorMessageInvalidFormatEmail();
  assert.equal(errorMessageInvalidEmail, "Enter Valid Email");
});

After(async () => {
  await driver.deleteSession();
});
