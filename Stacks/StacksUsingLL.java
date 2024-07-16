import java.util.*;
public class StacksUsingLL{
    public static class Node{
        int data;
        Node next;

        Node( int data){
           this.data = data;
           this.next = null;
        }
     
    }

public static class StacksFun{
   static Node head = null;

   public  static boolean isEmpty(){
    return head == null;
   }

   //push
   public static void push(int data){
    Node newNode = new Node( data);
    if(isEmpty()){
        head = newNode;
        return;
    }
    newNode.next = head;
     head = newNode;
   }

   //pop
   public static int pop(){
       if(isEmpty()){
        return -1;
       }
       int val = head.data;
       head = head.next;
       return val;

   }

   public static int peek(){
    if(isEmpty()){
        return -1;
    }
      int val = head.data;
       return val;
   }
}
    public static void main(String args[]){
        //JCF
    Stack<Integer> s = new Stack<>();
    s.push(2);
    s.push(1);
    s.push(0);
    s.push(-1);
    while(!s.isEmpty()){
       System.out.println(s.peek());
       s.pop();
    }
    }
}