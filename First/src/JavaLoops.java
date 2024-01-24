import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            int i = 2;
            System.out.println("While:");
            while (i <= a) {
                System.out.print(i + " ");
                i += 2;
            }

            System.out.println("\nFor:");
            for (int j = 2; j <= a; j += 2) {
                System.out.print(j + " ");
            }

        }
    }
}
