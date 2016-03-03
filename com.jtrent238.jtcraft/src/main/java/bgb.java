/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bgb
/*    */   implements bci
/*    */ {
/*    */   private final bfz c;
/*    */   protected final bao a;
/*    */   protected final btb b;
/* 16 */   private long d = 0L;
/*    */   
/*    */   protected bgb(bfz parambfz, btb parambtb) {
/* 19 */     this.c = parambfz;
/* 20 */     this.b = parambtb;
/* 21 */     this.a = bao.B();
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bmh parambmh, int paramInt6, int paramInt7, boolean paramBoolean)
/*    */   {
/* 26 */     this.a.l.b(brp.a("lanServer.title", new Object[0]), paramInt2 + 32 + 3, paramInt3 + 1, 16777215);
/* 27 */     this.a.l.b(this.b.a(), paramInt2 + 32 + 3, paramInt3 + 12, 8421504);
/*    */     
/* 29 */     if (this.a.u.u) {
/* 30 */       this.a.l.b(brp.a("selectServer.hiddenAddress", new Object[0]), paramInt2 + 32 + 3, paramInt3 + 12 + 11, 3158064);
/*    */     } else {
/* 32 */       this.a.l.b(this.b.b(), paramInt2 + 32 + 3, paramInt3 + 12 + 11, 3158064);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 38 */     this.c.b(paramInt1);
/* 39 */     if (bao.K() - this.d < 250L) {
/* 40 */       this.c.f();
/*    */     }
/* 42 */     this.d = bao.K();
/* 43 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*    */   
/*    */   public btb a()
/*    */   {
/* 51 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */