import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunctionAdd = (a,b)->a+b;
        Integer result = biFunctionAdd.apply(6,9);
        System.out.println(result);



        BiFunction<Integer,String,String> biFunctionString = (a,b)->a+b;
        String resultNew = biFunctionString.apply(6,"Dipakakakak");
        System.out.println(resultNew);

    }
}
