package TwoSum.Solution4;

import java.util.Arrays;
import java.util.ArrayList;
class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> j = new ArrayList<Integer>();
        for(int i = 0;i<nums.length; i++){
            if(!j.isEmpty()&&j.contains(target-nums[i])){
                return new int[]{j.indexOf(target-nums[i]),i};
            }
            j.add(nums[i]);
        }
        return new int[]{};
    }
}
