package com.book.tests.tests;

import com.book.tests.manager.AppManager;
import com.book.tests.model.User;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.fail;

public class TestBase {

    protected final AppManager app = new AppManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}

