package com.company;

public class pr6_1 extends Thread{
    public void fun() {

        System.out.println("This program is prepared by 21CE099_MOKSH>>");
    }

    public static void main(String[] args) {

        pr6_1 p = new pr6_1();

        p.start();

    }
}
