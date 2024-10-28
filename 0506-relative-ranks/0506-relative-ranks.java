class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map=new HashMap();
        int[] temp=score.clone();
        Arrays.sort(temp);
        for(int i=0;i<temp.length;i++)
        {
            map.put(temp[i] , temp.length-i);
        }
        String[] result=new String[score.length];
        for(int i=0;i<result.length;i++)
        {
            int rank =map.get(score[i]);
            String rankS=rank + "";
            if(rank==1)
            {
                result[i]="Gold Medal";
            }
            else if(rank==2)
            {
                result[i]="Silver Medal";
            }
            else if(rank==3)
            {
                result[i]="Bronze Medal";
            }
            else
            {
                result[i]=rankS;
            }
        }
        return result;
    }
}