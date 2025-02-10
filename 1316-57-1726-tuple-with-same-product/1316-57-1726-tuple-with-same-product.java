class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer ,Integer> map=new HashMap<>();
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                result += 8*map.getOrDefault(nums[i]*nums[j],0);
                map.put(nums[i]*nums[j],
                map.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        return result;
    }
}