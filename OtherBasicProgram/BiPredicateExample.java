import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (a, b)->a.equals(b);
        Boolean result=biPredicate.test(5,5);
        System.out.println(result);

        BiPredicate<String,String> biPredicateStringCompare = (str1,str2)->str1.equalsIgnoreCase(str2);
        Boolean resultOfBiPredicateString =  biPredicateStringCompare.test("Dipak","Dipak");
        System.out.println(resultOfBiPredicateString);

    }
}
