import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String name = "Ahn";

            System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());
            System.out.println(name.compareTo("AHn"));

            String greetName = sc.nextLine();

            System.out.println("Hello, " + greetName);
        }

    }
}
