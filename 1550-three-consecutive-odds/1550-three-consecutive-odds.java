class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0) count++;
            if(count>2) return true;
            if(arr[i]%2==0)count =0;
        }
        return false;
    }
}