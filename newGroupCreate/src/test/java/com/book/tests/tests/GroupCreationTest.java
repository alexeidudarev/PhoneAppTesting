package com.book.tests.tests;

import com.book.tests.model.NewGroup;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GroupCreationTest extends TestBase {

  @DataProvider
  public Iterator<Object[]>validGroups() throws IOException {
    List<Object[]>list= new ArrayList<>();
    BufferedReader reader = new BufferedReader(
            new FileReader(new File("src/test/resources/groups.csv")));
    String line = reader.readLine();
    while (line!=null){
      String[]split = line.split(";");
      list.add(new Object[]{new NewGroup()
              .setGroupName(split[0])
              .setGroupHeader(split[1])
              .setGroupFooter(split[2])});
      line = reader.readLine();
    }
    return list.iterator();
  }

  @Test(dataProvider = "validGroups")
  protected void groupCreationTest(NewGroup group) {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getNumberOfGroups();
    app.getGroupHelper().newGroupCreation(group);
    app.getNavigationHelper().goToGroupPage();
    int after = app.getGroupHelper().getNumberOfGroups();
    Assert.assertEquals(after,before+1);

  }


}
