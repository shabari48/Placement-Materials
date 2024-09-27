public class recursivebs {

  public static void main(String[] args) {
    int arr[] = { 2, 22, 23, 43, 56, 64, 77, 88, 121, 134, 552, 764, 899 };
    int res = binarySearchIterative(arr, 89, 0, arr.length - 1);
    if (res == -1) System.out.println(
      "Element is not present in the array"
    ); else System.out.println("Element is present at index " + res);
  }

  public static int binarySearchIterative(int arr[], int x, int l, int h) {
    if (l > h) return -1;

    int mid = (l + h) / 2;
    if (arr[mid] == x) return mid; else if (
      x > arr[mid]
    ) return binarySearchIterative(
      arr,
      x,
      mid + 1,
      h
    ); else return binarySearchIterative(arr, x, l, mid - 1);
  }
}
