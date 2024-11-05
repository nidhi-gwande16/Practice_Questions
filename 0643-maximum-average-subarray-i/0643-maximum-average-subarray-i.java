class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0.0;
        double result=0.0;
        
        int sum=0;
        //Calculate Sum for the First Subarray of Length k:
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        
        avg=sum*1.0/k;              //Initialize the Maximum Average:
        result=avg;
        
        //Sliding Window Technique for the Remaining Subarrays:
        for(int i=k;i<nums.length;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            avg=sum*1.0/k;
            result=Math.max(result,avg);
        }
        return result;
    }
} 
