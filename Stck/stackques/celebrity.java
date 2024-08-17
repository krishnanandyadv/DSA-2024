// package stackques;

import java.util.Stack;
public class celebrity {
    public static void main(String[] args) {
        // int[] [] M = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
        int[] [] M = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0} };
   
 Stack<Integer> st=new Stack<>();
 System.out.println( celeb(M,st));

    }
    public static int celeb( int[] [] M,Stack<Integer> st){
        int ans=-1;
        for(int i=0;i<M.length;i++){
       st.push(i);
        }

        while(st.size()>1){
        int a=st.pop();
        int b=st.pop();
        int x=M[a][b];
        if(x==1){
            st.push(b);
        }
        else{
            st.push(a);

        }
        
    }
    for(int i=0;i<M.length;i++){
        if(i==st.peek()){
            continue;
        }
        if(M[st.peek()][i]==0 && M[i][st.peek()]==1){
                    ans=st.peek(); 
        }}
        return ans;
    
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

