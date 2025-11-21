package org.example;

import java.util.Scanner;

class MyBat {
    enum MyBatSize {SMALL, MEDIUM, LARGE};
    MyBatSize size;


}

public class Main {
    public static void main(String[] args) {
    MyBat myBat = new MyBat();

    myBat.size = MyBat.MyBatSize.SMALL;
    System.out.println(myBat.size);//
    }
}