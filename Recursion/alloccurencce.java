public class alloccurencce {
    public static void main(String[] args) {
        int[] arr={2,45,5,6,43,2,34,2,45};
        String ans="";
       System.out.println(  ALlOc(arr,44,ans,0));
      
    }

    private static String ALlOc(int[] arr, int t, String ans,int i) {
              if(i==arr.length && ans==""){
                ans=ans+-1;
                return ans;
              }
             if(i==arr.length){
                return ans;
              }
              if(arr[i]==t){
                ans=ans+" "+i;
              }
        return  ALlOc(arr, t, ans, ++i);
    }

}
