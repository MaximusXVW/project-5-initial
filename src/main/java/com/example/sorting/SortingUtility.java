package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        int index = 0;
        while(index == 0) {
            if (index == 0) {
                index++;
            } else if (data[index].compareTo(data[index - 1]) >= 0) {
                index++;
            } else {
                swap(data, index, index - 1);
                index--;
            }
        }

        // TODO implement Gnome Sort here
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] data) {
        boolean swapped = true;
        int start = 0;
        int end = data.length - 1;

        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i, i + 1);
                    swapped = true;
                }
            }
            end--;
            if (swapped) {
                swapped = false;

                // Otherwise, reset the swapped flag so that it can be used in the next stage


                for (int i = end - 1; i >= start; i--) {
                    if (data[i].compareTo(data[i + 1]) > 0) {
                        swap(data, i, i + 1);
                        swapped = true;
                    }
                }
                start++;
            }
            // TODO implement Cocktail Shaker Sort here
        }
    }

    public static <T extends Comparable<T>> void shellSort(T[] data) {

        // TODO implement Shell Sort here
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





