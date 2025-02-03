public class powr {
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(power(a,n));
        
    }

    private static int power(int a, int n) {
       if(n==0){
        return 1;
       }
       
int halfpow=power(a, n/2)*power(a, n/2);

if(n%2!=0){
     halfpow=power(a, n/2)*power(a, n/2)*a;
 
}
return halfpow;
    }
}
