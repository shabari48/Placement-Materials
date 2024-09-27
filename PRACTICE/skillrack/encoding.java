import java.util.Scanner;

public class encoding {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int n = str.length();
    String x = sc.next();
    String y = sc.next();
    String str1 = "", str2 = "";

    //Reverse
    StringBuilder sd = new StringBuilder(x);
    String rev = sd.reverse().toString();

    if (rev.equals(y)) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (i <= n - x.length() && str.substring(i, i + x.length()).equals(x)) {
                result.append('a');
                i += x.length();
            } else if (i <= n - y.length() && str.substring(i, i + y.length()).equals(y)) {
                result.append('b');
                i += y.length();
            } else {
                result.append(str.charAt(i));
                i++;
            }
        }
        System.out.println(result.toString());
    }
   else if (y.contains(x)) {
      str1 = str.replace(y, "b");
      str2 = str1.replace(x, "a");
      System.out.println(str2);
    } 
      
  else {
      str1 = str.replace(x, "a");
      str2 = str1.replace(y, "b");
      System.out.println(str2);
    }

    sc.close();
  }
}
