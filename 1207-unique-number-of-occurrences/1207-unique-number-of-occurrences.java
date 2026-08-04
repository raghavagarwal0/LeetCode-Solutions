class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> h1 = new HashSet<>();
        for(int freq: h.values())
        {
            if(h1.contains(freq))
            {
                return false;
            }
            h1.add(freq);
        }
        return true;   
    }
}