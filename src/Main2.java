import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

// Capgemini
public class Main2 {
    public static void main(String[] args) {
        List<Employee2> emp = new ArrayList<>();
        Employee2 e1 = new Employee2("Yogesh",21,11000);
        Employee2 e2 = new Employee2("Amol",27,13000);
        Employee2 e3 = new Employee2("Laxman",26,11000);
        Employee2 e4 = new Employee2("Shankar",22,11000);
        Employee2 e5 = new Employee2("Ashutosh",23,11000);

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);
        System.out.println("Original Salary Is ");
        System.out.println(emp);

        List<Employee2> incrementSalary = emp.stream().map(e->{
            if(e.getAge()>25){
                e.setSalary(e.getSalary()*1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println("Increment Salary Is "+incrementSalary);
    }

}
