package TwoSum.Solution3;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;
class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            if(!hash.isEmpty()&&hash.containsValue(target-nums[i])){
                //Solution exists
                for(int j = 0; j<nums.length; j++){
                    if(hash.get(j)==(target-nums[i])){
                        return new int[]{j, i};
                    }
                }
            }
            hash.put(i, nums[i]);
        }
        return new int[]{12};
    }
}
