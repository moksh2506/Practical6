package com.company;
import java.util.*;

class Even extends Thread
{
    int arr[] = new int[50];
    Even(int [] arr)
    {
        for(int i=0;i<50;i++)
        {
            this.arr[i] = arr[i];
        }
    }

    @Override
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.println("Even Number: "+arr[i]);
            }
        }

    }
}

class Odd extends Thread{
    int arr[] = new int[50];
    Odd(int []arr)
    {
        for(int i=0;i<50;i++)
        {
            this.arr[i] = arr[i];
        }
    }
    @Override
    public void run()
    {
        for(int i=0;i<50;i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.println("Odd Number: "+arr[i]);
            }
        }
    }
}
public class pr6_2 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Random r = new Random();
        for(int i=0;i<50;i++)
        {
            arr[i] = r.nextInt(100);
        }
        Odd o = new Odd(arr);
        Even e = new Even(arr);
        o.start();
        e.start();
        System.out.println("This program is prepared by 21CE099_MOKSH>>");
    }
}