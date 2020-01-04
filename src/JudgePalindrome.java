/**
 * 判断一个数是否是回文数
 * 就是一个数 正着读和反着读都是一个数
 * 121 => 121 true
 * 10 => 01 false
 */
public class JudgePalindrome {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome2(4444);
        System.out.println("palindrome = " + palindrome);

    }

    /**
     * 判断一个数是否是回文数
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
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

    public static boolean isPalindrome3(int x) {
        String s = new StringBuilder(String.valueOf(x)).reverse().toString();
        return (String.valueOf(x)).equals(s);
    }

    public static boolean isPalindrome4(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) div *= 10;
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) return false;
            x = (x % div) / 10;
            div /= 100;
        }

        return true;
    }
}
