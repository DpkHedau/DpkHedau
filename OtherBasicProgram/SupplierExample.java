import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supplierExample =()-> "My Name is Dipak";
        String str = supplierExample.get();
        System.out.println(str);

    }
}
