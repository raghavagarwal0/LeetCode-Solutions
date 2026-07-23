class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int n = candies.length;

        for(int i=0;i<n;i++)
        {
            int sum = candies[i]+extraCandies;
             Boolean flag = true;
            for(int j=0;j<n;j++)
            {
               
                if(i==j) continue;
                if(sum<candies[j])
                {
                    flag = false;
                }
            }
            ans.add(flag);
        }
        return ans;
    }
}