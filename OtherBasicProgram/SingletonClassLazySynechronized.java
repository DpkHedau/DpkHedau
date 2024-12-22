class Singleton {


    private static Singleton INSTANCE;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
            if (INSTANCE == null)
                INSTANCE = new Singleton();
            return INSTANCE;

    }
}

public class SingletonClassLazySynechronized {
    public static void main(String... a) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2); //True

    }
}