class countandsay {
    public static String countAndSay(int n) {
      
      int j=0;
    
      
      String s="1";
      
      while(n>1){
      StringBuilder sb=new StringBuilder();
      int count=1;
      j=0;
      while(j<s.length()){
        if(j==s.length()-1){
            sb.append(Integer.toString(count)+s.charAt(j));
            break;
        }
        else if(s.charAt(j)==s.charAt(j+1))
          count++;
        else{
            sb.append(Integer.toString(count)+s.charAt(j));
            count=1;
        }
        j++; 
      }
      s=sb.toString();
      n--;
      }
     return s;
        
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(countAndSay(n));
    }
}