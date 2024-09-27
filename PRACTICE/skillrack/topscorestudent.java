import java.util.Scanner;

public class topscorestudent {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    String[] s1 = new String[n];
     sc.nextLine();

    for (int i = 0; i < n; i++)
       s1[i] = sc.nextLine();  
       
    /*  s1[0] = "Sasikumar:50:60:70" 
       s1[1]=Arun:60:40:90 
       s1[2]=Manoj:50:50:60"
       s1[3]=Rekdha:60:35:45"];
       */ 

    String name = " ";
    int max = 0;

    for (String val : s1) {  //Take each String from the array
      // System.out.println(val);
      int sum = 0;
      Scanner scanner = new Scanner(val);// Scans each String Eg:"Sasikumar:50:60:70" Scans this string

      scanner.useDelimiter(":");
      String s = scanner.next(); // Only take the  first name like "Sasikumar" as we are using colon only scans upto that
      //System.out.println(s);

      while (scanner.hasNext()) {  //A  loop for reading numbers from the String  and add it to sum .After reading Sasikumar next one by one each number is read and added to sum
        String s2 = scanner.next();
        // System.out.println(s2);
        int x = Integer.parseInt(s2);
        sum += x;
      }

      if (sum > max) {  // max value and corresponding name is found
        max = sum;
        name = s;
      }
    }
    System.out.println(name);
  }
}
