class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left=0;
        int maxfreq =0;
        int maxLength=0;
        for(int right=0;right<s.length();right++) {
            char curr = s.charAt(right);
            count[curr - 'A']++;
            maxfreq = Math.max(maxfreq,count[curr-'A']);
            while((right-left+1) -maxfreq > k) {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
