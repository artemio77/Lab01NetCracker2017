package sorters;

import fillers.AutoFillers;

/**
 * Класс сортировки масива который реализует
 * алгоритм быстрой сортировки
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see AllSorts
 */

public class QuickSort extends AllSorts {
    @Override
    public int[] sort(int[] arr) {
        // check for empty or null array
        array = arr;
        AutoFillers.setArrayLenght(arr.length);
        quicksort(0, AutoFillers.getArrayLenght() - 1);
        return array;
    }

    private boolean quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high - low) / 2];
        // Divide into two lists
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j, array);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
        return true;
    }
}




