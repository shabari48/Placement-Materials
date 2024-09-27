import java.util.Scanner;

class oddincerasingevendecreasingpattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        System.err.print("-");
      }

      int count=1, odd=1;
      while(count<=(2*i)+1)
         {
            System.out.print(odd);
            odd+=2;
            count++;
         }


      System.out.println();
    }


  }
}
