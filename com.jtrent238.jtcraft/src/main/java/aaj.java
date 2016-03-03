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
/*     */ public class aaj
/*     */   extends zs
/*     */ {
/*     */   private apg a;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   
/*     */   public aaj(yx paramyx, apg paramapg)
/*     */   {
/*  23 */     this.a = paramapg;
/*     */     
/*  25 */     a(new aay(paramapg, 0, 56, 17));
/*  26 */     a(new aay(paramapg, 1, 56, 53));
/*  27 */     a(new aak(paramyx.d, paramapg, 2, 116, 35));
/*     */     
/*  29 */     for (int i = 0; i < 3; i++) {
/*  30 */       for (int j = 0; j < 9; j++) {
/*  31 */         a(new aay(paramyx, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     }
/*  34 */     for (i = 0; i < 9; i++) {
/*  35 */       a(new aay(paramyx, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(aac paramaac)
/*     */   {
/*  45 */     super.a(paramaac);
/*  46 */     paramaac.a(this, 0, this.a.j);
/*  47 */     paramaac.a(this, 1, this.a.a);
/*  48 */     paramaac.a(this, 2, this.a.i);
/*     */   }
/*     */   
/*     */   public void b()
/*     */   {
/*  53 */     super.b();
/*     */     
/*  55 */     for (int i = 0; i < this.e.size(); i++) {
/*  56 */       aac localaac = (aac)this.e.get(i);
/*  57 */       if (this.f != this.a.j) {
/*  58 */         localaac.a(this, 0, this.a.j);
/*     */       }
/*  60 */       if (this.g != this.a.a) {
/*  61 */         localaac.a(this, 1, this.a.a);
/*     */       }
/*  63 */       if (this.h != this.a.i) {
/*  64 */         localaac.a(this, 2, this.a.i);
/*     */       }
/*     */     }
/*     */     
/*  68 */     this.f = this.a.j;
/*  69 */     this.g = this.a.a;
/*  70 */     this.h = this.a.i;
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2)
/*     */   {
/*  75 */     if (paramInt1 == 0) this.a.j = paramInt2;
/*  76 */     if (paramInt1 == 1) this.a.a = paramInt2;
/*  77 */     if (paramInt1 == 2) this.a.i = paramInt2;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  82 */     return this.a.a(paramyz);
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/*  87 */     add localadd1 = null;
/*  88 */     aay localaay = (aay)this.c.get(paramInt);
/*  89 */     if ((localaay != null) && (localaay.e())) {
/*  90 */       add localadd2 = localaay.d();
/*  91 */       localadd1 = localadd2.m();
/*     */       
/*  93 */       if (paramInt == 2) {
/*  94 */         if (!a(localadd2, 3, 39, true)) {
/*  95 */           return null;
/*     */         }
/*  97 */         localaay.a(localadd2, localadd1);
/*  98 */       } else if ((paramInt == 1) || (paramInt == 0)) {
/*  99 */         if (!a(localadd2, 3, 39, false)) {
/* 100 */           return null;
/*     */         }
/* 102 */       } else if (afa.a().a(localadd2) != null) {
/* 103 */         if (!a(localadd2, 0, 1, false)) {
/* 104 */           return null;
/*     */         }
/* 106 */       } else if (apg.b(localadd2)) {
/* 107 */         if (!a(localadd2, 1, 2, false)) {
/* 108 */           return null;
/*     */         }
/* 110 */       } else if ((paramInt >= 3) && (paramInt < 30)) {
/* 111 */         if (!a(localadd2, 30, 39, false)) {
/* 112 */           return null;
/*     */         }
/* 114 */       } else if ((paramInt >= 30) && (paramInt < 39) && 
/* 115 */         (!a(localadd2, 3, 30, false))) {
/* 116 */         return null;
/*     */       }
/*     */       
/* 119 */       if (localadd2.b == 0) {
/* 120 */         localaay.c(null);
/*     */       } else {
/* 122 */         localaay.f();
/*     */       }
/* 124 */       if (localadd2.b == localadd1.b) {
/* 125 */         return null;
/*     */       }
/* 127 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 130 */     return localadd1;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */