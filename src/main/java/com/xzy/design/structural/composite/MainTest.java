package com.xzy.design.structural.composite;

public class MainTest {
    public static void main(String[] args) {
        Menu root = new Menu(1,"系统管理");
        Menu 角色管理 = new Menu(2, "角色管理");
        root.addChildMenu(角色管理);
        角色管理.addChildMenu(new Menu(6, "固定角色"));
        角色管理.addChildMenu(new Menu(7,"临时角色"));

        Menu 用户管理 = new Menu(3, "用户管理");
        root.addChildMenu(用户管理);

        用户管理.addChildMenu(new Menu(4, "临时用户"));
        用户管理.addChildMenu(new Menu(5,"固定用户"));

        root.printMenu();
    }
}
