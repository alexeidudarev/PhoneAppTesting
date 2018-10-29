package com.book.tests.tests;

import com.book.tests.model.NewGroup;
import org.testng.Assert;
import org.testng.annotations.*;

public class AdressBookGroupCreation extends TestBase {


  @Test
  protected void testAdressBookGroupCreation() {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getNumberOfGroups();
    app.getGroupHelper().newGroupCreation(new NewGroup()
            .setGroupFooter("1")
            .setGroupHeader("1")
            .setGroupName("1"));
    app.getNavigationHelper().goToGroupPage();
    int after = app.getGroupHelper().getNumberOfGroups();
    Assert.assertEquals(after,before+1);

  }


}
