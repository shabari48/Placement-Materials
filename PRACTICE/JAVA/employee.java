import java.util.Arrays;

public class employee {
    public static int sum(int a[])
{
    int c=0;
    for(int i=0;i<a.length;i++)
    {
       c+=a[i];
    }
    return c;
}
    public static void main(String[] args) {
        int a[]={6,4,1};
        int p=4;
        int q=1;
        int count=0;
        int ans;
        while(sum(a)>0)
        {
           int ele=a[0];
           ans=0;
            for(int i=1;i<a.length;i++)
            {
                if(ele<a[i])
                 ans=i;
            }
           
           
            for(int i=0;i<a.length;i++)
            {
                if(ans!=i)
                 a[i]=Math.max(a[i]-q,0);
                
            }
            a[ans]=Math.max(a[ans]-p,0);
            count++;
        }
        System.out.println(count);
    }
}