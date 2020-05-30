package cn.lw.test;

import cn.lw.sort.Selection;

import java.util.Arrays;

/**
 *  排序算法 之  选择排序 测试
 * @author superW
 */
public class SelectionTest {

    public static void main(String[] args) {
        Integer[] arrays = {4,6,8,7,9,2,10,1};
        Selection.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
