class MyLinkedList {
    
    class ListNode {
        int val;
        ListNode next;

        ListNode () {}

        ListNode (int val) {
            this.val = val;
        }
    }

    int size;
    ListNode virtualIndex;

    public MyLinkedList() {
        this.size = 0;
        this.virtualIndex = new ListNode(0);
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = virtualIndex;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
            return;
        }
        size++;
        ListNode cur = virtualIndex;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        ListNode node = new ListNode(val);
        node.next = cur.next;
        cur.next = node;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            virtualIndex = virtualIndex.next;
            return;
        }
        ListNode cur = virtualIndex;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
