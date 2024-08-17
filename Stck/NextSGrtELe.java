import java.util.Stack;
public class NextSGrtELe {
 public static void main(String[] args) {
        int[] arr={11,2,3,23,13,9,15};
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
    
while(!st.isEmpty() && arr[i]>arr[st.peek()]){
    int f=st.pop();
    nge[f]=arr[i];

  }
  st.push(i);

        }
        while(!st.isEmpty()){
            int f=st.pop();
            nge[f]=-1;
          }

        for(int i=0;i<arr.length;i++){
            System.out.print(nge[i]+" ");
        }

    }
}

