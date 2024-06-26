class Solution {
    public int findDuplicate(int[] arr) {
         HashMap<Integer,Integer> mp =new HashMap<>();
         int ans=0;
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i]))
            ans= arr[i];
            mp.put(arr[i],mp.getOrDefault(0,1));}
            return ans;
    }
}