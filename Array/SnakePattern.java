

import java.util.Scanner;

public class SnakePattern {
  static void snakeMatrix(int [][]matrix, int r, int c){
    int totalElement=0;
    int topR=0;
    int rightCol=c-1;
    int leftCol=0;
    while ((totalElement<r*c)) {
      for(int i=leftCol;i<=rightCol&&totalElement<r*c;i++){
       System.out.print(matrix[topR][i]+ " ");
       totalElement++;
      }
      topR++;

      for(int i=rightCol;i>=0&&totalElement<r*c;i--){
        System.out.print(matrix[topR][i]+ " ");
        totalElement++;
   
      }
      topR++;
    }
  }
 
  public static void main(String[] args) {
    System.out.print("Enter the row and column size");
    Scanner sc= new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int [][] matrix= new int[r][c];
    System.out.print("\n the total number of element= "+ r*c);
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
  snakeMatrix(matrix,r,c);
  }
}
