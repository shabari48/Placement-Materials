class iterativebs{
    public static void main(String[] args) {
        
        int arr[]={2,22,23,43,56,64,77,88,121,134,552,764,899};
        int res=binarySearchIterative(arr, 56);
        if(res==-1)
          System.out.println("Element is not present in the array");
        else
          System.out.println( "Element is present at index "+res);  
    }

    public  static int binarySearchIterative(int arr[], int x){
   int l=0;
   int h=arr.length-1;
       while(l<=h){

        int mid=(l+h)/2;
        if(arr[mid]==x)
           return mid;
        else if(x> arr[mid])
           l=mid+1;
        else
        h=mid-1;

       }
       return -1;
    }

}