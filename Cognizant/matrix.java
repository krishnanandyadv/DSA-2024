public class matrix {
    public static void main(String[] args) {
        int[][] mat={{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int r=3;
        int c=4;
        int i=0;
        int j=c-1;
        int k=0;
        int t=98;
        while(k<r+c-1){
            if(mat[i][j]==t){
           System.out.println("yes");
  break;
            }
            if(mat[i][j]<t){
               i++;
     
                 }
            if(mat[i][j]>t){
                 j--;
     
                 }
                 k++;

        }
        if(k==r+c-1){
  System.out.println("no");
        }

    }
}
