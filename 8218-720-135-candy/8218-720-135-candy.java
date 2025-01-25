class Solution {
    public int candy(int[] ratings) {
        int[] result=new int[ratings.length];
        Arrays.fill(result, 1);
        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                result[i]=result[i-1]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--)
        {
            if(ratings[i] <ratings[i-1] && result[i]>=result[i-1])
            {
                result[i-1] =result[i]+1;
            }
        }
        return Arrays.stream(result).sum();
    }
}