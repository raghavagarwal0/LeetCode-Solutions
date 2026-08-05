class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap <Character,Integer> h = new HashMap<>();
        HashMap <Character,Integer> h1 = new HashMap<>();
        if(word1.length()!=word2.length()) return false;
        for(int i=0;i<word1.length();i++)
        {
            char ch = word1.charAt(i);
            char ch1 = word2.charAt(i);
            h.put(ch,h.getOrDefault(ch,0)+1);
            h1.put(ch1,h1.getOrDefault(ch1,0)+1);
        }
        if(!h.keySet().equals(h1.keySet())) return false;
        ArrayList <Integer> a1 = new ArrayList<>(h.values());
        ArrayList <Integer> a2 = new ArrayList<>(h1.values());

        Collections.sort(a1);
        Collections.sort(a2);

        return a1.equals(a2);
        

    }
}