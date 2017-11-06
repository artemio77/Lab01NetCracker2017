package loggenerator;

import fillers.AutoFillers;
import org.apache.log4j.Logger;
import org.perf4j.GroupedTimingStatistics;
import org.perf4j.StopWatch;
import org.perf4j.log4j.Log4JStopWatch;
import sorters.AllSorts;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Класс для профилирования методов сортировки,
 * методы класса производять подсчет времени выполнения
 * каждого алгоритма сортировки з записью данных в лог файл
 * /logs/ap-log.log
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see AllSorts
 */
public class Log4jMain{
    private final static Logger logger = Logger.getLogger(Log4jMain.class);
    private final static ArrayList<StopWatch> arrayList = new ArrayList<StopWatch>();
    private Log4jMain() {
    }

    public static void logSort(int[] array, Object mClassObject) throws NoSuchMethodException, IllegalArgumentException, InvocationTargetException, IllegalAccessException {
        Method method = mClassObject.getClass().getMethod("sort", int[].class);

        logger.info(mClassObject.getClass().getSimpleName() + " " + AutoFillers.formatNumbers(AutoFillers.getArrayLenght()) + " elements");
        StopWatch stopWatch = new Log4JStopWatch(mClassObject.getClass().getSimpleName());
        try {

            method.invoke(mClassObject, array);
            logger.info("Sort is successful !!!");
        } catch (Exception e) {
            logger.info("Sort is not successful !!!");
            e.printStackTrace();
        }

        stopWatch.stop();
        arrayList.add(stopWatch);
        logger.info(getArrayList());
        System.out.println("");
    }

    private static String getArrayList() {
        GroupedTimingStatistics groupedTimingStatistics = new GroupedTimingStatistics();

groupedTimingStatistics.addStopWatches(arrayList);

        return groupedTimingStatistics.toString();
    }
}
