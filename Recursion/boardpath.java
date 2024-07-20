public class boardpath {
    public static void main(String[] args) {
        System.out.println(boardpathd(4,0,""));
      
    }

    private static int boardpathd(int end, int cur, String ans) {
        if(cur==end){
            System.out.println(ans);
            return 1;
        }
        if(cur>end){
            return 0;
        }
        int fp=boardpathd(end, cur+1, ans+1);
        
        int sp=boardpathd(end, cur+2, ans+2);
        int tp=boardpathd(end, cur+3, ans+3);
        return fp+sp+tp;
    }
}
