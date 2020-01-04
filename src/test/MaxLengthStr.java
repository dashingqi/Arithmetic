package test;

import java.util.Arrays;
import java.util.HashMap;

public class MaxLengthStr {

    public static void main(String[] args) {
        String s = "12345678854634234565234343423";
        int length = maxLength(s);
        System.out.println("args = " + length);

    }

    private static int maxLength(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < n; end++) {
            char tempChar = s.charAt(end);
            if (map.containsKey(tempChar)) {
                    start = Math.max(start,map.get(tempChar));
            }
            ans = Math.max(ans, end - start + 1);
            map.put(tempChar, end + 1);
        }

        return ans;
    }
}
