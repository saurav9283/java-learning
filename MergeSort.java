public class MergeSort {
    public static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end - mid;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int i = 0; i < n1; i++) {
            larr[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rarr[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        //if right array end to compare then copy all the left array element to the original array
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void mergerSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergerSort(arr, start, mid);
            mergerSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 4, 3 };
        int size = arr.length;

        mergerSort(arr, 0, size - 1);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}