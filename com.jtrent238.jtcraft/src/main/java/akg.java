/*     */ import java.util.Random;
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
/*     */ public class akg
/*     */   extends ajc
/*     */ {
/*  16 */   private rf[] a = new rf[2];
/*     */   
/*     */   public akg() {
/*  19 */     super(awt.d);
/*  20 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*  21 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  26 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
/*     */   }
/*     */   
/*     */   public int b(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  31 */     return paramahl.e(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom) {}
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji) {}
/*     */   
/*     */ 
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {}
/*     */   
/*     */ 
/*     */   public void e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  47 */     if (paramahb.t.g) { return;
/*     */     }
/*  49 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  50 */     int j = paramahb.b(ahn.a, paramInt1, paramInt2, paramInt3) - paramahb.j;
/*  51 */     float f = paramahb.d(1.0F);
/*     */     
/*     */ 
/*     */ 
/*  55 */     if (f < 3.1415927F) {
/*  56 */       f += (0.0F - f) * 0.2F;
/*     */     } else {
/*  58 */       f += (6.2831855F - f) * 0.2F;
/*     */     }
/*     */     
/*  61 */     j = Math.round(j * qh.b(f));
/*  62 */     if (j < 0) {
/*  63 */       j = 0;
/*     */     }
/*  65 */     if (j > 15) {
/*  66 */       j = 15;
/*     */     }
/*     */     
/*  69 */     if (i != j) {
/*  70 */       paramahb.a(paramInt1, paramInt2, paramInt3, j, 3);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  76 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   public boolean f()
/*     */   {
/*  86 */     return true;
/*     */   }
/*     */   
/*     */   public aor a(ahb paramahb, int paramInt)
/*     */   {
/*  91 */     return new apa();
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  96 */     if (paramInt1 == 1) {
/*  97 */       return this.a[0];
/*     */     }
/*  99 */     return this.a[1];
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 104 */     this.a[0] = paramrg.a(N() + "_top");
/* 105 */     this.a[1] = paramrg.a(N() + "_side");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */