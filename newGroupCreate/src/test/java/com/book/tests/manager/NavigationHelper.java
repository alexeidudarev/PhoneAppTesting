package com.book.tests.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd){
        super(wd);
    }

    public void goToGroupPage() {
        click(By.xpath("//a[contains(text(),'groups')]"));

    }
    public void goToCreateNewContact(){
        click(By.xpath("//a[@href='edit.php']"));
    }

}
