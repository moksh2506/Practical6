package com.company;
import java.util.Scanner;

class Increment extends Thread {
    int n;
    Increment(int n) {
        this.n = n;
    }

    public void run() {

        n += 1;
        try {
            sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After adding 1 --> Number = " + n);
    }
}


public class pr6_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        Thread t = new Increment(n);
        t.start();
        System.out.println("This program is prepared by 21CE099_MOKSH>>");
    }
}
