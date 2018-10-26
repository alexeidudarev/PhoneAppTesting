package com.book.tests.manager;

import com.book.tests.model.Contact;
import com.book.tests.model.NewGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd){
        super(wd);
    }
    public void newContactCreation(Contact contact) {
        type(By.name("firstname"), contact.getName());
        type(By.name("middlename"), contact.getMiddleName());
        type(By.name("lastname"), contact.getFamilyName());
        type(By.name("address"),contact.getAdress());
        click(By.name("submit"));
    }
    public int getNumberOfContacts() {
        return  driver.findElements(By.xpath("//*[@name='selected[]']")).size();
    }


}