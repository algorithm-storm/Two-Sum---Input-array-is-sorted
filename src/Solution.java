public class Solution {
    /*
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            return null;
        }

        int index1 = 0;
        int index2 = nums.length -1;

        while(index1 < index2){
            if(nums[index1] + nums[index2] < target){
                index1++;
            }
            else if(nums[index1] + nums[index2] > target){
                index2--;
            }
            else if(nums[index1] + nums[index2] == target){
                break;
            }
        }

        return new int [] {index1+1, index2+1};

    }
}