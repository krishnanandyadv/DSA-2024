

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int e=arr.length-1;
        int s=0;
        while(s<=e){
              int temp=arr[s];
              arr[s]=arr[e];
              arr[e]=temp;
              s++;
              e--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
