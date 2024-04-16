//minimum size subarray sum equal to target
public class leetcode209 {
//  

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// // 
    public static void main(String[] args) {
        
    }
    public static int subarraysize(int[] arr,int k){
                int sum=0;
                int ei=0;
                int si=0;
                int cu=0;
                int ans=10000;
                while (ei<arr.length) {
                    //grow
                    sum=sum+arr[ei];

                  
                    //shrink
                   
    while(sum>k && si<=ei){

    sum=sum-arr[si];
    si++;
        }
        if(sum==k){
            cu=ei-si+1;
            ans=Math.min(cu,ans);
          }
       
        ei++;
                }
        
    }
}