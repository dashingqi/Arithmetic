package test;

public class JudgePalindrome {

    public static void main(String[] args) {
        boolean palindrome = isPalindrome(10000007);
        System.out.println("palindrome = " + palindrome);
    }

    /**
     * 判断是否是回文数
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
