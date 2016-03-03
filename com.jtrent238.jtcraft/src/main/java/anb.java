/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class anb
/*    */   extends aji
/*    */ {
/*    */   private final boolean a;
/*    */   
/*    */   public anb(boolean paramBoolean)
/*    */   {
/* 14 */     super(awt.t);
/* 15 */     this.a = paramBoolean;
/*    */     
/* 17 */     if (paramBoolean) {
/* 18 */       a(1.0F);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 24 */     if (!paramahb.E) {
/* 25 */       if ((this.a) && (!paramahb.v(paramInt1, paramInt2, paramInt3))) {
/* 26 */         paramahb.a(paramInt1, paramInt2, paramInt3, this, 4);
/* 27 */       } else if ((!this.a) && (paramahb.v(paramInt1, paramInt2, paramInt3))) {
/* 28 */         paramahb.d(paramInt1, paramInt2, paramInt3, ajn.bv, 0, 2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 35 */     if (!paramahb.E) {
/* 36 */       if ((this.a) && (!paramahb.v(paramInt1, paramInt2, paramInt3))) {
/* 37 */         paramahb.a(paramInt1, paramInt2, paramInt3, this, 4);
/* 38 */       } else if ((!this.a) && (paramahb.v(paramInt1, paramInt2, paramInt3))) {
/* 39 */         paramahb.d(paramInt1, paramInt2, paramInt3, ajn.bv, 0, 2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 46 */     if ((!paramahb.E) && 
/* 47 */       (this.a) && (!paramahb.v(paramInt1, paramInt2, paramInt3))) {
/* 48 */       paramahb.d(paramInt1, paramInt2, paramInt3, ajn.bu, 0, 2);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 55 */     return adb.a(ajn.bu);
/*    */   }
/*    */   
/*    */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 60 */     return adb.a(ajn.bu);
/*    */   }
/*    */   
/*    */   protected add j(int paramInt)
/*    */   {
/* 65 */     return new add(ajn.bu);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\anb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */