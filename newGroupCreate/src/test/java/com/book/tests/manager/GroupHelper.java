package com.book.tests.manager;

import com.book.tests.model.NewGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver dr) {
        super(dr);
    }

    public void newGroupCreation(NewGroup newGroup) {
        click(By.linkText("groups"));
        click(By.name("new"));
        type(By.name("group_name"), newGroup.getGroupName());
        type(By.name("group_header"), newGroup.getGroupHeader());
        type(By.name("group_footer"), newGroup.getGroupFooter());
        click(By.name("submit"));
    }

    public void groupApdate(NewGroup newGroup){

        type(By.name("group_name"), newGroup.getGroupName());
        type(By.name("group_header"), newGroup.getGroupHeader());
        type(By.name("group_footer"), newGroup.getGroupFooter());

    }


    public void submitChanges() {
        click(By.xpath("//input[@value='Update']"));

    }

    public void selectGroup() {
        click(By.xpath("//*[@name='selected[]']"));
        click(By.xpath("//*[@name='edit']"));

    }
    public int getNumberOfGroups() {
        return  driver.findElements(By.xpath("//*[@name='selected[]']")).size();
    }
    public boolean isGroupExist(){ return isElementPresented(By.name("selected[]")); }
    public void createNewDefaultGroup(){
        newGroupCreation(new NewGroup()
                .setGroupFooter("1")
                .setGroupHeader("1")
                .setGroupName("1"));

    }
}
