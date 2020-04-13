package array;

/**
 * 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution4 {
    public boolean findNumberIn2DArray(int[][] matrix,int target){
        //使用矩阵收缩的方式来加速查找
        if(matrix.length == 0){
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while(row <= matrix.length -1 && col >= 0  ){
            if(target == matrix[row][col]){
                return true;
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] a = new int[1];
//        int[] b = {1};
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println((new Solution4()).findNumberIn2DArray(test,10));
    }
}
