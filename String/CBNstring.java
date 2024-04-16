public class CBNstring {
    public static void main(String[] args) {
        String str="81615";
       
        System.out.println( PrintSubString(str));
    }

    public static int PrintSubString(String str){
        int count=0;
        boolean[] visted=new boolean[str.length()];

        for(int slen=1;slen<=str.length();slen++){
            for(int i=0;i<=str.length()-slen;i++){
                int ei=i+slen;
                String s=str.substring(i, ei);
             Long l= Long.parseLong(s);
               
                if(iscbnumber(l)==true && isvisted(visted,i,ei-1)){

                    for(int j=i;j<=ei-1;j++){
                        visted[i]= true;
                         
                        }
                    count++;
                }

// System.out.println(s);
            }
        }
        return count;

    }

    private static boolean isvisted(boolean[] visted,int s, int e) {
        for(int i=s;i<=e;i++){
           if(visted[i]== true){
            return false;
           }
        }
return true;
    }
 

    public static boolean iscbnumber(long n){
        int [] arr={2,3,5,7,11,13,17,19,23,29};
        //poin 1
        if(n==0||n==1){
            return false;
        }
                //poin 2
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
                //poin 3

                for(int i=0;i<arr.length;i++){
                    if(n%arr[i]==0){
                        return false;
                    }
                }
                return true;
    }
}
