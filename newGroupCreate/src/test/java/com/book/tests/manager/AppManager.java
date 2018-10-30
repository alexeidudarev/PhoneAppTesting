package com.book.tests.manager;

import com.book.tests.model.User;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AppManager {

    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private ContactHelper contactHelper;
    private WebDriver driver;
    private String browser;
    private Properties properties;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    public AppManager(String browser) {
        this.browser = browser;
        properties = new Properties();
    }

    public void init() throws IOException {
        String target = System.getProperty("target","local");
        properties.load(new FileReader(String.format
                ("src/test/resources/%s.properties",target)));


        if(browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();
        }else if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        }else if(browser.equals(BrowserType.SAFARI)){
            driver = new SafariDriver();
        }

        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper = new ContactHelper(driver);
        sessionHelper.loginWebSite(properties.getProperty("web.baseUrl"));
        sessionHelper.enterLoginCredentials(new
                User(properties.getProperty("web.adminLogin"),
                properties.getProperty("web.adminPass")));
    }

    public void stop() {
        sessionHelper.logout();
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }



    public SessionHelper getSessionHelper() { return sessionHelper; }

    public GroupHelper getGroupHelper(){ return groupHelper; }

    public NavigationHelper getNavigationHelper(){ return  navigationHelper; }

    public ContactHelper getContactHelper(){ return contactHelper; }
}
