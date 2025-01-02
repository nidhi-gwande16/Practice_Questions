class Solution {
    public long maximumImportance(int n, int[][] roads) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] road:roads)
        {
            adj.get(road[0]).add(road[1]);
            adj.get(road[1]).add(road[0]);
        }
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new int[]{i,adj.get(i).size()});
        }
        Collections.sort(list,(l1,l2)->l1[1]-l2[1]);
        Map<Integer,Integer> city=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            city.put(list.get(i)[0],i+1);
        }
        long res=0;
        for(int[] road:roads)
        {
            res+=city.get(road[0]);
            res+=city.get(road[1]);
        }
        return res;
    }
}