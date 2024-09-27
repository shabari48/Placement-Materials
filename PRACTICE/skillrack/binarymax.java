import java.util.Scanner;

public class binarymax {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         String bin=Integer.toBinaryString(n);  
         String arr[]= formString(bin);
         int max=0;
         for(String s:arr) {
            int num = Integer.parseInt(s,2);
            if(num>max)
                max=num;
         }
            System.out.println(max);

    } 

    public static String[] formString(String bin) {
        String[] arr = new String[bin.length()];
        for(int i=0;i<bin.length();i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<bin.length();j++) {
                 if(j!=i)
                    sb.append(bin.charAt(j));
            }
           arr[i] = sb.toString();
        }
        return arr;
    }
    
}
