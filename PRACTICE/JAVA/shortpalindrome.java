public class shortpalindrome  {
        public static String shortestPalindrome(String s) {
            int i=0;
            int j=s.length()-1;
            StringBuilder sb=new StringBuilder(s);
            while(i<j)
            {
                if(s.charAt(i)==s.charAt(j))
                 {
                    i++;
                    j--;
                 }
                 else
                 {
                    sb.insert(i,s.charAt(j));
                    j++;
                 }
            }
            return sb.toString();
        }
        public static void main(String[] args) {
            String que="aacecaaa";
            String ans=shortestPalindrome(que);
            System.out.println(ans);
        }
    }
