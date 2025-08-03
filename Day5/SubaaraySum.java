public class SubaaraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int cnt=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                cnt=Math.min(j-i+1,cnt);
                i++;
            }
            j++;
        }
        if(cnt==Integer.MAX_VALUE) return 0;
        return cnt;
    }
}
// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0