package StringProgram;

public class StringPoolTest {
   	public static void main(String[] args) {
          	
          	String s1 = "abc";
          	String s2 = new String("abc");
          	String s3 = "abc";
          	String s4 = new String("abc");
          	String s5 = new String("abc").intern();

          	System.out.println("--comparing s1--");
          	System.out.println(s1.equals(s2)); //false
          	System.out.println(s1==s3); //true
          	System.out.println(s1==s4); //false
          	System.out.println(s1==s5); //true

          	System.out.println("--comparing s2--");
          	System.out.println(s2==s3); //false
          	System.out.println(s2==s4); //false
          	System.out.println(s2==s5); //false


          	System.out.println("--comparing s3--");
          	System.out.println(s3==s4); //false
          	System.out.println(s3==s5); //true


          	System.out.println("--comparing s4--");
          	System.out.println(s4==s5); //false

		/*******************************************************/
		System.out.println("-------------------------------------------");

		System.out.println("--comparing s1--");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //true
		System.out.println(s1.equals(s5)); //true

		System.out.println("--comparing s2--");
		System.out.println(s2.equals(s3)); //true
		System.out.println(s2.equals(s4)); //true
		System.out.println(s2.equals(s5)); //true


		System.out.println("--comparing s3--");
		System.out.println(s3.equals(s4)); //true
		System.out.println(s3.equals(s5)); //true


		System.out.println("--comparing s4--");
		System.out.println(s4.equals(s5)); //true

		System.out.println("-------------------------------------------");

		System.out.println("--comparing s1--");
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s1.equalsIgnoreCase(s4)); //true
		System.out.println(s1.equalsIgnoreCase(s5)); //true

		System.out.println("--comparing s2--");
		System.out.println(s2.equalsIgnoreCase(s3)); //true
		System.out.println(s2.equalsIgnoreCase(s4)); //true
		System.out.println(s2.equalsIgnoreCase(s5)); //true


		System.out.println("--comparing s3--");
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		System.out.println(s3.equalsIgnoreCase(s5)); //true


		System.out.println("--comparing s4--");
		System.out.println(s4.equalsIgnoreCase(s5)); //true

          	
   	}
 
}