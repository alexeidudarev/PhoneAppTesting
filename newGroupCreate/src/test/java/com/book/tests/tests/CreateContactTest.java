package com.book.tests.tests;

import com.book.tests.model.Contact;
import com.sun.jndi.toolkit.url.Uri;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;


public class CreateContactTest extends TestBase {

    private File photo;

    @Test(enabled = false)
    public void createNewContact(){
        photo = new File("/Users/alexeidudarev/Documents/java " +
                "training 2018/AddressBookTesting/newGroupCreate/src/test" +
                "/resources/cat.jpg");
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getNumberOfContacts();
        app.getNavigationHelper().goToCreateNewContact();
        app.getContactHelper().newContactCreation(new Contact()
                .setName("alex")
                .setMiddleName("al")
                .setFamilyName("moroz")
                .setAdress("New York")
                .setPhoto(photo));
        int after = app.getContactHelper().getNumberOfContacts();
        Assert.assertEquals(after,before+1);

    }
    //name of group should be of existing group only
    //test for drop down list
    @Test(enabled = true)
    public void createNewContactWithGroup(){
        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getNumberOfContacts();
        app.getNavigationHelper().goToCreateNewContact();
        app.getContactHelper().newContactCreation(new Contact()
                .setName("alex")
                .setMiddleName("al")
                .setFamilyName("moroz")
                .setAdress("New York")
                .setGroup("1"));//name of group should be of existing group only
        int after = app.getContactHelper().getNumberOfContacts();
        Assert.assertEquals(after,before+1);

    }
}
