
public class DoubleLL{

  public class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  //add first
  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
   if(head ==null){
    head = tail =newNode;
    return;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

public int removeFirst(){
    if(head == null){
        System.out.println("No data to remove");
        return Integer.MIN_VALUE;
    }
        if(size == 1){
        size--;
        int val = head.data;
        head = null;
        tail = null;
        return val;
    }
    size--;
    int val = head.data;
    head = head.next;
    head.prev =null;
    return val;
}

public void addLast(int data){
    Node newNode  = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    newNode = tail;
}

public int removeLast(){
    if(head == null){
        System.out.println("No element in the LinkedList");
         return Integer.MIN_VALUE;
    }
    if(size == 1){
        int val = head.data;
        head = tail = null;
        return val;
    }
    int val = tail.data;
    Node temp = tail.prev;
    temp.next = null;
    tail.prev = null;
    tail = temp;
    return val;
}
  public void print(){
    Node temp = head;
    while(temp != null){
        
        System.out.print(temp.data + "<->");
        temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverse(){
    Node prev = null;
    Node curr = head;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
  }
  public static void main(String args[]){
    DoubleLL dll = new DoubleLL();
    dll.addFirst(2);
    dll.addFirst(3);
    dll.addFirst(4);
    dll.print();
    // dll.removeLast();
    // dll.addLast(5);
    
    dll.reverse();
    dll.print();
    System.out.println(size);
  }
}