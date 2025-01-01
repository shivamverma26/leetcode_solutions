class Solution {
    public String compressedString(String word) {
         StringBuilder comp = new StringBuilder();
        int i = 0;
        
        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 1;
            
            while (i + count < word.length() && word.charAt(i + count) == currentChar && count < 9) {
                count++;
            }
            
            comp.append(count).append(currentChar);
            
            i += count;
        }
        
        return comp.toString();
    }
}