public class Student {
    //instance Fields
    String studentName;
    String studentId = "000000000";
    int studentAge ;
    char studentGender;
    String studentEmail = " por asignar";

    public Student(){
        System.out.println("Student created without data!");
    }
    //builder
    public Student(String name, String id, int age, char gender){
        studentName = name;
        studentId = id;
        studentAge = age;
        studentGender = gender;
        System.out.println("Student \"" + studentName + "\" created!");
    }
    public void tellInfo(){
        System.out.println("My name is " + studentName + " and my ID is " +  studentId );
        System.out.println("I am " + studentAge + " and my gender is " + studentGender );
    }
    public void repeatAfter(String message){
        System.out.println("The message is: " + message);
    }

    public void haveBirthday(){
        studentAge++;
    }
    public String getEmail(){
        return studentEmail;
    }
    public String toString(){
        return "Student " + studentName;
    }
}
