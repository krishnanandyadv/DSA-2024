// package Recursion;

public class power {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        // int p=1;
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0){
            return 1;
        }

       
 int p=  pow(a,b-1);
        return  a*p;
     
    }
}
