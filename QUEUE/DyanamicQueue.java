public class DyanamicQueue extends Queue{
    @Override
    public void Enqueue(int item) throws Exception{
if(super.isFull()){
    int[] arr=new int[2*super.data.length];
    for(int i=0;i<data.length;i++){
        int idx=(front+i)%data.length;
        arr[i]=data[idx];
    }
    this.data=arr;
    this.front=0;
}
super.Enqueue(item);
    }
    public static void main(String[] args) throws Exception{
        DyanamicQueue dq=new DyanamicQueue();

        dq.Enqueue(3);
        dq.Enqueue(3);
   
        dq.Enqueue(3);
        dq.Display();

    }
    
}
