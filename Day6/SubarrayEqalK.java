package Post_immersion.Day6;
public class SubarrayEqalK {
    public int subarraySum(int[] nums, int k) {
        int subar=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    subar++;
                }
            }
        }
        return subar;
    }
}
// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2