import java.util.Arrays;

public class mergesortinplace {

  public static void ms(int arr[],int s,int e) {
    if((e-s)==1) return;

    int mid = (s+e) / 2;
    ms(arr, 0, mid);
    ms(arr, mid, e);

    merge(arr,s,mid,e);
  }

  public static void merge(int arr[], int s,int m,int e) {
    int ans[] = new int[e-s];
    int i = s, j = m, k = 0;

    while (i < m && j < e) {
      if (arr[i] < arr[j]) {
        ans[k] = arr[i];
        i++;
        k++;
      } else {
        ans[k] = arr[j];
        j++;
        k++;
      }
    }

    while (i < m) {
      ans[k] = arr[i];
      i++;
      k++;
    }

    while (j < e) {
      ans[k] = arr[j];
      j++;
      k++;
    }

    for(k=0;k<ans.length;k++)
       arr[s+k]=ans[k];

  }

  public static void main(String[] args) {
     int arr[] = { 5,4,3,2,1 };
     ms(arr,0,5);
    System.out.println(Arrays.toString(arr));
  }
}
