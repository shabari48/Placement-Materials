import java.util.HashMap;

public class autobiagrpah {
    public static void main(String[] args) {
        String num="3211000";
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=num.length();
        for(int i=0;i<n;i++)
        {
            char e=num.charAt(i);
            Integer val=hm.get(e);
            if(val!=null)
             hm.put(e, val+1);
            else
             hm.put(e,1);
        }
        for(int i=0;i<n;i++)
        {
          
            char key = (char) (i + '0');
            int a=hm.getOrDefault(key, 0);
            int b=num.charAt(i)-'0';
            if(a!=b)
            {
                System.out.println("no");
                return ;
            }
            
        }
        System.out.println("yes");
    }

}