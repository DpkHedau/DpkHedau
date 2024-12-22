public class ReverseStringExample {
    public static void main(String[] args) {

        String str = "DpkHedau";
        String[] strArray = str.split("");
        int length = str.length();
        System.out.println("Reverse String without using inbuilt function");
        String reverseString = "";
        for(int i=length-1;i>=0;i--){
            String abc = strArray[i];
            reverseString = reverseString + abc;
        }
        System.out.println("reverseString:::::"+reverseString);
        System.out.println("---------------------------------------------------");
        System.out.println("Reverse String with using inbuilt function");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println("reverseString:::::"+sb.toString());

    }
}
