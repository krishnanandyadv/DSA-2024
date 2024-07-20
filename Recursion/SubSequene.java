public class SubSequene {  
     static int c=0;
    public static void main(String[] args) {
        String str="abc";
        printSS(str,"");
        System.out.println(c);
    }

    private static void printSS(String str, String ans) {
        if(str.length()==0){
        c=c+1;
        System.out.println(ans);
 return;
        }
       char ch=str.charAt(0);
       printSS(str.substring(1), ans);
       printSS(str.substring(1), ans+ch);
    }
}
