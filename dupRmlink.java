public class dupRmlink {
    public static void main(String []args){
        node toRun= new node(-1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(1);
        toRun.addNode(2);
        toRun.head= toRun.deleteDuplicates(toRun.head);
        toRun.display(toRun.head);
    }
}
class node{
    int val;
    node next;
    public node(int data){
        this.val=data;
        this.next=null;
    }
    public node (int data, node next){
        this.val=data;
        this.next = next; 
    }
    public node head= null;
    public node tail=null;
    //public node head2= null;
    //public node tail2=null;
    public void addNode(int data){
        //creation of new node
        node newNode = new node(data);

        if(head==null){
            head =newNode;
            tail = newNode;
        }
        else{
            tail.next=newNode;
            tail = newNode;
        }

    }
   /* public void addNode2(int data){
        //creation of new node
        node newNode = new node(data);

        if(head2==null){
            head2 =newNode;
            tail2 = newNode;
        }
        else{
            tail2.next=newNode;
            tail2 = newNode;
        }

    }*/
    public void display(node hd){
        node current = hd;
        if(hd == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.val+"  ");
            current=current.next;
        }
    }
    public node deleteDuplicates(node hd){
        if(hd==null||hd.next==null){
            return hd;
        }
        node temp1,temp2;
        temp1=head;
        temp2=head.next;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                temp1=temp2;
                temp2=temp2.next;
            }
            else{
                temp1.next=temp2.next;
                temp2=temp2.next;
            }
        }
        return hd;
    }
}