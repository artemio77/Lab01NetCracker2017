package sorters;

import fillers.AutoFillers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubleSortStartToEndTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"BubleSortStartToEnd\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"BubleSortStartToEnd\" - FINISH.\n");
    }

    @Test
    public void sort() throws Exception {
        System.out.print("sort - >>");
        int[] array = AutoFillers.randomFilter();
        BubleSortStartToEnd bubleSortStartToEnd = new BubleSortStartToEnd();
        bubleSortStartToEnd.sort(array);
        System.out.println("OK!!!");
    }

}