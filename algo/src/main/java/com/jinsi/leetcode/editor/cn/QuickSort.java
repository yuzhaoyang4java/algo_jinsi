

package com.jinsi.leetcode.editor.cn;

import java.util.Arrays;

/**
 * 快速排序
 * https://blog.csdn.net/zcxyywd/article/details/131024516
 */
public class QuickSort {
    public static void main(String[] args) {
        Solution solution = new QuickSort().new Solution();
        int[] ints = {3, 2, 4, 10, 1};
        solution.quickSort2(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void quitSort1(int[] nums, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return;
            }
            // 基准值元素未知
            int pIndex = partition1(nums, startIndex, endIndex);
            quitSort1(nums, startIndex, pIndex - 1);
            quitSort1(nums, pIndex + 1, endIndex);
        }

        /**
         * 分治发（双边循环法）
         *
         * @param num
         * @param startIndex
         * @param endIndex
         * @return
         */
        private int partition1(int[] num, int startIndex, int endIndex) {
            // 基准值
            int p = num[startIndex];
            // 左指针
            int l = startIndex;
            // 右指针
            int r = endIndex;
            while (l != r) {
                // 控制右指针向左移动，找到小于基准值的元素
                while (l < r && num[r] > p) {
                    r--;
                }
                // 控制左指针向右移动，找到大于基准值的元素
                while (l < r && num[l] <= p) {
                    l++;
                }
                if (l < r) {
                    // 交换左右指针所指元素
                    int temp = num[l];
                    num[l] = num[r];
                    num[r] = temp;
                }
            }
            // 交换基准值与重合点位置
            num[startIndex] = num[l];
            num[l] = p;
            return l;
        }

        /**
         * 分治发（单边循环法）
         *
         * @param num
         * @param startIndex
         * @param endIndex
         * @return
         */
        private void quickSort2(int[] num, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return;
            }
            int pIndex = partition2(num, startIndex, endIndex);
            quickSort2(num, startIndex, pIndex - 1);
            quickSort2(num, pIndex + 1, endIndex);
        }


        private int partition2(int[] num, int startIndex, int endIndex) {
            int p = num[startIndex];
            int mark = startIndex;
            for (int i = startIndex + 1; i <= endIndex; i++) {
                if (num[i] < p) {
                    mark++;
                    int tmp = num[i];
                    num[i] = num[mark];
                    num[mark] = tmp;
                }
            }
            num[startIndex] = num[mark];
            num[mark] = p;
            return mark;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}