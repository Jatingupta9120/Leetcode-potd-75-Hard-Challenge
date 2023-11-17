/* Company Tags                : AMAZON
    Leetcode Link               : https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/
    Similar Leetcode Porblem    : Leetcode 881. Boats to Save People */
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int result=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            result=Math.max(result,sum);
            i++;
            j--;
        }
        return result;
    }
}