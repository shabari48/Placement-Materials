/**
 * mypower
 */
public class mypower {

    public static void main(String[] args) {
        double x=myPow(0.00001,200);
        System.out.println(x);
    }
    static double myPow(double x, int n) {
        if(n==1)
            return x;
         if(n<0)
             return myPow(1/x,-n);

        return myPow(x,n-1) * myPow(x,1);
    }
}