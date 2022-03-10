package inheritance.simple;
class Employee{
    float salary = 40000;
}

class simpleInheritance extends Employee {
    float bonus = 10000;

    public static void main(String args []){
        simpleInheritance p = new simpleInheritance();
        System.out.println("Programmer salary is " + p.salary);
        System.out.println("Programmer bonus is  " + p.bonus);
    }
}

// side note:
// in order to call main from second class with commands:
// javac simpleInheritance.java => compile and creates class file
// java simpleInheritance 
//! class with main method needs to be named same as file


