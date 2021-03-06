package loggenerator;

import com.sun.webkit.perf.PerfLogger;
import org.apache.log4j.Logger;
import org.perf4j.GroupedTimingStatistics;
import org.perf4j.LogParser;
import org.perf4j.TimingStatistics;

import java.io.*;
import java.awt.Desktop;


/**
 * Класс для работы с файлов с логами о работе методов,
 * реализирует методы для создания файла с разширением .xls
 * где будет сгенирирован график с результатами выполнения методов сортировки
 * и віводом статистики работі методов в консоль,
 * открытие и очищение файла с логами
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see Log4jMain
 */
public class LogGenerator {
    private LogGenerator() {
    }

    private static void logGenerator() {
        StringBuffer output = new StringBuffer();
        String command = "java -jar perf4j-0.9.16.jar /logs/app-log.log -t 900000";
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(output);
        System.out.println();
    }

    private static void openLogFile() {
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }
        try {
            desktop.open(new File("/logs/app-log.log"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void cleanLogFile() {
        File logfile = new File("/logs/app-log.log");
        try {
            FileOutputStream writer = new FileOutputStream(logfile);
            writer.write((new String()).getBytes());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void openExelFile() {
        Desktop desktop = null;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
        }
        try {
            desktop.open(new File("perfGraphs.xls"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static void exelFileGenerator() {
        try {
            Runtime.getRuntime().exec("java -jar perf4j-0.9.16.jar --graph perfGraphs.xls /logs/app-log.log");
        } catch (IOException ioe) {
            System.out.println("Here error!\n");
        }
    }
}


