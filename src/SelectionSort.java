public class SelectionSort implements ISort {
    private int qtdOperation = 0;

    @Override
    public long Sort(int[] arr) {
        long timeInit = System.currentTimeMillis();
        selectionSort(arr, arr.length);
        long timeLast = System.currentTimeMillis();
        return (timeLast - timeInit);
    }
    @Override
    public void CountOperation(int[] arr) {
        qtdOperation = 0;
        selectionSortCountOperation(arr, arr.length);
    }
    public void selectionSort(int[] arr, int len) {
        int out, in, min;

        for (out = 0; out < len - 1; out++) // outer loop
        {
            min = out; // minimum
            for (in = out + 1; in < len; in++)
                // inner loop
                if (arr[in] < arr[min]) // if min greater,
                {
                    min = in; // a new min
                }
            swap(arr, out, min); // swap them
        }
    }

    private void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public void selectionSortCountOperation(int[] arr, int len) {
        int out, in, min;

        for (out = 0; out < len - 1; out++) // outer loop
        {
            min = out; // minimum
            for (in = out + 1; in < len; in++)
                // inner loop
                if (arr[in] < arr[min]) // if min greater,
                {
                    qtdOperation++;
                    min = in; // a new min
                }
            swap(arr, out, min); // swap them
        }
    }

    @Override
    public String GetNameMethod() {
        return "SelectionSort";
    }

    @Override
    public int GetQtdOperationMethod() {
        return qtdOperation;
    }
}
