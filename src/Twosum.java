import java.util.HashMap;

public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++){
            int minus = target - nums[i];
            if(map.containsValue(minus)){
                return new int[]{map.get(minus), i};
            }
        }
        return null;
    }
}
