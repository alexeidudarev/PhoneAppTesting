package com.book.tests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd){
        super(wd);
    }

    public void goToGroupPage() {
        if(isElementPresented(By.tagName("h1"))
                && driver.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresented(By.name("new"))){
        }else{
            click(By.xpath("//a[contains(text(),'groups')]"));
        }

    }

    public void goToCreateNewContact(){
        click(By.xpath("//a[@href='edit.php']"));
    }
    public void goToHomePage(){
        if(!isElementPresented(By.id("maintable"))){
           click(By.xpath("//a[@href='./']"));
        }
    }

}
