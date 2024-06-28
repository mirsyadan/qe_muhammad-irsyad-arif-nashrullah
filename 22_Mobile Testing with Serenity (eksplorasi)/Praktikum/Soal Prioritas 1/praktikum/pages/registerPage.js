import BasePage from "./base.js";
import { By, until } from 'selenium-webdriver';


export default class RegisterPage extends BasePage {
  constructor(driver) {
    super(driver);
    this.driver = driver; // Menyimpan driver yang diteruskan ke kelas

  }

  async getRegisterPageButton() {
    const registerPageButton = await this.find(
      '//android.widget.Button[@resource-id="com.loginmodule.learning:id/appCompatButtonRegister"]'
    );

    const validateRegisterButton = await registerPageButton.getAttribute("resource-id");
    return validateRegisterButton;
  }

  async insertName(name) {
    const nameElement = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextName"]';
    await this.click(nameElement);
    await this.type(nameElement, name);
  }

  async insertEmail(email) {
    const emailElement = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]';
    await this.click(emailElement);
    await this.type(emailElement, email);
  }

  async insertPassword(password) {
    const passwordElement = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextPassword"]';
    await this.click(passwordElement);
    await this.type(passwordElement, password);
  }
  async insertConfirmPassword(password) {
    try {
      const passwordElementLocator = By.xpath('//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextConfirmPassword"]');
      const passwordElement = await this.driver.findElement(passwordElementLocator);
      await passwordElement.click(); // Klik pada elemen password terlebih dahulu
      await passwordElement.sendKeys(password); // Masukkan password
    } catch (error) {
      console.error("Error occurred while inserting confirm password:", error);
      throw error;
    }
  }

  
  async tapRegisterButton() {
    await this.click('//android.widget.Button[@resource-id="com.loginmodule.learning:id/appCompatButtonRegister"]');
  }

  async getRegisterSuccessNotification() {
    const popUpConfirmation = await this.find(
      '//android.widget.TextView[@resource-id="com.loginmodule.learning:id/snackbar_text"]'
    );
    const validateSuccessNotification = await popUpConfirmation.getAttribute("resource-id");
    return validateSuccessNotification;
  }

  async validateErrorMessageAllFieldEmpty() {
    const errorMessageFieldEmpty = await this.find(
      '//android.widget.TextView[@text="Enter Full Name"]'
    );
    const errorMessage = await errorMessageFieldEmpty.getAttribute("text");
    return errorMessage;
  }

  async validateErrorMessageInvalidFormatEmail() {
    const errorMessageInvalidEmail = await this.find(
      '//android.widget.TextView[@text="Enter Valid Email"]'
    );

    const errorMessage = await errorMessageInvalidEmail.getAttribute("text");
    return errorMessage;
  }
}
