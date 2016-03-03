/*    */ import java.util.Random;
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
/*    */ public class akb
/*    */   extends ajc
/*    */ {
/*    */   public akb()
/*    */   {
/* 18 */     super(awt.f);
/*    */   }
/*    */   
/*    */   public aor a(ahb paramahb, int paramInt)
/*    */   {
/* 23 */     return new aox();
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 28 */     if (!paramahb.E)
/*    */     {
/* 30 */       boolean bool = paramahb.v(paramInt1, paramInt2, paramInt3);
/* 31 */       int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 32 */       int j = (i & 0x1) != 0 ? 1 : 0;
/*    */       
/* 34 */       if ((bool) && (j == 0)) {
/* 35 */         paramahb.a(paramInt1, paramInt2, paramInt3, i | 0x1, 4);
/* 36 */         paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/* 37 */       } else if ((!bool) && (j != 0)) {
/* 38 */         paramahb.a(paramInt1, paramInt2, paramInt3, i & 0xFFFFFFFE, 4);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 45 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*    */     
/* 47 */     if ((localaor != null) && ((localaor instanceof aox))) {
/* 48 */       agp localagp = ((aox)localaor).a();
/* 49 */       localagp.a(paramahb);
/* 50 */       paramahb.f(paramInt1, paramInt2, paramInt3, this);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(ahb paramahb)
/*    */   {
/* 56 */     return 1;
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 61 */     aox localaox = (aox)paramahb.o(paramInt1, paramInt2, paramInt3);
/*    */     
/* 63 */     if (localaox != null) {
/* 64 */       paramyz.a(localaox);
/*    */     }
/*    */     
/* 67 */     return true;
/*    */   }
/*    */   
/*    */   public boolean M()
/*    */   {
/* 72 */     return true;
/*    */   }
/*    */   
/*    */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 77 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/*    */     
/* 79 */     if ((localaor != null) && ((localaor instanceof aox))) {
/* 80 */       return ((aox)localaor).a().g();
/*    */     }
/*    */     
/* 83 */     return 0;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*    */   {
/* 88 */     aox localaox = (aox)paramahb.o(paramInt1, paramInt2, paramInt3);
/*    */     
/* 90 */     if (paramadd.u()) {
/* 91 */       localaox.a().b(paramadd.s());
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 97 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */