import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0){
                if (i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

//FizzBuzz HackerRank
//import java.util.Scanner;
//
//class Solution {
//
//    /*
//     * Complete the 'fizzBuzz' function below.
//     *
//     * The function accepts INTEGER n as parameter.
//     */
//
//    public static void main(String[] args) {
//        // Write your code here
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 1; i <= n; i++){
//            if (i % 3 == 0){
//                if (i % 5 == 0){
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//}
