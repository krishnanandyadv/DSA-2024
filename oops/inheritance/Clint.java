// package inheritance;

public class Clint {
    public static void main(String[] args) {
     
        //  CASE 2 REFERENCE=P,INSTANCE=C
        // P obj =new C();
        // System.out.println(obj.x);
        // System.out.println(obj.y);
        // obj.fun(); // output will be of P but during runtime there is method overriding so child method overide to parentens  
        // // method overide child and parents of same name of method 
        // obj.fun2P();
        // ((C)(obj)).fun2C();

        // // case 3
        // C obj =new P();

        // case 4
        C obj =new C();
        System.out.println(obj.x);
        System.out.println(obj.p1);

        // function usi ka chalega jiska new obj hota agar usme nhi hoga tho woo parents me check ke=agrega
    obj.fun(); 
//  to acces p variabel
    System.out.println(((P)obj).x);

    }
}
