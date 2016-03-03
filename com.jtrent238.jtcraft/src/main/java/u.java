/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class u
/*    */ {
/*    */   public static v a()
/*    */   {
/* 16 */     String str = System.getProperty("os.name").toLowerCase();
/* 17 */     if (str.contains("win")) return v.c;
/* 18 */     if (str.contains("mac")) return v.d;
/* 19 */     if (str.contains("solaris")) return v.b;
/* 20 */     if (str.contains("sunos")) return v.b;
/* 21 */     if (str.contains("linux")) return v.a;
/* 22 */     if (str.contains("unix")) return v.a;
/* 23 */     return v.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */