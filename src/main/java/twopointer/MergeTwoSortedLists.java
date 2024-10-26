package twopointer;

public class MergeTwoSortedLists {
	
	public static void main(String[] args) {
		// Define two sorted linked lists
        int[] list1Values = {1, 3, 5, 7};
        int[] list2Values = {2, 4, 6, 8};

        
        ListNode list1 = createLinkedList(list1Values);
        ListNode list2 = createLinkedList(list2Values);

        // Print the initial lists
        System.out.println("List 1:");
        printList(list1);
        System.out.println("List 2:");
        printList(list2);
        
        // Merge the lists
        ListNode mergedList = new MergeTwoSortedLists().mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
        printList(mergedList);

	}
    public static ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
	
}
