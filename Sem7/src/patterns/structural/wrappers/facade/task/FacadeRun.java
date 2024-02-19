package patterns.structural.wrappers.facade.task;

import java.util.Arrays;

/**
    You'll need to simplify {@link FacadeRun} class's logic.
 */
public class FacadeRun {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{2, 4, 6, 1, 14, 2, -7, 66, 0, -555};
        Double[] doubles = new Double[]{31d, 3d, 5d, 55d, 12d, 47d, 0d, -1d, 125d, -15d};

        sort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
        System.out.println(binarySearch(ints, 14, 0, ints.length - 1));

        sort(doubles, 0, doubles.length -1);
        System.out.println(Arrays.toString(doubles));
        System.out.println(binarySearch(doubles, 47.0, 0, doubles.length - 1));
    }

    private static <T extends Comparable<T>> int binarySearch(T[] array, T value, int min, int max) {
        int mid;
        if (min > max) {
            return -1;
        } else {
            mid = (max - min) / 2 + min;
        }

        if (array[mid].compareTo(value) < 0) {
            return binarySearch(array, value, mid + 1, max);
        } else {
            if (array[mid].compareTo(value) > 0) {
                return binarySearch(array, value, min, mid - 1);
            } else return mid;
        }
    }


    private static <T extends Comparable<T>> void sort(T[] array, int startIndex, int endIndex) {
        if (startIndex > endIndex) return;
        int middleIndex = (endIndex - startIndex) / 2 + startIndex;

        T middleElement = array[middleIndex];
        int i = startIndex;
        int j = endIndex;

        while (i <= j) {
            while (array[i].compareTo(middleElement) < 0) i++;
            while (array[j].compareTo(middleElement) > 0) j--;

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }
        sort(array, startIndex, j);
        sort(array, i, endIndex);
    }

    private static <T extends Comparable<T>> void swap(T[] array, int leftIndex, int rightIndex) {
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }

}
