public class BackTracking{

    public static void arrayBacktracking(int val,int array[],int i){
        
       if(i == array.length){
        return ;
       }
       array[i] = val;
       arrayBacktracking(val+1, array,i+1);
       array[i] = array[i]-2;
       
    }

    public static void subsets(String str , String ans , int i){
        if(i == str.length()){
        //   if(ans==""){
        //   System.out.println("null");
          
        // }
          if(ans.length() == 0){
            System.out.println("null");
          }
          else{
            System.out.println(ans);
          }
          
          return;
        }

        subsets(str, ans+str.charAt(i), i+1);
        subsets(str, ans, i+1);
        
    }

    private static int count =0;
    public static void subsetsOfNumber(int array[] , String ans , int i){
     
        if(i == array.length){
       
          System.out.println(ans);
        
          return;
        }

        subsetsOfNumber(array, ans+array[i], i+1);
        subsetsOfNumber(array, ans, i+1);
        
        
    }

    public static void permutation(String str , String res) {
      if( str.length() == 0){
        System.out.println(res);
        return;
      }
      for(int i =0;i< str.length();i++){
        char charac = str.charAt(i);
          String newStr= str.substring(0,i)+ str.substring(i+1);
          permutation(newStr, res+charac);
      }
    }

    public static void main(String args[]){
      //   int i =0;
      // int array[] = new int[5];
      //  System.out.println("Enter the input");
      // arrayBacktracking(1, array,i);
      // for(int j =0;j<5;j++){
      //   System.out.print(array[j] + " ");
      // }
      subsets("abc", "", 0);
      // int array[] ={3,30,34,5,9};
      // subsetsOfNumber(array,"",0);
      // System.out.println("the count is" +count);
      // System.out.println("the count should be "+Math.pow(2, array.length));

      //   int number = 987;
      //   int firstDigit = getFirstDigit(number);
      //   System.out.println("The first digit of the number " + number + " is: " + firstDigit);
      // permutation("abc", "");
    }
}