class Solution {
    public int majorityElement(int[] v) {
     int cnt=0,el=0;
     for(int i=0;i<v.length;i++){
        if(cnt==0){
            cnt++;
            el=v[i];
        }
        else if(el==v[i]) cnt++;
        else cnt--;
     }    return el;
    }
}