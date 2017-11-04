import fillers.AutoFillers;
import loggenerator.Log4jMain;
import loggenerator.LogGenerator;
import sorters.ArraySort;
import sorters.MergerSort;
import sorters.QuickSort;

import java.io.FileNotFoundException;

import static loggenerator.Log4jMain.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException {
        int[] array = AutoFillers.randomFilter();
        int[] array1 = array.clone();
        int[] array2 = array.clone();


       // LogGenerator.cleanLogFile();
        MergerSort mergerSort = new MergerSort();
        QuickSort quickSort = new QuickSort();
        ArraySort arraySort = new ArraySort();
        Log4jMain.logSort(array, mergerSort);
        Log4jMain.logSort(array1, quickSort);
        Log4jMain.logSort(array2, arraySort);

         LogGenerator.exelFileGenerator();

        LogGenerator.logGenerator();
        LogGenerator.openExelFile();
        //LogGenerator.openLogFile();

    }
}
