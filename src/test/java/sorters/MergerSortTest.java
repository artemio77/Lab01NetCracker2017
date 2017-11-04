package sorters;

import fillers.AutoFillers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergerSortTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"MergerSort\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"MergerSort\" - FINISH.\n");
    }

    @Test
    public void sort() throws Exception {
        System.out.print("sort - >>");
        int[] array = AutoFillers.randomFilter();
        MergerSort mergerSort = new MergerSort();
        mergerSort.sort(array);
        System.out.println("OK!!!");
    }

}

