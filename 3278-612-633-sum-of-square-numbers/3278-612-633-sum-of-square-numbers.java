class Solution {
    public boolean judgeSquareSum(int c) {
        long left=0, right=(long)Math.sqrt(c);
        while(left<=right)
        {
            long num=left*left + right*right;
            if(num==c)
            return true;

            if(num >c)
            right--;
            else left++;
        }
        return false;
    }
}