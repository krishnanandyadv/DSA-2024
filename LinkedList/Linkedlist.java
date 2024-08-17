// package LinkedList;

public class Linkedlist {
    public class  Node {
     int data;
     Node next;
     public Node(int data){
        this.data=data;
     }
        
    }

    private Node head;
    private Node tail;
    private int size;
    public void addfrist(int item){
        Node nn=new Node(item);
           if(this.size==0){
           
            this.head=nn;
            this.tail=nn;
            this.size++;
           }
           else{
            nn.next=this.head;
            this.head=nn;
            this.size++;
           }
    }

    public void display(){
        Node temp=this.head;
     
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
      
    }
    public void addlast(int item){
        Node nn=new Node(item);
        if(this.size==0){
          
            this.head=nn;
            this.tail=nn;
            this.size++;
        }
        else{
            this.tail.next=nn;
            this.tail=nn;
          this.size++;
        }
    }
    public int getfrist() throws Exception{
        if(head==null){
           throw new Exception("kahli hh");
        }
        return head.data;
    }
    public static void main(String[] args) throws Exception{
        Linkedlist l=new Linkedlist();
        l.addfrist(0);
        l.addfrist(1);
        l.addfrist(3);
        l.addfrist(352);
        l.addfrist(25);
     l.display();
 
     System.out.println(l.getfrist());
  
    }
}
