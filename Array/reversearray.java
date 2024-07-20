public class reversearray {
    public static void main(String[] args) {
        int[] arr={22,345,-323,665,4,-4534,7,5,67,8,9,9,9,0};
rev(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    }
    public static int[] rev(int[] arr){

int i=3;
int j=7;

// int j=arr.length-1;
while(i<j){
     int temp= arr[i];
     arr[i]=arr[j];
     arr[j]=temp;
     i++;
     j--;
}
         
return arr;
    }
}
