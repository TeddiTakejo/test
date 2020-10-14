package com.company;

class Node {
    String data;
    Node next;

    Node(String d) {
        data = d;
        next = null;
    }

}
class LinkedList{
    Node head;
    public void push(String new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public int solution(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}


