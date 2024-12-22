class SingletonFinal {


    private static final SingletonFinal INSTANCE = new SingletonFinal();

    private SingletonFinal() {
    }

    public static SingletonFinal getInstance() {

            return INSTANCE;

    }
}

public class SingletonClassWithEagarFinalKeyword {
    public static void main(String... a) {

        SingletonFinal obj1 = SingletonFinal.getInstance();
        SingletonFinal obj2 = SingletonFinal.getInstance();
        System.out.println(obj1==obj2); //True

    }
}