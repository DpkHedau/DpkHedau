import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> evenNumberPredicate =  (n)->n%2==0;
        Predicate<Integer> oddNumberPredicate =  (n)->n%2!=0;

        Predicate<String> startWithPredicate = (s) -> s.startsWith("s");
        Predicate<String> checkStringPredicate = (s) -> s.equalsIgnoreCase("Dipak");

        

        System.out.println("Number is Even :: "+evenNumberPredicate.test(5));
        System.out.println("Number is Odd :: "+oddNumberPredicate.test(5));

        System.out.println("String Start With :: "+startWithPredicate.test("m"));
        System.out.println("Check String :: "+checkStringPredicate.test("Dipak"));







    }

}
