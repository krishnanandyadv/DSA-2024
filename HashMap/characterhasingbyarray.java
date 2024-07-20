public class characterhasingbyarray {
    
    public static void main(String[] args) {
        String s="aabsbrjdjdednika";
        
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
             hash[s.charAt(i)-'a']+=1;

        }
        System.out.println(hash[0]);

        String S="aabsbrjdjdeAD@##dnaaika";
        
        int[] Hash=new int[256];
        for(int i=0;i<S.length();i++){
            int in=S.charAt(i);
             Hash[in]+=1;

        }
        System.out.println(Hash[97]);
    }
}
