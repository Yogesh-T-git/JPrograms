import java.util.*;

class Linkedlist<T>{
    Node head = null;

    class Node{
        T data;
        Node next;

        Node(T ch){
            data = ch;
            next = null;
        }
    }

    void insert(T d){
        Node new_node = new Node(d);
        if(head == null)
            head = new_node;
        else{
            Node temp = head;
            while(temp.next!=null) temp = temp.next;
            temp.next = new_node;
        }
    }

    void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }

    boolean c_pl(Node a, Node b){

        if(b == null) return true;
        boolean ans = c_pl(a, b.next);
        if(ans == false) return false;
        
        if(a.data != b.data) return false;
        a = a.next;
        return true;
        


    }

}



public class pll {
    public static void main(String[] args){
        Linkedlist<Character> ll = new Linkedlist<Character>();
        ll.insert('m');
        ll.insert('a');
        ll.insert('a');
        ll.insert('a');
        ll.insert('m');

        ll.display();

        Linkedlist.Node first = ll.head;
        Linkedlist.Node last = ll.head;

        System.out.println(ll.c_pl(first, last));

        


        




    }
    
}
