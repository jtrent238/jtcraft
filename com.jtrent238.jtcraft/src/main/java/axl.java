/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class axl
/*    */ {
/*  7 */   private static int a = 256;
/*    */   
/*  9 */   private static List b = new ArrayList();
/* 10 */   private static List c = new ArrayList();
/*    */   
/* 12 */   private static List d = new ArrayList();
/* 13 */   private static List e = new ArrayList();
/*    */   
/*    */   public static synchronized int[] a(int paramInt) {
/* 16 */     if (paramInt <= 256) {
/* 17 */       if (b.isEmpty()) {
/* 18 */         arrayOfInt = new int['Ā'];
/* 19 */         c.add(arrayOfInt);
/* 20 */         return arrayOfInt;
/*    */       }
/* 22 */       arrayOfInt = (int[])b.remove(b.size() - 1);
/* 23 */       c.add(arrayOfInt);
/* 24 */       return arrayOfInt;
/*    */     }
/*    */     
/*    */ 
/* 28 */     if (paramInt > a) {
/* 29 */       a = paramInt;
/*    */       
/* 31 */       d.clear();
/* 32 */       e.clear();
/*    */       
/* 34 */       arrayOfInt = new int[a];
/* 35 */       e.add(arrayOfInt);
/* 36 */       return arrayOfInt;
/*    */     }
/* 38 */     if (d.isEmpty()) {
/* 39 */       arrayOfInt = new int[a];
/* 40 */       e.add(arrayOfInt);
/* 41 */       return arrayOfInt;
/*    */     }
/* 43 */     int[] arrayOfInt = (int[])d.remove(d.size() - 1);
/* 44 */     e.add(arrayOfInt);
/* 45 */     return arrayOfInt;
/*    */   }
/*    */   
/*    */ 
/*    */   public static synchronized void a()
/*    */   {
/* 51 */     if (!d.isEmpty()) d.remove(d.size() - 1);
/* 52 */     if (!b.isEmpty()) { b.remove(b.size() - 1);
/*    */     }
/* 54 */     d.addAll(e);
/* 55 */     b.addAll(c);
/*    */     
/* 57 */     e.clear();
/* 58 */     c.clear();
/*    */   }
/*    */   
/*    */   public static synchronized String b() {
/* 62 */     return "cache: " + d.size() + ", tcache: " + b.size() + ", allocated: " + e.size() + ", tallocated: " + c.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\axl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */