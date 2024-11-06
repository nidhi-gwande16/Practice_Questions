class Solution {
    public int arrangeCoins(int n) {
        long l=0;
        long r=n;
        while(l<=r)
        {
            long mid=l+(r-l)/2;
            if(n>=(mid*(mid+1)/2))
                l=mid+1;
            else
                r=mid-1;
        }
        return (int)l-1;
    }
}