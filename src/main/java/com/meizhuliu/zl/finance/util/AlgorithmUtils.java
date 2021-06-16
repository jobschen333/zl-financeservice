package com.meizhuliu.zl.finance.util;

/**
 * 常见的一些算法编写
 * @author chxy
 * @date 2021/6/12 23:19
 */
public class AlgorithmUtils {


    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int num = nums.length;
        int a = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            // 因为val 小于100 所以可以等于
            if (nums[i] == val) {
                if (nums[i] == nums[a]) {

                } else {
                    nums[i] = nums[a];
                    a--;
                    num--;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        removeElement(a, 2);
    }
}
