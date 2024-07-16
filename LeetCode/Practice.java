
public class Practice{
    public static int[] mergeSort( int array[] ,int si , int ei ){
        if(si == ei){
            int base[] = new int[1];
            base[0] = array[si];
            return base;
        }
        int mid = si + (ei-si)/2;
       int array1[] = mergeSort(array, si, mid);
       int array2[] = mergeSort(array, mid+1, ei);
       int res[] = merging(array1,array2);
       return res;
    }

     static int count  = 0;
    public static int[] merging(int array1[] , int array2[]){
        int m = array1.length;
        int n = array2.length;
        int temp[] = new int[n+m];
        int i = 0;
        int j = 0;
        int k =0;
        
        while( i < m && j<n){
            if(array1[i] < array2[j] ){
                temp[k] = array1[i];
                i++;k++;
            }
            else{
                temp[k] = array2[j];
                j++;k++;
                count += m-i;
            }
        }
        while(i < m){
            temp[k] = array1[i];
            k++;i++;
        }
        while(j < n){
            temp[k] = array2[j];
            k++;j++;
        }
        return temp;
    }

    public static void quickSort(int array[],int si , int ei){
        if(si >= ei){
            return;
        }
        int pivot = partion(array,si,ei);
        quickSort(array, si, pivot-1);
        quickSort(array, pivot+1, ei);
    }

    public static int partion(int array[],int si , int ei){
       int pivotEle = array[ei];
       int i = si-1;
       for(int  j =si ;j<ei ;j++){
        if(array[j] <= pivotEle){
            i++;
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
       }
       i++;
       int temp = pivotEle;
       array[ei] = array[i];
       array[i] = temp;
       return i;
    }

    public static String[] mergeSortingString(String str[] , int si , int ei){
        if(si == ei){
            String base[] = new String[1];
            base[0] = str[si];
            return base;
        }
        int mid = si+(ei-si)/2;
        String left[] =mergeSortingString(str, si, mid);
        String right[]= mergeSortingString(str, mid+1, ei);
        String res[] =mergeString(left,right);
        return res;
    }
    public static String[] mergeString(String left[] , String right[]){
        int n = left.length;
        int m = right.length;
        String temp[] = new String[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i <n && j < m)
      if(isAplpahbaticallySmaller(left[i] , right[j])){
         temp[k] = left[i];
         i++;k++;
      }
      else{
        temp[k] = right[j];
        j++;k++;
      }

      while(i < n){
        temp[k++] = left[i++];
      }
       while(j < m){
        temp[k++] = right[j++];
      }
      return temp;
    }

    public static boolean isAplpahbaticallySmaller(String left , String right){
        if(left.compareTo(right) < 0){
          return true;
        }
        return false;
    }

    public static int countOfNumbers(int array[]){
        int maxCount = array.length/2;
        for(int i =0;i<array.length-1;i++){
            int cont = 0;
            for(int j =0;j<array.length;j++){
          
          if(array[i] == array[j]){
            cont++;
          }
            if(cont > maxCount){
               return array[i];
            }
            // System.out.println(cont);
        }
            }
     
       return -1;
        
    }
    public static void main(String args[]){
       int array[] = {6,5,5};
    //    int[] res =mergeSort(array, 0, array.length-1);
    //    String str[] = {"sun" , "earth" ,"mars" ,"mercury"};
    //    String res2[] = mergeSortingString(str,0,str.length-1);
//    quickSort(array, 0, array.length-1);
    //  System.out.println(count);
    System.out.println(countOfNumbers(array));
    //    for(int i =0;i< res2.length ;i++){
    //     System.out.print(res2[i] + " ");
      
    //    }

    }
}