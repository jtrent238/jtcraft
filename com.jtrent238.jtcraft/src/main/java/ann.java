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
/*     */ 
/*     */ public class ann
/*     */   extends aji
/*     */ {
/*     */   protected ann()
/*     */   {
/*  19 */     super(awt.y);
/*  20 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  21 */     a(true);
/*  22 */     a(abt.c);
/*  23 */     b(0);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  28 */     this.L = paramrg.a("snow");
/*     */   }
/*     */   
/*     */   public azt a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  33 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3) & 0x7;
/*  34 */     float f = 0.125F;
/*  35 */     return azt.a(paramInt1 + this.B, paramInt2 + this.C, paramInt3 + this.D, paramInt1 + this.E, paramInt2 + i * f, paramInt3 + this.G);
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
/*     */ 
/*     */   public boolean c()
/*     */   {
/*  49 */     return false;
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/*  54 */     return false;
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  59 */     b(0);
/*     */   }
/*     */   
/*     */   public void a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  64 */     b(paramahl.e(paramInt1, paramInt2, paramInt3));
/*     */   }
/*     */   
/*     */   protected void b(int paramInt) {
/*  68 */     int i = paramInt & 0x7;
/*  69 */     float f = 2 * (1 + i) / 16.0F;
/*  70 */     a(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  75 */     aji localaji = paramahb.a(paramInt1, paramInt2 - 1, paramInt3);
/*     */     
/*  77 */     if ((localaji == ajn.aD) || (localaji == ajn.cj)) { return false;
/*     */     }
/*  79 */     if (localaji.o() == awt.j) { return true;
/*     */     }
/*  81 */     if ((localaji == this) && ((paramahb.e(paramInt1, paramInt2 - 1, paramInt3) & 0x7) == 7)) { return true;
/*     */     }
/*  83 */     return (localaji.c()) && (localaji.J.c());
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  88 */     m(paramahb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   private boolean m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/*  92 */     if (!c(paramahb, paramInt1, paramInt2, paramInt3)) {
/*  93 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/*  94 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  95 */       return false;
/*     */     }
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, yz paramyz, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 102 */     int i = paramInt4 & 0x7;
/* 103 */     a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.ay, i + 1, 0));
/* 104 */     paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     
/* 106 */     paramyz.a(pp.C[aji.b(this)], 1);
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/* 111 */     return ade.ay;
/*     */   }
/*     */   
/*     */   public int a(Random paramRandom)
/*     */   {
/* 116 */     return 0;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*     */   {
/* 121 */     if (paramahb.b(ahn.b, paramInt1, paramInt2, paramInt3) > 11) {
/* 122 */       b(paramahb, paramInt1, paramInt2, paramInt3, paramahb.e(paramInt1, paramInt2, paramInt3), 0);
/* 123 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 129 */     if (paramInt4 == 1) return true;
/* 130 */     return super.a(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ann.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */