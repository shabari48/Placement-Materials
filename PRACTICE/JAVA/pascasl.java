import java.util.*;

public class pascasl {

    static void variation1(int n){

        List<List<Integer>> pascal= new ArrayList<List<Integer>>();
        ArrayList<Integer> row,prev=null;
        for(int i=0;i<n;i++){
            row=new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    row.add(1);
                else
                    row.add(prev.get(j-1)+prev.get(j));
            }
            prev=row;
            pascal.add(row);
        }

        for(int i=0;i<n;i++){
            System.out.println(pascal.get(i));
        }

    }

    static void variation2(int row,int col){
         long res=1;

         for(int i=1;i<col;i++){
            res *= row-i;
            res/=i;
         }
      
         System.out.println(res);
    }
    static void variation3(int row){
          long res=1;
          ArrayList<Long>  nthrow =new ArrayList<>();

          for(int i=0;i<row;i++){
        
            nthrow.add(res);
            res*= row-(i+1);
            res/= i+1;
          }

      
            System.out.println(nthrow);
          

        }
    
    public static void main(String[] args) {
        int row=6,column=3;
        variation1(row);  // print n rows
        variation2(row,column);  // print the number based on row and column
        variation3(row); //.print nth row



    }
}
