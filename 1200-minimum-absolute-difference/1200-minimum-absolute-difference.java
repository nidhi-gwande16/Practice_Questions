class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList();
        int minDiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            int currDiff=arr[i]-arr[i-1];
            if(currDiff<minDiff)
            {
                minDiff=currDiff;
                result.clear();
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
            else if(currDiff == minDiff)
            {
                result.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return result;
    }
}