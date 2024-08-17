// package stackques;

import java.util.Stack;
public class Reverse{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
      

      
        System.out.println("*  *****");
        Reverse(st);
        System.out.println(st);

    }
    public static void Reverse(Stack<Integer> st){
        if(st.isEmpty()){
           
         return;     
        }
            int x=st.pop();
            Reverse(st);
            Insert_Down(st,x);
    }
    private static void Insert_Down(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
         return;     
        }
      
        int y=st.pop();
        Insert_Down(st, x);
        st.push(y);
    }
}