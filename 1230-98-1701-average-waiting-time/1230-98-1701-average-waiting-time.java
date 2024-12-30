class Solution {
    public double averageWaitingTime(int[][] customers) {
        double time=0;
        double waitingT=0;
        for(int customer[]:customers)
        {
            if(customer[0]<time)
            {
                time=time+customer[1];
            }
            else{
                time=customer[0]+customer[1];
            }
            waitingT=waitingT+time-customer[0];
        }
        return waitingT/customers.length;
    }
}