public class fixedsizesd {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5,36,7,86,5,4};
        int k=3;
// MximumSubarsum(arr,k);
System.out.println(MximumSubarsum(arr,k));
    }

    private static int MximumSubarsum(int[] arr,int k) {
     int sum=0;
     for(int i=0;i<k;i++){
    sum=sum+arr[i];
     }
     int ans=sum;
     System.out.println(ans);
     for(int i=k;i<arr.length;i++){
       sum=sum+arr[i];
       sum=sum-arr[i-k];
       ans=Math.max(ans,sum);
     }
     return ans;
    //  System.out.println(ans);
    }


}
