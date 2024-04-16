
public class min{
public static void main(String[] args) {
    System.out.println("hello");

    int[] arr={22,345,-323,665,4,-4534};
    System.out.println(minimun(arr));

}
public static int minimun(int[] arr ){
    int min =arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }

    }
    return min;
}
}