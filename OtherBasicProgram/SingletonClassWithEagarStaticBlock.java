class SingletonSticBlock {


    private static SingletonSticBlock INSTANCE ;
    static{
        INSTANCE = new SingletonSticBlock();
    }
    private SingletonSticBlock() {
    }

    public static SingletonSticBlock getInstance() {
        return INSTANCE;
    }
}

public class SingletonClassWithEagarStaticBlock {
    public static void main(String... a) {

        SingletonSticBlock obj1 = SingletonSticBlock.getInstance();
        SingletonSticBlock obj2 = SingletonSticBlock.getInstance();
        System.out.println(obj1==obj2); //True

    }
}

