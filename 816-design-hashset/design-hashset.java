class MyHashSet {

    ListNode head;
    ListNode temp;
    class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }

    public MyHashSet() {
        head = new ListNode(-1);
        temp = head;
    }
    
    public void add(int key) {
        if(!contains(key)){
            head.next = new ListNode(key);
            head = head.next;
        }
    }
    
    public void remove(int key) {
        ListNode temp2 = temp;
        while(temp2!=null && temp2.next!=null){
            if(temp2.next.value==key){
                if(temp2.next==head){
                    head = temp2;
                }
                temp2.next = temp2.next.next;
                break;
            }
            temp2 = temp2.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode temp2 = temp;
        while(temp2!=null){
            if(temp2.value==key){
                return true;
            }
            temp2 = temp2.next;
        }
        return false;
    }
}