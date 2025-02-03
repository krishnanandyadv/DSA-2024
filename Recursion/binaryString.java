public class binaryString {
    public static void main(String[] args) {
        String sb="";
        
        BS(5,sb,0);
        
    }

    private static void BS(int n, String sb,int lastplace) {
      if(n==0){
        System.out.println(sb);
       
        return;

      }
      if(lastplace==0){

        BS(n-1, sb+'0', 0);
        BS(n-1, sb+'1', 1);
      }
      else{
        BS(n-1, sb+'0', 0);
      }
    }
}
