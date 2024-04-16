public class subsequence {
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        printSubsequnce(str,ans);
    }

    private static void printSubsequnce(String ques, String ans) {

        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch =ques.charAt(0);
        printSubsequnce(ques.substring(1),ans);
        printSubsequnce(ques.substring(1),ans+ch);

      
    }
}
