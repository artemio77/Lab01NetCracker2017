package loggenerator;

import fillers.AutoFillers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import sorters.ArraySort;

public class Log4jMainTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"Log4Main\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"Log4Main\" - FINISH.\n");
    }

    @Test
    public void logSort() throws Exception {
        System.out.println("logSort - >>");
        ArraySort arraySort = new ArraySort();
        int[] array = AutoFillers.randomFilter();
        Log4jMain.logSort(array,arraySort);
        System.out.println("OK!!!");
    }
}