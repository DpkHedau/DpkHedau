import java.util.HashMap;
 
class EmployeeNew {
    
    private String name;
    
    public EmployeeNew(String name) { // constructor
           this.name = name;
    }
 
 
    //no hashCode() method
 
    //no equals() method
    
    @Override
    public String toString() {
           return "Employee[ name=" + name + "] ";
    }
 
}
 

public class ProgramWithoutHshcodeAndEqualsMethod {
    public static void main(String...a){
           
           HashMap<EmployeeNew, String> hm=new HashMap<EmployeeNew, String>();
           hm.put(new EmployeeNew("a"), "emp1");
           hm.put(new EmployeeNew("b"), "emp2");
           hm.put(new EmployeeNew("a"), "emp1 OVERRIDDEN");
           
           System.out.println("HashMap's data> "+hm);
           System.out.println("HashMap's size> "+hm.size());
           System.out.println(hm.get(new EmployeeNew("a")));
           
    }
}