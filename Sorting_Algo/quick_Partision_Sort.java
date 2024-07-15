class Solution {
    public int[] sortArray(int[] a)
    {
        quickSort(a, 0, a.length - 1);
        return a;
    }

    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int loc = partition(a, low, high);
            quickSort(a, low, loc - 1);
            quickSort(a, loc + 1, high);
        }
    }

    private int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb + 1;
        int end = ub;

        while (start <= end) {
            while (start <= end && a[start] <= pivot) {
                start++;
            }

            while (start <= end && a[end] >= pivot) {
                end--;
            }

            if (start <= end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }

        int temp = a[lb];
        a[lb] = a[end];
        a[end] = temp;

        return end;
    }
}
