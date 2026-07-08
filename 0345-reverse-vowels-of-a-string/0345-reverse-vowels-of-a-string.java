class Solution {
       private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
    public String reverseVowels(String s) {

     char [] arr  = s.toCharArray();
        int low = 0;
        int high = arr.length - 1;
        while(low<high)
        {
            if(!isVowel(arr[low]))
            {
                low++;
            }
            else if(!isVowel(arr[high]))
            {
                high--;
            }
            else
            {
                char ch = arr[low];
                arr[low] = arr[high];
                arr[high] = ch;
                low++;
                high--;
            }
        }
        return new String(arr);
    }
}