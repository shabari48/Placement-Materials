public class validip {

    static int validipadress(String ip){
       
        for(char c:ip.toCharArray()){
            if(Character.isAlphabetic(c)&&c!='.'){
                return 0;
            }
        }
        int count=0;

        for(int i=0;i<ip.length();i++){
            if(ip.charAt(i)=='.'){
                count++;
            }
        }
        if(count!=3){
            return 0;
        }




        return 1;

    }
    public static void main(String[] args) {
        String ip="2";
        
      System.out.println(validipadress(ip));
        
    }
    
}
