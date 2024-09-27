import java.util.*;

public class primebet2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();

    int ans = countprime(n1, n2);
    System.out.print(ans);
  }

  static int countprime(int n1, int n2) {
    int count = 0;
    for (int i = n1; i <= n2; i++) {
      if (isprime(i)) count++;
    }
    return count;
  }

  static boolean isprime(int i) {
    if (i <= 1) return false;
    for (int j = 2; j <= i / 2; j++) {
      if (i % j == 0) return false;
    }
    return true;
  }
}
