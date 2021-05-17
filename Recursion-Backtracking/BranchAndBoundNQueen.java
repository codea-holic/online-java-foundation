import java.util.*;

public class BranchAndBoundNQueen {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    //write your code here
    
    boolean cols [] = new boolean[board.length];
    boolean [] ndiag = new boolean[2 * board.length - 1];
    boolean [] rdiag = new boolean[2 * board.length - 1];
    
    // solve(board, row, cols-array, n-diag array, r-diag array, answer)
    solve(board, 0, cols, ndiag, rdiag, "");
    
  }
  
  // asf -> answer so far
  public static void solve(boolean [][] board, int row, boolean [] cols, boolean [] ndiag, boolean [] rdiag, String asf){
      
      if(row == board.length){
          System.out.println(asf + ".");
          return;
      }
      
      for(int col = 0; col < board.length; col++){
          if(cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length - 1] == false){
              board[row][col] = true;
              cols[col] = true;
              ndiag[row + col] = true;
              rdiag[row - col + board.length - 1] = true;
              solve(board, row + 1, cols, ndiag, rdiag, asf + row + "-" + col + ", ");
              cols[col] = false;
              ndiag[row + col] = false;
              rdiag[row - col + board.length - 1] = false;
              board[row][col] = false;
          }
      }
  }

}