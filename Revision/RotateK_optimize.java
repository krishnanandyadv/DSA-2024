import java.util.Arrays;

public class RotateK_optimize {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
     int k=3;
        k=k%n;
          int i=n-k;
           int j=n-1;  //last k element
        reverse(arr,i,j);
  
  
         int s1=0;
          int e1=n-k-1;
         reverse(arr,s1,e1);  //first k elemnt
  
        int e=arr.length-1;
          int s=0;
            reverse(arr,s,e); //all arr
       System.out.println(Arrays.toString(arr));
      
    
    }
    public static void reverse(int[] arr,int i,int j){
        while(i<=j){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
       }
   }
}
