package com.book.tests.tests;

import com.book.tests.model.NewGroup;
import com.book.tests.model.User;
import com.book.tests.tests.TestBase;
import org.testng.annotations.*;

public class AdressBookGroupCreation extends TestBase {


  @Test
  public void testAdressBookGroupCreation() throws Exception {
    app.loginWebSite();
    app.enterLoginCredentials(new User("Admin", "secret"));
    app.newGroupCreation(new NewGroup("1", "1", "1"));
    app.logout();
  }


}
