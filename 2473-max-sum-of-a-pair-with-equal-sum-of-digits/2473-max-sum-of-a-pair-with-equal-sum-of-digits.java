class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=sumOfDigits(nums[i]);
            if(map.containsKey(sum))
            {
                ans=Math.max(ans, nums[i] +map.get(sum));
            }
            map.put(sum, Math.max(nums[i],map.getOrDefault(sum,0)));
        }
        return ans>0?ans:-1;
    }
    private int sumOfDigits(int num)
    {
        int sum=0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}