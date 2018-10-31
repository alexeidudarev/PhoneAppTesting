package com.book.tests.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "NewGroup{" +
                "groupName='" + groupName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewGroup newGroup = (NewGroup) o;
        return Objects.equals(groupName, newGroup.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName);
    }
}
