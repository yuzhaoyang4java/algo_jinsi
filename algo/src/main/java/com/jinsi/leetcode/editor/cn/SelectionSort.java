

package com.jinsi.leetcode.editor.cn;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        Solution solution = new SelectionSort().new Solution();
        int[] ints = {3, 2, 4, 10, 1};
        solution.sort(ints);
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
    }
//leetcode submit region end(Prohibit modification and deletion)

}