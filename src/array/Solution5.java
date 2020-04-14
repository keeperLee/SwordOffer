package array;

/**
 * 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Solution5 {
    //思路很简单，就是扩容，然后替换字符串
    public String replaceSpace(String str) {
        int length = str.length();
        char[] array = new char[length*3];
        int size = 0 ;
        for(int i = 0 ; i < str.length() ; i ++){
            char temp = str.charAt(i);
            if(temp==' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else{
                array[size++] = temp;
            }
        }
        String result = new String(array,0,size);
        return result;
    }
}
