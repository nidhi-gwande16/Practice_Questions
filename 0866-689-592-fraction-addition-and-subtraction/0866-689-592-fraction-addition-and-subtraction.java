class Solution {
    public String fractionAddition(String expression) {
        String fractions[]=expression.split("(?=[+-])");
        long num=0;
        long den=1;
        for(String fraction:fractions )
        {
            String[] current =fraction.split("/");
            long a=Long.parseLong(current[0]);
            long b=Long.parseLong(current[1]);
            num=num*b + a*den;
            den=den*b;
        }
        if(num==0)
        return "0/1";

        long gcd=gcd( Math.abs(num),Math.abs(den) );
        num=num/gcd;
        den=den/gcd;
        return num+"/"+den;
    }
    private long gcd(long a,long b)
    {
        if(a==b)
        return a;
        if(a>b) return gcd(a-b,b);
        return gcd(a,b-a);
    }
}