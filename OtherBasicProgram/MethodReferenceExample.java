import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "JavaScript", "C++");
        
        names.forEach(System.out::println);
    }
}
