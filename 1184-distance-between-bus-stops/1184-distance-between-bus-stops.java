class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        //cloackwise distance
        
        if(start> destination)
        {
            int temp=destination;
            destination=start;
            start=temp;
        }
        int clockwise=0;
        int totalDist=0;
        for(int i=0;i<distance.length;i++)
        {
            if(i>=start && i<destination)
            {
                clockwise=clockwise+distance[i];
            }
            totalDist =totalDist+distance[i];
        }
        int anticlock=totalDist-clockwise;
        return Math.min(clockwise,anticlock);
        
    }
}