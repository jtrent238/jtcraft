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
/*     */ 
/*     */ public class zx
/*     */   extends zs
/*     */ {
/*     */   private aoq a;
/*     */   private final zy f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   
/*     */   public zx(yx paramyx, aoq paramaoq)
/*     */   {
/*  25 */     this.a = paramaoq;
/*     */     
/*  27 */     a(this.f = new zy(this, paramaoq, 0, 136, 110));
/*     */     
/*  29 */     int j = 36;
/*  30 */     int k = 137;
/*     */     
/*  32 */     for (int m = 0; m < 3; m++) {
/*  33 */       for (int n = 0; n < 9; n++) {
/*  34 */         a(new aay(paramyx, n + m * 9 + 9, j + n * 18, k + m * 18));
/*     */       }
/*     */     }
/*  37 */     for (m = 0; m < 9; m++) {
/*  38 */       a(new aay(paramyx, m, j + m * 18, 58 + k));
/*     */     }
/*     */     
/*  41 */     this.g = paramaoq.l();
/*  42 */     this.h = paramaoq.j();
/*  43 */     this.i = paramaoq.k();
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(aac paramaac)
/*     */   {
/*  49 */     super.a(paramaac);
/*     */     
/*  51 */     paramaac.a(this, 0, this.g);
/*  52 */     paramaac.a(this, 1, this.h);
/*  53 */     paramaac.a(this, 2, this.i);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/*  58 */     if (paramInt1 == 0) this.a.c(paramInt2);
/*  59 */     if (paramInt1 == 1) this.a.d(paramInt2);
/*  60 */     if (paramInt1 == 2) this.a.e(paramInt2);
/*     */   }
/*     */   
/*     */   public aoq e() {
/*  64 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  69 */     return this.a.a(paramyz);
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/*  74 */     add localadd1 = null;
/*  75 */     aay localaay = (aay)this.c.get(paramInt);
/*  76 */     if ((localaay != null) && (localaay.e())) {
/*  77 */       add localadd2 = localaay.d();
/*  78 */       localadd1 = localadd2.m();
/*     */       
/*  80 */       if (paramInt == 0) {
/*  81 */         if (!a(localadd2, 1, 37, true)) {
/*  82 */           return null;
/*     */         }
/*  84 */         localaay.a(localadd2, localadd1);
/*  85 */       } else if ((!this.f.e()) && (this.f.a(localadd2)) && (localadd2.b == 1)) {
/*  86 */         if (!a(localadd2, 0, 1, false)) {
/*  87 */           return null;
/*     */         }
/*  89 */       } else if ((paramInt >= 1) && (paramInt < 28)) {
/*  90 */         if (!a(localadd2, 28, 37, false)) {
/*  91 */           return null;
/*     */         }
/*  93 */       } else if ((paramInt >= 28) && (paramInt < 37)) {
/*  94 */         if (!a(localadd2, 1, 28, false)) {
/*  95 */           return null;
/*     */         }
/*     */       }
/*  98 */       else if (!a(localadd2, 1, 37, false)) {
/*  99 */         return null;
/*     */       }
/*     */       
/* 102 */       if (localadd2.b == 0) {
/* 103 */         localaay.c(null);
/*     */       } else {
/* 105 */         localaay.f();
/*     */       }
/* 107 */       if (localadd2.b == localadd1.b) {
/* 108 */         return null;
/*     */       }
/* 110 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 113 */     return localadd1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */