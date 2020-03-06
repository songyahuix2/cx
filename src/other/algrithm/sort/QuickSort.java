package other.algrithm.sort;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/22/2019 - 8:13 PM
 */
public class QuickSort {

    public void quickSort1(int arr[], int low, int high) {
        int start = low;
        int end = high;
        int base = arr[low];

        while (end > start) {
            // 从后往前比较
            while (end > start && arr[end] >= base)
                // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if (arr[end] <= base) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            // 从前往后比较
            while (end > start && arr[start] <= base)
                // 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
                start++;
            if (arr[start] >= base) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            // 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        // 递归
        if (start > low)
            quickSort1(arr, low, start - 1);// 左边序列。第一个索引位置到关键值索引-1
        if (end < high)
            quickSort1(arr, end + 1, high);// 右边序列。从关键值索引+1到最后一个
    }

    /**
     * 快速排序方法2
     */
    public int[] quickSort2(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSort2(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSort2(array, smallIndex + 1, end);
        return array;
    }

    /**
     * 快速排序算法——partition
     */
    public int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    /**
     * 交换数组内两个元素
     */
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // 测试
    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] arr = { 11, 3, 29, 49, 30, 7, 50, 63, 46, 1, 99 };
        System.out.println("未排序的数组：" + Arrays.toString(arr));
       s.quickSort1(arr, 0, arr.length-1);
        // Resourse.quickSort2(arr, 0, arr.length - 1);
        System.out.println("排序后的数组：" + Arrays.toString(arr));
    }

}
