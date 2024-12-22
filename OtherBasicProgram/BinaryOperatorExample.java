import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        Integer result = add.apply(5,3);
        System.out.println(result);
    }
}
