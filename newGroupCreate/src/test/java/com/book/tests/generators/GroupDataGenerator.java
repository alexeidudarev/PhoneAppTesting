package com.book.tests.generators;

import com.book.tests.model.NewGroup;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class GroupDataGenerator {
    public static void main(String[]arg) throws IOException {
        int count = Integer.parseInt(arg[0]);
        File file = new File(arg[1]);
        List<NewGroup>groups = generateGroups(count);
        save(groups,file);
    }

    private static void save(List<NewGroup> groups, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for(NewGroup group:groups){
            writer.write(String.format("%s;%s;%s\n"
                    ,group.getGroupName()
                    ,group.getGroupHeader()
                    ,group.getGroupFooter()));
        }
        writer.close();
    }

    private static List<NewGroup> generateGroups(int count) {
        List<NewGroup> groups = new ArrayList<>();
        for (int i = 0; i < count ; i++) {
           groups.add(new NewGroup()
                   .setGroupName(String.format("name %s",i))
                   .setGroupHeader(String.format("header %s",i))
                   .setGroupFooter(String.format("footer %s ",i)));
        }
        return groups;
    }
}
