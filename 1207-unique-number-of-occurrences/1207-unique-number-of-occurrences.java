class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] ch=new int[2001];
        for(int i:arr)
        {
            ch[i+1000]++;
                
        }
        Arrays.sort(ch);
        for(int i=0;i<2000;i++)
        {
            if(ch[i]!=0 && ch[i]==ch[i+1])
            {
                return false;
            }
        }
        return true;
    }
}