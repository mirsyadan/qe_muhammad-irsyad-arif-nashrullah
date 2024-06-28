import { remote } from "webdriverio";
import "dotenv/config";

const capabilities = {
  platformName: process.env.PLATFORM_NAME,
  "appium:devicename": process.env.DEVICE_NAME,
  "appium:app": process.env.APP_DIR,
  "appium:automationName": process.env.AUTOMATION_NAME,
  "appium:autoGrantPermissions": process.env.AUTO_GRANT_PERMISSION,
};

const wdOpts = {
  hostname: process.env.APPIUM_HOST || "127.0.0.1",
  port: parseInt(process.env.APPIUM_PORT, 10) || 4723,
  logLevel: "info",
  capabilities,
};

export default async function initDriver() {
  try {
    const driver = await remote(wdOpts);
    return driver;
  } catch (error) {
    console.error(error);
  }
}
