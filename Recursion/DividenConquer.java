
public class DividenConquer{

    public static  void printArray(int array[]){
       for(int i=0;i<array.length;i++){
        System.out.print(array[i] + " ");
       }
    }

    public static void mergeSort(int array[] , int si ,int ei){
        if(si>=ei){
            return;
        }
     int mid = si+ (ei-si)/2;
     mergeSort(array, si, mid);
     mergeSort(array, mid+1, ei);
     merge(array,si,ei,mid);
    }

    public static void merge(int array[] ,int si , int ei ,int mid){
      int temp[] = new int[ei-si+1];
      int i = si;
      int j = mid+1;
      System.out.println(mid);
      int k =0;
      while(i <= mid && j<= ei){
        if(array[i] < array[j]){
            temp[k] = array[i];
            i++;k++;
        }
        else{
            temp[k] = array[j];
            j++;k++;
        }
      }
      //for leftover elements
      while(i <= mid){
        temp[k++] = array[i++];
      }
      while(j <= ei){
        temp[k++] = array[j++];
      } 

      for(int l=si,m=0;m<temp.length;m++,l++){
        array[l] = temp[m];
      }

    }

    public static void quickSort(int array[] ,int si , int ei){
        if(si>=ei){
            return;
        }
         int piIdx = partion(array,si,ei);
         quickSort(array, si, piIdx-1);
         quickSort(array, piIdx+1, ei);
    }

    public static int partion(int array[] ,int si , int ei){
      int pivot = array[ei];
      int i =si-1;
      
      for(int j =si;j<ei;j++){
        if(array[j] <= pivot){
            i++;
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
      }
      i++;
      int temp = pivot;
      array[ei] = array[i];
      array[i] = temp;
      return i;
    }
    public static int[] mergeSorting(int array[] , int si ,int ei){
    if(si==ei){
         int []base =new int[1];
         base[0] = array[si];
         return base;
        }
     int mid = si+ (ei-si)/2;
    int left[] = mergeSorting(array, si, mid);
    int right[] = mergeSorting(array, mid+1, ei);
     int res[]=mergeSortedArray(left,right); 
return res;
    }


    public static int[] mergeSortedArray(int array1[] , int array2[]){
        int n = array1.length;
        int m = array2.length;
        int temp[] = new int[n+m];
        int i =0;
        int j =0;
        int k =0;
        int count =0;

        while(i<n && j<m){
            if(array1[i] <array2[j]){
               temp[k] = array1[i];
                i++;k++;
               
            }
            else{
                temp[k] = array2[j];
                j++;k++; 
               
        }
        }
     while(i<n){
        temp[k] = array1[i];
        i++;k++;
     }
     while(j<m){
        temp[k] = array2[j];
        k++;j++;
     }
     return temp;
    
    }

    public static int searchInRotatedSortedArray(int array[],int target , int si ,int ei){
        int mid = si+(ei-si)/2;
        if(si >ei){
            return -1;
        }
        if(target == array[mid]){
            return mid;
        }
        if(array[si] <= array[mid]){
            if(target >=array[si] && target <= array[mid]){
                return searchInRotatedSortedArray(array, target, 0, mid-1);
            }
            else{
                 return searchInRotatedSortedArray(array, target, mid+1, ei);
            }
        }
        else{
            if(target>=array[mid] && target <=array[ei]){
                return searchInRotatedSortedArray(array, target, mid+1, ei);
            }
            else{
                return searchInRotatedSortedArray(array, target, si, mid-1);
            }
        }
    }
 
    public static int countOfNumbers(int array[] , int si , int ei ){

        if(si == ei){
            return array[si];
        }

        int mid = si+(ei-si)/2;
        int left = countOfNumbers(array, si, mid);
        int right = countOfNumbers(array, mid+1, ei);

        if(left == right){
            return left;
        }
        int leftount =countrepeatedNumbers(array,left , si ,ei);
        int rightount =countrepeatedNumbers(array,right,si ,ei);
        if(leftount > rightount){
            return left;
        }
        else{
            return right;
        }


    }
    public static int countrepeatedNumbers(int array[] ,int nums ,int si ,int ei){
        int count =0;
      for(int i =si ;i<= ei ;i++){
        if(array[i] == nums){
            count++;
        }
      }
      return count;
    }
    public static void main(String args[]){
     int array[] = {4,5,6,7,0,1,2};
     int array2[] = {1,2,8};
    //  quickSort(array, 0, array.length-1);
    // mergeSort(array,0,array.length-1);
    //  printArray(array);
    //  System.out.println(searchInRotatedSortedArray(array,5,0,array.length-1));
    System.out.println(countOfNumbers(array ,0,array.length-1));
    }
    
}