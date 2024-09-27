import java.util.*;

/**
 * evenupperoddlower
 */
public class evenupperoddlower {

  public static void main(String[] args) {
    //Your Code Here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int even = 2, odd = 1;
    int arr[][] = new int[n][n];

    for (int j = 0; j < n; j++) {
      boolean f = true;
      for (int i = 0; i < n; i++) {
        if (i == j) {
          arr[i][j] = 0;
          f = false;
        } else if (f) {
          arr[i][j] = even;
          even += 2;
        } else {
          arr[i][j] = odd;
          odd += 2;
        }
      }
    }
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }
}
