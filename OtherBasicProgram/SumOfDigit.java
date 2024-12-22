public class SumOfDigit {

    public static void main(String[] args) {
        int number = 123;

        int r,sum=0;

        while(number!=0){
            r = number%10;
            sum = sum+r;
            number = number/10;

        }

        System.out.println(sum);

    }
}
