class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m =  nums2.length;
        Boolean flag = true;
        if((n+m)%2==0) flag = false;
        int ans = (n+m)/2;
        int i=0;
        int j=0;
        int count =0;
        int prevna = 0;
        int na = 0;

            while(i<n && j<m)
            {

                if(nums1[i]<=nums2[j])
                {
                    prevna = na;
                    na = nums1[i];
                    count++;
                    i++;
                }
                else {
                    prevna = na;
                    na = nums2[j];
                    count++;
                    j++; 
                }
                     if(count>ans)
                { 
                    break;
                }
            }
            if(count<=ans)
            {
                while(i<n)
                {
                    count++;
                    prevna = na;
                    na = nums1[i];
                    i++;
                    if(count>ans) break;

                }

                while(j<m)
                {
                    
                    count++;
                    prevna = na;
                    na = nums2[j];
                    j++;
                    if(count>ans) break;
                }
            }

            if(flag==false)
            {
                double median  = (double) (prevna+na)/2;
                return median; 
            }
            return (double) na;

    }
}