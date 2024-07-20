// Source code is decompiled from a .class file using FernFlower decompiler.
public class slidingwindow {
   
    public static void main(String[] var0) {
       byte var1 = 3;
       int[] var2 = new int[]{2,7,3,5,8,1};
       int var3 = 0;
       boolean var4 = false;
 
       int var5;
       for(var5 = 0; var5 < var1; ++var5) {
          var3 += var2[var5];
       }
 
       int var6 = var3;
 
       for(var5 = var1; var5 < var2.length; ++var5) {
          var3 += var2[var5];
          var3 -= var2[var5 - var1];
          var6 = Math.max(var6, var3);
       }
 
       System.out.println(var6);
    }
 }
