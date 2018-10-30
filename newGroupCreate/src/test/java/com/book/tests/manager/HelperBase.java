package com.book.tests.manager;

import com.book.tests.model.User;
import org.openqa.selenium.*;

import java.io.File;

public class HelperBase {
    public WebDriver driver;
    private boolean acceptNextAlert = true;
    public HelperBase(WebDriver dr) {
        this.driver = dr;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
    public void clear(By locator) {
        driver.findElement(locator).clear();
    }
    public void type(By locator, String text) {
        click(locator);
        if(text!= null){
            String existText = driver.findElement(locator).getAttribute("value");
            if(!text.equals(existText)){
                clear(locator);
                driver.findElement(locator).sendKeys(text);
            }
        }

    }
    public void sendKeys(By locator , String text) {
        driver.findElement(locator).sendKeys(text );
    }

    public void attach(By locator, File file){
        if(file!=null){
            driver.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }

    public boolean isElementPresented(By locator) {
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            System.out.println("no such element exeption");
            return false;
        }

    }
    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
