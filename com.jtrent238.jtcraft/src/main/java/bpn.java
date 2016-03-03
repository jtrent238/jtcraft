/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bpn
/*    */ {
/* 11 */   private static final Logger a = ;
/*    */   private static bpn b;
/*    */   
/*    */   public static void a() {
/* 15 */     b = new bpn();
/*    */   }
/*    */   
/*    */   public static bpn b() {
/* 19 */     return b;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void a(bpi parambpi)
/*    */   {
/* 26 */     parambpi.f().b(parambpi);
/* 27 */     parambpi.e().b(parambpi);
/*    */     
/* 29 */     buu.e(parambpi.h());
/*    */   }
/*    */   
/*    */   public int c() {
/* 33 */     int i = buu.d();
/*    */     
/* 35 */     if (i <= 0) {
/* 36 */       throw new lb("Could not create shader program (returned program ID " + i + ")");
/*    */     }
/*    */     
/* 39 */     return i;
/*    */   }
/*    */   
/*    */   public void b(bpi parambpi) {
/* 43 */     parambpi.f().a(parambpi);
/* 44 */     parambpi.e().a(parambpi);
/*    */     
/* 46 */     buu.f(parambpi.h());
/* 47 */     int i = buu.a(parambpi.h(), buu.o);
/* 48 */     if (i == 0) {
/* 49 */       a.warn("Error encountered when linking program containing VS " + parambpi.e().a() + " and FS " + parambpi.f().a() + ". Log output:");
/* 50 */       a.warn(buu.e(parambpi.h(), 32768));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */