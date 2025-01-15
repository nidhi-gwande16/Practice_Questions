class Solution {
    public boolean canSortArray(int[] nums) {
       int max=nums[0], lastMax=0,bits=countSetBits(nums[0]);
       for(int i=1;i<nums.length;i++)
       {
        boolean bitChange=bits!=countSetBits(nums[i]);
        if(bitChange)
            lastMax=max;
        if(nums[i]>max)
        {
            max=nums[i];
            bits=countSetBits(max);

        }
        if(nums[i]<lastMax)
        return false;
       } 
       return true;
    }
    private int countSetBits(int n)
    {
        int count=0;
        while(n>0)
        {
            count+=(n&1);
            n=n>>1;
        }
        return count;
    }
}