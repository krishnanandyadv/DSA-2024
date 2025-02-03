public class MAx2nd {
    public static void main(String[] args) {
        int[] arr={1,2,33,44,11,10,34};
        int sMax=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int tmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(max<arr[i]){
                max=arr[i];
             }
        }
        for(int i=0;i<arr.length;i++){
             if(sMax<arr[i] && arr[i]<max ){
                sMax=arr[i];
             }
        }
        for(int i=0;i<arr.length;i++){
             if(tmax<arr[i] && arr[i]<sMax && arr[i]<max){
                tmax=arr[i];
             }
        }
System.out.println(tmax);
    }
}
