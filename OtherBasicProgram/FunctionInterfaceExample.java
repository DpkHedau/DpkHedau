@FunctionalInterface
interface FInterface {

    int addition(int a ,int b);
}
public class FunctionInterfaceExample {
    public static void main(String[] args) {


        FInterface fI = (a, b) -> a + b;
        int result = fI.addition(3, 5);
        System.out.println(result);
    }
}