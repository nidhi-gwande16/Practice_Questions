class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length()-1;
        int n2=b.length()-1;
        int carry=0,base=2;
        StringBuilder result=new StringBuilder();
        while(n1>=0 || n2>=0){
            int t1=0;
            int t2=0, sum;
            if(n1>=0)
                t1=a.charAt(n1--)-'0';
            if(n2>=0)
                t2=b.charAt(n2--)-'0';
            sum=t1+t2+carry;
            if(sum>=base)
            {
                carry=1;
                sum=sum-base;
            }
            else
                carry=0;
            result.append(sum);
        }
        if(carry==1)
            result.append(carry);
        
        return result.reverse().toString();
    }
}