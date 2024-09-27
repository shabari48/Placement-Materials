public class reversetrianglepatter {
    public static void main(String[] args) {
        int n=14;
        int mid=0;
        if(n%2==0) mid=n/2; else mid=(n/2)+1;
      
        
        for(int i=1;i<=mid;i++){
            int num=i;
            for(int j=1;j<=n;j++){
                if(j==num || j==n-num+1)
                System.out.print("*");
                else
                 System.out.print("#");
            }
            System.out.println();
        }
  
}
}
