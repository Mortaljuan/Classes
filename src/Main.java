import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student juan = new Student("Juan", " 000564878 ", 18, 'm');
        Student samuel = new Student();

        System.out.println("Información de Juan:");
        juan.tellInfo();
        System.out.println("ID de Juan: " + juan.studentId);
        String juanEmail = juan.getEmail();
        System.out.println("Email de Juan:" + juanEmail);

        juan.repeatAfter("No soy ni Goku ni Vegeta,soy el encargado de eliminarte");
        System.out.print("¿Has cumplido años? (si/no): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            juan.haveBirthday();
            System.out.println("¡Feliz cumpleaños, " + juan.studentName + "! Ahora tienes " + juan.studentAge + " años.");
        } else {
            System.out.println("No se realizaron cambios en la edad.");
        }

        scanner.close();
    }
}
