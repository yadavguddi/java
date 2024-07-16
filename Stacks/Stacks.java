import java.util.*;

public class Stacks{
  static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
       return list.size() == 0;
    }

    public static void push(int data){
       list.add(data);
    }

    public static int pop(){
        int val = list.get(list.size() -1);
        list.remove(list.size() -1);
        return val;
    }

    public static int peek(){
        return list.get(list.size() -1);
    }
  }
 public static void main(String args[]){
  Stack ss = new Stack();
  ss.push(1);
  ss.push(3);
  ss.push(8);

  while(!ss.isEmpty()){
    System.out.print(ss.peek());
    ss.pop();
  }
 }
}