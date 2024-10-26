package twopointer;

public class MiddleNodeOfLinkedList {
	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		}

		ListNode slow = head;
		ListNode fast = head;

		// Move fast two steps and slow one step until fast reaches the end
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
