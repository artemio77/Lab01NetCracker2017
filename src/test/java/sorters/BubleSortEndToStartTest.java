package sorters;

import fillers.AutoFillers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BubleSortEndToStartTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"ArraySort\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"ArraySort\" - FINISH.\n");
    }

    @Test
    public void sort() throws Exception {
        System.out.print("sort - >>");
        int[] array = AutoFillers.randomFilter();
        BubleSortEndToStart bubleSortEndToStart = new BubleSortEndToStart();
        bubleSortEndToStart.sort(array);
        System.out.println("OK!!!");
    }

}