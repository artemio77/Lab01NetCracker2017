package loggenerator;

import fillers.AutoFillers;
import org.apache.log4j.Logger;
import org.perf4j.StopWatch;
import org.perf4j.log4j.Log4JStopWatch;
import sorters.AllSorts;

import java.lang.reflect.Method;

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
public class Log4jMain {
    private final static Logger logger = Logger.getLogger(Log4jMain.class);

    private Log4jMain() {
    }

    public static void logSort(int[] array, Object mClassObject) throws NoSuchMethodException, IllegalArgumentException {
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
        System.out.println("");
    }

}
