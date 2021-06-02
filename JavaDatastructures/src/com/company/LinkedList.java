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
        Node temp = head;
        int count=0;
        while(temp!=null){

            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public void insert(int index, int data){

        if((index<0) && (index > getLength())){
            System.out.println("Invalid Syntax");
            return;
        }
        else{

            if(index-1 == 0) {
                insertBegining(data);
            }
            else{
                Node node = new Node();
                node.data = data;
                int count = 0;
                Node n = head;
                while (count+1 != index-1) {

                    n = n.next;
                    count++;
                }

                node.next = n.next;
                n.next = node;
            }
        }

    }
}
