public class NewEmployee {

    // Private fields
    private int id;
    private double salary;
    private String name;
    private int age;

    // No-argument constructor
    public NewEmployee() {
    }

    // Parameterized constructor
    public NewEmployee(int id, double salary, String name, int age) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // Optional: toString method for easy representation
    @Override
    public String toString() {
        return "NewEmployeee [id=" + id + ", salary=" + salary + ", name=" + name + ", age=" + age +"]";
    }

}
