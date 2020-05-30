package cn.lw.sort;

/**
 *  排序算法 之  选择排序
 * @author superW
 */
public class Selection {

    public static void sort(Comparable[] arrays){

        /**
         * 选择排序：
         *      1、每一次遍历，假定第一个索引处的最小的值，和每一元素进行比较，
         *      如果当前索引处 的值大于其他某个索引处的值，则假定其他某个索引出的值为小值，后可以找到小值所在的索引
         *      2、交换第一个索引处和小值所在的索引处的值
         * 时间复杂度：O(N^2)
         */
        for (int i = 0; i <= arrays.length-2; i++) {
            // 将每次遍历出的下标值 默认设置为 最小值的下标值，然后在和其他的元素进行比较，
            int minIndex = i;
            for (int j = i+1; j < arrays.length ; j++) {
                if (greater(arrays[minIndex],arrays[j])){
                    minIndex = j;
                }
            }
            // 找到比 i 小的值 进行交换
            exch(arrays,i,minIndex);
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
