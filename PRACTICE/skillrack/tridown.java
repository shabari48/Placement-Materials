import java.util.Scanner;

/**
 * tridown
 */
public class tridown {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        n++;
        for(int i=0;i<n;i++) System.out.print("_");
        System.out.println();
        int l=0;
        int r=n-1;

        while (l<r) 
        {
            for(int i=0;i<r;i++){
                if(i==l) System.out.print("\\");
                else System.out.print("*");
            }
            System.out.println("/");
             l++;
             r--;
        }
       
    }
}