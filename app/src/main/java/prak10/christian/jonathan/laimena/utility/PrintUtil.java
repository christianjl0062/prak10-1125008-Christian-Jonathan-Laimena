package prak10.christian.jonathan.laimena.utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import prak10.christian.jonathan.laimena.models.Printable;

public class PrintUtil {
    public static <T> void printList(List<T> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static <T> void printList(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getPrintDetail());
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static <T extends Comparable<T>> void printListSorted(List<T> list) {
        List<T> listBaruSorted =  new ArrayList<>(list);
        for  (int i = 0; i < listBaruSorted.size(); i++) {
            listBaruSorted.get(i);
        }
        Collections.sort(listBaruSorted);

        System.out.print("[");
        for (int i = 0; i < listBaruSorted.size(); i++) {
            System.out.print(listBaruSorted.get(i));
            if (i < listBaruSorted.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static <T extends Comparable> void printListSorted(T[] array) {
        T[] arrayBaruSorted = Arrays.copyOf(array, array.length);
        for (int i = 0; i < arrayBaruSorted.length - 1; i++) {
            for (int j = 0; j < arrayBaruSorted.length - i - 1; j++) {
                if (arrayBaruSorted[j].compareTo(arrayBaruSorted[j + 1]) > 0) {
                    T temp = arrayBaruSorted[j];
                    arrayBaruSorted[j] = arrayBaruSorted[j + 1];
                    arrayBaruSorted[j + 1] = temp;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < arrayBaruSorted.length; i++) {
            System.out.print(arrayBaruSorted[i]);
            if (i < arrayBaruSorted.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}