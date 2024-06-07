

package com.jinsi.leetcode.editor.cn;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Solution solution = new SelectionSort().new Solution();
        int[] ints = {3, 2, 4, 10, 1};
        solution.sort2(ints);
        System.out.println(Arrays.toString(ints));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void sort(int[] nums) {
            int minValue;

            for (int i = 0; i < nums.length; i++) {
                minValue = nums[i];
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < minValue) {
                        minValue = nums[j] ^ minValue;
                        nums[j] = minValue ^ nums[j];
                        minValue = nums[j] ^ minValue;
                    }
                }
                nums[i] = minValue;
            }
        }

        public void sort1(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                // 最小元素的索引
                int minIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex == i) {
                    continue;
                }
                // 交换元素位置
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        public void sort2(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                // 最大元素的索引
                int maxIndex = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > nums[maxIndex]) {
                        maxIndex = j;
                    }
                }
                if (maxIndex == i) {
                    continue;
                }
                // 交换元素位置
                int temp = nums[i];
                nums[i] = nums[maxIndex];
                nums[maxIndex] = temp;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}