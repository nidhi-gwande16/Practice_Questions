class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA=new HashSet<>();
        Set<Integer> setB=new HashSet<>();

        int[] result=new int[A.length];
        int count=0;
        for(int i=0;i<result.length;i++)
        {
            setA.add(A[i]);
            setB.add(B[i]);
            if(A[i] ==B[i])
            {
                count++;
            }
            else
            {
                if(setB.contains(A[i]))
                count++;
                if(setA.contains(B[i]))
                count++;
            }
            result[i] =count;
        }
        return result;
    }
}