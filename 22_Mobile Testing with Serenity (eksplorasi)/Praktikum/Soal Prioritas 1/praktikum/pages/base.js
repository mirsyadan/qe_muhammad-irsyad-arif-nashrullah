export default class BasePage {
  constructor(driver) {
    this.driver = driver;
  }

  async find(locator) {
    const element = await this.driver.$(locator);
    return element;
  }

  async type(locator, text) {
    const element = await this.find(locator);
    await element.setValue(text);
  }

  async click(locator) {
    const element = await this.find(locator);
    await element.click();
  }  

  async clear(locator) {
    const element = await this.find(locator);
    await element.clearValue();
  }
}