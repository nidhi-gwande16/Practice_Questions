class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff=0;
        int totaldiff=0;
        int answer=0;

        for(int i=0;i<gas.length;i++)
        {
            diff+=gas[i]-cost[i];
            totaldiff +=gas[i]-cost[i];
            if(totaldiff<0)
            {
                totaldiff=0;
                answer=i+1;
            }
        }
        if(diff<0 || answer>=gas.length)
        {
            return -1;
        }
        return answer;
    }
}