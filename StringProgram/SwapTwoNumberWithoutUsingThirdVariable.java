public class SwapTwoNumberWithoutUsingThirdVariable {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Value of a before swap::"+a);
        System.out.println("Value of b before swap::"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a after swap::"+a);
        System.out.println("Value of b after swap::"+b);


    }
}
