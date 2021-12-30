public class elemrmlist {
    public static void main(String []arg) {
        node toRun= new node(-1);
        toRun.addNode(5);
        toRun.addNode(6);
        toRun.addNode(6);
        toRun.addNode(6);
        toRun.addNode(6);
        toRun.addNode(6);
        toRun.addNode(6);
        toRun.addNode(5);
        int value=6;
        toRun.head= toRun.removeElements(toRun.head,value);
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
    public node removeElements(node hd,int value){
        if(hd==null){
            return hd;
        }
        while(hd!=null&&hd.val==value){
            //System.out.println("in first while");
            hd=hd.next;
        }
        if(hd==null){
            return hd;
        }
        node curr=hd,temp=hd.next;
        while(temp!=null){
            if(temp.val==value){
                curr.next=temp.next;
                temp=temp.next;
            }
            else{
                curr=temp;
                temp=temp.next;
            }
        }
        return hd;
    }
}