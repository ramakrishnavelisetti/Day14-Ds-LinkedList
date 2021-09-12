package com.bdlz.DSLS;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to add the data at the end");
        System.out.println("Enter 3 to add the data at middle");
        System.out.println("Enter 4 to delete the first node");
        System.out.println("Enter 5 to delete the last node");
        System.out.println("Enter 6 to find index number and node based on value");
        System.out.println("Enter 7 to insert data at given node");
        System.out.println("Enter 8 to delete  after data after given node");
        System.out.println("Enter 9 to Sort the data in LinkedList");
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
            case 5:
                Operations.deleteLastNode();
                break;
            case 6:
                Operations.findNodeBasedOnValue();
                break;
            case 7:
                Operations.InsertDataAtGivenNode();
                break;
            case 8:
                Operations.DeleteAfterNodeAfterSearchNode();
                break;
            case 9:
                Operations.sortList();
        }
    }
}
