class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k)
        return false;

        int[] count =new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a'] +=1;
        }
        int odd=0;
        for(int i:count)
        {
            if((i & 1)==1)
            odd=odd+1;
        }
        if(odd>k)
        return false;

        return true;
    }
}