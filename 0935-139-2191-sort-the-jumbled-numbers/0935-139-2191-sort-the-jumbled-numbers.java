class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<long[]> list=new ArrayList<>();
        for(int i:nums)
        {
            list.add(new long[]{i,map(String.valueOf(i),mapping)});
        }
        Collections.sort(list,new Comparator<>(){
            public int compare(long[] a,long[] b)
            {
                return Long.compare(a[1],b[1]);
            }
        });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=(int)list.get(i)[0];
        }
        return nums;
    }
    private long map(String num,int[] mapping)
    {
        StringBuilder result=new StringBuilder();
        for(char c:num.toCharArray())
        {
            result.append(mapping[c-'0']);
        }
        return Long.parseLong(result.toString());
    }
}