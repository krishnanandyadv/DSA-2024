


public class ReverseQueue extends DyanamicQueue{
    public static void main(String[] args) throws  Exception{
        DyanamicQueue q=new DyanamicQueue();
         q.Enqueue(10);
         q.Enqueue(20);
         q.Enqueue(30);
         q.Enqueue(40);
         q.Enqueue(50);

         Reverse(q);
         q.Display();
    }

    public static void Reverse(DyanamicQueue q) throws Exception {
      int f=q.Dequeue();
      Reverse(q);
      q.Enqueue(f);

    }

}
