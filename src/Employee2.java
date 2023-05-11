// Capgemini
// Get List Of Employee And The Get Variable Name,Age,Salary and who Emp Above Age 25 Get Salary Increment is 10%
public class Employee2 {
    private String Name;
    private int age;
    private double salary;

    public Employee2(String name, int age, double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
//                "Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
