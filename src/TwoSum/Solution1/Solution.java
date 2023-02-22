package TwoSum.Solution1;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,4,5},5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(i!=j&&(nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
