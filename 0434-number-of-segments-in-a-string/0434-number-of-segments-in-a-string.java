class Solution {
    public int countSegments(String s) {
        int n=s.length();
        int segements=0;
        for(int i=0;i<n;i++)
        {
            if((i==0 || s.charAt(i-1)==' ') && s.charAt(i)!=' ')
            {
                segements++;
            }
        }
        return segements;
    }
}