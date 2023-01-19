package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public void exmaple01(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            numbers.add((int) (Math.random() * 100));

        // print out unsorted list
        System.out.println("Unsorted Array List: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);

        // print out the sorted list
        System.out.println("Sort in ascending order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());

        // print out in descending order
        System.out.println("Sort in descedning order: " + numbers);

    }

    public void example02() {
        // Integer numbers[] = {10, 5, 1, 2, 4, 3, 6, 7, 9, 8};
        Integer numbers[] = { 10, 5, 1, 2, 4, 3, 6, 7, 9, 8 };

        // sort numbers array in ascending order
        Arrays.sort(numbers);

        // print out the sorted number array
        System.out.println("Sorted Numbers: " + Arrays.toString(numbers));

        // sort numbers array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // numbers.sort(Comparator.reverseOrder());

        // pritn out numbers array in descending order
        System.out.println("Sorted Numbers in descending order: " + Arrays.toString(numbers));

    }

    public void exmaple03() {
        Employee emp1 = new Employee("88571", "Tiffany", "SS", "Developer", "charles.wang@iss.nus.sg", 30000);

        Employee emp2 = new Employee("74923", "Charles", "SS", "Programmer", "charles.wang@iss.nus.sg", 50000);
        Employee emp3 = new Employee("74234", "Lucas", "SS", "AI Technician", "charles.wang@iss.nus.sg", 90000);
        Employee emp4 = new Employee("53246", "Peter", "SS", "Developer", "charles.wang@iss.nus.sg", 20000);
        Employee emp5 = new Employee("16944", "Sarah", "SS", "Developer", "charles.wang@iss.nus.sg", 56000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("Unsorted employees: " + employees);

        Collections.sort(employees);

        System.out.println("Sorted Employees: " + employees);

        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employees (salary): " + employees);

        // List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("Charles").collect(Collectiors.toList));
        // System.out.println("Filtered employees: " + filteredEmployees);

    }
}
