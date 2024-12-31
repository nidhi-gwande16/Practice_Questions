class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] frequency=new int[k];
        for(int i:arr)
        {
            int remainder= i % k;
            if(remainder<0)
                remainder = remainder+k;
            frequency[remainder]+=1;
        }
        if(frequency[0]%2!=0)
            return false;
        for(int i=1;i<=(k/2);i++)
            {
                if(frequency[i]!=frequency[k-i])
                return false;
            }
        return true;
    }
}