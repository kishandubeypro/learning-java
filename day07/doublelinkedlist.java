package day07;
import java.util.*;
public class doublelinkedlist {
    

    static node head;
    static node tail;
    void insertlast(int data){
        node newNode = new node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void display(){
        if(head == null){
            System.out.println("List is empty");
            return ;
        }
        node temp = head;
        while (temp!=null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublelinkedlist ob= new doublelinkedlist();
        ob.insertlast(10);
        ob.insertlast(20);
        ob.insertlast(30);

        ob.display();
    }
}

