import java.util.Scanner;

public class removeduplicateconstantspace {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

    for (int i = 0; i < n; i++) {
      arr[arr[i] % n] += n;
    }
    for (int i = 0; i < n; i++) {
      if (arr[i] > 2 * n) System.out.print(i + " ");
    }
  }
}
//explanation

/*The program then iterates over the array. For each element arr[i], it increments the value at index arr[i] % n by n. 
This is done in the line arr[arr[i]%n]+=n;. The % n operation ensures that the index is within the bounds of the array.
This step effectively marks the presence of the number i in the array, 
because if i is present in the array, then after this step, arr[i] will be at least n.

Finally, the program iterates over the array again and prints the indices of the elements that are greater than 2*n.
These are the numbers that appear more than once in the array, because if a number i appears more than once, 
then arr[i] will have been incremented by n more than once, making it greater than 2*n.


 */
