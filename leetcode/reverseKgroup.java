class Solution {
  public int size(ListNode head){
    int length = 0;
    while(head != null){
   
      head = head.next;
         length++;
    }
    return length;
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur  = head ;
        ListNode prev = null;
        ListNode next = cur ;
        int count = 0;
        int size = 0;

        if(size(head)<k  && next!= null){
          return next;
        }
        else{
          while(cur!=null && count < k){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            count++;

          }
          if(next != null)
          head.next = reverseKGroup(next,k);
        }
      return prev;
    }
}