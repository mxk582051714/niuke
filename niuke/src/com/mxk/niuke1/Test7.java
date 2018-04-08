/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，
 * 则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
package com.mxk.niuke1;

import java.util.Arrays;

public class Test7 {

    public static int InversePairs(int[] array) {
        if (array == null || array.length < 1) {
            throw new IllegalArgumentException("Array arg should contain at least a value");
        }
        int[] copy = new int[array.length];  		//辅助数组，用来复制排好序的原数组
        System.arraycopy(array, 0, copy, 0, array.length);
    //    System.out.println(Arrays.toString(copy));
        return InversePairsCore(array, copy, 0, array.length - 1);
    }

    private static int InversePairsCore(int[] array, int[] copy, int start, int end) {

        if (start == end) { 		 	//长度为1的子数组时返回
            copy[start] = array[start];
            return 0;
        }

        int length = (end - start) / 2;
        int left = InversePairsCore(copy, array, start, start + length);
        int right = InversePairsCore(copy, array, start + length + 1, end);

        // 前半段的最后一个数字的下标
        int i = start + length;
        // 后半段最后一个数字的下标
        int j = end;
        // 开始拷贝的位置
        int indexCopy = end;
        // 逆序数
        int count = 0;

        while (i >= start && j >= start + length + 1) {
            if (array[i] > array[j]){
                copy[indexCopy] = array[i];
                indexCopy--;
                i--;
                count += j - (start + length); // 对应的逆序数
            } else {
                copy[indexCopy] = array[j];
                indexCopy--;
                j--;
            }
        }
        //按排好的顺序覆盖copy数组中的内容
        for (; i >= start;) {
            copy[indexCopy] = array[i];
            indexCopy--;
            i--;
        }

        for (; j >= start + length + 1;) {
            copy[indexCopy] = array[j];
            indexCopy--;
            j--;
        }
        return count + left + right;
    }

    public static void main(String[] args) {
        int[] array = {7,5,6,4,11,2};
        System.out.println(InversePairs(array)); // 3
//        int[] array2 = {6, 5, 4, 3, 2, 1};
//        System.out.println(InversePairs(array2)); //  15
//        int[] array3 = {1, 2, 3, 4, 5, 6};
//        System.out.println(InversePairs(array3)); // 0
//        int[] array4 = {1};
//        System.out.println(InversePairs(array4)); // 0
//        int[] array5 = {1, 2};
//        System.out.println(InversePairs(array5)); // 0
//        int[] array6 = {2, 1};
//        System.out.println(InversePairs(array6)); // 1
//        int[] array7 = {1, 2, 1, 2, 1};
//        System.out.println(InversePairs(array7)); // 3
    }
}



