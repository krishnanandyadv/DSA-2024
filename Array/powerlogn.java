public class powerlogn {

public static void main(String[] args) {
   
    System.out.println( powerlog(2,6));
}

private static int powerlog(int a, int n) {
    if(n==0){
        return 1;
    }
int ans=powerlog(a,n/2);
ans=ans*ans;
if(n%2!=0){
    ans=ans*a;
}
return ans;
}

}
