class Student{
    // private data
    private String name; 

    // public getter method
    public String getName(){
        return name;
    }

    // public writer method

    public String setName(String name){
        this.name = name;
        return name;
    }

    // constructor
    Student(String name){
        this.name = name;
    }
}


class testEncapsulation{
    public static void main(String args []){
        Student s = new Student("Milan");
        // System.out.println(s.name);
        // =>error: name has private access in Student

        System.out.println(s.getName());
        s.setName("Zicko");
        System.out.println(s.getName());

    }
}