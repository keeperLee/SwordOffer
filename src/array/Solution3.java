package array;

import java.util.HashMap;
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
