package Problem;

public class MergeTwoSortedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            System.out.println("List 1 is null");
            return list2;
        }
        if (list2 == null) {
            System.out.println("List 2 is null");
            return list1;
        }
        if (list1.val <= list2.val) {
            System.out.println("list1.val <= list2.val, val1: " + list1.val + " val2: " + list2.val + " next1: " + list1.next);
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            System.out.println("list1.val > list2.val, val1: " + list1.val + " val2: " + list2.val + " next1: " + list1.next);
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
