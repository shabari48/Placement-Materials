import java.util.Scanner;

public class binaryformation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] = new String[n];
    int flag = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();
    }


    String binary[] = onezero(arr);


    StringBuilder sd = new StringBuilder();

    for (String s : binary) {
      if (s != null) {
        flag = 1;
        String temp = removeZero(s);
        sd.append(temp);
      }
    }

    if (flag == 0) System.out.println("-1"); else {
      String result = sd.toString();
      System.out.println(result);
      Integer decimal = Integer.parseInt(result, 2);
      System.out.println(decimal);
    }
  }

  public static String[] onezero(String[] arr) {
    int i = 0;
    for (String s : arr) {
      int flag = 0;
      StringBuilder sb = new StringBuilder();
      for (char c : s.toCharArray()) {
        if (c == '0' || c == '1') {
          sb.append(c);
          flag = 1;
        }
      }
      if (flag == 0) arr[i++] = null; else arr[i++] = sb.toString();
    }
    return arr;
  }

  public static String removeZero(String str) {
    int i = 0;
    while (i < str.length() && str.charAt(i) == '0') i++;
    StringBuffer sb = new StringBuffer(str);
    if(i==str.length()) return "0";
    sb.replace(0, i, "");
    return sb.toString();
  }
}
