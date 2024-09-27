import java.lang.reflect.Array;
import java.util.*;

class sorted {

  public static void main(String[] args) {
    int arr[] = {1,4,8,9};
    int x = 6;
    System.out.println(wheretoinsert(arr, x));
  }

  public static String wheretoinsert(int arr[], int x) {
    int n = arr.length;
    if (x > arr[n - 1]) {
      return arr[n - 1] + ",NULL";
    } else if (x < arr[0]) {
      return "NULL," + arr[0];
    } else {
      return findposition(arr, x);
    }
  }

  public static String findposition(int arr[], int x) {
    String ans = "";
    int i = 0, j = 1;
    while (j < arr.length) {
      if (arr[i] == x || arr[j] == x) return x + " is already present";
      if (x > arr[i] && x < arr[j]) {
        ans = "between" + arr[i] + "," + arr[j];
        break;
      }
      i++;
      j++;
    }
    return ans;
  }
}
