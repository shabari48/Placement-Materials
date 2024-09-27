import java.util.*;
public class merge{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
        int arr[][]= new int[n][2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    
        sortinput(arr);
        
        int i=0,j=1;

        while(j<n){
            if(arr[i][1]>=arr[j][0]){
                arr[i][1]=Math.max(arr[i][1],arr[j][1]);
            }
            else{
                System.out.println("["+arr[i][0]+" "+arr[i][1]+"]");
                i=j;
            }

            j++;
        }

        System.out.println("["+arr[i][0]+" "+arr[i][1]+"]");
       
    }

    public static void sortinput(int arr[][]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j][0]>arr[i][0]){
                    int temp[]=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }




}