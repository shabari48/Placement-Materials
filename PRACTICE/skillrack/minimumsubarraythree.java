import java.util.Scanner;
class  minimumsubarraythree {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);    
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        
        int min=Integer.MAX_VALUE;
        int i=0;

    while(i<n) {
            int sum=0;
            sum+=arr[i]+arr[i+1]+arr[i+2];
            if(sum<min) {
                min=sum;
            }
            i+=3;
        }
        System.out.println(min);

    }
}
