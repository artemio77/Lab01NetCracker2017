package sorters;

import fillers.AutoFillers;

import java.util.Arrays;

/**
 * Абстрактный класс модель для сортировки масива который реализует
 * основные методы доступа к масиву.
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see ArraySort
 * @see BubleSortEndToStart
 * @see BubleSortStartToEnd
 * @see MergerSort
 * @see QuickSort
 */
public abstract class AllSorts {
    protected static int[] array = new int[AutoFillers.getArrayLenght()];


    public abstract int[] sort(int[] arr);


    public void printSort(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    protected void exchange(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
