class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];
        
        for (char c : s1.toCharArray()) {
            s1Map[c - 'a']++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            s2Map[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                // Remove the leftmost character from the window
                s2Map[s2.charAt(i - s1.length()) - 'a']--;
            }
            
            if (Arrays.equals(s1Map, s2Map)) {
                return true;
            }
        }
        
        return false;
    }
}