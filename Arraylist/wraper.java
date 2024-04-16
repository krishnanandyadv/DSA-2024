// package Arraylist;

public class wraper {
    public static void main(String[] args) {
        int a=100;
        Integer a1=100;
        System.out.println(a);
        System.out.println(a1);
        Integer c1=19;
        Integer c2=19;
        System.out.println(c1==c2);//in range h -128 to 127 tho cashe create nhi hoga so same true same address ko point karega same for Integer ,byte ,long
        Integer d1=199;
        Integer d2=199;
        System.out.println(d1==d2); //out of range
    }
}
