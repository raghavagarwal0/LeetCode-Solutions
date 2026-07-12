class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] sortt = arr.clone();
        Arrays.sort(sortt);
        sortt = Arrays.stream(sortt)
                  .distinct()
                  .toArray();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<sortt.length;i++)
        {
            h.put(sortt[i],i+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = h.get(arr[i]);
        }
        return arr;
    }
}