package kunal.oops1;

public class Sample {
        String name;
        int age;

    public Sample() {
        this.name = "Default Name";
        this.age=13;
    }

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }


    protected  void fun(){
        System.out.println("Hi");
    }



}
