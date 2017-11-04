package sorters;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Класс  для сортировки масива который реализует
 * встроеным методом Arraysorts
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 */
public class ArraySort extends AllSorts {
    @Override
    public int[] sort(int[] arr) {


        Arrays.sort(arr);
        return arr;
    }

    public Method getMethod(String sort, Class<int[]> aClass) {
        return null;
    }
}
