class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for(char ch:chars.toCharArray())
        {
            count[ch - 'a']++;
        }
        int ans=0;
        for(String word : words)
        {
            int[] freq=new int[26];
            for(char ch:word.toCharArray())
            {
                freq[ch-'a']++;
            }
            boolean good=true;
            for(int i=0;i<26;i++)
            {
                if(freq[i] > count[i])
                {
                    good=false;
                    break;
                }
            }
            if(good)
            {
                ans+=word.length();
            }
        }
        return ans;
    }
}