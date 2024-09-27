class firstoccurence {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n=needle.length();
      ;

     int i=0,j=0,k=0;

     while(i<h && j<n){
        if(haystack.charAt(i)==needle.charAt(j)){
            i++;
            j++;
        }
        else{
            i=k+1;
            j=0;
            k=i;
        }
        if(j==n) return k;

     }
     return -1;

     
    }
    public static void main(String[] args) {
        firstoccurence obj=new firstoccurence();
        System.out.println(obj.strStr("a","a"));
        
    }
}