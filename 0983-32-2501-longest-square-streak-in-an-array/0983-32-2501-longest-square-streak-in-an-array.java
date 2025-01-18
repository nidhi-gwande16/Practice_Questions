class Solution {
    public int longestSquareStreak(int[] nums) {
        int max=-1;
        Arrays.sort(nums);
        Map<Integer , Integer> streaks=new HashMap<>();
        for(int i:nums)
        {
            int root=(int)Math.sqrt(i);
            if(root*root==i && streaks.containsKey(root))
            {
                streaks.put(i ,streaks.get(root)+1);
                max= Math.max(streaks.get(i),max);
            }
            else
            {
                streaks.put(i,1);
            }
        }
        return max;
    }
}