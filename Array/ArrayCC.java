




public class ArrayCC{
// Array works on call by reference 
    public static void update(int array[]){
        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;
        }
    }

public static int linerSearch(int array[]){
    for(int i=0;i<array.length;i++){
       int key=10;
        if(array[i] == key){
            return i;
        }
       
    }
    return -1;
}
public static void swapArray(int array[]){
int i=0;
int j=array.length-1;
while(i<=j){
int temp=array[i];
array[i]=array[j];
array[j]= temp;
i++;
j--;

}
for(int k=0;k<array.length;k++){
    System.out.println(array[k]);
}

}
public static int largestNumber(int array[]){
     int key = array[0];
     for(int i=0;i<array.length;i++){
        if(array[i] > key){
            key = array[i];
            
        }
     }
     return key;
}
public static void subArray(int array[]){
    int n = array.length;
    for(int i=0;i<n;i++){
       for(int j=i;j<n;j++){
        for(int k=i;k<=j;k++){
        System.out.print(array[k] + " " );
       }
       System.out.println();
       }
       
    }   

}

public static void maxSumSubarray(int array[]){
    int n=array.length;
    int sum=0;
    int maxSum=Integer.MIN_VALUE;
for (int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        sum=0;
        for(int k=i;k<=j;k++){
            
            sum+=array[k];
            // System.out.print(array[k]);
            
        }
        if(sum>maxSum){
            maxSum=sum;
        }
        System.out.println(sum);
    }

}
    System.out.println("maxSum"+maxSum);

}

public static void prefixSumSubarray(int array[]){
     int n=array.length;
    int sum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix [] = new int[n] ;
    prefix[0]=array[0];
    for (int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+array[i];
    }
    
for (int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        if(i==0){
            sum=prefix[j];
        }else{
          sum= prefix[j]-prefix[i-1];
        }
       
        if(sum>maxSum){
            maxSum=sum;
        }
        System.out.println(sum);
    }

}
    System.out.println("maxSum"+maxSum);


}

public static void kadanesForMaxSubarray(int array[]){
int ms=Integer.MIN_VALUE;
int cs=0;
int smallestNegative =Integer.MIN_VALUE;
for(int i=0;i<array.length;i++){
    
  
    cs=cs+array[i];
       if(array[i]<0){
       smallestNegative = Math.max(smallestNegative, array[i]);
    }
    if(cs<0){
        cs=0;
    }
   
    // if(ms<cs){
    //     ms=cs;
    // }
    ms = Math.max(cs,ms);
}
System.out.println("max value:"+smallestNegative);

}

public static void trappedRainWater(int array[]){
    int n =array.length;
int leftMaxBoundary[]= new int[n];
int rightMaxBoundary[]= new int[n];
int minBoundary[]= new int[n];
int trappedWater[]= new int[n];
leftMaxBoundary[0]=array[0];
rightMaxBoundary[n-1]=array[n-1];

//for left Boundary
for(int i=1;i<n;i++){
    if(array[i]<leftMaxBoundary[i-1]){
        leftMaxBoundary[i]=leftMaxBoundary[i-1];
    }
    else{
        leftMaxBoundary[i]=array[i];
    }
}
 //for right boundary
  for (int i = n - 2; i >= 0; i--) {
            if (array[i] < rightMaxBoundary[i + 1]) {
                rightMaxBoundary[i] = rightMaxBoundary[i + 1];
            } else {
                rightMaxBoundary[i] = array[i];
            }
        }
 
 //for minimum value compaared with both array
for(int i =0;i<n;i++){
 if(leftMaxBoundary[i]<rightMaxBoundary[i]){
     minBoundary[i]=leftMaxBoundary[i];
 }
 else{
    minBoundary[i]=rightMaxBoundary[i];
 }

}
 for(int i=0;i<n;i++){
    trappedWater[i]=minBoundary[i]-array[i];
 }

int trappedRainWater=0;
for(int i=0;i<n;i++){
    int maxtrappedwater=trappedWater[i];
    System.out.println(maxtrappedwater);
    trappedRainWater+=trappedWater[i];
}
  System.out.print("Trapped Rain Water is"+trappedRainWater);
}

