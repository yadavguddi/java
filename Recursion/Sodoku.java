
public class Sodoku{

    public static boolean isSafe(int sodoku[][],int row, int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sodoku[i][col] == digit){
                return false;
            }
        }

        //row
          for(int j=0;j<=8;j++){
            if(sodoku[row][j] == digit){
                return false;
            }
        }
          //grid
          int sr = (row/3)*3;
          int sc = (col/3)*3;
          for(int i =sr;i<sr+3;i++){
            for(int j=sc ;j<sc+3;j++){
               if(sodoku[sr][sc] == digit)
               {
                return false;
               }
            }
          }
          return true;
    }

    public static boolean sodokuSolver(int sodoku[][],int row, int col){
        //base case

        if(row == 9 ){
            return true;
        }
       
        int nextRow = row ;int nextCol = col+1;
        if(col+1 == 9){
            nextRow = row+1;
            nextCol =0;
        }

        if(sodoku[row][col] != 0){
            return sodokuSolver(sodoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sodoku,row,col,digit)){
                sodoku[row][col] = digit;
               if(sodokuSolver(sodoku, nextRow, nextCol)){
                return true;
               } 
               sodoku[row][col] =0;
            }
        }
        return false;
    }

    public static void printSodoku(int sodoku[][]){
        for(int i =0;i<sodoku.length;i++){
            for(int j =0;j<sodoku[0].length;j++){
                System.out.print(sodoku[i][j] + " ");
            }
            System.out.println();
        }
        
    }
 public static void main(String arga[]){
    int sodoku[][] = {
        {4,0,5,9,0,2,0,0,0},
        {0,6,9,0,0,0,0,2,0},
        {0,0,0,0,4,3,5,0,9},
        {0,4,0,1,0,0,6,0,2},
        {9,0,0,0,3,0,0,0,0},
        {5,1,0,0,0,0,8,9,0},
        {7,5,2,3,6,1,9,4,8},
        {1,0,4,8,0,9,7,5,6},
        {6,0,8,0,5,0,0,0,0},
    };

    if(sodokuSolver(sodoku, 0, 0)){
        System.out.println("Solution exist");
        printSodoku(sodoku);
    }
    else{
        System.out.println("Solution not exist");
    }
 }
}