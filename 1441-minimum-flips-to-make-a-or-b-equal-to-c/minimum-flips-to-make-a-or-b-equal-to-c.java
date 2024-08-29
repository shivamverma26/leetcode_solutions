class Solution {
    public int minFlips(int a, int b, int c) {
        if((a|b)==c)
            return 0;
        
        int flips=0;
        
        while(c!=0 || a!=0 || b!=0 ) 
        {
            if((c&1)==1)
            {
                if((a&1)==0 && (b&1)==0) 
                    flips+=1;
                
            }
            
            else if((c&1)==0)
            {
                if((a&1)==1 && (b&1)==1) 
                    flips+=2;
                
                else if((a&1)==1 || (b&1)==1) 
                    flips+=1;
                
            }
            a>>>=1;
            b>>>=1;
            c>>>=1;
        }
       return flips;
    }
    
    
}