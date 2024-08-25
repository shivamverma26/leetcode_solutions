class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        long cap=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(cap>=asteroids[i])
            cap+=asteroids[i];
            else return false;
        }
        return true;
    }
}