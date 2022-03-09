public class Dog{
    String name;
    int age;

    // * declare constructor, and by doing so we are losing defualt contructor provided by compiler
    // * if no constructor => The compiler automatically provides a no-argument, default constructor for any class without constructors. 
    public Dog(String name){
        this.name = name;
    }
    // * constructor overloading 
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(int age, String name){
        this.name = name;
        this.age = age;
    }
}

// * use this when you want to refer to the field on the object

// ! NOTES 
// * a constructor cannot be overridden. If you try to write a super class's constructor in the sub class compiler treats it as a method and expects a return type and generates a compile time error.