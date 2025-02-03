public class prime {
    public static void main(String[] args) {
        int n=200;
        for(int i=2;i<n;i++){

            if(isPrime(i)){
                String numberStr = i+"";
                if (numberStr.contains("0")) {
                   
                }
                else{
                    System.out.print(i+" ");
                }
              
            }
        }
    }

    private static boolean isPrime(int i) {
    for(int j=2;j<=Math.sqrt(i);j++){
        if(i%j==0){
            return false;
        }
    }
    return true;
    }

}
