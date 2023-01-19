package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
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
            System.out.println("New Directory " + dirPath + " Create.");
        else
            System.out.println("Directory " + dirPath + " Already Existed.");

        // create a file in the directory above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated)
            System.out.println("New file " + fileName + " created");
        else
            System.out.println("File " + fileName + " already existed");

        // lsit files under a directory
        File fileListp[] = newDir.listFiles();
        for (File f : fileListp) {
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalPath());
        }

    }

}
