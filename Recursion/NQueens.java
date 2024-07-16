 
public class NQueens{
    public static boolean isSafe(char board[][],int row, int col){
          for(int i=row-1;i>=0;i--){
            if(board[i][col] =='Q'){
                return false;
            }
          }
          for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
          }

             for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
          }
          return true;
    }
    public static void Nqueens(char board[][] , int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
       for(int j =0;j<board.length;j++){

        if(isSafe(board,row, j)){
        board[row][j] = 'Q';
        Nqueens(board, row+1);
        board[row][j] = 'X';
        }
       
       }
    }

    public static void printBoard(char board[][]){
        System.out.println("******** This is chess board with queen ********");
         for(int i =0 ;i <board.length;i++){
            for(int j =0;j<board[0].length;j++){
                System.out.print( board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int gridWays(int i , int j ,int m,int n){
    //     if(i==m-1 && j==n-1){
    //         return 1;
    //     }
    //     else if(i == n || j== m){
    //         return 0;
    //     }
    //    int x=gridWays(i+1, j, m, n);
    //   int y = gridWays(i, j+1, m, n);
      
    //   return x+y;

    //another way
    int a = fact((n-1) +( m-1));
    int b = fact(n-1)*fact(m-1);
    int noOfWays = a/b;
    return noOfWays;
    }
     
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        
        return n* fact(n-1);

    }

    public static void ratInAMaze(int ratMaze[][],int m , int i ,int j,String curr){
        if(i==m || j==m || i<0 || j<0 ||ratMaze[i][j]==0){
            return;
        }
        if(i == m-1 && j ==m-1){
            
               System.out.println("The rat path is: " + curr);
            printMatrix(ratMaze);
            System.out.println();
            return;
        }
        ratMaze[i][j] =0;
        ratInAMaze(ratMaze,m, i+1, j,curr+'D');
        ratInAMaze(ratMaze,m, i, j+1,curr+'R');
        ratInAMaze(ratMaze,m,i-1, j ,curr+'L');
        ratInAMaze(ratMaze,m, i, j-1,curr+'U');
        ratMaze[i][j] =1;
       
    }

    public static void printMatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
     
     public static void letterCombination(String D,char keypad[][]){
        int len = D.length();
        if(len == 0){
            System.out.println("");
            return;
        }
        keyPad(0,len,new StringBuilder(), D,keypad);
     }

    public static void keyPad(int i,int len,StringBuilder sb,String D,char keypad[][]){
        if(i==len){
            System.out.println(sb.toString());
        }
        else{
            char letters[] =keypad[Character.getNumericValue(D.charAt(i))];
            for(int j=0;j<letters.length;j++){
                keyPad(i+1, len, new StringBuilder(sb).append(letters[j]), D, keypad);
            }
        }
    }
    public static void main(String args[]){
        //NQUeens
        // int n =4;
        // char board[][] = new char[n][n];
        // for(int i =0 ;i <n;i++){
        //     for(int j =0;j<n;j++){
        //         board[i][j] ='X';
        //     }
        // }
        // Nqueens(board,0);

        //grid ways
        int ratMaze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1},
        };
        int m =3;
        int n =4;
        // System.out.println();
        // ratInAMaze(ratMaze,n,0,0,"");
        //keypad question
        char keypad[][] ={
         {},
          {'a','b','c'},
          {'d','e','f'},
          {'g','h','i'},
          {'g','h','i'},
          {'j','k','l'},
          {'m','n','o'},
          {'p','q','r','s'},
          {'t','u','v'},
          {'w','x','y','z'},
         {},
        };
            
       letterCombination("12",keypad);
    }
}