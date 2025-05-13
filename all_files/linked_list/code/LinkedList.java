package all_files.linked_list.code;


import java.util.ArrayList;

public class LinkedList {
    public LinkedListNode head;
    public LinkedListNode tail;
    public int size;

    // create Linked List
    public void createLinkedList(int nodeValue){
        LinkedListNode newNode = new LinkedListNode();
        newNode.val = nodeValue;
        newNode.next = null;
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }

    // insert Node
    public void insertNode(int nodeValue){
        if (this.head == null){
            createLinkedList(nodeValue);
        } else {
            LinkedListNode newNode = new LinkedListNode();
            newNode.val = nodeValue;
            newNode.next = null;
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    // traversal
    public void traversal(){
        if (this.head == null){
            System.out.println("LinkedList is empty");
        } else {
            LinkedListNode current = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(current.val);
                if (i < size - 1){
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    // remove duplicate
    public void removeDuplicate(){
        if (this.head == null){
            System.out.println("LinkedList is empty");
        } else{
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedListNode prev = null;
            LinkedListNode next = this.head;
            while (next != null){
                if (!arrayList.contains(next.val)){
                    // if not contains add to the list
                    // prev = next
                    arrayList.add(next.val);
                    prev = next;
                } else {
                    // if contains
                    // prev.next  = next.next;
                    prev.next = next.next;
                    this.size --;
                }
                next = next.next;
            }
        }
    }

    // return Nth to Last
    public LinkedListNode returnNthToLast(int n){
        // with the size
//        LinkedListNode current = this.head;
//        for (int i = 0; i < this.size - n; i++){
//            current = current.next;
//        }
        // without the size
        LinkedListNode prev = this.head;
        LinkedListNode lead = this.head;
        for (int i = 0; i < n; i++){
            lead = lead.next;
        }
        while (lead != null){
            prev = prev.next;
            lead = lead.next;
        }
        return prev;
    }

    // partition
    public void partition(int x){
       LinkedListNode current = this.head;
       this.tail = this.head;
       while (current != null){
           LinkedListNode next = current.next;
           if (current.val < x){
               current.next = this.head;
               this.head = current;
           } else {
               this.tail.next = current;
               this.tail = current;
           }
           current = next;
       }
    }
    // sum of 2 linked lists
    public static LinkedList sumOfTwoLinkedLists(LinkedList list1, LinkedList list2){
        int carry = 0;
        LinkedListNode node1 = list1.head;
        LinkedListNode node2 = list2.head;
        LinkedList newList = new LinkedList();
        while (node2 != null || node1 != null){
            int result = carry;
            if (node1 != null){
                result += node1.val;
                node1 = node1.next;
            }
            if (node2 != null){
                result += node2.val;
                node2 = node2.next;
            }
            newList.insertNode(result % 10);
            carry = result / 10;
        }
        return newList;
    }

    // add same node for 2 list
    public void  addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.val = nodeValue;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llB.tail.next = newNode;
        llB.tail = newNode;
    }

    // getKthNode
    public static LinkedListNode getKthNode(LinkedListNode head, int k) {
        LinkedListNode current = head;
        while ( k > 0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }

    // intersection
    public static LinkedListNode intersection(LinkedList list1, LinkedList list2){
        if (list1.head == null || list2.head == null){
            return null;
        } else if (list1.tail != list2.tail){
            return null;
        } else {
            LinkedListNode shorter = new LinkedListNode();
            LinkedListNode longer = new LinkedListNode();
            if (list1.size > list2.size){
                shorter = list2.head;
                longer = list1.head;
            } else {
                shorter = list1.head;
                longer = list2.head;
            }
            longer = getKthNode(longer, Math.abs(list1.size - list2.size));
            while (shorter != longer){
                shorter = shorter.next;
                longer = longer.next;
            }
            return longer;
        }
    }
}
