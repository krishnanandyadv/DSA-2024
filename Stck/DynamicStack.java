public class DynamicStack  extends
 Stack {
    @Override
    public void push (int item) throws Exception{
    if(this.isFull()){
        int[] arr=new int[2*data.length];
        for(int i=0;i<data.length;i++){
       arr[i]=this.data[i];
        }
        this.data=arr;
    }
    super.push(item);
    }
    public static void main(String[] args) throws Exception{
        
  
DynamicStack ds=new DynamicStack();
for(int i=0;i<100;i++){
    ds.push(i);
}

ds.Display();

}}
