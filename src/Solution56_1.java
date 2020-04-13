import java.util.ArrayList;

/**
 * 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */

public class Solution56_1 {
    public int[] singleNumbers(int[] nums){
        return null;
    }

    public static void main(String[] args) {
        int[] test = {4,1,4,6};
        int[] res = (new Solution56_1()).singleNumbers(test);
        for (int i:res) {
            System.out.println(i);
        }
    }
}
