package TwoSum.Solution2;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Enumeration;


class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        int totalKey  = 1;
        for (int i = 0; i < nums.length; i++) {
            hash.put(totalKey, nums[i]);
            totalKey++;
        }

        totalKey = hash.size();

        for(int bKey = 1; bKey<=totalKey;bKey++){
            for(int tKey = totalKey; tKey>bKey; tKey--){
                if(bKey==tKey){
                    break;
                }
                else if(hash.get(bKey)+hash.get(tKey) == target){
                    return new int[]{bKey-1,tKey-1};
                }
            }
        }
        return new int[]{0};
    }
    }
