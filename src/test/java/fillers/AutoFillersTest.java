package fillers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class AutoFillersTest {


    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"Autofillers\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"Autofillers\" - FINISH.\n");
    }

    @Test
    public void formatNumbers() throws Exception {
        System.out.print("formatNumbers - >>");
        long num = 23657895;
        String number;
        DecimalFormat numFormat = new DecimalFormat("#,###,###");

        number = numFormat.format(num);
        System.out.println("OK!!!");

    }

    @Test
    public void firstFiller() throws Exception {
        System.out.print("firstFiller - >>");
        AutoFillers.firstFiller();
        System.out.println("OK!!!");
    }

    @Test
    public void secondFiller() throws Exception {
        System.out.print("secondFiller - >>");
        AutoFillers.secondFiller();
        System.out.println("OK!!!");
    }

    @Test
    public void backFiller() throws Exception {
        System.out.print("backFiller - >>");
        AutoFillers.backFiller();
        System.out.println("OK!!!");
    }

    @Test
    public void randomFilter() throws Exception {
        System.out.print("randomFiller - >>");
        AutoFillers.randomFilter();
        System.out.println("OK!!!");
    }


}
