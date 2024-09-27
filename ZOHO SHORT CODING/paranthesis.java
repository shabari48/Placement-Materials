import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        String s = "((a+b)+(c+d))";
        int n=s.length();
        System.out.println(dupe(s,n));
    }

    static String dupe(String s,int n){
         
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch==')'){
                int count=0;
                while(st.pop()!='('){
                    count++;
    
                }
                if(count<1){
                    return "Duplicate found";
                }
            }
            else{
                st.push(ch);
            }
        }
        return "No duplicate";
    }
}
