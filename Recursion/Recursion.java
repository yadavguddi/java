class Recursion{

    public static void printDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
         printDecreasing(n-1);
    }
    public static void printIncreasing(int n){
        if(n==10){
            System.out.println(n);
            return;
        }
      System.out.println(n);
      printIncreasing(n+1);
    }
    public static int Factorial(int n){
      if(n==0){
        return 1;
      }
      Factorial(n-1);
      int fa = n* Factorial(n-1);
     return fa;
      
    }
    public static int sumOfNNaturalsNumber(int n){
            if(n==0){
        return 0;
      }
      sumOfNNaturalsNumber(n-1);
      int fa = n+sumOfNNaturalsNumber(n-1);
     return fa;
    }
    public static int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        fibonacci(n-1);
        fibonacci(n-2);
        int fibo = fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }

    public static boolean isSorted(int array[],int i){
        if(i == array.length-1){
            return true;
        }
         if(array[i]> array[i+1]){
            return false;
         }
         return isSorted(array,i+1);
    }

    public static int firstOccurance(int array[] ,int i){
        int key =5;
        if(i == array.length){
            return -1;
        }
        if(array[i] == key){
            return i;
        }
        return firstOccurance(array, i+1);
    }

        public static int lastOccurance(int array[] ,int i){
        int key =2;
        if( i == 0){
            return -1;
        }
        if(array[i] == key){
            return i;
        }
        return lastOccurance(array, i-1);
    }
    public static int powerOfN(int n,int m){
        if(m==0){
          return 1;
        }
       int power= n*powerOfN(n,m-1);
          return power;
    }

    public static int optimizedPower(int x,int m){
        if(m==0){
            return 1;
        }
      int pow =optimizedPower(x,m/2);
      int powSq =pow*pow;
      if(m%2!=0){
         powSq= x*powSq;
      }
      return powSq;
    }

    public static int tilingQuestion(int n){
      if(n==0 || n==1){
        return 1;
      }
      int fnm1 = tilingQuestion(n-1);
      int fnm2 = tilingQuestion(n-2);
      int totalWays = fnm1 +fnm2;
      return totalWays;
    }

    public static void removeDuplicateString(String str,int idx,StringBuilder newStr ,boolean map[]){
           if(idx == str.length()){
            System.out.println(newStr);
             return;
           }
           char currChar = str.charAt(idx);
           if(map[currChar-'a'] == true){
            removeDuplicateString(str, idx+1, newStr, map);
           }
           else {
            map[currChar-'a'] = true;
            removeDuplicateString(str, idx+1, newStr.append(currChar), map);
           }
    }
    public static void indexOfInteger(int array[],int idx,int key){
     if(idx == array.length){
        return;
     }
     if(array[idx] == key){
        System.out.println(idx);
     }
     indexOfInteger(array, idx+1, 2);
   
    }
    public static int friendsPairProblem(int n){
        if(n==1 || n == 2){
            return n;
        }
        int fnm1 = friendsPairProblem(n-1);
        int fnm2 = friendsPairProblem(n-2);
       int pair = fnm1 + (n-1*fnm2);
       return pair;
    }
    
    public static void numberIntoWords(String string[],int num){
        
        if(num == 0){
           return;
        }
        numberIntoWords(string, num/10);
        int lastDigit = num%10;
        System.out.print(string[lastDigit] + " ");
       
    }

    // public static void countOfSubstringStartingAndEndingLetterSame(String str,int n){
       
    //        int fnm1 = countOfSubstringStartingAndEndingLetterSame(str,n-1);
    //         int fnm2 = countOfSubstringStartingAndEndingLetterSame(str,n-2);
    //       int fnm3 = countOfSubstringStartingAndEndingLetterSame(str,n-3);


    // }


    public static String toUpperCase(String str){
        StringBuilder newstr = new StringBuilder("");
         newstr.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1 ){
                newstr.append(str.charAt(i));
                i++;
               newstr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                 newstr.append(str.charAt(i));
            }
          
        }
        return newstr.toString();
    }

    public static void printBinaryStrings(int n ,int lastNumber ,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        
            printBinaryStrings(n-1, 0, str+"0");
      
        if(lastNumber == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
      
    }
    public static void main(String args[]){
        int array[] = {1,2,2,7,9,2};
        String string[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        // int n =50;
        String str ="abac";
        String str1 ="baca cdv reg";
        // removeDuplicateString(str, 0, new StringBuilder(""), new boolean[26]);
    //    System.out.println(tilingQuestion(4));
    // indexOfInteger(array, 0, 2);
    // System.out.println(friendsPairProblem(3));
    //  int n = str.length();
    // numberIntoWords(string,234);
    // System.out.println(toUpperCase(str1));
    printBinaryStrings(3,0,"");

    }
}