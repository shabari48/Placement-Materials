class Base {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
class test {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.show();
    }
}