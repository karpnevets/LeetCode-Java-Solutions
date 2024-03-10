import java.util.List;

public class Solution_Q19Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        if (length == 0)
            return null;
        if (n == length + 1)
            return head.next;
        temp = head;
        for (int i = 0; i < length - n; i++) {
            temp = temp.next;
        }
        ListNode jump = temp.next.next;
        temp.next = jump;
        return head;
    }
}

/**Attempts: 3   Runtime: 0ms   Memory: 41.16MB**/