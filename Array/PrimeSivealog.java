public class PrimeSivealog {
public static void main(String[] args) {
  
    primesive(200);
}

private static void primesive(int n) {
boolean[] prime=new boolean[n+1];
prime[0]=true; //not prime 
prime[1]=true; //not prime 
for(int j=2;j*j<=n;j++){
    if(prime[j]==false){
        for(int k=2;k*j<=n;k++){
            prime[k*j]=true;
        }
    }
}

for(int i=2;i<=n;i++){
    if(prime[i]==false){
        System.out.println(i);
    }
}
}


}
