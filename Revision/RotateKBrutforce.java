import java.util.Arrays;

public class RotateKBrutforce {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;

for(int j=1;j<=k;j++){
    int t=arr[n-1];
        for(int i=n-2;i>=0;i--){
          arr[i+1]=arr[i];
        }
        arr[0]=t;
    }
System.out.println(Arrays.toString(arr));
}
}
