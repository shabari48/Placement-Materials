public class stringpattern {

  public static void main(String[] args) {
    String str = "abcdefghijklmno";
    StringBuffer sb = new StringBuffer(str);
    int i = 1;
    String substr = "";

    while (sb.length() > 0) {
      if (i % 2 == 1) {
        substr = sb.substring(0, Math.min(i, sb.length()));
        sb.delete(0, Math.min(i, sb.length()));
      } else if (i % 2 == 0) {
        substr = sb.substring(Math.max(0, sb.length() - i), sb.length());
        sb.delete(Math.max(0, sb.length() - i), sb.length());
      }
      System.out.println(substr);
      i++;
    }
  }
}