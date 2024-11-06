class MyHashMap {
    Integer [] myMap;
    public MyHashMap() {
        this.myMap = new Integer [1000001];
    }
    
    public void put(int key, int value) {
            this.myMap[key] = value;
    }
    
    public int get(int key) {
    
        return this.myMap[key] != null ? this.myMap[key] : -1;
    }
    
    public void remove(int key) {
        if(this.myMap[key] != null){
            this.myMap[key] = null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */