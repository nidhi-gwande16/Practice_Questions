class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character ,Integer> map=new HashMap<>();
        for(char c: words[0].toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=1;i<words.length;i++)
        {
            Map<Character,Integer> temp=new HashMap<>();
            for(char c: words[i].toCharArray())
            {
                temp.put(c,temp.getOrDefault(c,0)+1);
            }
            for(char c:map.keySet())
            {
                map.put(c,Math.min(map.get(c),temp.getOrDefault(c,0)));
            }
        }
        List<String> result=new ArrayList<>();
        for(char c: map.keySet())
        {
            for(int i=0;i<map.get(c);i++)
            {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}