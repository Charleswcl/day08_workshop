package sg.edu.nus.iss;

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
     */
    public static void main(String[] args) {
        // CollectionSortExample cs = new CollectionSortExample();
        // cs.exmaple03();

        // HashMap hm = new HashMap();
        // hm.exmaple();

        // HashTable ht = new HashTable();
        // ht.exmaple();

        ConcurrentHashMapExample ch = new ConcurrentHashMapExample();
        ch.exmaple();
    }
}
