class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");

        String ans=s.toLowerCase();
        
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(j))
            return false;
            else{
                i++;
                j--;
            }
        }  
        return true;      
    }
}