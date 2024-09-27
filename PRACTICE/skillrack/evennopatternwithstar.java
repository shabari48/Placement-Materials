
import java.util.*;
public class evennopatternwithstar {
   


    public static void main(String[] args) {
		//Your Code Here
   Scanner sc= new Scanner(System.in);
   int n=sc.nextInt();
   int m=(n/2),temp=n;
   
   for(int i=0;i<m;i++){
       int a=1,b=temp;
       for(int j=0;j<n-i;j++){
           if(j<i) System.out.print("*");
           else{
               if(j<m)
                   System.out.print(a++);
                else 
                   System.out.print(b--);
               
           }
           System.out.print(" ");
       }
       System.out.println();
       temp-=2;
   }
	}
}
