package tiyinc.noobs;

/**
 * Created by DTG2 on 08/18/16.
 */
public class Day9Runner {
    public static void main(String[] args) {
        System.out.println("Running");
        Day9Runner myRunner = new Day9Runner();
        //creates a new instance of the Day9Runner so that we can call non-static methods
        myRunner.testWriteFile();

    }
    
    public void testWriteFile() {
        System.out.println("Test write file");

    }
}
