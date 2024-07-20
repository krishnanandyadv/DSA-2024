public class selectionsort {
    public static void main(String[] args) {
        int[] arr={8,9,1,5,3,8,76};
        int n=arr.length;

        for(int i=0;i<n;i++){
        int minind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[minind];
            arr[minind]=temp;

        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
