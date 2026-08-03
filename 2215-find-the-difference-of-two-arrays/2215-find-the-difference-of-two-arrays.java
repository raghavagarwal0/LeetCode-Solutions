class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> h = new HashMap<>();
        HashMap<Integer, Integer> h1 =  new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            h.put(nums1[i],h.getOrDefault(nums1[i],0)+1);
        }
         for(int i=0;i<nums2.length;i++)
        {
            h1.put(nums2[i],h1.getOrDefault(nums2[i],0)+1);
        }
        List<Integer> ans1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {

            if(!h1.containsKey(nums1[i]))
            {
                h1.put(nums1[i],h1.getOrDefault(nums1[i],0)+1);
                ans1.add(nums1[i]);
            }
            
        }
        ans.add(ans1);
                List<Integer> ans2 = new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {

            if(!h.containsKey(nums2[i]))
            {
                h.put(nums2[i],h.getOrDefault(nums2[i],0)+1);
                ans2.add(nums2[i]);
            }
            
        }
        ans.add(ans2);
        return ans;
    }
}