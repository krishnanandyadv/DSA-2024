import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  row");
        int r=sc.nextInt();
        int[][] arr=new int[r][];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter  col");
            int c=sc.nextInt();
            arr[i]=new int[c];

            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<arr.length;i++){
       
          
         
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);


                
                
            }
             System.out.println();
            
        }
      
    }
}
