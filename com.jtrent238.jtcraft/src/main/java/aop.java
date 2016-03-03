/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aop
/*     */   extends aji
/*     */ {
/*     */   protected aop()
/*     */   {
/*  18 */     super(awt.r);
/*  19 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
/*  20 */     a(true);
/*  21 */     a(abt.c);
/*  22 */     b(0);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  27 */     return ajn.L.a(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  32 */     int i = 0;
/*  33 */     float f = 0.0625F;
/*  34 */     return azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + i * f, paramInt3 + this.G);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  48 */     return false;
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  53 */     b(0);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  58 */     b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   protected void b(int paramInt) {
/*  62 */     int i = 0;
/*  63 */     float f = 1 * (1 + i) / 16.0F;
/*  64 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  69 */     return (super.c(paramahb, paramInt1, paramInt2, paramInt3)) && (j(paramahb, paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  74 */     e(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  78 */     if (!j(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  79 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*  80 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  81 */       return false;
/*     */     }
/*  83 */     return true;
/*     */   }
/*     */   
/*     */   public boolean j(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  88 */     return !paramahb.c(paramInt1, paramInt2 - 1, paramInt3);
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  93 */     if (paramInt4 == 1) return true;
/*  94 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */   
/*     */   public int a(int paramInt)
/*     */   {
/*  99 */     return paramInt;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(adb paramadb, abt paramabt, List paramList)
/*     */   {
/* 112 */     for (int i = 0; i < 16; i++) {
/* 113 */       paramList.add(new add(paramadb, 1, i));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */