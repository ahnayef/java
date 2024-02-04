package Practice.Array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array length: ");
            int len = sc.nextInt();
            int arr[] = new int[len];

            System.out.print("Enter " + len + " element: ");

            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i : arr) {
                System.out.println(i);
            }
        }

    }

}
