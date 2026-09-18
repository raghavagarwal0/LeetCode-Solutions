class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int j=0;
        int count=0;
        int ans = (n+m)/2;
        Boolean flag = true;
        if((n+m)%2==0) 
        {
            flag = false;
        }
        int prev =0;
        int el = 0;
        while(i<n && j<m)
        {
            if(nums1[i]<=nums2[j])
            {
                prev = el;
                el = nums1[i];
                count++;
                i++;
            }
            else
            {
             prev =el;
             el = nums2[j++];
             count++;   
            }
            if(ans<count) break;
        }
        if(ans>=count)
        {
            while(i<n)
            {
                prev = el;
                el = nums1[i++];
                count++;
                if(ans<count) break;
            }
            while(j<m)
            {
                prev = el;
                el = nums2[j++];
                count++;
                if(ans<count) break;
            }
        }
        if(!flag) {
            double med =  ((prev+el)/2.0);
            return med;
        }
        return (double) el;
    }
}