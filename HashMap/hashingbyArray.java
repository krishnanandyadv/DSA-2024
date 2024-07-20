public class hashingbyArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,2,3,1,1,1}; 
        int[] hash=new int[14];

        // question find the number of occurence in the array of 1, 2,5,12
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]=hash[arr[i]]+1;
        }
        for(int i=0;i<arr.length;i++){
           System.out.println(i +"="+hash[i]);
        }
        System.out.println(hash[1]);
    }
}
