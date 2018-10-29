package com.book.tests.tests;

import com.book.tests.manager.AppManager;
import com.book.tests.model.User;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.fail;

public class TestBase {

    protected static AppManager app = new AppManager(System.getProperty("browser"
            ,BrowserType.CHROME));

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}

