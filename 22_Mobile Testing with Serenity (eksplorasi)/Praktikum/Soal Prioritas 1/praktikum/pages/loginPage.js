// File: LoginPage.js
import BasePage from "./base.js";
import { By, until } from 'selenium-webdriver';

export default class LoginPage extends BasePage {
  constructor(driver) {
    super(driver);
    this.driver = driver; // Menyimpan driver yang diteruskan ke kelas
  }

  async getTitle() {
    const titleComponent = await this.find(
      '//android.widget.TextView[@text="VERSION - V4"]'
    );
    const title = await titleComponent.getAttribute("text");
    return title;
  }

  async getEmailField() {
    const emailFieldComponent = await this.find(
      '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]'
    );
    const emailField = await emailFieldComponent.getAttribute("resource-id");
    return emailField;
  }

  async setEmail(email) {
    const emailFieldLocator = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]';
    await this.type(emailFieldLocator, email);
  }

  async getPasswordField() {
    const passwordFieldComponent = await this.find(
      '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextPassword"]'
    );
    const passwordField = await passwordFieldComponent.getAttribute("resource-id");
    return passwordField;
  }

  async setPassword(password) {
    const passwordFieldLocator = '//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextPassword"]';
    await this.type(passwordFieldLocator, password);
  }

  async tapLoginButton() {
    await this.click(
      '//android.widget.Button[@resource-id="com.loginmodule.learning:id/appCompatButtonLogin"]'
    );
  }

  async errorMessageElement() {
    try {
      // Tunggu hingga pesan kesalahan validasi muncul
      await this.driver.wait(until.elementLocated(By.xpath('//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]/following-sibling::android.widget.TextView[@resource-id="com.loginmodule.learning:id/textinput_error"]')), 10000);

      // Jika elemen ditemukan, dapatkan teks pesan kesalahan
      const errorMessageElement = await this.driver.findElement(By.xpath('//android.widget.EditText[@resource-id="com.loginmodule.learning:id/textInputEditTextEmail"]/following-sibling::android.widget.TextView[@resource-id="com.loginmodule.learning:id/textinput_error"]'));
      const errorMessage = await errorMessageElement.getAttribute("text");

      // Kembalikan pesan kesalahan
      return errorMessage;
    } catch (error) {
      // Tangkap dan logika jika elemen tidak ditemukan
      console.error("Error occurred while getting error message:", error);
      throw error; // Dilempar kembali untuk penanganan di tempat pemanggilan
    }
  }

  async validateInvalidEmailAndPass() {
    const errorMessageInvalidEmailAndPass = await this.find(
      '//android.widget.ScrollView[@resource-id="com.loginmodule.learning:id/nestedScrollView"]/android.support.v7.widget.LinearLayoutCompat'
    );
    const invalidEmailAndPass = await errorMessageInvalidEmailAndPass.getAttribute("text");
    return invalidEmailAndPass;
  }

  async getCreateAcountText() {
    const createAccountText = await this.find(
      '//android.widget.TextView[@resource-id="com.loginmodule.learning:id/textViewLinkRegister"]'
    );
    const validateCreateAccountText = await createAccountText.getAttribute("resource-id");
    return validateCreateAccountText;
  }

  async tapCreateAccountText() {
    await this.click('//android.widget.TextView[@resource-id="com.loginmodule.learning:id/textViewLinkRegister"]');
  }
}
