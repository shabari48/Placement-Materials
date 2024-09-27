import java.util.Scanner;

public class primarycolour {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    if (str.indexOf('r') == -1 && str.indexOf('R') == -1) System.out.println(
      "red"
    ); else if (
      str.indexOf('g') == -1 && str.indexOf('G') == -1
    ) System.out.println("green"); else if (
      str.indexOf('b') == -1 && str.indexOf('B') == -1
    ) System.out.println("blue");
  }
}
