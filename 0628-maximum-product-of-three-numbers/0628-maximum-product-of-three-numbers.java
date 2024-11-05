class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
        
      int max1=nums[0]* nums[1]*nums[n-1];          //useful if there are negative numbers in the array
      int max2=nums[n-1]*nums[n-2]*nums[n-3];       //maximum positive product of three numbers.
        
        return Math.max(max1,max2);
    }
}