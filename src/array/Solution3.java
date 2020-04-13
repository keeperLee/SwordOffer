package array;

import java.util.HashMap;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
class Solution3 {
    //将数组中的每个元素作为key存在HashMap中，进行计数，出现次数大于一就返回该元素。
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int findRepeatNumber(int[] nums) {
        for(int i = 0 ; i < nums.length; i ++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+ 1);
                if(map.get(nums[i]) > 1){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
