/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alp
/*    */   extends alk
/*    */ {
/*    */   public alp()
/*    */   {
/* 15 */     super("ice", awt.w, false);
/* 16 */     this.K = 0.98F;
/* 17 */     a(true);
/* 18 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public int w()
/*    */   {
/* 23 */     return 1;
/*    */   }
/*    */   
/*    */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 28 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, 1 - paramInt4);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 33 */     paramyz.a(pp.C[aji.b(this)], 1);
/* 34 */     paramyz.a(0.025F);
/*    */     
/* 36 */     if ((E()) && (afv.e(paramyz))) {
/* 37 */       add localadd = j(paramInt4);
/* 38 */       if (localadd != null) {
/* 39 */         a(paramahb, paramInt1, paramInt2, paramInt3, localadd);
/*    */       }
/*    */     } else {
/* 42 */       if (paramahb.t.f) {
/* 43 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 44 */         return;
/*    */       }
/*    */       
/* 47 */       int i = afv.f(paramyz);
/* 48 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, i);
/*    */       
/* 50 */       awt localawt = paramahb.a(paramInt1, paramInt2 - 1, paramInt3).o();
/* 51 */       if ((localawt.c()) || (localawt.d())) {
/* 52 */         paramahb.b(paramInt1, paramInt2, paramInt3, ajn.i);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 59 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 64 */     if (paramahb.b(ahn.b, paramInt1, paramInt2, paramInt3) > 11 - k()) {
/* 65 */       if (paramahb.t.f) {
/* 66 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 67 */         return;
/*    */       }
/*    */       
/* 70 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 71 */       paramahb.b(paramInt1, paramInt2, paramInt3, ajn.j);
/*    */     }
/*    */   }
/*    */   
/*    */   public int h()
/*    */   {
/* 77 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */