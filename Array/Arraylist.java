import java.util.*;

public class Arraylist{

    public static boolean Monotonic(ArrayList<Integer> monotonicList){
        int count =0;
         int newcount =0;
       for(int i =0;i<monotonicList.size()-1;i++){
        int numbers = monotonicList.get(i);
        int numbers1 = monotonicList.get(i+1);
        if(numbers <numbers1){
            count++;
        }
        else{
            newcount++;
        }
       }
       if(count == monotonicList.size()-1 || newcount == monotonicList.size()-1){
        return true;
       }
       else{
        return false;
       }
    }

    public static boolean isMonotonic(ArrayList<Integer> monotonicList){
       boolean inc =true;
       boolean dec = true;
       for(int i =0; i<monotonicList.size()-1;i++){
        if(monotonicList.get(i) < monotonicList.get(i+1)){
            dec = false;
        }
         if(monotonicList.get(i) > monotonicList.get(i+1)){
            inc = false;
        }
       }
       return inc|| dec;
    }

   public static ArrayList lonelyNumber(ArrayList<Integer> list){
    ArrayList<Integer> newList =new ArrayList<>();
    Collections.sort(list);
     for(int i =0;i< list.size();i++){
        int num =list.get(i);
          for(int j =i+1;j<list.size();j++){
              if(num != list.get(j) && list.get(i+1) != num+1){
                    if(i>0){
                        if(list.get(i-1) != num-1){
                          newList.add(list.get(i));
                        }
                    }
              }
          }
     }
     return newList;
   }
    public static void main(String arga[]){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(9);
        // list.add(1);
        // list.add(10);
        // list.size();
        // System.out.println(list);
        // int max = Integer.MIN_VALUE;
        // // for(int i=list.size()-1;i>=0;i--){
        //     if(list.get(i)>max){
        //         max=list.get(i);
        //     }
        //   max= Math.max(max ,list.get(i));
        // int idx1 = 1;
        // int idx2 = 2;
        // int temp = list.get(idx1);
        // list.set(idx1,list.get(idx2)) ;
        // list.set(idx2,temp) ;
        //sorting in ascending order
        // Collections.sort(list);
        // System.out.println(list);

        //sorting in decending order
    //     Collections.sort(list,Collections.reverseOrder());
    //      System.out.println(list);
    // //}
        //  System.out.print(max);

        //2D matrix ArrayList

    //     ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    //     ArrayList<Integer> list1 =  new ArrayList<>();
    //     ArrayList<Integer> list2 =  new ArrayList<>();
    //     ArrayList<Integer> list3 =  new ArrayList<>();
    //    for(int i=1;i<=5;i++){
    //     list1.add(1*i);
    //     list2.add(2*i);
    //     list3.add(2*i);
    //    }
    //    mainList.add(list1);
    //    mainList.add(list2);
    //    mainList.add(list3);
    //     System.out.println(mainList);
    //     for(int i=0;i<mainList.size();i++){
    //          ArrayList<Integer> currList = mainList.get(i);
    //          for(int j=0;j<currList.size();j++){
    //             System.out.print(currList.get(j) + " ");
    //          }
    //      System.out.println();
    //     }
     Scanner sc = new Scanner(System.in);   
ArrayList<Integer> monotonicList = new ArrayList<>();

    monotonicList.add(10);
    monotonicList.add(6);
    monotonicList.add(5);
     monotonicList.add(6);
    // System.out.print(monotonicList);
    System.out.println(lonelyNumber(monotonicList));

    }
}