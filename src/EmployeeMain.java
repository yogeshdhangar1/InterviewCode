import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Emp1","Cs",10000),
                new Employee("Emp2","Cs",15000),
                new Employee("Emp3","It",20000),
                new Employee("Emp4","It",25000));
         Map<String,Employee> byDepartment =
                 employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
                         Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e->e.getSalary())), Optional::get))
                 );
        System.out.println(byDepartment);
    }
}
