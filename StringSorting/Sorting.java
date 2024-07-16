
public class Sorting{
    public static void bubbleSort(int array[]){
        int n = array.length;
        int swap;
        System.out.println(n);
      for(int i=0;i<n-1;i++){
      swap=0; 
        for(int j=0;j<n-1-i;j++){
            if(array[j]>array[j+1]){
            int temp=array[j];
            array[j]=array[j+1];
            array[j+1]=temp; 
              swap++;  
          
            }
           
        }
          System.out.println(swap);
              if(swap==0){
             break;
             }
      }
    }
public static void selectionSort(int array[]){
 for(int i=0;i<array.length-1;i++){
  int Smallest = i;
     for(int j=i+1;j<array.length;j++){
      if(array[j]<array[Smallest]){
        Smallest =j;
      }
     }
     int temp = array[Smallest];
     array[Smallest] = array[i];
     array[i]=temp;

 }
}    
    public static void printArray(int array[]){
      for(int i=0;i<array.length;i++){
       System.out.print(array[i]) ;
      }
    }
    public static void main(String args[]){
 int array[]={1,2,3,4,5};
 selectionSort(array);
 printArray(array);


    }
}