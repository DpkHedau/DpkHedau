import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvenNumberAndFilterThemUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> evenNumber = (n)->n%2==0;
        List<Integer> listOfInteger =  numbers.stream()
                                        .filter(evenNumber)
                                        .filter(n->n>5)
                                        .collect(Collectors.toList());

        System.out.println(listOfInteger);

        List<String> listString = Arrays.asList("Dipak","Akash","Vipul","Pravin","Gopal");

        List<String> stringList = listString.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(stringList);


        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the sum of the elements using reduce
        int sum = numbers1.stream()
                .reduce(5, (a, b) -> a + b);  // Initial value: 0, binary operator

        // Print the sum
        System.out.println("Sum: " + sum);  // Output: Sum: 15
    }
}
