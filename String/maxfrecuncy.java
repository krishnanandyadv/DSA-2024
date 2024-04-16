public class maxfrecuncy {
    public static void main(String[] args) {
      int[] arr=new int[26];
      String str="askwsdmkmceeeee" ;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
       
int ascii = (int) ch;
arr[ascii-97]= arr[ascii-97]+1;

    }

    int max=0;
    int j=0;
    for(int i=0;i<arr.length;i++){
      
        if(arr[i]>max){
            j=i;
        }
        max=Math.max(arr[i],max);
          
    }
System.out.println(max);

char ch=(char)(97+j);
System.out.println(ch);

    }
}
