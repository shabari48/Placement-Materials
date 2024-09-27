public class equilibrium {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int n=arr.length;
        int result=equilibriumpoint(arr,n);
        System.out.println(result);
    }
    public static int equilibriumpoint(int arr[],int n){
    int lsum=0;
    int rsum=0;
    for(int i=0;i<n;i++) rsum+=arr[i];

    for(int i=0;i<n;i++){
        rsum=rsum-arr[i];
        if(lsum==rsum) return i+1;
        lsum=lsum+arr[i];
    }

    return -1;
}
}
