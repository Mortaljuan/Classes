public class Main {

    public static void main(String[] args) {
        Student juan = new Student("juan","000564878",17,'m');
        Student samuel = new Student();
        System.out.println(juan);
        System.out.println(samuel);
        System.out.println(juan.studentId);
        System.out.println(samuel.studentId);
    }
}
