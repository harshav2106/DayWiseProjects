package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "John", 28));
        employees.add(new Employee(1, "Alice", 24));
        employees.add(new Employee(2, "Bob", 30));

        System.out.println("Original list:");
        employees.forEach(System.out::println);

        
        Collections.sort(employees, new SortByEmpId());
        System.out.println("\nSorted by empId:");
        employees.forEach(System.out::println);

        
        Collections.sort(employees, new SortByEmpName());
        System.out.println("\nSorted by empName:");
        employees.forEach(System.out::println);

        
        Collections.sort(employees, new SortByEmpAge());
        System.out.println("\nSorted by empAge:");
        employees.forEach(System.out::println);
    }

}
