

class oops1
{
    public static void main(String[] args) {

        Student s1=new Student(85,"Sappu",88.0f); // Student() is default constructor this will be called
        //  when we have not defined any other constructor . if we have defined a constructor like
        // Student(i1,i2) and used new Student() then it will cause error 
        


       // System.out.println(s1); // prints random values  when a object is
        // print will automatically calls the toString method which prints by default Classname@memoryaddress
        //System.out.println(s1.toString()) are that prints same

        //when values are printed without initializing they print default values. For non primitve types 
        // Integer,Character,String prints null;

        System.out.println(s1.rollno);  
        System.out.println(s1.name);
        System.out.println(s1.marks);
     
        

        // Student s2;
        // for(int i=0;i<10000000;i++)
        //   s2=new Student();  // Garbage collection occurs when an object is not pointed by a reference 
        //variable and before an object is destroyed finalize metho will be called;

 //   String str1 = "abc";
// String str2 = "abc";
// System.out.println(str1 == str2); // true, because of string interning
// System.out.println(str1.equals(str2)); // true, because the content is the same

// String str3 = new String("abc");
// String str4 = new String("abc");
// System.out.println(str3 == str4); // false, because they are different objects
// System.out.println(str3.equals(str4)); // true, because the content is the same

// == is used for checking if the refernces are pointing to same. in Tnteger from -128 to 127 
//two values when compared using == gives true above that range it givres false

// Integer a=-129;   
// Integer b=-129;
// System.out.println(a==b);  // false
 

      String a="hi"; // a  is pointing the string hi
      a.concat("bye"); // when a is concatnated a string it becomes a new object
      System.out.println(a); // so it gives hi as output
      
    
     

    }

}

class Student{
     int rollno;
    String name;
    float marks;

    Student(){ 
        

    }
    Student(int rollno,String name){
        //this();// calls Student() constructor and has to be in first line 
        // called as constructor chaining
        this.rollno=rollno;
        this.name=name;

    }
  

    Student(int rollno,String name, float marks){
        this(rollno,name);  // this will call the constructor Student(int roollno,String name) and it has to be in first line
         //this(); this will cause error coz i can call only 
        //constructor from a constructor 
        this.marks=marks;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     // TODO Auto-generated method stub
    //     super.finalize();
    //     System.out.println("Object Destroyed");
    // }
    

}


// this is used for referring to  the current instance and 
// also differentiate local and instance variable and to call constructors

// Student shabari=new Student(85,"Shabari Prakash") 

//  Student(int rollno,String name){
//     this.rollno=rollno;   this will act like shabari.rollno=that passed rollno
//     this.name=name;
// }
