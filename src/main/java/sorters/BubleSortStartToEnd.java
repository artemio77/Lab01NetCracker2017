package sorters;

/**
 * Класс сортировки масива который реализует
 * сортировку пузырьком от меньшего к большему
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see AllSorts
 */
public class BubleSortStartToEnd extends AllSorts {

    @Override
    public int[] sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] > arr[k]) {
                    exchange(j, k, arr);
                }
            }
        }
        return arr;

    }


}
