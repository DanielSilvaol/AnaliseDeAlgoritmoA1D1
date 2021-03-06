public class QuickSort implements ISort {
    private int qtdOperation = 0;
    @Override
    public long Sort(int[] arr) {
        long timeInit = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long timeLast = System.currentTimeMillis();
        return (timeLast - timeInit);
    }
    @Override
    public void CountOperation(int[] arr) {
        qtdOperation = 0;
        quickSortCountOperation(arr, 0, arr.length - 1);
    }
    private void quickSort(int[] arr, int init, int last) {
        if (init < last) {
            int positionPivot = Separar(arr, init, last);
            quickSort(arr, init, positionPivot - 1);
            quickSort(arr, positionPivot + 1, last);
        }
    }

    private int Separar(int[] arr, int init, int last) {
        int pivot = arr[init];
        int i = init + 1, f = last;
        while (i <= f) {
            if (arr[i] <= pivot)
                i++;
            else if (pivot < arr[f])
                f--;
            else {
                int troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[init] = arr[f];
        arr[f] = pivot;
        return f;
    }
    private void quickSortCountOperation(int[] arr, int init, int last) {
        if (init < last) {
            int positionPivot = SepararCountOperation(arr, init, last);
            quickSortCountOperation(arr, init, positionPivot - 1);
            quickSortCountOperation(arr, positionPivot + 1, last);
        }
    }

    private int SepararCountOperation(int[] arr, int init, int last) {
        int pivot = arr[init];
        int i = init + 1, f = last;
        while (i <= f) {
            if (arr[i] <= pivot)
                i++;
            else if (pivot < arr[f])
                f--;
            else {
                int troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
                qtdOperation++;
            }
        }
        arr[init] = arr[f];
        arr[f] = pivot;
        qtdOperation++;

        return f;
    }
    @Override
    public String GetNameMethod() {
        return "QuickSort";
    }

    @Override
    public int GetQtdOperationMethod() {
        return qtdOperation;
    }
}
