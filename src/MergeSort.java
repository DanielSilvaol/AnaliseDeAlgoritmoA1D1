public class MergeSort implements ISort {
    private int qtdOperation = 0;

    @Override
    public long Sort(int[] arr) {
        qtdOperation = 0;
        long timeInit = System.currentTimeMillis();
        mergeSort(arr, arr.length);
        long timeLast = System.currentTimeMillis();
        return (timeLast - timeInit);
    }

    public void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left_arr = new int[mid];
        int[] right_arr = new int[len - mid];

        //Dividing array into two and copying into two separate arrays
        int k = 0;
        for (int i = 0; i < len; ++i) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k = k + 1;
            }
        }
        // Recursively calling the function to divide the subarrays further
        mergeSort(left_arr, mid);
        mergeSort(right_arr, len - mid);
        // Calling the merge method on each subdivision
        merge(left_arr, right_arr, arr, mid, len - mid);
    }

    public void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;
        //The while loops check the conditions for merging
        while (l < left_size && r < right_size) {
            qtdOperation++;
            if (left_arr[l] < right_arr[r]) {
                arr[i++] = left_arr[l++];
            } else {
                arr[i++] = right_arr[r++];
            }
        }
        while (l < left_size) {
            qtdOperation++;
            arr[i++] = left_arr[l++];
        }
        while (r < right_size) {
            qtdOperation++;
            arr[i++] = right_arr[r++];
        }
    }

    @Override
    public String GetNameMethod() {
        return "MergeSort";
    }

    @Override
    public int GetQtdOperationMethod() {
        return qtdOperation;
    }
}