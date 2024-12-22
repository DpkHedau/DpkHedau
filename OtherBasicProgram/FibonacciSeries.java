import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>();
        int n1 = 0,n2=1,n3 = 0;
        int number = 10;
        for (int i = 0; i <number ; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            fibonacciList.add(n3);
            //System.out.println(n3);
            n3=0;
        }
        fibonacciList.forEach(System.out::print);
    }
}
