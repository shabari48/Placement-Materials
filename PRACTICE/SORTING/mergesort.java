import java.util.Arrays;

public class mergesort {

  public static int[] ms(int arr[]) {
    if(arr.length==1) return arr;

    int mid = arr.length / 2;
    int left[] = ms(Arrays.copyOfRange(arr, 0, mid));
    int right[] = ms(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
  }

  public static int[] merge(int left[], int right[]) {
    int ans[] = new int[left.length + right.length];
    int i = 0, j = 0, k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        ans[k] = left[i];
        i++;
        k++;
      } else {
        ans[k] = right[j];
        j++;
        k++;
      }
    }

    while (i < left.length) {
      ans[k] = left[i];
      i++;
      k++;
    }

    while (j < right.length) {
      ans[k] = right[j];
      j++;
      k++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 5,4,3,2,1 };
    int ans[] = ms(arr);
    System.out.println(Arrays.toString(ans));
  }
}
