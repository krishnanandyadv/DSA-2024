// package slidingwindow;
import java.util.*;
public class slidingwindow {
    public static void main(String[] args) {
        int k=3;
        int[] arr={2,54,6,8,9,0,97,4};
        int currentsum=0;
        int ans=0;
        for(int i=0;i<k;i++){
          currentsum=arr[i]+currentsum;
        }
        ans=currentsum;
        for(int i=k;i<arr.length;i++){
            currentsum=arr[i]+currentsum;
            currentsum=currentsum-arr[i-k];

              ans=Math.max(ans,currentsum);
        }
        System.out.println(ans);
    }
}
