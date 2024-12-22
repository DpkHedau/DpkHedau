import java.util.HashMap;
 
class NewEmployeeeNew {
    
    private String name;
    
    public NewEmployeeeNew(String name) { // constructor
           this.name = name;
    }
 
 
    //no hashCode() method
 
    //no equals() method
    
    @Override
    public String toString() {
           return "NewEmployeee[ name=" + name + "] ";
    }
 
}
 

public class ProgramWithoutHshcodeAndEqualsMethod {
    public static void main(String...a){
           
           HashMap<NewEmployeeeNew, String> hm=new HashMap<NewEmployeeeNew, String>();
           hm.put(new NewEmployeeeNew("a"), "emp1");
           hm.put(new NewEmployeeeNew("b"), "emp2");
           hm.put(new NewEmployeeeNew("a"), "emp1 OVERRIDDEN");
           
           System.out.println("HashMap's data> "+hm);
           System.out.println("HashMap's size> "+hm.size());
           System.out.println(hm.get(new NewEmployeeeNew("a")));
           
    }
}