package loggenerator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LogGeneratorTest {
    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"LogGenerator\" - START.\n");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Testing class \"LogGenerator\" - FINISH.\n");
    }
    @Test
    public void logGenerator() throws Exception {
        System.out.print("logGenerator - >>");
        LogGenerator.class.getDeclaredMethod("logGenerator");
        System.out.println("OK!!!");
    }

    @Test
    public void openLogFile() throws Exception {
        System.out.print("logGenerator - >>");
        LogGenerator.class.getDeclaredMethod("openLogFile");
        System.out.println("OK!!!");
    }

    @Test
    public void cleanLogFile() throws Exception {
        System.out.print("cleanLogFile - >>");
        LogGenerator.class.getDeclaredMethod("cleanLogFile");
        System.out.println("OK!!!");
    }

    @Test
    public void openExelFile() throws Exception {
        System.out.print("openExelFile - >>");
        LogGenerator.class.getDeclaredMethod("cleanLogFile");
        System.out.println("OK!!!");
    }

    @Test
    public void exelFileGenerator() throws Exception {
        System.out.print("exelFileGenerator - >>");
        LogGenerator.class.getDeclaredMethod("exelFileGenerator");
        System.out.println("OK!!!");
    }

}