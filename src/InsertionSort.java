public class InsertionSort implements ISort {
    private int qtdOperation = 0;
    @Override
    public long Sort(int[] arr) {
        qtdOperation = 0;
        long timeInit = System.currentTimeMillis();
        insertionSort(arr, arr.length);
        long timeLast = System.currentTimeMillis();
        return (timeLast - timeInit);
    }

    public void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                qtdOperation++;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String GetNameMethod() {
        return "InsertionSort";
    }

    @Override
    public int GetQtdOperationMethod() {
        return qtdOperation;
    }
}
