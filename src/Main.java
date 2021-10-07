import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your first name:");
        String firstName = in.nextLine();

        System.out.println("Input your last name:");
        String lastName = in.nextLine();

        System.out.println("Input your age:");
        int age = in.nextInt();

        System.out.println( "\n" + firstName + " "+ lastName + " is " + age + " years old;" );
        in.close();

    }
}
