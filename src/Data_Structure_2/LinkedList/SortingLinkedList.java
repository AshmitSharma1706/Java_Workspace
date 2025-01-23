package Data_Structure_2.LinkedList;

public class SortingLinkedList {
    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge=new ListNode();
        ListNode temp=merge;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next=list1;
                list1=list1.next;
                temp=temp.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
                temp=temp.next;
            }
        }
        while(list1!=null){
            temp.next=list1;
            list1=list1.next;
            temp=temp.next;
        }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
        return merge.next;
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return mergeTwoLists(left,right);
    }
}

