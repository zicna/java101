public class Constructors {
    public static void main(String[] args){
        Dog myDog = new Dog("Hello");
        Dog myDogOne = new Dog("Brila", 5);
        Dog myDogRevere = new Dog(4, "Sapa");
        System.out.println("first dog name is: " + myDog.name+ " and second dog name is " + myDogOne.name + " and last dog name is " + myDogRevere.name) ;
    }
}



//*  javac Constructor.java 
// reads source file (package, module, type, declarations) and compiles into a class file
// ! after every change in java file run javac command
// * java Constructor

