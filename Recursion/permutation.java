public class permutation {
    public static void main(String[] args) {
        permutationp("123","");
    }

    private static void permutationp(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            // String sub=ques.substring(i+1);
            boolean flage=false;
            if(ques.indexOf(ch,i+1)>=0){
         flage=true;
         
            }
            if(flage==false){
          
            String ros=ques.substring(0, i)+ques.substring(i+1);
            permutationp(ros, ans+ch);
            }
        }
    }
}
