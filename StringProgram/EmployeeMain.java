import javax.swing.event.DocumentListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<NewEmployee> NewEmployeeeList = new ArrayList<NewEmployee>();
        NewEmployeeeList.add(new NewEmployee(101, 110000.0, "Rohit", 34));
        NewEmployeeeList.add(new NewEmployee(102, 60000.0, "Dipak", 34));
        NewEmployeeeList.add(new NewEmployee(103, 90000.0, "Devendra", 34));
        NewEmployeeeList.add(new NewEmployee(104, 80000.0, "Shrikrishna", 34));

        //Sort Employee on the basis of salary
        List<NewEmployee> listEmp = NewEmployeeeList.stream()
                .sorted(Comparator.comparingDouble(NewEmployee::getSalary).reversed())
                .collect(Collectors.toList());

        //System.out.println(listEmp);

        //Sort Employee on the basis of salary
        List<NewEmployee> listEmpyee = NewEmployeeeList.stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary() , e1.getSalary()))
                .collect(Collectors.toList());


        //System.out.println(listEmpyee);
        //Sort Employee on the basis of Name and salary
        List<NewEmployee> listEmpUsingName = NewEmployeeeList.stream()
                .sorted(Comparator.comparing(NewEmployee::getName)
                        .thenComparing(NewEmployee::getSalary))
                .collect(Collectors.toList());

        System.out.println(listEmpUsingName);





    }
}
