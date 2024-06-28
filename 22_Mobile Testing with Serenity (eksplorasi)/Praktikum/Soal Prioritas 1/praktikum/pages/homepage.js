import BasePage from "./base.js";
import { By, until } from 'selenium-webdriver'; // Mengimpor modul yang diperlukan dari selenium-webdriver

const timeout = 5000;

export default class HomePage extends BasePage {
  constructor(driver) {
    super(driver);
    this.driver = driver; // Menyimpan driver yang diteruskan ke kelas
  }

  async getHomePageTitle() {
    // Gunakan this.driver untuk mengakses driver yang diteruskan
    const titleComponent = await this.driver.wait(until.elementLocated(By.xpath('//android.widget.TextView[@text="Android NewLine Learning"]')), timeout);
    const title = await titleComponent.getAttribute("text");
    return title;
  }
}
