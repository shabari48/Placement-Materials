import java.util.Scanner;

public class timearrival {

  public static void main(String args[]) {
    String str = "10:00 9:55 10:02 9:45 11:00";
    String[] s1 = str.split(" ");
    String name = " ";
    int count = 0;

    for (String val : s1) {
   
      Scanner scanner = new Scanner(val);

      scanner.useDelimiter(":");
      String s = scanner.next();
      String s2 = scanner.next();
    //  System.out.println(s2);
      int x=Integer.parseInt(s);
      int y=Integer.parseInt(s2);

      // System.out.println(x+" "+y);

      if(x>=10 && y>0||x>10) count++;
    }
    System.out.println(count);
  }
}