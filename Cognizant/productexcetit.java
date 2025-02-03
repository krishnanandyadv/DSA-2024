import java.util.*;
public class productexcetit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4};
      int n=  arr.length;
      int[] left=new int[n];
      int[] right=new int[n];
      left[0]=1;
      for(int i=1;i<n;i++){
          left[i]=left[i-1]*arr[i-1];

      }
      right[n-1]=1;
      for(int i=n-2;i>=0;i--){
          right[i]=right[i+1]*arr[i+1];

      }
      for(int i=0;i<n;i++){
       arr[i]=left[i]*right[i];

      }


           for(int i=0;i<arr.length;i++){
                   System.out.println(arr[i]);
                    }
    }

}

// import java.util.*;
// public class productexcetit {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int[] arr={2,3,4};
//         int[] ans=new int[arr.length];
//         Arrays.fill(ans, 1);
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(j==i){
//                     continue;
//                 }
//                 ans[i]=arr[j]*ans[i];
//         }}
//         for(int i=0;i<arr.length;i++){
//           System.out.println(ans[i]);
//        }
//     }

// }
