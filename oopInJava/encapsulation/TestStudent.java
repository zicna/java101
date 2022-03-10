class StudentOne{
    private int id;
    private String studentName;
    private String studentCollege;
    private String studentAddress;
    
    // declare all setters
    public void setId(int id){
        this.id = id;
    }
    public void setStudentName(String name){
        this.studentName = name;
    }
    public void setStudentCollege(String college){
        this.studentCollege = college;
    }
    public void setStudentAddress(String address){
        this.studentAddress = address;
    }

    // declare getters
    public int getId(){
        return id;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentCollege(){
        return studentCollege;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
}

class TestStudent{
    public static void main(String args []){
        System.out.println("helllo");
        StudentOne s = new StudentOne();
        
        // s.studentName;
        s.setStudentName("Milan");
        System.out.println(s.getStudentName());
    }
}