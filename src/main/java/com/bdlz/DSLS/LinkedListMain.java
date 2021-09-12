package com.bdlz.DSLS;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 to add the data at middle");
        System.out.println("Enter 4 to delete the first element");
        switch(scanner.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
            case 3:
                Operations.addDataAtMiddle();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
        }
    }
}
