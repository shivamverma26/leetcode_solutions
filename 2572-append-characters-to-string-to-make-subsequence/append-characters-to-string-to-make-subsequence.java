class Solution {
     public int isSubsequence(String s, String t) {
        if(s.length()!=0&&t.length()==0) return 0;
        if(s.length()==0&&t.length()==0) return 0;

         int j=0;
        for(int i=0;i<s.length();i++){
           
                if(s.charAt(i)==t.charAt(j))
                j++;

                if(j==t.length()) return 0;
            
        }
        int ans=t.length()-j;
        return ans;  
}

    public int appendCharacters(String s, String t) {
        int ans=isSubsequence(s,t);
        return ans;
    }
}