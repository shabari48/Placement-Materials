class Solution {

  int print2largest(int arr[], int n) {
    // code here
    int max = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] > max) max = arr[i];
    }

    int newmax = 0, flag = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] > newmax && arr[i] != max) {
        newmax = arr[i];
        flag = 1;
      }
    }
    if (flag == 1) return newmax; else return -1;
  }
}
