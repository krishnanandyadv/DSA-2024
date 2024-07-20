//this is leetcode probleam i was done in 5min without a error

public class scoreofstring {
   public static void main(String[] args) {
    System.out.println(scoreOfString("asnddjsj")
    );
    
    
   }
        public static int scoreOfString(String s) {
            int sum=0;
            for(int i=1;i<s.length();i++){
                int p=s.charAt(i-1);
                int c=s.charAt(i);
                  int d=c-p;
                  if(d<0){
                    sum=sum-d;
                  }
                  else{
                  sum=sum+d; }
            }
            return sum;
        }
    }

