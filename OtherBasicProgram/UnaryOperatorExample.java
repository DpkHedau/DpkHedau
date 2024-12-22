import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperatorExample = (n)->n*n*n;
        Integer result = unaryOperatorExample.apply(5);
        System.out.println(result);
    }
}
