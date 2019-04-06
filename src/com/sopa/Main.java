package com.sopa;

public class Main {

    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        //[data][next]->[

        Node nodeB = new Node();
        nodeB.data = 5;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 69;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

    }

    public int listLength(Node aNode){
        int length = 0;
        Node currentNode = aNode;

        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }

        return length;

    }



}
