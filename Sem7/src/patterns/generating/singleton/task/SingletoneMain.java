package patterns.generating.singleton.task;

/**
 Make the database class a singleton
 */
public class SingletoneMain {
    public static void main(String[] args) {
        Database db1 = new Database("path");
        Database db2 = new Database("path");

        System.out.println(db1.equals(db2)); //must be true

    }
}
