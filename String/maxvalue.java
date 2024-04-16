public class maxvalue {
    public static void main(String[] args) {
        int[] arr={54,546,548,60};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                     String str=arr[j]+""+arr[j+1];
                     String str1=arr[j+1]+""+arr[j];
                     if(Long.parseLong(str)<Long.parseLong(str1)){
                   
                        int t=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=t;
                     }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
