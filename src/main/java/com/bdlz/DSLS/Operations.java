package com.bdlz.DSLS;

public class Operations {
    public static LinkedList addDataAtStart(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }
    public static void addDataAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
    public static void addDataAtMiddle(){
        LinkedList linkedList = new LinkedList();
        Node secondNode = linkedList.push(70);
        Node firstNode = linkedList.push(56);
        Node newNode = new Node(30);
        linkedList.print();
        linkedList.insertInBetween(firstNode, newNode);
        linkedList.print();
    }
    public static void deleteFirstNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.pop();
        linkedList.print();

    }

    public static void deleteLastNode() {
        LinkedList linkedList = addDataAtStart();
        linkedList.popLast();
        linkedList.print();

    }

    public static void findNodeBasedOnValue() {
        LinkedList linkedList = addDataAtStart();
        linkedList.findNode(30);
    }

    public static LinkedList InsertDataAtGivenNode() {
        LinkedList linkedList= addDataAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.searchNodeAt(30, newNode);
        System.out.println("Before");
        linkedList.print();
        return linkedList;
    }
    public static void DeleteAfterNodeAfterSearchNode() {
        System.out.println("Before");
        LinkedList linkedList = InsertDataAtGivenNode();
        System.out.println("after");
        linkedList.deleteANode(40);
        linkedList.print();
    }
    public static void sortList() {
        System.out.println("before sorting the list");
        LinkedList linkedList = InsertDataAtGivenNode();
        linkedList.sort();
        System.out.println("after sorting the list");
        linkedList.print();
    }
}
