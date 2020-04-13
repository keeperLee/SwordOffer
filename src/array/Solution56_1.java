package array;

/**
 * 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
public class Solution56_1 {

    public int[] singleNumbers(int[] nums) {
        //定义一个变量用于存放整个数组连续异或之后的结果
        int result = 0;
        for(int num:nums){
            result = result^num;
        }
        //找到lowbit，定义value表示用于区别最后保留下来用于区别两个数的不同的二进制位所对应的值
        //lowbit = x&(-x);
        int value= result&(-result);

        //定义一个数组用于承接最后的结果
        int[] backArray = new int[2];
        for(int num:nums){
            //使用vlue对数组原来的数组进行分组，如果相同的元素是可以通过异或运算的交换律抵消的
            //如：1^2^1 = 1^1^2 = 2
            if((value & num)  != 0){
                backArray[0]=backArray[0]^num;
            }else{
                backArray[1]=backArray[1]^num;
            }
        }
        return backArray;
    }


    public static void main(String[] args) {
        int[] test = {4,1,4,6};
        int[] res = (new Solution56_1()).singleNumbers(test);
        for(int n:res){
            System.out.println(n);
        }
    }
}
