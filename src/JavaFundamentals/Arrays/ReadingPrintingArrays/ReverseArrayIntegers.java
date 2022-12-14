package JavaFundamentals.Arrays.ReadingPrintingArrays;

import java.util.Scanner;

public class ReverseArrayIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Create an integer array with n as number of arrays
        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

    }
}
