package util;

public class TestFor {
    public static void main(String[] args) {
        String a = "abc";
        for (int i = 0 ; i < a.length(); i ++){
            System.out.println(a.charAt(i));
        }
        for (int i = 0 ; i <= a.length()-1; i ++){
            System.out.println(a.charAt(i));
        }
    }
}
