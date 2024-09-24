class TrieNode{
   TrieNode children[] = new TrieNode[10];
   boolean fromFirst = false, fromSecond = false;
   void insert(int num, boolean fromFirst){
     String key = Integer.toString(num);
     TrieNode curr = this;
     for(var digChr : key.toCharArray()){
        int indx = (int)(digChr - '0');
        if(curr.children[indx] == null){
            curr.children[indx] = new TrieNode();
        }
        curr.children[indx].fromFirst |= fromFirst;
        curr.children[indx].fromSecond |= !fromFirst;
        curr = curr.children[indx];
     }
   } 
}
class Solution {
    private int maxLen = 0;
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TrieNode root = new TrieNode();
        for(var num : arr1){
            root.insert(num, true);
        }
        for(var num : arr2){
            root.insert(num, false);
        }
        findLongestPref(root, 0);
        return maxLen;
    }
    private void findLongestPref(TrieNode root, int depth){
        maxLen = Math.max(maxLen, depth);
        for(var child : root.children){
            if(child != null && child.fromFirst && child.fromSecond){
                findLongestPref(child, depth + 1);
            }
        }
    }
}