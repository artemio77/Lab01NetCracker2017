import fillers.AutoFillers;
import loggenerator.Log4jMain;
import loggenerator.ModulLogGenerator;
import sorters.ArraySort;
import sorters.MergerSort;
import sorters.QuickSort;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int[] array = AutoFillers.randomFilter();

        int[] array1 = array.clone();
        int[] array2 = array.clone();

        ModulLogGenerator modulLogGenerator = new ModulLogGenerator();
       // modulLogGenerator.modulCleanLogFile();
        MergerSort mergerSort = new MergerSort();
        QuickSort quickSort = new QuickSort();
        ArraySort arraySort = new ArraySort();
        Log4jMain.logSort(array, mergerSort);
        Log4jMain.logSort(array1, quickSort);
        Log4jMain.logSort(array2, arraySort);


        modulLogGenerator.modulLogGenerator();
        //modulLogGenerator.modulOpenLogFile();
       modulLogGenerator.modulExelFileGenerator();
        modulLogGenerator.modulOpenExelFile();


    }
}
