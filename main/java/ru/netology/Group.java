package ru.netology;

public enum Group {

    WORK("Работа"),
    FRIENDS("Друзья"),
    FAMILY("Семья");

    private final String groupName;

    Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}