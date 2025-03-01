public class Student {
    //instance Fields
    String studentName;
    String studentId = "000000000";
    int studentAge;
    char studentGender;

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
}
