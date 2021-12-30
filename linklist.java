//import java.nio.file.AccessDeniedException;

// Linked list program using Class
public class linklist {
    public static void main(String []args) {
    node toRun = new node(-1);
    toRun.addNode(1);
    toRun.addNode(2);
    toRun.addNode(4);
    toRun.addNode2(1);
    toRun.addNode2(3);
    toRun.addNode2(4);
    //toRun.display(toRun.head);
    //toRun.display(toRun.head2);
    toRun=toRun.merge(toRun.head, toRun.head2);
    toRun.display(toRun);

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
    public node head2= null;
    public node tail2=null;
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
    public void addNode2(int data){
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
    node merge(node l1, node l2){
        if(l1==null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        node nw,temp=null;
        if(l1.val<l2.val){
            temp=l1;
            nw=l1;
            l1=l1.next;
            nw.next=null;
        }
        else{
            temp=l2;
            nw=l2;
            l2=l2.next;
            nw.next=null;
        }
        while(true){
            if(l1==null){
                nw.next=l2;
                return temp;
            }
            if(l2==null){
                nw.next=l1;
                return temp;
            }
            if(l1.val<l2.val){
                nw.next=l1;
                l1=l1.next;
                nw=nw.next;
                nw.next=null;
            }
            else{
                nw.next=l2;
                l2=l2.next;
                nw=nw.next;
                nw.next=null;
            }
        }
        //return temp;
    }
}

