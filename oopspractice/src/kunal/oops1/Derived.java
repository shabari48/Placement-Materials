package kunal.oops1;

public class Derived extends Sample {
    int id;

    public Derived() {
        super();
        this.id = id;
    }

    Derived(int age, String name, int id ){
        super(name,age);
        this.id = id;
    }

    protected  void fun(){
        System.out.println("Hi Derived");
    }


}

