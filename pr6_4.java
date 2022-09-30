package com.company;

public class pr6_4 extends Thread{
    public void run() {

        System.out.println("Running--");
        System.out.println("This program is prepared by 21CE099_MOKSH>>");
    }

    public static void main(String args[]) {

        pr6_4 t1= new pr6_4();
        pr6_4 t2 = new pr6_4();
        pr6_4 t3 = new pr6_4();

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);

        System.out.println("Priority of thread t1 is: " + t1.getPriority());
        System.out.println("Priority of thread t2 is: " + t2.getPriority() + " [default]");
        System.out.println("Priority of thread t3 is: " + t3.getPriority());
        t1.start();
    }
}
