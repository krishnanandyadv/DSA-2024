public class tillingProb {
  public static void main(String[] args) {
    int n=4;
   
    System.out.println( tilling( n));
  }

private static int tilling(int n) {
    if(n==0 ||n==1){
        return 1;
    }
    //vertical way
    int f1=tilling(n-1);
    //horizontal
 int w2=tilling(n-2);
 int totalway=f1+w2;
 return totalway;
}  


}
