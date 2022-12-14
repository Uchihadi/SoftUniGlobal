package JavaFundamentals.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = numbers.size();
        for (int i = 0; i < size/2; i++){
            // They have access to the entire array
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size()-1));
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}