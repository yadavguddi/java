public class Strings{

    public static void palindromeString(String str){
      
      int length = str.length();
      int newLength = length/2;
      boolean Palindrome = true;
      for(int i=0;i<newLength;i++){
        if(str.charAt(i)==str.charAt(length-i-1)){
            Palindrome=true;
        }
        else{
            Palindrome=false;
        }
      }

  if(Palindrome==true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }

    public static double getShorttestPath(String path){
        int x =0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
               y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
               x--;
            }
            else{
                x++;
            }
            
        }
        double shortestDistance = Math.sqrt(Math.pow(y,2) + Math.pow(x,2));
        return shortestDistance;
    }

    public static void subString(String str,int si,int ei){
        for(int i=si;i<ei;i++){
            char character = str.charAt(i);
            System.out.print(character);
        }
    }

    public static void largestString(String array[]){
        String largest = array[0];
        for(int i=1;i<array.length;i++){
            if(largest.compareTo(array[i]) < 0){
                largest = array[i];
            }
        }
        System.out.println(largest);
    }

    public static String stringCompression(String str){
        String str1 = "";
       
        for(int i=0;i<str.length();i++){
             int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
          {
            i++;
            count++;
           }
           str1+=str.charAt(i);
           if(count >1){
            str1+=count;
           }
        }
        return str1;
    }

    public static int countLowerCaseVowels(String str){
       int count =0;
         for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch =='o' || ch == 'u'){
                count++;
            }
         }
         return count;
    }
        // public static boolean stringAnagram(String str1 , String str2){
        //     int count = 0;
        // for(int i=0;i<str1.length()-1;i++)
        // for(int j=i+1;j<str1.length();j++){
        //     if(str1.charAt(i) == str2.charAt(j)){
        //        count++;
        //     }
         
        // }
        //  if(count == str1.length()-2){
        //     return true;
        //  }
        //     System.out.println(count);
        //  return false;
        // }
    
    public static void stringOfArraySort(String str[]){
        String min = "";
        int k =0;
        
        for(int i =0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
            if(str[i].compareTo(str[j])>0){
                min= str[i];
                str[i] = str[j];
                str[j] = min;
            }
            }
        }
        
    }
    public static void main(String args[]){
       String str ="aaabbA";
        String str1 ="aaaAbb";
      
       String str3[] = {"sun" , "earth" ,"mars" ,"mercury"};
       stringOfArraySort(str3);
       for(int i=0;i<str3.length;i++){
        System.out.print(str3[i] + " ");
       }
    //    largestString(array);
    //    System.out.println(stringAnagram(str,str1));
    //    subString(str,0,5);
        // palindromeString(str);
    }
}