package cn.lw.test;

import cn.lw.sort.Insertion;

import java.util.Arrays;

/**
 *  排序算法 之  插入排序
 * @author superW
 */
public class InsertionTest {

    public static void main(String[] args) {
        Integer[] arrays =  {4,3,2,10,12,1,5,6};
        Insertion.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
