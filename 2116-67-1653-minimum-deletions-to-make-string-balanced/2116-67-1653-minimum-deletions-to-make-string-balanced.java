class Solution {
    public int minimumDeletions(String s) {
        int b=0;
        int ans=0;
        for(char c:s.toCharArray())
        {
            if(c=='b')
            b++;
            else{
                if(b>0)
                {
                    ans++;
                    b--;
                }
                else{
                    b=0;
                }
            }
        }
        return ans;
    }
}