class Solution {
    public boolean canPlaceFlowers(int[] flowerhead, int n) {
        int count = 0;
        int k  =flowerhead.length;
        if(k==1)
        {
            if(flowerhead[0]==0)
            {
                count++;
            }
        }
        if(k>1)
        {
        if(flowerhead[0]==0 && flowerhead[1]==0) 
        {
            flowerhead[0]=1;
            count++;
        }
        }
        for(int i=1;i<flowerhead.length-1;i++)
        {
            if(flowerhead[i-1]==0 && flowerhead[i+1]==0)
            {
                if(flowerhead[i]==0)
                {
                    flowerhead[i] = 1;
                    count++;
                }
            }
        }
       if(flowerhead.length>1)
       {
        if(flowerhead[flowerhead.length-2]==0 && flowerhead[flowerhead.length-1]==0)
        {
            flowerhead[flowerhead.length-1]=1;
            count++;
        }
       }
       
        if(count>=n) return true;
        return false;
    }
}