public static void optimizedRainWater(int array[]){
    int n= array.length;
 int leftMaxBoundary[]= new int[n];
int rightMaxBoundary[]= new int[n];
leftMaxBoundary[0]=array[0];
rightMaxBoundary[n-1]=array[n-1];
for(int i=1;i<n;i++){
   leftMaxBoundary[i]= Math.max(array[i],leftMaxBoundary[i-1]);
}
for(int i=n-2;i>=0;i--){
     rightMaxBoundary[i]= Math.max(array[i],rightMaxBoundary[i+1]);
}
int allTrappedWater=0;
for(int i=0;i<n;i++){
int minvalue=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
 int trappedWater=minvalue-array[i];
allTrappedWater+=trappedWater;

}
System.out.println(allTrappedWater);
}

public static void buySellStocks(int array[]){
  int buyPrice=Integer.MAX_VALUE;
  int maxProfit=0;
 int n=array.length;
  for(int i=0;i<n;i++){
       if(buyPrice<array[i]){
        int profit=array[i]-buyPrice;
        maxProfit=Math.max(maxProfit,profit);
       }else{
        buyPrice=array[i];
       }
  }
  System.out.print(maxProfit);
}

public static void maxArray(int array[]){
    int n =array.length;
  int maxValue = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
         if(array[i]>maxValue){
             maxValue = array[i];
         }
     }
System.out.println(maxValue);
}

public static void insertionSort(int array[]){
    for(int i=1;i<array.length;i++){
        int curr = array[i];
        int prev = i-1;
        while(prev>=0 && array[prev]>curr){
            array[prev+1] = array[prev];
            prev--;
        }
        array[prev+1] = curr;
    }
}

public static void countingSort(int array[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<array.length;i++){
        largest = Math.max(largest,array[i]);
    }
    int count[] = new int[largest+1];
    for(int i=0;i<array.length;i++){
          count[array[i]]++;
    }
    int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
              array[j]=i;
              j++;
               count[i]--;
            }
         
    }
}

public static void printArray(int array[]){
    for (int i=0;i<array.length;i++){
        System.out.print(array[i] +" ");
    }
}

public static boolean numberRepeated(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
               if(array[i] == array[j]){
                return true;
               }
            }
        }
        return false;
}

public static void binarySearch(int array[]){
int target = 85;
int n=5;
int lo=0;
int hi=n-1;
int index;
boolean found = false;
while(lo<=hi){
    int mid = (lo+hi)/2;
    if(array[mid]==target){
        index=mid;
      break;
    }
  else if(array[mid]<target){
  lo=mid+1;
  }
  else{
    hi = mid-1;
  }

}
}
public static int SmallestInteger(int nums[]){
    int smallElement = Integer.MAX_VALUE;
    for(int i =0;i<nums.length;i++){
  if(nums[i]<smallElement){
    smallElement = nums[i];
  }
    }
    return smallElement;
}
public static int elementSearch(int nums[],int target){
    int n = nums.length;
    int i=0;
    int j =n-1;
    
    while(i<=j){
        int mid =(i+j)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(target <nums[mid]){
            j = mid-1;
        }
        else{
            i = mid+1;
        }
    }
    return -1;
}
public static void mainSearch(int nums[]){
    int sm =SmallestInteger(nums);
    elementSearch(nums,6);

}
public static void main(String args[]){

// int marks[] = new int[50];
// Scanner sc = new Scanner(System.in);
//  marks[0]= sc.nextInt();
//   marks[1]= sc.nextInt();
//    marks[2]= sc.nextInt();

// System.out.println("physics:" + marks[0]);
// System.out.println("chemistry:" + marks[1]);
// System.out.println("maths:" + marks[2]);
// marks[2]=100;
// System.out.println("maths:" + marks[2]);

//call by reference concept
int array[] = {2,3,5,1,6};
// countingSort(array);
// printArray(array);
// update(array);
// for(int i=0;i<array.length;i++){
//    System.out.println(array[i]);
// }
// binarySearch(array);


// int index=linerSearch(array);
// if(index == -1){
//     System.out.println("Not found Key");
// }
// else{
//     System.out.println("Found key"+" "+ index);
// }
//  Scanner sc = new Scanner(System.in);
//      int n =sc.nextInt();
//      int array[]=new int[n];
//      for(int i=0;i<n;i++){
//          array[i]=sc.nextInt();
//      }
//      maxArray(array);

System.out.println(elementSearch(array,6));
 }
}
