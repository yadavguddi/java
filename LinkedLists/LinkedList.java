import java.util.*;

public class LinkedList{

    public  static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }}

    public  static Node head;
    public  static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
          head = tail = newNode;
          return;
        }
        
        newNode.next = head;
        head = newNode;
    }

       public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
          head = tail = newNode;
        //   tail.next = null;
          return;
        }
        size++;
        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
}

// public int intersectionOfTwoLL(){
   
// }

public void printLinkedList(){
    Node temp = head;
    if(head == null){
        System.out.println("Linked List is empty");
        return;
    }
    
    while(temp !=null){
        System.out.print(temp.data +"->");
        temp = temp.next;
    }
    System.out.println("null");
}

public void addInMiddle(int idx, int data){
    if(idx ==0){
        addFirst(data);
        return;
    }
    size++;
 Node newNode = new Node(data);
 int i =0;
 Node temp = head;
 while(i<idx-1){
    temp = temp.next;
    i++;
 }
 newNode.next = temp.next;
 temp.next = newNode;
}

public int removeFirst(){
    if(size == 0)
    {
        System.out.println("LikedList is empty");
        return Integer.MIN_VALUE;
    }
    if(size ==1){
        int val = head.data;
        head = tail = null;
        size =0;
        return val;
        
    }
    size--;
    int val = head.data;
   head = head.next ;
   return val;
}

public int removeLast(){
    if(size ==0){
        System.out.println("LinkedList is Empty");
        return Integer.MAX_VALUE;
    }
    if(size ==1){
        int val = head.data;
        head.next =null;
        size =0;
        return val;
    }
    Node temp;
    temp = head;
    int idx=0;
    while(idx<size-2){
        temp = temp.next;
        idx++;
    }
    
    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;
}

public int linearSearch(int data){
    Node temp = head;
    int i =0;
    while(temp != null){
        if(temp.data ==  data){
            return i;
        }
        i++;
        temp = temp.next;
    }
    return -1;
}

public int helper(Node head , int data ){
    if(head == null){
        return -1;
    }
    if(head.data == data){
        return 0;
    }
    int idx = helper(head.next, data);
    if(idx == -1){
        return -1;
    }
    return idx+1;
}
public int searchRecursive(int data){
    return helper(head,data);
}

public void reverseLinkedList(){
    Node prev = null;
    Node curr = tail = head;
    Node next ;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
} 

public void removeNodeFromEnd(int n){
 int sz = 0;
 Node temp = head;
 while(temp != null){
    temp = temp.next;
    sz++;
 }

 if(n==sz){
 head = head.next;
 return;
 }
 int i=1;
 Node prev = head;
 while(i<sz-n){
  prev = prev.next;
  i++;
 }
prev.next = prev.next.next;
return;
}

public Node findMid(Node head){
    Node slow = head;
    Node fast = head;
  
 
  while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
  }
 return slow;
}

public boolean checkPalindrome(){
    if(head == null || head.next == null){
        return true;
    }
    //find mid
    Node midNode = findMid(head);

    //reverse second half
    Node prev = null;
    Node curr =midNode;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;
    //check left half and right half;
    while(right != null){
          if(left.data != right.data){
             return false;
          } 
          left = left.next;
          right = right.next;
    }
    return true;
}

public static boolean isCycle(){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}

public  static void removeCycle(){
  Node slow =head;
  Node fast = head;
  Boolean cycle = false;
  while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
    if(fast == slow){
        cycle = true;
        break;
    }
  }

  if(cycle == false){
    return;
  }
  slow = head;
  Node lastNode = null;
    while(fast != slow){
    lastNode = fast;
    slow = slow.next;
    fast = fast.next;
  }
  lastNode.next = null;
}
public static Node midNode(){
  Node slow = head;
  Node fast = head.next;
  while(fast != null && fast.next != null){
    slow = slow.next;
    fast  = fast.next;
  }
  return slow;
}
public static Node mergeSort(Node head){
    if(head == null || head.next == null){
       return head;
    }
  Node mid =midNode();
   Node rightHead =mid.next;
   mid.next = null;
  Node newLeft =mergeSort(head);
   Node newRight=mergeSort(rightHead);
   return merge(newLeft,newRight);
}

public static Node merge(Node newLeft , Node newRight){
    Node mergerLL = new Node(-1);
    Node temp = mergerLL;
  while(newLeft != null && newRight != null){
      if(newLeft.data <= newRight.data){
         temp.next = newLeft;
         newLeft = newLeft.next;
         temp = temp.next;
      }
      else{
        temp.next = newRight;
         newRight = newRight.next;
         temp = temp.next;
      }
  }
  if(newLeft != null){
    temp.next = newLeft;
         newLeft = newLeft.next;
         temp = temp.next;
  }
  if(newRight != null){
    temp.next = newRight;
         newRight = newRight.next;
         temp = temp.next;
  }
 return mergerLL.next;
}

public static void zigZag(){
    //mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    

    //reverse 2nd part
   
    Node curr = mid.next ;
    mid.next = null;
     Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next; 
    }
    Node leftHead = head;
    Node rightHead = prev;

    //Alternate Merging
    Node nextL ,nextR;
    while(leftHead != null && rightHead != null){
        nextL = leftHead.next;
        leftHead.next = rightHead;
        nextR = rightHead.next;
        rightHead.next = nextL;
        leftHead = nextL;
        rightHead = nextR;
    }
}

public static void deletemNodesAfternNoddes(){
    int m =3;
    int i =1;
    int j =0;
    int n=3;
    Node temp = head;
    while(i < m){
        temp = temp.next;
        i++;
    }
    Node newTemp = temp;
    while(j<n+1){
        newTemp = newTemp.next;
        j++;
    }
    temp.next = newTemp;

}

public static void swappingNodes(){
    int x =2;
    int y = 4;
    int i=0;
    int j=0;
    Node temp = head;
    Node newtemp = head;
    int datas ;
    while(i != x+1){
    temp = temp.next;
    i++;
    }

     while(j != y+1){
    newtemp = newtemp.next;
    i++;
    }
    
    datas = temp.data ;
    temp.data = newtemp.data;
    newtemp.data =datas;
}
    public static void main(String args[]){
     LinkedList ll = new LinkedList();
   
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(5);
    ll.addFirst(6);
    ll.addFirst(7);
    ll.addFirst(7);
    ll.addFirst(7);
  
      //1->2->3->2
       ll.printLinkedList();
    // ll.head =ll.mergeSort(ll.head);
    ll.swappingNodes();
       ll.printLinkedList();

     
    //    System.out.println(size);
    //    System.out.println(ll.searchRecursive(5));
    //    System.out.println(ll.searchRecursive(50));
    //  ll.printLinkedList();
    // ll.removeNodeFromEnd(2);
    // ll.reverseLinkedList();
    // ll.printLinkedList();
//     System.out.println(isCycle());
//     removeCycle();
//      System.out.println(isCycle());
//    ;

    }
}