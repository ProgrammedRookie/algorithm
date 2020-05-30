package cn.lw.test;

import cn.lw.sort.Bubble;

import java.util.Arrays;

/**
 *  排序算法 之  冒泡排序测试
 * @author superW
 */
public class BubbleTest {

    public static void main(String[] args) {
        Integer[] arrays = {4,5,6,3,2,1};
        Bubble.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
