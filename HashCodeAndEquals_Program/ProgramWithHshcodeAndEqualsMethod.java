import java.util.HashMap;
 
class NewEmployeee {
    
    private String name;
    
    public NewEmployeee(String name) { // constructor
           this.name = name;
    }
    
    @Override
    public int hashCode(){
           return (this.name==null ? 0: this.name.hashCode() );       
    }
 
    @Override
    public boolean equals(Object obj){    
           NewEmployeee emp=(NewEmployeee)obj;
           return (emp.name==this.name || emp.name.equals(this.name));       
    }
 
    @Override
    public String toString() {
           return "NewEmployeee[ name=" + name + "] ";
    }
 
}
 
/** Copyright (c), AnkitMittal JavaMadeSoEasy.com */
public class ProgramWithHshcodeAndEqualsMethod {
    public static void main(String...a){
           
           HashMap<NewEmployeee, String> hm=new HashMap<NewEmployeee, String>();
           hm.put(new NewEmployeee("a"), "emp1");
           hm.put(new NewEmployeee("b"), "emp2");
           hm.put(new NewEmployeee("a"), "emp1 OVERRIDDEN");
           
           System.out.println("HashMap's data> "+hm);
           System.out.println("HashMap's size> "+hm.size());
           System.out.println(hm.get(new NewEmployeee("a")));
           
    }
}