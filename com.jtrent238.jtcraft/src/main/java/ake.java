/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ake
/*    */   extends aji
/*    */ {
/*    */   private rf a;
/*    */   private rf b;
/*    */   
/*    */   protected ake()
/*    */   {
/* 16 */     super(awt.d);
/* 17 */     a(abt.c);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 22 */     if (paramInt1 == 1) return this.a;
/* 23 */     if (paramInt1 == 0) return ajn.f.h(paramInt1);
/* 24 */     if ((paramInt1 == 2) || (paramInt1 == 4)) return this.b;
/* 25 */     return this.L;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 30 */     this.L = paramrg.a(N() + "_side");
/* 31 */     this.a = paramrg.a(N() + "_top");
/* 32 */     this.b = paramrg.a(N() + "_front");
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 37 */     if (paramahb.E) {
/* 38 */       return true;
/*    */     }
/* 40 */     paramyz.b(paramInt1, paramInt2, paramInt3);
/* 41 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */