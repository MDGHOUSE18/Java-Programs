package DS;

import java.util.Collection;

import Patterens.number;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
    
}
public class Linkedlist {

    Node head;

    //Adding the data
    public void append(int data){
        Node new_node=new Node(data);

        if (head==null) {
            head=new_node;
        }else{
            Node current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=new_node;
        }
    }

    //print list
    public void display(){
        if (head==null) {
            System.out.println("lsit is empty");
            return;
        }

        Node current= head;

        while (current!=null) {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        Linkedlist list= new Linkedlist();
        // list.display();
        list.append(10);
        list.append(20);

        list.display();
    }

    
}