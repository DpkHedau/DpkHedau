public class PrimeNumber {

    public static void main(String[] args) {
        int number = 27;
        int r = number/2;
        System.out.println(number);
        boolean primeFlag = true;
        for(int i=2;i<=r;i++){
            if (number % i == 0) {
                primeFlag = false;
                break;
            }

        }
        if(primeFlag)
            System.out.println("number is prime");
        else
            System.out.println("number is not prime");


    }
}
