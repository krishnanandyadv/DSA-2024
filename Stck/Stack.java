
public  class Stack {

    protected int[] data;
    protected int top=0;
    public Stack(){
        this.data =new int[5];
    }
    public Stack(int cap){
        this.data =new int[cap];
    } 


  public boolean isEmpty(){
    return this.top==0;
  }

  public boolean isFull(){
    return this.top==this.data.length;
  }
   public void push(int item) throws Exception{
    if(isFull()){
      throw new Exception("stack overflow");
    }
    this.data[this.top]=item;
    this.top++;
   }
 public int pop() throws Exception{
  if(isEmpty()){
    throw new Exception("stak is laready empty");
  }
    this.top--;
    return this.data[top];
}
 public int peek() throws Exception{
  if(isEmpty()){
    throw new Exception("stak is already empty");}
    return this.data[top-1];
}
 public int size(){
    
    return this.top;
}

public void Display(){
    for(int i=0;i<top;i++){
        System.out.println(data[i]);
    }
}




    public static void main(String[] args) throws Exception {
        Stack s=new Stack();
        s.push(4);
        s.push(43);
        s.push(454);
      
        s.push(8);
        System.out.println(s.pop());
        // s.Display();
        System.out.println(s.peek());
       
        
      }
}