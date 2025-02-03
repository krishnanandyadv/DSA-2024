public class lastoccur {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,45,567,8};
    int i= lastoc(arr,0,3);
        System.out.println(i);
    }

    private static int lastoc(int[] arr,int i,int key) {

        if(i == arr.length) {
            return -1;
        }
            int isFound = lastoc(arr, key, i+1);
            if(isFound == -1 && arr[i] ==key) {
            return i;
            }
            return isFound;


//         if(j==-1){
//             return -1;
//         }
//    if(arr[j]==t){
//     return j;
//    }
//    return lastoc(arr, j-1, t);
     }
}
