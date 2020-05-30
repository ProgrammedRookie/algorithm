package cn.lw.sort;

import java.util.Arrays;

/**
 *  排序算法 之  插入排序
 * @author superW
 */
public class Insertion {

    /**
     * 插入排序：
     *  默认将数组中头位置的元素当作已经排序的数组，在从未排序的数组中依次遍历元素和
     *  和已排序的数组进行比较，
     *      ：当比已排序数组中末尾位置的元素小时，在和倒数第二个位置
     *  进行大小比较，以此类推，直到找到最小元素的位置，
     *      ：当比已排序数组的末尾元素大时，将这个元素放到已排序的末尾位置
     * 时间复杂度： O(N^2)
     *
     */
    public static void sort(Comparable[] arrays){

        // 为排序数组的头位置的元素，默认为已排序数组
        for (int i = 1; i < arrays.length ; i++) {
            // 设置虚拟已排序数组，操作下标
            for (int j = i; j > 0 ; j--) {
                if (greater(arrays[j-1],arrays[j])){
                    exch(arrays,j-1,j);
                }else {
                    break;
                }
            }
        }
    }

    /**
     * 比较大小
     * @param c1
     * @param c2
     * @return
     */
    private static boolean greater(Comparable c1,Comparable c2){
        return c1.compareTo(c2) > 0 ;
    }

    /**
     * 交换位置
     * @param arr
     * @param i
     * @param j
     */
    private static void exch(Comparable[] arr,int i, int j){
        Comparable temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
