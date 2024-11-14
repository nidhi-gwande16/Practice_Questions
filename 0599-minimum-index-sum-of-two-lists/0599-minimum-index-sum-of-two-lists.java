class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            hm.put(list1[i],i);
        }
        List<String> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int j=0;j<list2.length;j++)
        {
            if(hm.containsKey(list2[j]))
            {
                
            int current=hm.get(list2[j])+j;
            if(current<min)
            {
                l.clear();
                l.add(list2[j]);
                min=current;
            }
            else if(current==min)
            {
                l.add(list2[j]);
            }
            }
        }
        return l.toArray(new String[0]);
    }
}