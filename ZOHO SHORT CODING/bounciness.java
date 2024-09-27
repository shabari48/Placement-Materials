public class bounciness {
    public static void main(String[] args) {
        double height=25;
        double bi=0.5;
        System.out.printf("%.2f",10+ calculate(height,bi));
    }

    public static double calculate(double h,double bi){

        double value=h*bi;
        if(value>1)
         return 2*value+calculate(value, bi);
        else
          return 0;
    }

}
