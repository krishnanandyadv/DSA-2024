public class isSorted {
    public static void main(String[] args) {
        int[] arr={1,33,445,6421,23445};
        int i=0;
       System.out.println( issorted(arr,i));

    }

    private static boolean issorted(int[] arr,int i) {
if(i==arr.length-1){
    return true;
}
 if(arr[i]>arr[i+1]){
   return false;
 }

 return issorted(arr, i+1);
 
    }
}
