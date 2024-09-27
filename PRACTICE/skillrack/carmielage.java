import java.util.Scanner;

public class carmielage {

  public static void main(String args[]) {
    String str = "Car1@12.54 Car543@9.12 Car991@19.01 CarXYZ@7.5 carE@11.24";
    String[] s1 = str.split(" ");
    String name = " ";
    double min = Double.MAX_VALUE;

    for (String val : s1) {
   
     Scanner scanner = new Scanner(val);

       scanner.useDelimiter("@");
   String car = scanner.next();
   String mil = scanner.next();
   double m=Double.parseDouble(mil);
     //System.out.println(val);
   // System.out.println(car+" "+m);

      if(m<min){
        min=m;
        name=car;
      } 
    }
    System.out.println(name);
  }
}

