public class rotatearray {
    public static void main(String[] args) {
        int[] arr={1,35,6,7,8,8,8,6};
        int k=3;
    }
    public static void RA(int[] arr,int k){
      
        int n=arr.length;
  k=k%n;

  for(int j=1;j<=k;j++){
      int l=arr[n-1];

      for(int i=n-2;i>=0;i++){
        arr[i+1]=arr[i];
      }
      arr[0]=l;
    }
}
}