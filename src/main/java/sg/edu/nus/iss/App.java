package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws IOException {
        
        // ArraySortExample as = new ArraySortExample();
        // as.example();

        // CollectionSortExample cs = new CollectionSortExample();
        // cs.exmaple03();

        // HashMap hm = new HashMap();
        // hm.exmaple();

        // HashTable ht = new HashTable();
        // ht.exmaple();

        // ConcurrentHashMapExample ch = new ConcurrentHashMapExample();
        // ch.exmaple();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackedExample se = new StackedExample();
        // se.example();

        String dirPath = "data";
        String fileName = "data.txt";

        // create a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated)
            System.out.println("New Directory " + dirPath + " Created.");
        else
            System.out.println("Directory " + dirPath + " Already Existed.");

        // create a file in the directory above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated)
            System.out.println("New file " + fileName + " created");
        else
            System.out.println("File " + fileName + " already existed");

        // list files under a directory
        File fileList[] = newDir.listFiles();
        for (File f : fileList) {
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalPath());
        }

        // Use FileoutputStream to write some integers to file 'data.txt'
        FileOutputStream fos = new FileOutputStream(newFile, true);
        for (int i = 0; i < 10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }

        String welcomeMessage = "Welcome to ISS TFIP programme.";

        // convert string to byte[] array using getBytes()
        byte[] outputData = welcomeMessage.getBytes();

        // writing the string in byte array
        // one character at a time to the file
        fos.write(outputData);

        // clear the OutputStream
        // force the data to store to the file destination
        fos.flush();
        fos.close();

        String fileEmployee = "employee.txt";

        // create a file in the directory above
        File newEmployeeFile = new File(dirPath + File.separator + fileEmployee);
        boolean isEmployeeFileCreated = newEmployeeFile.createNewFile();

        if (isEmployeeFileCreated)
            System.out.println("New Employee " + fileName + " created");
        else
            System.out.println("File " + fileName + " already existed");

        CSVWriter cw = new CSVWriter();
        List<Employee> employeeList = cw.generateEmployees();
        cw.writeToCSV(employeeList, dirPath + File.separator + fileEmployee);

        CSVReader cr = new CSVReader();
        List<Employee> readEmployeeList = cr.readCSV(dirPath + File.separator + fileEmployee);
        readEmployeeList.forEach(e -> System.out.println(e));
    }

}
