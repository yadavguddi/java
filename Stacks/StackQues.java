import java.util.*;


public class StackQues{
    public static void pushBottom(Stack<Integer> s,int data){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
     
     int top = s.pop();
     pushBottom(s, data);
     s.push(top);
}
 
 public static String reverseStringUsingStack(String str){
    int idx =0;
    Stack<Character> s = new Stack<>();
   while(idx <str.length()){
    char pop = str.charAt(idx);
      s.push(pop);
      idx++;
   }
  StringBuilder result = new StringBuilder("");
   while(!s.isEmpty()){
      
      result.append(s.pop()); 
   }
   return result.toString();
}


public static void reverseStack(Stack<Integer> s){
    Stack<Integer> newStack = new Stack<>();
 while(!s.isEmpty()){
    int pop = s.pop();
    newStack.push(pop);
 }
 while(!newStack.isEmpty()){//extra memory space
    System.out.println(newStack.pop());
 }
}

public static void rebverseStackUsingRecursion(Stack<Integer> s){
    if(s.isEmpty()){
        return;
    }
     int ele = s.pop();
     rebverseStackUsingRecursion(s);
     pushBottom(s,ele);
    
       while(!s.isEmpty()){
        System.out.println(s.pop());
     }
}

public static boolean validParentheses(String s){
 Stack<Character> st = new Stack<>();
 if(s.length()%2 != 0){
   return false;
 }
 for(int i=0;i<s.length();i++){
   char ch = s.charAt(i);
   if(ch == '(' || ch == '[' || ch == '{'){
      st.push(ch);
   }
   else{
      if(st.isEmpty()){
         return false;
      }
      if((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}')  || (st.peek() == '[' && ch == ']') ){
         st.pop();
      }
      else{
         return false;
      }}
   }
  if(st.isEmpty()){
   return true;
  }
  else{
   return false;
  }
}

public static boolean duplicateParentheses(String str){
 Stack<Character> s = new Stack<>();
 for(int i =0;i<str.length(); i++){
   char ch = str.charAt(i);

      
      if(ch == ')'){
          int count =0;
         while(s.peek() != '('){
           count++;
           s.pop();
         }
        if(count<1){
       return true;
        }
        else{
         s.pop();
       }
      }
      else{
         s.push(ch);
      }
 
   }
 return false;
}

public static void stockSpan(int stocks[] ,int span[]){
 Stack<Integer> s = new Stack<>();
 span[0] =1;
 s.push(0);
 for(int i =1;i<stocks.length ;i++){
   int currPrice = stocks[i];
    while(!s.isEmpty() && currPrice>stocks[s.peek()]){
      s.pop();
    }
    if(s.isEmpty()){
      span[i] = i+1;
    }
    else{
      int prevHigh = s.peek();
      span[i] = i - prevHigh;
    }
    s.push(i);
 }
}

public static void nextGreaterElement(int array[] , int greaterEle[]){
   Stack<Integer> s = new Stack<>();
   for(int i =array.length-1;i>=0; i--){
      while(!s.isEmpty() && array[i]>=array[s.peek()]){
         s.pop();
      }
      if(s.isEmpty()){
         greaterEle[i] = -1;
      }
      else{
         greaterEle[i] = array[s.peek()];
      }
      s.push(i);
   }
}
 public static void main(String[] args) {
   //   Stack<Integer> s = new Stack<>();
   //   s.push(3);
   //   s.push(2);
   //   s.push(1);
    //  while(!s.isEmpty()){
    //     System.out.println(s.pop());
    //  }
    //    s.push(3);
    //  s.push(2);
    //  s.push(1);

    //  pushBottom(s,5);

    // String res =reverseStringUsingStack("abc");
    // System.out.println(res);

    // reverseStack(s);

   //  rebverseStackUsingRecursion(s);

   // boolean ans =duplicateParentheses("((A+b))");
   // System.out.println(ans);

   //Stocks span

   int stocks[] ={6,8,0,1,3};
   int span[] = new int[stocks.length];
   nextGreaterElement(stocks,span);

   for(int i =0;i<span.length;i++){
      System.out.println(span[i]+ " ");
   }
 }
}