import java.util.HashMap;
import java.util.Map;
 
public class StringInMap {
    public static void main(String...a){
           
          //HashMap's key=Integer class  (Integer’s api has already overridden hashCode() and equals() method for us )
           Map<Integer, String> hm=new HashMap<Integer, String>();
           hm.put(1, "data");
           hm.put(1, "data OVERRIDDEN");
           
           System.out.println(hm.get(1));
           
    }
}