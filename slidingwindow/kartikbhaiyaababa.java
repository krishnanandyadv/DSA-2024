public class kartikbhaiyaababa {
    public static void main(String[] args) {
        String str="aababab";
        int k=3;
       int flipa=maximulength(str, k,'a');
       int flipb=maximulength(str, k,'b');
        System.out.println(Math.max(flipa,flipb));
    }

    private static int maximulength(String str, int k,char ch) {
        int ans=0;
        int si=0;
        int ei=0;
        int f=0;
        while (ei<str.length()) {
            // widow grow
            if(str.charAt(ei)==ch){
                      f++;
            }
            // window shrink
            while (f>k && si<=ei) {
                if(str.charAt(ei)==ch){
                    f--;
          }
                si++;
            }
            // result
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
          


      return ans;

    }

}
