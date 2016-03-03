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
/*     */ public class amw
/*     */   extends akk
/*     */ {
/*     */   private boolean a;
/*     */   private rf b;
/*     */   private rf M;
/*     */   
/*     */   protected amw(boolean paramBoolean)
/*     */   {
/*  25 */     super(awt.C);
/*  26 */     a(true);
/*  27 */     this.a = paramBoolean;
/*  28 */     a(abt.b);
/*     */   }
/*     */   
/*     */   public rf a(int paramInt1, int paramInt2)
/*     */   {
/*  33 */     if (paramInt1 == 1) return this.b;
/*  34 */     if (paramInt1 == 0) { return this.b;
/*     */     }
/*  36 */     if ((paramInt2 == 2) && (paramInt1 == 2)) return this.M;
/*  37 */     if ((paramInt2 == 3) && (paramInt1 == 5)) return this.M;
/*  38 */     if ((paramInt2 == 0) && (paramInt1 == 3)) return this.M;
/*  39 */     if ((paramInt2 == 1) && (paramInt1 == 4)) { return this.M;
/*     */     }
/*  41 */     return this.L;
/*     */   }
/*     */   
/*     */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  46 */     super.b(paramahb, paramInt1, paramInt2, paramInt3);
/*  47 */     int i; if ((paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.aE) && (paramahb.a(paramInt1, paramInt2 - 2, paramInt3) == ajn.aE)) {
/*  48 */       if (!paramahb.E) {
/*  49 */         paramahb.d(paramInt1, paramInt2, paramInt3, e(0), 0, 2);
/*  50 */         paramahb.d(paramInt1, paramInt2 - 1, paramInt3, e(0), 0, 2);
/*  51 */         paramahb.d(paramInt1, paramInt2 - 2, paramInt3, e(0), 0, 2);
/*  52 */         wr localwr = new wr(paramahb);
/*  53 */         localwr.b(paramInt1 + 0.5D, paramInt2 - 1.95D, paramInt3 + 0.5D, 0.0F, 0.0F);
/*  54 */         paramahb.d(localwr);
/*     */         
/*  56 */         paramahb.c(paramInt1, paramInt2, paramInt3, e(0));
/*  57 */         paramahb.c(paramInt1, paramInt2 - 1, paramInt3, e(0));
/*  58 */         paramahb.c(paramInt1, paramInt2 - 2, paramInt3, e(0));
/*     */       }
/*  60 */       for (i = 0; i < 120; i++) {
/*  61 */         paramahb.a("snowshovel", paramInt1 + paramahb.s.nextDouble(), paramInt2 - 2 + paramahb.s.nextDouble() * 2.5D, paramInt3 + paramahb.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */       }
/*  63 */     } else if ((paramahb.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.S) && (paramahb.a(paramInt1, paramInt2 - 2, paramInt3) == ajn.S))
/*     */     {
/*  65 */       i = (paramahb.a(paramInt1 - 1, paramInt2 - 1, paramInt3) == ajn.S) && (paramahb.a(paramInt1 + 1, paramInt2 - 1, paramInt3) == ajn.S) ? 1 : 0;
/*  66 */       int j = (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 - 1) == ajn.S) && (paramahb.a(paramInt1, paramInt2 - 1, paramInt3 + 1) == ajn.S) ? 1 : 0;
/*  67 */       if ((i != 0) || (j != 0)) {
/*  68 */         paramahb.d(paramInt1, paramInt2, paramInt3, e(0), 0, 2);
/*  69 */         paramahb.d(paramInt1, paramInt2 - 1, paramInt3, e(0), 0, 2);
/*  70 */         paramahb.d(paramInt1, paramInt2 - 2, paramInt3, e(0), 0, 2);
/*  71 */         if (i != 0) {
/*  72 */           paramahb.d(paramInt1 - 1, paramInt2 - 1, paramInt3, e(0), 0, 2);
/*  73 */           paramahb.d(paramInt1 + 1, paramInt2 - 1, paramInt3, e(0), 0, 2);
/*     */         } else {
/*  75 */           paramahb.d(paramInt1, paramInt2 - 1, paramInt3 - 1, e(0), 0, 2);
/*  76 */           paramahb.d(paramInt1, paramInt2 - 1, paramInt3 + 1, e(0), 0, 2);
/*     */         }
/*     */         
/*  79 */         wt localwt = new wt(paramahb);
/*  80 */         localwt.i(true);
/*  81 */         localwt.b(paramInt1 + 0.5D, paramInt2 - 1.95D, paramInt3 + 0.5D, 0.0F, 0.0F);
/*  82 */         paramahb.d(localwt);
/*     */         
/*  84 */         for (int k = 0; k < 120; k++) {
/*  85 */           paramahb.a("snowballpoof", paramInt1 + paramahb.s.nextDouble(), paramInt2 - 2 + paramahb.s.nextDouble() * 3.9D, paramInt3 + paramahb.s.nextDouble(), 0.0D, 0.0D, 0.0D);
/*     */         }
/*     */         
/*  88 */         paramahb.c(paramInt1, paramInt2, paramInt3, e(0));
/*  89 */         paramahb.c(paramInt1, paramInt2 - 1, paramInt3, e(0));
/*  90 */         paramahb.c(paramInt1, paramInt2 - 2, paramInt3, e(0));
/*  91 */         if (i != 0) {
/*  92 */           paramahb.c(paramInt1 - 1, paramInt2 - 1, paramInt3, e(0));
/*  93 */           paramahb.c(paramInt1 + 1, paramInt2 - 1, paramInt3, e(0));
/*     */         } else {
/*  95 */           paramahb.c(paramInt1, paramInt2 - 1, paramInt3 - 1, e(0));
/*  96 */           paramahb.c(paramInt1, paramInt2 - 1, paramInt3 + 1, e(0));
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 104 */     return (paramahb.a(paramInt1, paramInt2, paramInt3).J.j()) && (ahb.a(paramahb, paramInt1, paramInt2 - 1, paramInt3));
/*     */   }
/*     */   
/*     */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, sv paramsv, add paramadd)
/*     */   {
/* 109 */     int i = qh.c(paramsv.y * 4.0F / 360.0F + 2.5D) & 0x3;
/* 110 */     paramahb.a(paramInt1, paramInt2, paramInt3, i, 2);
/*     */   }
/*     */   
/*     */   public void a(rg paramrg)
/*     */   {
/* 115 */     this.M = paramrg.a(N() + "_face_" + (this.a ? "on" : "off"));
/* 116 */     this.b = paramrg.a(N() + "_top");
/* 117 */     this.L = paramrg.a(N() + "_side");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */