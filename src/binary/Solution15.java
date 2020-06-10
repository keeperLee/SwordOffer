package binary;

/**
 * 二进制中1的个数
 */
public class Solution15 {

    /**
     * 这种方式超时
     * @param
     * @return
     */
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            //如果n的二进制最后一位为1，则n&1结果最后一位为1，如果n的二进制最后一位为0，那么n&1结果最后一位为0
            res += n&1;
            n >>= 1;
        }
        return res;
    }

    /**
     * 这种方式不会超时
     * @param n
     * @return
     */
    public int hammingWeight1(int n) {
        int res = 0;
        while(n != 0){
            res += 1;
            //利用n&(n-1)可以消去n最后一位1，然后让res累加1。
            n &= (n-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        b>>=1;
        System.out.println(b);
    }
}
