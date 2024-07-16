import java.util.*;

class Bitmanuplation{

    public static void oddEven(int n){
      if((n&1)==1){
          System.out.println("odd number");
      }
      else{
        System.out.println("even number");
      }
    }
    public static void main( String args[]){
      oddEven(3);
    }
}