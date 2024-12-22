import java.util.function.Function;

public class FunctionJava8Class {
    public static void main(String[] args) {
        Function<String,String> functionString = (str) -> "My Name is "+str;

        functionString.apply("Dipak");
    }



}
