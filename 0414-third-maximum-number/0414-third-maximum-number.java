class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            s.add(i);
        }
        int[] arr=new int[s.size()];
        int k=0;
        for(int i : s)
        {
            arr[k]=i;
            k++;
        }
        Arrays.sort(arr);
        if(arr.length<3)
        {
            return arr[arr.length-1];
        }
        
        return arr[arr.length-3];
    }
}