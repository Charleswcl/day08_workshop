package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fillName,department,role,emailAddress,salary";

    public List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // create some employees
        Employee emp1 = new Employee("88571", "Tiffany", "SS", "Developer", "tiffany@iss.nus.sg", 30000);
        Employee emp2 = new Employee("74923", "Charles", "SS", "Programmer", "charles@iss.nus.sg", 50000);
        Employee emp3 = new Employee("74234", "Lucas", "SS", "AI Technician", "lucas@iss.nus.sg", 90000);

        // add the employee to the list of employees
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;

    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        // write FILE_HEADER to CSV
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);

        // read records row by row and write it using fw.append()
        for (Employee e : employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPERATOR);
        }

        fw.flush();
        fw.close();

    }

}
