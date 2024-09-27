import java.util.Scanner;

public class righttripat2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n=sc.nextInt();
    // int[][] matrix = new int[n][n];

    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         matrix[i][j]=sc.nextInt();
    //     }
    // }

    int[][] matrix = {
      { 1, 6, 8, 9, 4 },
      { 9, 2, 7, 7, 4 },
      { 5, 1, 5, 7, 2 },
      { 8, 5, 9, 6, 3 },
      { 3, 5, 9, 6, 4 },
    };

    int n = matrix.length;
    int mid = n / 2;
    System.out.println(mid);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= mid; j++) {
        if (j < Math.abs(mid - i)) {
          System.out.print("* ");
        } else {
          System.out.print(matrix[i][j + mid] + " ");
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
/*{
            { 71, 89, 28, 62, 17, 21, 36 },
            { 94, 41, 22, 15, 60, 92, 23 },
            { 18, 37, 84, 78, 73, 39, 97 },
            { 50, 50, 94, 41, 90, 58, 44 },
            { 66, 44, 68, 23, 62, 87, 37 },
            { 43, 79, 25, 51, 83, 66, 12 },
            { 51, 19, 68, 99, 61, 60, 66 },
          }; */
