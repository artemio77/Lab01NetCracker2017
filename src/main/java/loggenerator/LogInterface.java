package loggenerator;

import java.lang.reflect.InvocationTargetException;

public interface LogInterface {


    void modulOpenLogFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    void modulLogGenerator() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    void modulCleanLogFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    void modulOpenExelFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    void modulExelFileGenerator() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;

    


}
