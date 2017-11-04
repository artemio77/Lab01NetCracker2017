package fillers;

import java.text.DecimalFormat;
import java.util.Random;
/**
 * Класс который реализирует методы для заполнения масивов с данными
 *
 * @author Artem Derevets (derevets.artem@gmail.com)
 * @version 1.0
 *

 */
public class AutoFillers {

    private static int ARRAY_LENGHT = 20000;


    private static int[] arr = new int[ARRAY_LENGHT];

    public static String formatNumbers(int a) {

        DecimalFormat numFormat;
        String number;

        numFormat = new DecimalFormat("#,###,###");

        number = numFormat.format(a);
        return number;
    }

    private AutoFillers() {
    }

    public static int getArrayLenght() {

        return ARRAY_LENGHT;
    }

    public static void setArrayLenght(int arrayLenght) {
        ARRAY_LENGHT = arrayLenght;
    }

    public static int[] getArr() {
        return arr;
    }

    public static void setArr(int[] arr) {
        AutoFillers.arr = arr;
    }


    public static int[] firstFiller() {

        for (int j = 0; j < arr.length; j++) {

            arr[j] = j;


        }
        return arr;


    }

    public static int[] secondFiller() {

        for (int j = 0; j < arr.length; j++) {

            arr[j] = j;
            if (j == 49) {
                arr[j] = (int) (Math.random() * 1000);
            }

        }
        return arr;
    }

    public static int[] backFiller() {
        int i = arr.length;
        for (int j = 0; j < arr.length; j++) {

            arr[j] = i;
            i--;

        }

        return arr;
    }

    public static int[] randomFilter() {


        for (int j = 0; j < arr.length; j++) {

            arr[j] = new Random().nextInt(1000000);
        }


        return arr;
    }


}






