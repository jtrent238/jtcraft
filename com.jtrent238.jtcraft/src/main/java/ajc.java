/*    */ 
/*    */ 
/*    */ public abstract class ajc
/*    */   extends aji
/*    */   implements akw
/*    */ {
/*    */   protected ajc(awt paramawt)
/*    */   {
/*  9 */     super(paramawt);
/* 10 */     this.A = true;
/*    */   }
/*    */   
/*    */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 15 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, int paramInt4)
/*    */   {
/* 20 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramInt4);
/* 21 */     paramahb.p(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 26 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/* 27 */     aor localaor = paramahb.o(paramInt1, paramInt2, paramInt3);
/* 28 */     if (localaor != null) {
/* 29 */       return localaor.c(paramInt4, paramInt5);
/*    */     }
/* 31 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ajc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */