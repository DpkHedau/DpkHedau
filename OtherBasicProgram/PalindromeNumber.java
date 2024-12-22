public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 12321;
        int r , sum=0;
        while(number != 0){
            r = number%10;
            System.out.println("reminder:::"+r);
            sum = r+(sum*10);
            System.out.println("sum:::"+sum);
            number = number/10;
            System.out.println("number:::"+number);

        }
        System.out.println(sum);
    }
}
