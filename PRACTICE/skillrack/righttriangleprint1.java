import java.util.Scanner;

public class righttriangleprint1 {

  public static void main(String[] args) {
    int[][] matrix = {
      { 71, 89, 28, 62, 17, 21, 36 },
      { 94, 41, 22, 15, 60, 92, 23 },
      { 18, 37, 84, 78, 73, 39, 97 },
      { 50, 50, 94, 41, 90, 58, 44 },
      { 66, 44, 68, 23, 62, 87, 37 },
      { 43, 79, 25, 51, 83, 66, 12 },
      { 51, 19, 68, 99, 61, 60, 66 },
    };

    int n = matrix.length;
    int x = n - 1;

    for (int i = 0; i < n / 2; i++) {
      for (int j = n / 2; j < n; j++) {
        if ((i + j) >= x && i != j) {
          System.out.print(matrix[i][j] + " ");
        } else if (i == j && (i + j) == x) {
          System.out.print(matrix[i][j] + " ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }

    for (int i = n / 2; i < n; i++) {
      for (int j = n / 2; j < n; j++) {
        if (i <= j) {
          System.out.print(matrix[i][j] + " ");
        } else {
          System.out.print("* ");
        }
      }
      System.out.println();
    }
  }
}
/*{ 1, 6, 8, 9, 4 },
      { 9, 2, 7, 7, 4 },
      { 5, 1, 5, 7, 2 },
      { 8, 5, 9, 6, 3 },
      { 3, 5, 9, 6, 4 }, */
