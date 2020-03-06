package other.algrithm.sort;

/**
 * @author shkstart
 * @date 7/23/2019 - 3:16 PM
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 52, 0, 19, 11, 0, 5, 13};
        MergeSort mergeSort = new MergeSort(arr);
    }

    public int[] arr;

    public MergeSort(int[] array) {
        this.arr = array.clone();
        sort(0, array.length - 1);
    }

    public void sort(int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public void merge(int low, int mid, int high) {

        // 声明新的数组，临时储存归并结果
        int[] B = new int[high - low + 1];
        int h = low;
        int i = 0;
        int j = mid + 1;

        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                B[i] = arr[h];
                h++;
            } else {
                B[i] = arr[j];
                j++;
            }
            i++;
        }

        // 等号很重要
        if (h <= mid) {
            for (int k = h; k <= mid; k++) {
                B[i] = arr[k];
                i++;
            }
        } else {
            for (int k = j; k <= high; k++) {
                B[i] = arr[k];
                i++;
            }
        }

        for (int k = low; k < high; k++) {
            arr[k] = B[k - low];
        }
    }
}
