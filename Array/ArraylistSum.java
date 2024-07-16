import java.util.*;

public class ArraylistSum{

    public static int maxContainerWater(ArrayList<Integer> height){
       int maxHeight = Integer.MIN_VALUE;
     for(int i =0;i<height.size();i++){
        for(int j =i+1;j<height.size();j++){
           int height1 = Math.min(height.get(i),height.get(j));
       
            int width = j-i;
             int newmaxHeight = height1*width;
           maxHeight=  Math.max(maxHeight,newmaxHeight);
        }
     }
     return maxHeight;
    }

public static boolean pairSum1(ArrayList<Integer> height){
   int target = 80;
   for(int i =0;i< height.size();i++){
      for(int j=i+1;j<height.size();j++){
         if(height.get(i)+height.get(j) == target){
            return true;
         }
      }
   }
   return false;
}

public static boolean  pairSum1TwoPointerApproach(ArrayList<Integer> height){
   int target = 80;
   int i = 0;
   int j = height.size()-1;
   while(i<=j){
     int sumHeight = height.get(i)+height.get(j);
     if(sumHeight == target){
      return true;
     }
     if(sumHeight < target){
      i++;
     }
     else{
      j--;
     }
   }
  return false;
}

public static boolean pairSum1INRotatedTwoPointerApproach(ArrayList<Integer> newList1){
   int lp=0;
   int rp =0;
   int target = 16;
   int n= newList1.size();
   for(int i=0;i<n-1;i++){
      if(newList1.get(i) > newList1.get(i+1) ){
          rp = i;
          lp = i+1;
          break;
      }
   }
   while(lp!=rp){
    if(newList1.get(lp)+newList1.get(rp) == target){
       return true;
    }
    if(newList1.get(lp)+newList1.get(rp) < target){
      lp = (lp+1)%n;
    
    }
    else{
          rp =(n+rp-1)%n;
      
    }
   }
   return false;
}
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        pairSum1INRotatedTwoPointerApproach(height);
        System.out.println(pairSum1INRotatedTwoPointerApproach(height));
    }
}