class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0];
        int score=Integer.MIN_VALUE;
        for(int j=1;j<values.length;j++)
        {
            score=Math.max(score,max+values[j]-j);
            max=Math.max(max,values[j]+j);
        }
        return score;
    }
}