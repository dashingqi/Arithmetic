package test;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 8, 1, 2, 3};
        int[] ints = sumOfTwo(nums, 10);
        System.out.println("ints = " + ints[0] + "======" + ints[1]);
    }

    private static int[] sumOfTwo(int[] numS, int target) {
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numS.length; i++) {
            int def = target - numS[i];
            if (map.containsKey(def)) {
                res[0] = map.get(def);
                res[1] = i;
                break;
            }
            map.put(numS[i], i);
        }
        return res;
    }
}
