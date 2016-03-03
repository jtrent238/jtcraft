/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajr
/*    */   extends aji
/*    */ {
/*    */   protected ajr(awt paramawt)
/*    */   {
/* 12 */     super(paramawt);
/* 13 */     a(true);
/* 14 */     float f = 0.2F;
/* 15 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
/* 16 */     a(abt.c);
/*    */   }
/*    */   
/*    */   protected ajr() {
/* 20 */     this(awt.k);
/*    */   }
/*    */   
/*    */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 25 */     return (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3)));
/*    */   }
/*    */   
/*    */   protected boolean a(aji paramaji) {
/* 29 */     return (paramaji == ajn.c) || (paramaji == ajn.d) || (paramaji == ajn.ak);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 34 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/* 35 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 40 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   protected void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 44 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/* 45 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 46 */       paramahb.d(paramInt1, paramInt2, paramInt3, e(0), 0, 2);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 52 */     return a(paramahb.a(paramInt1, paramInt2 - 1, paramInt3));
/*    */   }
/*    */   
/*    */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 57 */     return null;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean c()
/*    */   {
/* 66 */     return false;
/*    */   }
/*    */   
/*    */   public boolean d()
/*    */   {
/* 71 */     return false;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 76 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */