public class fristoccurence {
    public static void main(String[] args) {
        int[] arr={1,23,4,95,565,59,77,85,58};
        int i=0;
        System.out.println(FOc(arr,i));
    }

    private static int FOc(int[] arr,int i) {
        if(i==arr.length){
            return -1;
        }
       if(arr[i]==5){
        return i;
       }
       
      
    return   FOc(arr, ++i);
    }
    
}
