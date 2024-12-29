class Solution {
    public int maximumSwap(int num) {
        char[] digits=String.valueOf(num).toCharArray();
        int n=digits.length;
        int[] rightMax=new int[n];
        int max=n-1;
        rightMax[n-1]=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(digits[i]>digits[rightMax[i+1]])
            {
                max=i;
            }
            rightMax[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            if(digits[i]!=digits[rightMax[i]])
            {
                char temp=digits[rightMax[i]];
                digits[rightMax[i]]=digits[i];
                digits[i]=temp;
                return Integer.valueOf(new String(digits));
            }
        }
        return num;
    }
}