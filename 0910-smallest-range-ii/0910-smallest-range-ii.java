class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int result=nums[n-1]-nums[0];
        
        for(int i=0;i<n-1;i++)
        {
            int j=i+1;
            int low=Math.min(nums[0]+k,nums[j]-k);
            int high=Math.max(nums[n-1]-k,nums[i]+k);
            result=Math.min(result,high-low);

        }
        return result;
    }
}