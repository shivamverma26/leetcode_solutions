class Solution {
    public String nearestPalindromic(String n) {
       int len = n.length();

        if (len == 1) {
            int num = Integer.parseInt(n);
            return String.valueOf(num - 1);
        }
        
        long num = Long.parseLong(n);
        List<Long> candidates = new ArrayList<>();
        
        // Lower and upper bounds
        candidates.add((long) Math.pow(10, len - 1) - 1); 
        candidates.add((long) Math.pow(10, len) + 1);    
        
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        
        for (int i = -1; i <= 1; i++) {
            String newPrefix = String.valueOf(prefix + i);
            String candidate = generatePalindrome(newPrefix, len % 2 == 0);
            candidates.add(Long.parseLong(candidate));
        }
        
        long closest = -1;
        for (long candidate : candidates) {
            if (candidate != num) {
                if (closest == -1 || 
                    Math.abs(candidate - num) < Math.abs(closest - num) || 
                    (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
                    closest = candidate;
                }
            }
        }
        
        return String.valueOf(closest);
    }
    
    private String generatePalindrome(String prefix, boolean isEvenLength) {
        StringBuilder sb = new StringBuilder(prefix);
        if (isEvenLength) {
            return sb.append(new StringBuilder(prefix).reverse().toString()).toString();
        } else {
            return sb.append(new StringBuilder(prefix.substring(0, prefix.length() - 1)).reverse().toString()).toString();
        }
    }
}