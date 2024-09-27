
public class Static{
        int stdid;

        Static(){
            this.stdid=1;
        }

     class inner {
        String name;
        
        inner(String name){
            super();
            this.name=name;
        }

         static void fun(){
            System.out.println("Hello");
        }
    }

    void greet(){

        final int x=90;

        class InnerStatic {
           
             final void printx(){
                System.out.println(x);
            }
            
        }

        InnerStatic is= new InnerStatic();
        is.printx();
    }

    public static void main(String[] args) {
        Static.inner i1= new Static().new inner("Sappu");
        System.out.println("Static.main()");
        inner.fun();
        Static s = new Static();
        s.greet();
    }
    
}
