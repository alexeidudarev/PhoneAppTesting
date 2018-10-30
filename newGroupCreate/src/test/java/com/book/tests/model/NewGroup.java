package com.book.tests.model;

public class NewGroup {
    private String groupName;
    private String groupHeader;
    private String groupFooter;

    public NewGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public NewGroup setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
        return  this;
    }

    public NewGroup setGroupFooter(String groupFooter) {
        this.groupFooter = groupFooter;
        return this;
    }


    public String getGroupName() {
        return groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }
}
