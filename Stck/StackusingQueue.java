public class StackusingQueue {


private DyanamicQueue data ;
public StackusingQueue(){
    this.data=new DyanamicQueue();

}
public boolean isEmpty(){
   return this.data.isEmpty();
}

public int size(){
    return this.data.size();

}
public void push(int item) throws Exception{
    DyanamicQueue temp=new DyanamicQueue();
    while (!this.data.isEmpty()) {
        temp.Enqueue(data.Dequeue());
    }
    this.data.Enqueue(item);
    while (!temp.isEmpty()){
        data.Enqueue(data.Dequeue());
    }
}

 public int pop() throws Exception{
return this.data.Dequeue();
 }
 public int peek() throws Exception{
return this.data.getfront();
 }
    public static void main(String[] args) throws Exception {
        StackusingQueue st=new StackusingQueue();
        st.push(1);
        st.push(2);
        st.push(3);
    }

    
}
