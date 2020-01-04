import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class SumOfTwo {

    public static void main(String[] args) {
        int[] ints = sumOfTwos(new int[]{8, 8, 55,7,6,2}, 10);
        System.out.println("ints = " + ints[0] + " ==== " + ints[1]);
    }

    public static int[] sumOfTwo(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    num[0] = i;
                    num[1] = j;
                    break;
                }
            }
        }
        return num;
    }

    /**
     * 使用HashMap，减少一层的判断
     * 把数组中的值当作key，角标当作值存储在HashMap中
     * @param nums
     * @param target
     * @return
     */
    public static int[] sumOfTwoUseHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //存放角标的数组
        int res[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            //目标值 减去 当前的值，获取要获得值
            int def = target - nums[i];
            if (map.get(def) != null) {
                res[0] = map.get(def);
                res[1] = i;
                return res;
            }

            map.put(nums[i], i);
        }
        return res;

    }

    public static int[] sumOfTwos(int[] nums,int target){

        int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap();

        for(int i=0;i<nums.length;i++){

            int tempValue = target-nums[i];

            if(map.containsKey(tempValue)){
                res[0] = map.get(tempValue);
                res[1] = i;
                return res;
            }

            map.put(nums[i],i);
        }

        return res;


    }

}
