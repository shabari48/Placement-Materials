class removeunitdigitoccurence {

  public static void main(String[] args) {
    String str = "6887686796";//Integer.toString(x); sc.nextLine();
    char arr[] = str.toCharArray();
    Integer n = arr.length;
    char ch = arr[n - 1];

    String ans = "";

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != ch) {
        ans += arr[i];
      }
    }
    
    if(ans.length()==0){
      System.out.println("-1");
    }
    else{
  
    Integer ans1 = Integer.parseInt(ans);
    if(ans1==0){
      System.out.println("0");
    }
    else{
      System.out.println(ans1);
    }
  }
}
}
