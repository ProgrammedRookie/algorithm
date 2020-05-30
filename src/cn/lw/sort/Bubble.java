package cn.lw.sort;

/**
 *  排序算法 之  冒泡排序
 * @author superW
 */
public class Bubble {

    /**
     * 排序
     * @param comparable
     */
    public static void sort(Comparable[] comparable){
        /**
         * 冒泡排序：
         *      比较两个相邻的两个元素，如果前一个数比后一个数大，则两个数交换位置，
         * 时间复杂度：
         *      O(N^2)
         */
        for (int i = comparable.length -1;i > 0; i--){
            for (int j =0; j < i; j++){
                if (greater(comparable[j],comparable[j+1])){
                    exch(comparable,j,j+1);
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
