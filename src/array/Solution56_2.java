package array;

import java.util.HashMap;

/**
 * 数组中数字出现的次数
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 */
public class Solution56_2 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i)==null){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        int result = 0;
        for(int i:nums){
            if(map.get(i)==1){
                result = i;
                break;
            }
        }
        return result;
    }
}
