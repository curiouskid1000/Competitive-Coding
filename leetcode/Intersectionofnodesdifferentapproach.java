public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode A1 =headA;
        ListNode B1 =headB;
        int count1=0;
        int count2=0;
        int n;
        
        while(A1!=null){
           count1++;
           A1=A1.next;
           }
        while(B1!=null){
            count2++;
            B1=B1.next;
        }
        A1=headA;
        B1=headB;
        if(count2>count1){
            n=count2-count1;
            for(int i=1;i<=n;i++){
                B1=B1.next;
            }
        }
        else{
            n=count1-count2;
              for(int i=1;i<=n;i++){
                A1=A1.next;
            }
        }
        while(A1!=B1){
            A1=A1.next;
            B1=B1.next;
        }
        return A1;
    }
}