package sorters;

/**
 * Класс сортировки масива который реализует
 * обменную сортировку
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 * @see AllSorts
 */


public class MergerSort extends AllSorts {

    private static int[] array;

    private int[] tempMergArr;

    private int length;

    @Override
    public int[] sort(int[] arr) {
        this.array = arr;
        this.length = arr.length;
        this.tempMergArr = new int[length];


        doMergeSort(0, length - 1);


        return array;

    }


    private boolean doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
        return true;
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }


}
