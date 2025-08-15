import java.util.*;
public class IntersectionOf2Array {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int num:nums1) s1.add(num);
        Set<Integer> s2=new HashSet<>();
        for(int n:nums2){
            if(s1.contains(n)){
                s2.add(n);
            }
        }
        int[] ans=new int[s2.size()];
        int idx=0;
        for(int n:s2){
            ans[idx++]=n;
        }
        return ans;
    }
}
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.