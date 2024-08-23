class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int i=0;
        int j=skill.length-1;
        long sum=skill[0]+skill[skill.length-1];
        long ans=0;

        while(i<j){
            if(skill[i]+skill[j]==sum) 
            ans+=skill[i]*skill[j];

            else return -1;

            i++;
            j--;
        }
        return ans;
    }
}