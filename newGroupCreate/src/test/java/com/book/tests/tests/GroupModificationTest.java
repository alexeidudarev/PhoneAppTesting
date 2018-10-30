package com.book.tests.tests;

import com.book.tests.model.NewGroup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupModificationTest extends  TestBase {

    @Test(priority = 1)
    public void modifyGroupTest(){

        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getNumberOfGroups();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().groupApdate(new NewGroup()
               .setGroupName("modified name")
               .setGroupHeader("new header")
               .setGroupFooter("new footer"));
        app.getGroupHelper().submitChanges();
        app.getNavigationHelper().goToGroupPage();
        int after = app.getGroupHelper().getNumberOfGroups();
        System.out.println("before: "+before+" ,after : "+after);
        Assert.assertEquals(after,before);


    }
}
