class Solution {
    public String removeStars(String s) {
        int n=s.length();
       Stack <Character> st=new Stack<>();
       for(int i=0;i<n;i++){
        if(s.charAt(i)!='*')  st.push(s.charAt(i));
        else{
            st.pop();
            
        }
       
       } 
       StringBuilder str=new StringBuilder();
       while(!st.isEmpty()){
        str.append(st.pop());
       }
       str=str.reverse();
      return str.toString();
    }
}