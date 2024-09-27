import java.util.Arrays;

public class quicksort {
    public static void qs(int arr[],int low,int high){
        if(low>=high)return;

        int s=low;
        int e=high;
        int mid=(s+e)/2;
        int pivot=arr[mid];

        while(s<=e){
            while(arr[s]<pivot)s++;
            while(arr[e]>pivot)e--;

            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        qs(arr,low,e);
        qs(arr,s,high);
    }
    
     public static void main(String[] args) {
    int arr[] = { 5,4,3,2,1 };
    qs(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));
  }
}

/*
 *Let's go through a dry run of the code.

**Initial Array:**
```
arr[] = { 5, 4, 3, 2, 1 }
```
**First Iteration:**
The `qs` function is called with the initial array, and the indices `0` and `4` (last index of the array).
```
qs(arr, 0, 4)
```
Assuming the `qs` function implements the standard quicksort algorithm, it will:

1. Choose a pivot element (let's say the middle element, `arr[2] = 3`).
2. Partition the array around the pivot element.
3. Recursively call `qs` on the subarrays.

**Partitioning:**
After partitioning, the array might look like this:
```
arr[] = { 2, 1, 3, 5, 4 }
```
The pivot element `3` is in its final position. The elements less than `3` are on the left, and the elements greater than `3` are on the right.

**Recursive Calls:**
The `qs` function will now be called recursively on the subarrays:

1. `qs(arr, 0, 1)` (left subarray: `{ 2, 1 }`)
2. `qs(arr, 3, 4)` (right subarray: `{ 5, 4 }`)

**Second Iteration:**
Let's focus on the left subarray `{ 2, 1 }`.
```
qs(arr, 0, 1)
```
The pivot element is chosen (let's say the first element, `arr[0] = 2`).
The array is partitioned, and the pivot element is moved to its final position:
```
arr[] = { 1, 2, 3, 5, 4 }
```
No recursive calls are needed for this subarray, as it has only one element.

**Third Iteration:**
Now, let's focus on the right subarray `{ 5, 4 }`.
```
qs(arr, 3, 4)
```
The pivot element is chosen (let's say the first element, `arr[3] = 5`).
The array is partitioned, and the pivot element is moved to its final position:
```
arr[] = { 1, 2, 3, 4, 5 }
```
No recursive calls are needed for this subarray, as it has only one element.

**Final Result:**
The array is now sorted:
```
arr[] = { 1, 2, 3, 4, 5 }
```
The `System.out.println` statement will print the sorted array.
 */