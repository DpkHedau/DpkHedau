import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printMessage = System.out::println;

        printMessage.accept("My Name is Dipak");

        Consumer<Integer> operationOnConsumer = System.out::println;
        operationOnConsumer.accept(5*5*5);

    }
}
