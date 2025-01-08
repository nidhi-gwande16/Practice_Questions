class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        solve(0,0,s,new ArrayList<>(),result);
        return result;   
    }

    private void solve(int start, int end,String s,List<String> current,List<List<String>> result)
    {
        if(end==s.length()-1)
        {
            if(isPalindrome(start,end,s))
            {
                current.add(s.substring(start,end+1));
                result.add(current);
            }
            return;
        }
        if(isPalindrome(start,end,s))
        {
            List<String> list=new ArrayList<>(current);
            list.add(s.substring(start,end+1));
            solve(end+1,end+1,s,list,result);
        }
        solve(start,end+1,s,current,result);
    }
    private boolean isPalindrome(int start,int end,String s)
    {
        while(start<end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
    }
}