public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        int r,sum=0,cubeNumber;

        while(number!=0){
            r = number%10;
            cubeNumber = r*r*r;
            sum = sum+cubeNumber;
            number = number/10;
        }
        System.out.println("sum::" +sum);
        if(number==sum){
            System.out.println("number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }

    }

}
