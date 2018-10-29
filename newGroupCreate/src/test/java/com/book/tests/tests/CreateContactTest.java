package com.book.tests.tests;

import com.book.tests.model.Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {

    @Test
    public void createNewContact(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getNumberOfContacts();
        app.getNavigationHelper().goToCreateNewContact();
        app.getContactHelper().newContactCreation(new Contact().setName("alex")
                .setMiddleName("al").setFamilyName("moroz").setAdress("New York"));
        int after = app.getContactHelper().getNumberOfContacts();
        Assert.assertEquals(after,before+1);

    }
}
