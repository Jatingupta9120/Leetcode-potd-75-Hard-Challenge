class Solution {
    public int maxSubArray(int[] nums) {
        int currmax=0;
        int n=nums.length;
        int maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(currmax<0)currmax= 0;
            currmax+=nums[i];
            maxsofar=Math.max(maxsofar,currmax);
        }
        return maxsofar;
    }
}