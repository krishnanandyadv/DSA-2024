// package oops.QUEUE;

public class Queue {
    protected int[] data;
    protected int front;
    private int size;
    public Queue(){
    this.front=0;
    this.data=new int[5];

    }
    public Queue(int size){
        this.data=new int[size];
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==data.length;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("queue full");
        }
        
    //   this is for liner queue  this.data[size+front]=item;
    // circular queue
    int i=(size+front)%data.length;
    this.data[i]=item;
    
        
        size++;

    }
    public int Dequeue() throws Exception{

        if(isEmpty()){
            throw new Exception("queue empty");

        }
        
        int re=data[front];
        size--;
        front=(front%data.length)+1;
     return re;
   

    }

    public int size(){
        return size;
    }

    public int getfront(){
        // System.out.println(front);
        return this.data[this.front];
    }
    public void Display(){
        for(int i=0;i<size;i++){

            System.out.print(data[(front+i)%data.length]+"  ");
        
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
      q.Enqueue(10);
      q.Enqueue(20);
      q.Enqueue(30);
      q.Enqueue(40);
     
      q.Display();
      q.Dequeue();
      q.Dequeue();
      q.getfront();
      q.Enqueue(0);
      q.Enqueue(1);
      q.Enqueue(2);
      q.Display();
    }

}
