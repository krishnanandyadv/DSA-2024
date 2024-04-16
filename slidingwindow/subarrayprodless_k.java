public class subarrayprodless_k {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int k=10;
        System.out.println(subarray(arr,k));
    }
    public static int subarray(int[] arr, int k){
        int p=1;
        int si=0;
        int ei=0;
        int ans=0;
        // grow
      while(ei<arr.length){
        p=p*arr[ei];



      
        //shrink

while(p>=k && si<=ei){

    p=p/arr[si];
    si++;
}
        // return ans
        ans=ans+ei-si+1;
    ei++;
      }

return ans;
    }
}
