class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] degree =new int[graph.length];
        List<List<Integer>> adj=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<graph.length;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++)
        {
            for(int nbr:graph[i])
                {
                    degree[i] +=1;
                    adj.get(nbr).add(i);
                }
        }
        for(int i=0;i<graph.length;i++)
            {
                if(degree[i]==0)
                queue.add(i);
            }
        while(!queue.isEmpty())
        {
            int curr=queue.remove();
            result.add(curr);
            for(int nbr:adj.get(curr))
            {
                degree[nbr]-=1;
                if(degree[nbr]==0)
                queue.add(nbr);
            }
        }
        Collections.sort(result);
        return result;
    }
}