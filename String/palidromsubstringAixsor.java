public class palidromsubstringAixsor {
    public static void main(String[] args) {
        String str="aaa";
       
        System.out.println( countPalidrom(str));
        }

    public static int countPalidrom(String s){
        int n=s.length();
        int c=0;
         if(n%2!=0){
        for(int axis=0;axis<=s.length();axis++){
            for(int orbit=0;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                if(s.charAt(axis-orbit)==s.charAt(axis+orbit)){
                    c++;
                    System.out.println(s.charAt(axis-orbit)+""+s.charAt(orbit)+""+s.charAt(axis+orbit));
                }
                else{
                    break;
                }
            }
        }}
        
        else{
            for(double axis=0.5;axis<=s.length();axis++){
                for(double orbit=0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++){
                    if(s.charAt((int)(axis-orbit))==s.charAt((int)(axis+orbit))){
                        c++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return c;
    }

}
