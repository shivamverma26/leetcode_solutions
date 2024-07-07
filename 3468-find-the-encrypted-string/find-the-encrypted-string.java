class Solution {
    public String getEncryptedString(String s, int k) {
        String str="";
        for(int i=k;i<s.length()+k;i++){
            char ch= s.charAt(i%s.length());
            str+=ch;
        }
        return str;
    }
}