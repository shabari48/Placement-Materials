import java.io.*;
import java.util.*;

public class kadens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int maximum=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<n;i++){
            
            sum+=arr[i];
            
            if(sum>maximum)
                maximum=sum;
            
            if(sum<0)
                sum=0;
        }
        
        System.out.println(maximum);
    }
}