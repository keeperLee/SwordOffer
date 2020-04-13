package util;

/**
 * lowbit展示类
 */
public class And {
    public static void main(String[] args) {

        System.out.println(Integer.toBinaryString(6));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(6&(-6));
        System.out.println("==========================");

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(5&(-5));

        System.out.println("==========================");
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(1&(-1));
        System.out.println("==========================");

        int te = 4;
        int be = 2;
        be ^= te;
//        be*=te;
        System.out.println(be);

    }
}
