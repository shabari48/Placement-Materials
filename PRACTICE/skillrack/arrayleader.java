import java.util.*;
class arrayleader{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int max=0;
    
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                al.add(max);
            }
        }
        Collections.reverse(al);
        return al;
    }
}