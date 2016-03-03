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
/*     */ 
/*     */ public class zz
/*     */   extends zs
/*     */ {
/*     */   private aov a;
/*     */   private final aay f;
/*     */   private int g;
/*     */   
/*     */   public zz(yx paramyx, aov paramaov)
/*     */   {
/*  24 */     this.a = paramaov;
/*     */     
/*  26 */     a(new aab(paramyx.d, paramaov, 0, 56, 46));
/*  27 */     a(new aab(paramyx.d, paramaov, 1, 79, 53));
/*  28 */     a(new aab(paramyx.d, paramaov, 2, 102, 46));
/*  29 */     this.f = a(new aaa(this, paramaov, 3, 79, 17));
/*     */     
/*  31 */     for (int i = 0; i < 3; i++) {
/*  32 */       for (int j = 0; j < 9; j++) {
/*  33 */         a(new aay(paramyx, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     }
/*  36 */     for (i = 0; i < 9; i++) {
/*  37 */       a(new aay(paramyx, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(aac paramaac)
/*     */   {
/*  45 */     super.a(paramaac);
/*  46 */     paramaac.a(this, 0, this.a.i());
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  51 */     super.b();
/*     */     
/*  53 */     for (int i = 0; i < this.e.size(); i++) {
/*  54 */       aac localaac = (aac)this.e.get(i);
/*  55 */       if (this.g != this.a.i()) {
/*  56 */         localaac.a(this, 0, this.a.i());
/*     */       }
/*     */     }
/*  59 */     this.g = this.a.i();
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/*  64 */     if (paramInt1 == 0) this.a.d(paramInt2);
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
/*  80 */       if (((paramInt >= 0) && (paramInt <= 2)) || (paramInt == 3)) {
/*  81 */         if (!a(localadd2, 4, 40, true)) {
/*  82 */           return null;
/*     */         }
/*  84 */         localaay.a(localadd2, localadd1);
/*  85 */       } else if ((!this.f.e()) && (this.f.a(localadd2))) {
/*  86 */         if (!a(localadd2, 3, 4, false)) {
/*  87 */           return null;
/*     */         }
/*  89 */       } else if (aab.b_(localadd1)) {
/*  90 */         if (!a(localadd2, 0, 3, false)) {
/*  91 */           return null;
/*     */         }
/*  93 */       } else if ((paramInt >= 4) && (paramInt < 31)) {
/*  94 */         if (!a(localadd2, 31, 40, false)) {
/*  95 */           return null;
/*     */         }
/*  97 */       } else if ((paramInt >= 31) && (paramInt < 40)) {
/*  98 */         if (!a(localadd2, 4, 31, false)) {
/*  99 */           return null;
/*     */         }
/*     */       }
/* 102 */       else if (!a(localadd2, 4, 40, false)) {
/* 103 */         return null;
/*     */       }
/*     */       
/* 106 */       if (localadd2.b == 0) {
/* 107 */         localaay.c(null);
/*     */       } else {
/* 109 */         localaay.f();
/*     */       }
/* 111 */       if (localadd2.b == localadd1.b) {
/* 112 */         return null;
/*     */       }
/* 114 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 117 */     return localadd1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */