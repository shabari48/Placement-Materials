import java.util.*;

public class palindromealp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int i, j;
    for (i = 0, j = c.length - 1; i < c.length / 2; i++, j--) {
      if (c[i] != c[j]) {
        if (c[i] == c[j - 1] && (i != j - 1)) {
          System.out.print(c[j]);
          break;
        } else {
          System.out.print(c[i]);
          break;
        }
      }
    }
  }
}
