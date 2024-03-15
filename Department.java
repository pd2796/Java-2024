import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{

String name,department;

public Employee(String name,String department)
{
    this.name=name;
    this.department=department;
}
    
public String getName()
{
    return this.name;
}

public String getDepartment()
{
    return this.department;
}
}

public class Department {
    
    public static void main(String[] args) {
        
        List<Employee> list = Arrays.asList(new Employee("Parth", "It"),
                new Employee("Yash", "It"));


        Map<String, List<Employee>> emp = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
                emp.forEach((name,department)->{
                    System.out.println(department.toString() + " " + name);
                });
    }
}
