package com.book.tests.manager;

import com.book.tests.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    public WebDriver driver;

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

    public boolean isElementPresented(By locator) {
        try{
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException e){
            System.out.println("no such element exeption");
            return false;
        }

    }
}
