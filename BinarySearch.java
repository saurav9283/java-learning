public class BinarySearch {
    public static int binarySearch(int arr[], int start, int end, int x) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, 1, mid - 1, x);
            }
            if (arr[mid] < x) {
                return binarySearch(arr, mid + 1, end, x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6,4,2,3,3,2,5 };
        int x = 6;
        int size = arr.length;

        int ans = binarySearch(arr, 0, size - 1, x);
        if (ans == -1) {
            System.out.println("not found");
        } else {
            System.out.println(ans);
        }

    }
}