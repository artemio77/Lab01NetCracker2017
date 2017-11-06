package loggenerator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModulLogGenerator implements LogInterface {

    public void modulOpenLogFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = LogGenerator.class.getDeclaredMethod("openLogFile");
        method.setAccessible(true);
        method.invoke(null, null);
    }

    public void modulCleanLogFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = LogGenerator.class.getDeclaredMethod("cleanLogFile");
        method.setAccessible(true);
        method.invoke(null, null);
    }

    public void modulLogGenerator() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = LogGenerator.class.getDeclaredMethod("logGenerator");
        method.setAccessible(true);
        method.invoke(null, null);
    }

    public void modulOpenExelFile() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Method method = LogGenerator.class.getDeclaredMethod("openExelFile");
        method.setAccessible(true);
        method.invoke(null, null);

    }

    public void modulExelFileGenerator() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = LogGenerator.class.getDeclaredMethod("exelFileGenerator");
        method.setAccessible(true);
        method.invoke(null, null);
    }
}
