import java.util.*;
public class highestmark {

    public static void main(String[] args) {
		//Your Code Here
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt(),x=sc.nextInt();
    HashMap<Integer,Integer> hmap=new HashMap<>();
    while(sc.hasNextInt()){
        int student=sc.nextInt();
        int mark=sc.nextInt();
        if(!hmap.containsKey(student))
           hmap.put(student,mark);
        else{
            int k=hmap.get(student);
            hmap.put(student,k+mark);
        }
     
        }
      
        int max=0,maxkey=0;
        for(int i:hmap.keySet()){
        int a=hmap.get(i);
            if(a>max)
             {
                 maxkey=i;
                 max=a;
             }
        }
        int xmark= hmap.get(x);
        
        if(n==1) System.out.println("0");
        else if(max==xmark) System.out.println("0");
        else
        System.out.println(max-xmark+1);
    
    
	}
}