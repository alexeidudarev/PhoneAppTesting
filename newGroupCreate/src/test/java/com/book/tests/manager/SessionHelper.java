package com.book.tests.manager;

import com.book.tests.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver dr) {
        super(dr);
    }
    public void logout() {
        click(By.linkText("Logout"));
    }


    public void enterLoginCredentials(User user) {
        click(By.name("user"));
        clear(By.name("user"));
        sendKeys(By.name("user") ,user.getUserName());
        click(By.name("pass"));
        clear(By.name("pass"));
        sendKeys(By.name("pass"), user.getPassword());
        click(By.xpath("//input[@value='Login']"));
    }



    public void loginWebSite(String url) {
        driver.get(url);
    }

}
