public class SortLInkedList {
    static class node{
        int data;
        node next;
        node(){

        }
        node(int data){
            this.data=data;
            node next=null;
        }
    }
    static node solve(node head, int data) {
        if (head == null || data < head.data) {
            node newNode = new node(data);
            newNode.next = head;
            return newNode;
        }

        head.next = solve(head.next, data);
        return head;
    }
static node sort(node head){
        if (head==null){
            return head;
        }

     node temp=  sort(head.next);

return solve(temp,head.data);
}
    static void print(node temp){
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        a.next=new node(6);
        a.next.next=new node(3);
//        a.next.next.next=new node(8);
//        a.next.next.next.next=new node(2);
//       node x= solve(a,0);
       node x1= sort(a);
        print(x1);

    }
}
