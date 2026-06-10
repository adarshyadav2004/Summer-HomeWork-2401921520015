class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];
        int m=s1.length();
        // Store frequency of s1
        for (int i = 0; i <m; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            int windIdx = 0, idx = i;
            int[] windFreq = new int[26];

            while (windIdx < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++;
                idx++;
            }

            if (isFreqSame(freq, windFreq)) {   // found
                return true;
            }
        }

        return false;
    }

    public boolean isFreqSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}