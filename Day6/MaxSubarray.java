package Post_immersion.Day6;
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max+nums[i]);
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.
// Example 3:

// Input: nums = [5,4,-1,7,8]
// Output: 23