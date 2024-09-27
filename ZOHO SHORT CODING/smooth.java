import java.util.Arrays;

public class smooth {
  public static void main(String[] args) {
    //int arr[][]={{100,200,100},{200,50,200},{100,200,100}};
    //int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
    int arr[][]={{100,200,100,400},{200,0,100,100},{100,100,200,100}};
    int m=arr.length;
    int n=arr[0].length;
    int ans[][]= new int[m][n];
    
    for(int i=0;i<m;i++)
      Arrays.fill(ans[i], 0);

    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(i==0){  // 1st row
                if(j==0){
                    ans[i][j]=(arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1])/4;  // 1st row and 1st column
                }
                else if(j==n-1){
                    ans[i][j]=(arr[i][j]+arr[i][j-1]+arr[i+1][j]+arr[i+1][j-1])/4;  // 1st row and last column
                }
                else{
                    ans[i][j]=(arr[i][j]+arr[i][j-1]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j-1]+arr[i+1][j+1])/6;  // 1st row remaining column
                }
            }
            else if(i==m-1){ // last row
                if(j==0){
                    ans[i][j]=(arr[i][j]+arr[i][j+1]+arr[i-1][j]+arr[i-1][j+1])/4;  // last row and 1st column
                }
                else if(j==n-1){
                    ans[i][j]=(arr[i][j]+arr[i-1][j]+arr[i][j-1]+arr[i-1][j-1])/4;  // last row and last column
                }
                else{
                    ans[i][j]=(arr[i][j]+arr[i][j-1]+arr[i][j+1]+arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j+1])/6;  // last row remaining column
                }

            }
            else{ //remaining rows
                 
                if(j==0){ /// 1st column
                    ans[i][j]=(arr[i][j]+arr[i+1][j]+arr[i-1][j]+arr[i][j+1]+arr[i-1][j+1]+arr[i+1][j+1])/6;  
                }
                else if(j==n-1){ /// last column 
                    ans[i][j]=(arr[i][j]+arr[i+1][j]+arr[i-1][j]+arr[i][j-1]+arr[i-1][j-1]+arr[i+1][j-1])/6;  
                }
                else{ // remaining cells
                    ans[i][j]=(arr[i][j]+arr[i+1][j]+arr[i-1][j]+arr[i][j-1]+arr[i+1][j-1]+arr[i-1][j-1]+arr[i][j+1]+arr[i+1][j+1]+arr[i-1][j+1])/9; 
                }
            }

           
        }
    }
   

    for(int i=0;i<m;i++)
            System.out.println(Arrays.toString(ans[i]));





  }
}
