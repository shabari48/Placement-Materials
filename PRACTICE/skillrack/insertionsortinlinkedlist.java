public class insertionsortinlinkedlist
{
    public static Node insertionSort(Node ptr)
    {
        //code here
        if(ptr==null ||ptr.next==null) return ptr;
        Node dummy=new Node(0);
        dummy.next=ptr;
        Node toinsert=null,position=null;
        
        while(ptr !=null && ptr.next!=null){
            if(ptr.data<=ptr.next.data) ptr=ptr.next;
            else{
                toinsert=ptr.next;
                position=dummy;
                while(position.next.data<=toinsert.data){
                    position=position.next;
                }
                ptr.next=toinsert.next;
                toinsert.next=position.next;
                position.next=toinsert;
            }
        }
        
        return dummy.next;
    }
} 
