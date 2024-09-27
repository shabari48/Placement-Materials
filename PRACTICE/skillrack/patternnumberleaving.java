import java.util.Scanner;

public class patternnumberleaving {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char arr[]=str.toCharArray();
       int n=arr.length;
       //System.out.println(n);
       
     
       for(int i=0;i<n;i++){
        String s="";
        for(int j=0;j<arr[i]-'0';j++)
            {
                String temp="";
                for(int k=0;k<n;k++)
                {
                    if(k==i) continue;
                     temp+=arr[k];
                }
                s=temp;
                System.out.print(s+" ");
            }
            System.out.println();
                
        }
    }
}
