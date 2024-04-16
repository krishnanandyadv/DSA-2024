public class insertion {
    public static void main(String[] args) {
        int[] arr={8,9,1,5,3,8,76};
        
        for(int i=1;i<arr.length;i++){
int j=i-1;
int item=arr[i];
while(j>=0 && item<arr[j]){
       
    arr[j+1]=arr[j];
        //   int temp=arr[j];
        //   arr[j]=arr[j+1];
        //   arr[j+1]=temp;
         
        j--;
    
}
j++;
arr[j]=item;
        
}
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
