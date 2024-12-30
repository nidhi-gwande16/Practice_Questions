class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] result=arr.clone();
      Arrays.sort(arr);
      Map<Integer,Integer> ranks=new HashMap<>();
      for(int i:arr)
        {
            ranks.putIfAbsent(i,ranks.size()+1);
        }
        for(int i=0;i<result.length;i++)
        {
            result[i]=ranks.get(result[i]);
        }
        return result;

    }
}