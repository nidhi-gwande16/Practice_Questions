class Solution {
    class TreeNode{
        TreeNode[] children;
        TreeNode(){
            children =new TreeNode[10];

        }
    }
    TreeNode root;

    Solution() {
        root = new TreeNode();
    }

    private void insert(String s)
    {
        TreeNode node=root;
        for(char c:s.toCharArray())
        {
            if(node.children[c-'0']==null)
            {
                node.children[c-'0']=new TreeNode();
            }
            node =node.children[c-'0'];
        }
    }
    private int search(String s)
    {
         TreeNode node=root;
         for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(node.children[c-'0']==null)
            {
                return i;
            }
            node =node.children[c-'0'];
        }
        return s.length();
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        for(int i:arr1)
        {
            insert(String.valueOf(i));
        }
        int max=0;
        for(int i:arr2)
        {
            max=Math.max(max,search(String.valueOf(i)));
        }
        return max;
    }
}