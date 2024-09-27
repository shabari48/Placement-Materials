import java.util.Scanner;

public class xmastreeprintstring {
        public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		int p=len/2,n=p;
		for(int i=0;i<=len/2;i++){
		    for(int j=0;j<len;j++){
		        if(j==p||j==n)
		         System.out.print(s.charAt(j));
		        else 
		        System.out.print("*");
		    }
		    p--;n++;
		    System.out.println();
		}

	}
    
}
