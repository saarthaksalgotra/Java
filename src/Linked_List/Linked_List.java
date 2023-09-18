package Linked_List;
public class Linked_List {

        /*advantages of linked list
        1. Non-continuous
        2. space initialization*/

    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }
    Node root;

    public void display(){                                  //display data
        Node temp=root;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int size()                                       //size of linked list
    {
        Node temp=root;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int getFirst() throws Exception {                 //exception
        if(size()==0)
        {
            throw new Exception("Linked list is empty");
        }
        return root.data;
    }
    public int getLast() throws Exception {
        if(size()==0)
        {
            throw new Exception("Linked list is empty");
        }
            Node temp=root;
        while(temp.next !=null)
        {
            temp=temp.next;
        }
        return temp.data;
    }

    public int getIndex(int idx)
    {
        Node temp=root;
        for(int i=0;i<idx;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }

    public void addLast(int val)
    {
        Node nn=new Node(val);
        if(size()==0){
            root=nn;
        }
        else{
            Node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public void addFirst(int val)
    {
        Node nn=new Node(val);
        if(size()==0){
            root=nn;
        }
        nn.next=root;
        root=nn;
    }

    public void removeFirst(){
        Node temp=root;
        root=root.next;
    }

    public void removeLast(){
        Node temp=root;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=null;
    }

    public int removeAt(int idx)
    {
        if(idx==0){
            removeFirst();
        }
        if(idx==size()-1){
            removeLast();
        }
        Node temp=root;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        Node remove=temp.next;
        temp.next=temp.next.next;
        return remove.data;
    }
}

