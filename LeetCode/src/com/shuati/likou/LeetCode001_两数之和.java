//return new int[0]表示如果没找到，则返回一个空数组；
//
//        方法一：暴力破解
//        方法二：优化暴力破解
//        方法三：使用哈希表

package com.shuati.likou;

import java.util.HashMap;
import java.util.Map;

public class LeetCode001_两数之和 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];

    }
}
