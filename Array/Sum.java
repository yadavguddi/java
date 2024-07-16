import java.util.*;
public class Sum {

    public static boolean pallidrome(int num) {
        if (num == reverseNumber(num)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverseNumber(int num) {
        int reversedNumbers = 0;
        while (num > 0) {

            int lastDigit = num % 10;
            num = num / 10;
            reversedNumbers = reversedNumbers * 10 + lastDigit;

        }
        return reversedNumbers;
    }

    public static int sumOfNumbers(int num) {
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            sum = sum + lastDigit;
        }
        return sum;

    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int fact = a / (b * c);
        return fact;
    }

    public static boolean primeNumber(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            } else {
                prime = true;
            }
        }
        return prime;
    }

    public static boolean optimizedPrime(int n) {

        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

  

    public static void primeRange(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (optimizedPrime(i)) {
                System.out.println(i);
            }
        }

    }
      public static int binaryToDecimal(int num){
        int binary = 0;
        int pow =0;
        while(num>0){
         int lastDigit = num%10;
         num = num/10;
         double multiply = Math.pow(2, pow);
         binary = binary + (int)(lastDigit*multiply);
         pow++;
        }
      
return binary;
      }

public static void decimalToBinary(int num){
    while(num > 0){
        int bin =0;
        int pow =0;
        int remainder = num%2;
        bin = bin + (remainder*(int)Math.pow(10,pow));
       
         num = num/2;
         pow++;
         
        System.out.print(bin);

    }

}

public static void breakStatement(){
     Scanner sc = new Scanner(System.in);
    
     
     while(true){
         int number = sc.nextInt();
        if(number%10==0){
 System.out.println(number);
        break;
        }
      
     }
     

}

public static void continueStatement(){
    for(int i = 0; i<=5 ; i++){
        if(i == 3){
            continue;
        }
        System.out.println(i);
    }
}

public static void multipleTenContiue(){
    Scanner sc = new Scanner(System.in);
    while (true) { 
        int input = sc.nextInt();
        if(input%10 == 0){
            continue;
        }
        System.out.println(input);
    }}


public static void printStar(){
  for(int i=4;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
  }
}

public static void halfPyramid(){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void printCharacterPyramid(){
char ch = 'A';
for(int i=1;i<=5;i++){
    for(int j= 1; j<=i;j++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
}

public static void sumOfEvenOdd(){
    int choice;
    int even=0;
    int odd =0;
    Scanner sc = new Scanner(System.in);
    do { 
        System.out.println("Enter the number");
int num = sc.nextInt();
if(num%2==0){
even+=num;
}
else{
    odd+=num;
}
        System.out.println("Do you want to continue :If yes click '1");
        choice = sc.nextInt();
    } while (choice==1);

    System.out.println(even);
    System.out.println(odd);

}

public static void floydTrianglePattern(){
    int num = 1;
    for(int i=1;i<=5;i++){
        for(int j=1 ; j<=i;j++){
            System.out.print(num);
            System.out.print("");
            num++;
        }
        System.out.println();
    }
}

public static void invertedPattern(){
    for(int i=5 ; i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void TriangePattern(){
int num =1;
for(int i=1;i<=5;i++){
    for(int j=1;j<=i;j++){
        System.out.print(num);
        if(num == 1){
            num = 0;
        }
        else{
            num = 1;
        }
 
    }
    System.out.println();
}
}

public static void hollowRectanglePattern(int row_size,int col_size){
for(int i=1 ; i<=row_size;i++){
    for(int j=1 ;j<=col_size;j++){
        if(i==1 || i==row_size || j==1 || j==col_size){
            System.out.print("*");
        }else{
            System.out.print(" "); 
        }
    }
    System.out.println();
}
}

public static void invertedRotatedHalfPyramid(int n){
    for(int i =1 ;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void butterflyPattern(){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         System.out.println();
    }
      for(int i=4;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
         for(int j=1;j<=2*(4-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void solidRhombus(){
    for(int i =1; i<=5;i++){
        for(int j = 1; j<=5-i;j++){
            System.out.print(" ");

        }
           for(int j = 1; j<=5;j++){
            System.out.print("*");

        }
        System.out.println();
    }
}

public static  void pyramidPattern(){
      int num=1;
    for(int i = 1;i<=5;i++){
      
        for(int j =1;j<=5-i;j++){
            System.out.print(" ");
        }
          for(int j =1;j<=i;j++){
            System.out.print(num);
           
        }
        
         num++;
         System.out.println();
         
    }
}

public static void diamondPattern(int n){
    for(int i =1;i<=n;i++){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
           for(int j = 1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
         System.out.println();
    }
      for(int i =5;i>=1;i--){
        for(int j = 1;j<=n-i;j++){
            System.out.print(" ");
        }
           for(int j = 1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
         System.out.println();
    }
   
}

public static void hollowRhombus(int n){
    for(int i =1;i<=n;i++){
        for(int j =1;j<=n-i;j++){
            System.out.print(" ");
        }
          for(int j =1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
              System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
         System.out.println();
    }
}

public static void invertedPyramid(){
    for(int i=0;i<5;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j =i;j<5; j++){
            System.out.print("* ");
        }
            System.out.println();
    }
}
        // for (int k = 0; k  <  5; k++) {
        //     // Print spaces
        //     for (int j = 0; j  <  k; j++) {
        //         System.out.print(" ");
        //     }
        //     // Print asterisks
        //     for (int j = k; j  <  5; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }}
public static void number(){
    for(int i=1;i<=4;i++){
        for(int j=1;j<=1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}    

public static void onezeroone(){
    int num =1;
    for(int i=1;i<=5;i++){
       
        for(int j=1;j<=i;j++){
             
            System.out.print(num);
            num=0;
        }
        System.out.println();
    }
}
    public static void main(String args[]) {


        int num = 12;
        // int ans =binaryToDecimal(num);
         onezeroone();
        // System.out.println(ans);

    }
}
