package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxLengthStr {

    public static void main(String[] args) {
        String s = "12345678854634234565234343423";
        int length = getMaxLengthStr(s);
        System.out.println("args = " + length);

    }

    private static int maxLength(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < n; end++) {
            char tempChar = s.charAt(end);
            if (map.containsKey(tempChar)) {
                start = Math.max(start, map.get(tempChar));
            }
            ans = Math.max(ans, end - start + 1);
            map.put(tempChar, end + 1);
        }

        return ans;
    }

    public static int getMaxLengthStar(String str) {

        int n = str.length();

        int realLength = 0;

        Map<Character, Integer> map = new HashMap();

        for (int start = 0, end = 0; end < n; end++) {

            char tempChar = str.charAt(end);

            if (map.containsKey(tempChar)) {

                start = Math.max(start, map.get(tempChar));

            }

            realLength = Math.max(realLength, end - start + 1);

            map.put(tempChar, end + 1);
        }
        return realLength;
    }

    private static int getMaxLengthStr(String str) {
        int n = str.length();
        int tempLength = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < n; end++) {
            if (map.containsKey(str.charAt(end))) {
                start = Math.max(start, map.get(str.charAt(end)));
            }
            tempLength = Math.max(tempLength, end - start + 1);
            map.put(str.charAt(end), end + 1);
        }

        return tempLength;
    }

}
