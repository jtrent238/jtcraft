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
/*     */ 
/*     */ 
/*     */ public class aob
/*     */   extends aji
/*     */ {
/*     */   private rf a;
/*     */   private rf b;
/*     */   
/*     */   public aob()
/*     */   {
/*  24 */     super(awt.u);
/*  25 */     a(abt.d);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  30 */     if (paramInt1 == 0) return this.b;
/*  31 */     if (paramInt1 == 1) return this.a;
/*  32 */     return this.L;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  37 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  38 */     if (paramahb.v(paramInt1, paramInt2, paramInt3)) {
/*  39 */       b(paramahb, paramInt1, paramInt2, paramInt3, 1);
/*  40 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  47 */     if (paramahb.v(paramInt1, paramInt2, paramInt3)) {
/*  48 */       b(paramahb, paramInt1, paramInt2, paramInt3, 1);
/*  49 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public int a(Random paramRandom)
/*     */   {
/*  56 */     return 1;
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, agw paramagw)
/*     */   {
/*  61 */     if (paramahb.E) { return;
/*     */     }
/*  63 */     xw localxw = new xw(paramahb, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, paramagw.c());
/*  64 */     localxw.a = (paramahb.s.nextInt(localxw.a / 4) + localxw.a / 8);
/*  65 */     paramahb.d(localxw);
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/*  70 */     a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, null);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, sv paramsv) {
/*  74 */     if (paramahb.E) { return;
/*     */     }
/*  76 */     if ((paramInt4 & 0x1) == 1) {
/*  77 */       xw localxw = new xw(paramahb, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, paramsv);
/*  78 */       paramahb.d(localxw);
/*  79 */       paramahb.a(localxw, "game.tnt.primed", 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/*  85 */     if ((paramyz.bF() != null) && (paramyz.bF().b() == ade.d)) {
/*  86 */       a(paramahb, paramInt1, paramInt2, paramInt3, 1, paramyz);
/*  87 */       paramahb.f(paramInt1, paramInt2, paramInt3);
/*  88 */       paramyz.bF().a(1, paramyz);
/*  89 */       return true;
/*     */     }
/*  91 */     return super.a(paramahb, paramInt1, paramInt2, paramInt3, paramyz, paramInt4, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sa paramsa)
/*     */   {
/*  96 */     if (((paramsa instanceof zc)) && (!paramahb.E)) {
/*  97 */       zc localzc = (zc)paramsa;
/*  98 */       if (localzc.al()) {
/*  99 */         a(paramahb, paramInt1, paramInt2, paramInt3, 1, (localzc.c instanceof sv) ? (sv)localzc.c : null);
/* 100 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(agw paramagw)
/*     */   {
/* 107 */     return false;
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 112 */     this.L = paramrg.a(N() + "_side");
/* 113 */     this.a = paramrg.a(N() + "_top");
/* 114 */     this.b = paramrg.a(N() + "_bottom");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aob.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */