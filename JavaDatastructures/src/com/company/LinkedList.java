package com.company;

public class LinkedList {

    Node head;

    public void insertEnd(int data){

        Node node = new Node();
        node.data = data;

        if (head == null){
            head = node;
        }
        else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }

                temp.next = node;
                temp.next.next = null;
        }
    }

    public void print(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+"->"+" ");
            node = node.next;
        }
        System.out.println();
    }

    public void insertBegining(int data){
        Node node = new  Node();
        node.data = data;
        node.next = head;
        head = node;

    }

    public int getLength(){

    }

    public void insert(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        int count =0;
        Node n = head;
        while(count != index-1){
            n = n.next;

        }

    }
}
