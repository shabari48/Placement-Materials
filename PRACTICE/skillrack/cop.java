public class cop {

  public static void main(String[] args) {
    int n = 6;
    char ch = '#';

     for (int i = 0; i < n - 1; i++) {   //upper half
  
      for (int j = 0; j < n - 1 - i; j++) {
        System.out.print("- ");
      }
     
      if(i==0){
       System.out.print(ch+" ");
      }  
      else{
        for(int j=0;j<=(2*i);j++){
          if(j%i==0)
          System.out.print(ch+" ");
          else
        System.out.print("- ");
        }
      }

      System.out.println();
    }                                       //upper half ends

    for (int i = 0; i < (2 * n)-1; i++) System.out.print(ch + " ");   //middle line    # # # # # # # # # # # 
    System.out.println();
   

    
    for (int i = n-2; i>-1; i--) {            //lower half

      for (int j = 0; j < n - 1 - i; j++) {
        System.out.print("- ");
      }
     
      if(i==0){
       System.out.print(ch+" ");
      }  
      else{
        for(int j=0;j<=(2*i);j++){
          if(j%i==0)
          System.out.print(ch+" ");
          else
        System.out.print("- ");
        }
      }

      System.out.println();
    }
                                            //lower half ends



  }
}
