public class Try {
  public static void main(String[] args) {
    int n = 4;
    int startreduce = n;
    int start = 1;

    for (int row = 1; row <= n; row++) {
      int spaces = n - row;
      int i;
      for (i = 0; i < spaces; i++) {if(row==1) System.out.print("   "); else System.out.print("    ");}
      
      int printvalue = start;
      int reduce = spaces + 1;
      for (int col = 0; col < row; col++) {
        System.out.print(printvalue + "  ");
        printvalue = printvalue - (reduce++);
      }
      start = start + startreduce--;
      System.out.println();
    }
  }
}
