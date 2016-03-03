/*     */ import java.util.List;
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
/*     */ public class aku
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   
/*     */   public aku()
/*     */   {
/*  23 */     super(awt.e);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  28 */     if (paramInt1 == 1) {
/*  29 */       return this.a;
/*     */     }
/*  31 */     if (paramInt1 == 0) {
/*  32 */       return ajn.bs.h(paramInt1);
/*     */     }
/*  34 */     return this.L;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/*  39 */     this.L = paramrg.a(N() + "_side");
/*  40 */     this.a = paramrg.a(N() + "_top");
/*  41 */     this.b = paramrg.a(N() + "_eye");
/*     */   }
/*     */   
/*     */   public rf e() {
/*  45 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean c()
/*     */   {
/*  50 */     return false;
/*     */   }
/*     */   
/*     */   public int b()
/*     */   {
/*  55 */     return 26;
/*     */   }
/*     */   
/*     */   public void g()
/*     */   {
/*  60 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, azt paramazt, List paramList, sa paramsa)
/*     */   {
/*  65 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
/*  66 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     
/*  68 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*  69 */     if (b(i)) {
/*  70 */       a(0.3125F, 0.8125F, 0.3125F, 0.6875F, 1.0F, 0.6875F);
/*  71 */       super.a(paramahb, paramInt1, paramInt2, paramInt3, paramazt, paramList, paramsa);
/*     */     }
/*  73 */     g();
/*     */   }
/*     */   
/*     */   public static boolean b(int paramInt) {
/*  77 */     return (paramInt & 0x4) != 0;
/*     */   }
/*     */   
/*     */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*     */   {
/*  82 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/*  87 */     int i = ((qh.c(paramsv.y * 4.0F / 360.0F + 0.5D) & 0x3) + 2) % 4;
/*  88 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/*  93 */     return true;
/*     */   }
/*     */   
/*     */   public int g(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  98 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/*     */     
/* 100 */     if (b(i)) {
/* 101 */       return 15;
/*     */     }
/* 103 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aku.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */