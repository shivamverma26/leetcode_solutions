class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int count=0;
        
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
        StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(grid[i][j]);
                sb.append("+");
                
            } 
            String str=sb.toString();
            mp.put(str,mp.getOrDefault(str,0)+1);
        }
         for(int j=0;j<n;j++){
        StringBuilder sb1 = new StringBuilder();
            for(int i=0;i<n;i++){
                sb1.append(grid[i][j]);
                sb1.append("+");
                
            } 
            String str1=sb1.toString();
            
            if(mp.containsKey(str1))
            count+=mp.get(str1);
        }
        return count;
    }
}