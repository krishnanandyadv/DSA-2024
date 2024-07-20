// package binarysearch;

public class findsquareroot {
    public static void main(String[] args) {
        binarsearch(45);
        
    }

    private static void binarsearch(int n) {
        int s=0;
        
        int e=n;
        int ans=0;
        while (s<=e) {
            int mid=(s+e)/2;
            if(mid*mid<=n){
                s=mid+1;
               ans=mid;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(ans);

    }

}
