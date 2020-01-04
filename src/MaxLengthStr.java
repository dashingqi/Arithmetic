import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * 滑动窗口
 */
public class MaxLengthStr {
    public static void main(String[] args) {
        int maxLength = userMapGetLength("456789345");
        System.out.println("maxLength = " + maxLength);

    }

    /**
     * 1. n = 字符串的长度
     * 2. s= 最终获得的长度
     * 3. Map
     * 4. for循环 end start 获取到每一个字符alpha
     * 5.
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubString(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            //获得当前的字符
            char alpha = s.charAt(end);
            //判断map是否存了key为alpha的值
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            //判断当前和开始的大小 加1的目的是：自己本身的长度
            ans = Math.max(ans, end - start + 1);
            //将当前的 字符作为key，end+1作为value 存储到Map中。
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

//    public static int maxLength(String s) {
//        int n = s.length();
//        int ans = 0;
//        Map<Character, Object> map = new HashMap<>();
//
//        for (int end = 0, start = 0; end < n; end++) {
//            char alpha = s.charAt(end);
//            if (map.containsKey(alpha)){
//
//            }
//
//            ans = Math.max(ans,end-start+1);
//        }
//    }

    /**
     * 求字符串中去除重复的字符个数
     *
     * @param s
     * @return
     */
    public static int userMapGetLength(String s) {
        int length = s.length();
        Map<Character, Object> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(s.charAt(i), i);
        }
        return map.size();
    }

}
