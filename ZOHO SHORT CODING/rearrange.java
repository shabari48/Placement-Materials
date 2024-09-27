public class rearrange {
    public static void main(String[] args) {
        //int arr[]={1,8,5,7,4};
        //int arr[]={7,5,2,11,13,6};
        int arr[]={4,9,-1,-2,6,8,5};
        int n=arr.length;
        int i=0,j=n-1;
        boolean turn=true;
        while(i!=j){
            if(turn){
                int maxindex=i;
                int inc=i;
                while(inc<=j){
                    if(arr[inc]>arr[maxindex]){
                        maxindex=inc;
                    }
                    inc++;
                }
                int temp=arr[i];
                arr[i]=arr[maxindex];
                arr[maxindex]=temp;

                i++;
                turn=false;

            }
            else{
                int maxindex=j;
                int inc=j;
                while(inc>=i){
                    if(arr[inc]>arr[maxindex]){
                        maxindex=inc;
                    }
                    inc--;
                }
                int temp=arr[j];
                arr[j]=arr[maxindex];
                arr[maxindex]=temp;

                j--;

                turn=true;

            }


        }

        for(int v=0;v<n;v++)
          System.out.print(arr[v]+" ");


    }

}
