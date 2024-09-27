import java.util.*;
import java.math.BigInteger;
import java.util.Scanner;


    public class reversefibonacci {
        public static void main(String[] args) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            BigInteger m = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger();
            System.out.print(n + " " + m + " ");
            while (n.subtract(m).compareTo(BigInteger.ZERO) > 0) {
                BigInteger t3 = n.subtract(m);
                System.out.print(t3 + " ");
                n = m;
                m = t3;
            }

            System.out.print("0");
        }
    }
