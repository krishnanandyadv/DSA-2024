 
public class operation {
    public static void main(String[] args) {
        int n=6;
        int i=3;
        if((n&(1<<i))==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    
}
