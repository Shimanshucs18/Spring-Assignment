package com.assignment.Spring1.que3;


import org.springframework.stereotype.Component;
@Component
public class QuickSortImpl implements ISorting {
    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    public int[] Sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Quick used");
        return arr;
    }
}
