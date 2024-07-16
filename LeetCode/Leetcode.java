
public class Leetcode{
    public static void sumTwo(int array[] , int target,int n){
      
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(array[i]+array[j] == target){
                System.out.println(i+" "+j);
            }
          
        }
      }
    }
    public static int removeElement(int[] nums, int val) {
        int temp[] = new int[nums.length];
        int count =0;
        int k =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] != val){
             temp[k] = nums[i];
             k++;
            }
        }
        for(int i =0;i<temp.length;i++){
          if(temp[i] == 0){
            count --;
          }
           count++;
          //  System.out.print(temp[i] + " ");
        }
        return count;
    }

    public  static void removates(int[] nums) {
        int temp[] = new int[nums.length];
        boolean check = false;
        int k =0;
        int count =0;
       for(int i =0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length-1;j++){
            if(nums[i] == nums[j]){
            }
        }
       } 
       for(int l=0;l<temp.length-1;l++){
       System.out.print(temp[l] + " ");
       }
       System.out.println(count);
    }
        public static void printArray(int array[]){
      for(int i =0;i<array.length;i++){
        System.out.print(array[i] + " ");
      }
    }

     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int m =0;
        int j = nums1.length;
        int k = nums2.length;
        int l =0;
        int temp [] = new int[k+j];
        while(i<j && m<k){
            if(nums1[i] < nums2[m]){
                temp[l] = nums1[i];
                l++;i++;
            }
            else{
                temp[l] = nums2[m];
                m++;l++;
            }
          }
          while(i<j){
             temp[l] = nums1[i];
                l++;i++;
          }
          while(m<k){
            temp[l] = nums2[m];
            m++;l++;
          }
      
    printArray(temp);
            int mid = temp.length/2;
            System.out.println(mid);
            System.out.println(temp.length);
            if((temp.length)%2 ==0){
                return (temp[mid]+temp[mid-1])/2.0;
            }
            else{
                return temp[mid];
            }
            
      
    }
     public static boolean isValid(String s) {
        int roundCount =0;
        int curlyCount =0;
        int squareCount =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' ){
                roundCount++;
            }
           else if(s.charAt(i) == '{'  ){
               curlyCount++ ;
            }
              else if(s.charAt(i) == '[' ){
               squareCount++;
            }
        }
        System.out.println(roundCount);
         System.out.println(curlyCount);
          System.out.println(squareCount);
        if(roundCount%2==0 &&curlyCount%2==0 && squareCount%2==0 ){
          return true;
        }
        return false;
        
    }


    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int target= sc.nextInt();
        // int array[] = new int[n];
        // for(int i=0;i<n;i++){
        //     array[i]=sc.nextInt();
        // }
        //    for(int i=0;i<n;i++){
        //    System.out.print( array[i]);
        // }

        // sumTwo(array,target,n);
        // int array1 []= {1,2};
        //  int array2 []= {3,4};
        // System.out.println(findMedianSortedArrays(array1,array2));
        // findMedianSortedArrays(array1,array2);

        // removates(array);
        System.out.println(isValid("()[]{}"));
    }}
