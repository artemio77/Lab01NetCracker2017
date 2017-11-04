package sorters;

import fillers.AutoFillers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"QuickSort\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"QuickSort\" - FINISH.\n");
    }

    @Test
    public void sort() throws Exception {
        System.out.print("sort - >>");
        int[] array = AutoFillers.randomFilter();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("OK!!!");
    }

}

