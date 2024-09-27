public class numppluscharpatter {

  public static void main(String[] args) {
    int n = 5;
    char ch = '*';

      int i=0,j=0;
      while(i<n-1){
        j=0;
        while(j<n+i){
          if(j<n-i-1) System.out.print("-");
          else if(j==(n-1-i)) System.out.print(ch+" ");
          else System.out.print(ch+" ");
          j++;
        }
         System.out.println();
        i++;
      }

     
    

    for ( i = 0; i < (2 * n); i++) System.out.print(ch + " ");
    System.out.println();
    //   for(int i=0;i<n;i++){

    //   }

  }
}


