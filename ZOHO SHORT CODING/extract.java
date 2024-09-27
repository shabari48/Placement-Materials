public class extract {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcde";
        int n1=s1.length(),n2=s2.length();
        int i=0,j=0;
        boolean flag=false;
        String ans1="",ans2="";
        while(i<n1){
            if(s1.charAt(i)!=s2.charAt(j)){
                ans1+=s1.charAt(i);
                ans2+=s2.charAt(j);
                flag=true;
            }
        
            if(s1.charAt(i)==s2.charAt(j)&& flag==true){
                System.out.print(ans1+" "+ans2);
                System.out.println(

                );
                flag=false;
                ans1="";
                ans2="";
            }

            i++;
            j++;
        }
    if(ans1.length()!=0)
        System.out.println(ans1+" "+ans2);

    }
    
}
