class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][] distance=new long[26][26];
        for(long[] i:distance)
        {
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        for(int i=0;i<26;i++)
        {
            distance[i][i]=0;
        }
        for(int i=0;i<original.length;i++)
        {
            distance[original[i] -'a'][changed[i] -'a']=
            Math.min(distance[original[i] -'a'][changed[i] -'a'],cost[i]);
        }
        for(int node=0;node<26;node++)
        {
            for(int u=0;u<26;u++)
            {
                for(int v=0;v<26;v++)
                {
                    if(u==v)
                    continue;

                    distance[u][v]=Math.min(distance[u][node]+distance[node][v],distance[u][v]);
                }
            }
        }
        long result=0;
        for(int i=0;i<source.length();i++)
        {
            if(source.charAt(i)==target.charAt(i))
            continue;

            if(distance[source.charAt(i)-'a'][target.charAt(i)-'a']>=Integer.MAX_VALUE)
            return -1;
            result=result+distance[source.charAt(i)-'a'][target.charAt(i)-'a'];
        }
        return result;
    }
}