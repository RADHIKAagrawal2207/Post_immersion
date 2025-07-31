class LongestSubbarrayBitwiseAND {
    public int longestSubarray(int[] nums) {
        int max=0,maxc=0,cnt=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        for(int i:nums){
            if(max==i){
            cnt++;}
            else{
                maxc=Math.max(maxc,cnt);
                cnt=0;
            }
        }
        maxc=Math.max(maxc,cnt);
        if(maxc==0) return 1;
        return maxc;
    }
}