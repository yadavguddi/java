
import java.util.*;


 public class TwoDArray{


public static void twoDArray(){

   Scanner sc = new Scanner(System.in);
  int[][] matrix = new int[3][3];
  int m = matrix.length;
  int n = matrix[0].length;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        matrix[i][j]=sc.nextInt();
    }
}}

    public static void printArray(int matrix[][]){
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
    }

public static boolean searchValue(int matrix[][],int key){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
           if(matrix[i][j]==key){
            System.out.println("Key found at index"+j+","+j);
            return true;
           }
        }
    }
    System.out.println("Key not found");
    return false;
}

public static void spiralMatrix(int matrix[][]){
  int startRow = 0;
  int startCol = 0;
  int endRow = matrix.length-1;
  int endCol = matrix[0].length-1;
   while(startRow <= endRow && startCol<=endCol){
    for(int j=startCol;j<=endCol;j++){
        System.out.print(matrix[startRow][j] + " ");
    }
     for(int j=startRow+1;j<=endRow;j++){
        System.out.print(matrix[j][endCol] + " ");
    }
      for(int j=endCol-1;j>=startCol;j--){
        if(startCol == endCol){
            break;
        }
        System.out.print(matrix[endRow][j] + " ");
    }
      for(int j=endRow-1;j>=startRow+1;j--){
        if(startRow == endRow){
            break;
        }
        System.out.print(matrix[j][startCol] + " ");
    }
    startRow++;
    startCol++;
    endRow--;
    endCol--;
   }
   System.out.println();
}

public static void diagonalSum(int matrix[][]){
    int startRow = 0;
    int startCol = 0;
    int k=0;
    int sum1 =0;
    int sum2=0;
    int endCol = matrix[0].length-1;
    for(int i=0;i<=endCol;i++){
      System.out.print(matrix[startRow][startCol] + " ");
      sum1 +=matrix[startRow][startCol];
      startRow++;
      startCol++;     
    }
    System.out.println();
     for(int i=3;i>=0;i--){
      System.out.print(matrix[k][endCol] + " ");
      sum2 +=matrix[k][endCol];
      startRow++;
      endCol--;     
    }
     System.out.println();
int sum = sum1+sum2;
System.out.println(sum);

}
public static boolean staircaseSearch(int matrix1[][] , int key){
     int col = 0;
     int row =matrix1.length-1;
     while(col<matrix1.length && row>=0){
      if(matrix1[row][col] == key){
        System.out.println("key found at index" + row + "," + col);
        return true;
      }
      else if(matrix1[row][col] > key){
        row--;
      }
      else{
        col++;
      }
     }
     System.out.println("key not found");
     return false;
}

public static int countOfElements(int matrix[][],int key){
  int count =0;
     for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
         if(matrix[i][j]==key){
          count++;
         }
      }
     }
     return count;
}

public static int sumInSecondRow(int matrix[][]){
  int sum =0;
  int j=0;
  while(j<matrix[0].length){
    int i=1;
    sum+=matrix[i][j];
    j++;
  }
  return sum;
}

public static void transposeMatrix(int matrix[][]){
      int matrix2[][] = new int[4][4];
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
                matrix2[j][i] = matrix[i][j];
        }
      }
      printArray(matrix2);
}
 public static void main(String args[]){
  int matrix1[][] = {
    {10,20,30,40},
    {15,25,35,45},
    {27,29,37,48},
    {32,33,39,50},
  };
    int matrix[][] = {
    {10,20,30,40},
    {1,2,3,4},
    {27,20,37,48},
    {32,33,39,50},
  };
  //  staircaseSearch(matrix1,20);
  //  System.out.println(countOfElements(matrix,20));
   System.out.println(sumInSecondRow(matrix));
   transposeMatrix(matrix);
   

 }
}