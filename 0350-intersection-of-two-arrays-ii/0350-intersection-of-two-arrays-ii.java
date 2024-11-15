class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq[]=new int[1001];
        for(int num:nums1)
        {
            freq[num]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums2)
        {
            if(freq[num]>0)
            {
                list.add(num);
                freq[num]--;
            }
        }
        int k=list.size();
        int result[]=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }
}