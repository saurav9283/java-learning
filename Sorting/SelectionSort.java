package Sorting;

public class SelectionSort {

    public static void main(String[] atgs) {
        int arr[] = { 34, 34, 4, 23, 3445, 3, 46, 3, 5 };
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int a = 0; a < length; a++) {
            System.out.println(arr[a]);
        }
    }
}
