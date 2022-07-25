// garbage collection
// JVM's Garbage collector automatically remove the opbject from the heap
// if that's useless

// the object must be unreachable - no reference
// to make an obj unreachable - assign null, reassign to someother,
// create inside a method

// garbage collector is not called often

// before removing the obj from the heap, it executes the finalize method
// of the obj -> available in Object class all classed inherit Object class
// we can do clean up activity

import java.sql.Connection;
import java.util.Scanner;

class  DB {
    Connection conn;
    DB(Connection conn) {
        this.conn = conn;
    }
}
class Table {
    Connection conn;
    DB db = new DB(conn);

    public void addRow() {
        try {
            Scanner inp = new Scanner(System.in);
            conn.commit();
        }
        catch (Exception e) {
            System.out.println("Error in adding");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        db = null;
        conn = null;
        System.out.println("Memory cleared");
    }
}
public class Day4 {
    public void cleanUp() {
        System.gc(); // Custom GC call
        Runtime.getRuntime().gc(); // Other way
    }

    // custom call of garbage collector
    Table table = new Table();
    cleanUp();
}
