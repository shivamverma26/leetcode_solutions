class Solution {
    public int maxVowels(String s, int k) {
        char ch[]=new char[]{'a','e','i','o','u'};

         int n=s.length();
      if(k>n) return -1;
      
      int max1=0;
      int max2=0;

        for(int i=0;i<k;i++){
            for(int j=0;j<ch.length;j++){
                if(s.charAt(i)==ch[j]){
                    max1++;
                    break;
                }
            }
      }
     max2= max1;
      for(int i=k;i<n;i++){
        for(int j=0;j<ch.length;j++){
            if(s.charAt(i)==ch[j])
            max1++;
            if(s.charAt(i-k)==ch[j])
            max1--;
        }
       
         max2= Math.max(max1,max2);
      }
      return max2;
    }
}