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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aap
/*     */   extends zs
/*     */ {
/*  22 */   public aae a = new aae(this, 2, 2);
/*  23 */   public rb f = new aaw();
/*     */   public boolean g;
/*     */   private final yz h;
/*     */   
/*     */   public aap(yx paramyx, boolean paramBoolean, yz paramyz) {
/*  28 */     this.g = paramBoolean;
/*  29 */     this.h = paramyz;
/*  30 */     a(new aax(paramyx.d, this.a, this.f, 0, 144, 36));
/*     */     int j;
/*  32 */     for (int i = 0; i < 2; i++) {
/*  33 */       for (j = 0; j < 2; j++) {
/*  34 */         a(new aay(this.a, j + i * 2, 88 + j * 18, 26 + i * 18));
/*     */       }
/*     */     }
/*     */     
/*  38 */     for (i = 0; i < 4; i++) {
/*  39 */       j = i;
/*  40 */       a(new aaq(this, paramyx, paramyx.a() - 1 - i, 8, 8 + i * 18, j));
/*     */     }
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
/*  66 */     for (i = 0; i < 3; i++) {
/*  67 */       for (j = 0; j < 9; j++) {
/*  68 */         a(new aay(paramyx, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     }
/*  71 */     for (i = 0; i < 9; i++) {
/*  72 */       a(new aay(paramyx, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/*  75 */     a(this.a);
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/*  80 */     this.f.a(0, afe.a().a(this.a, this.h.o));
/*     */   }
/*     */   
/*     */   public void b(yz paramyz)
/*     */   {
/*  85 */     super.b(paramyz);
/*  86 */     for (int i = 0; i < 4; i++) {
/*  87 */       add localadd = this.a.a_(i);
/*  88 */       if (localadd != null) {
/*  89 */         paramyz.a(localadd, false);
/*     */       }
/*     */     }
/*  92 */     this.f.a(0, null);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public add b(yz paramyz, int paramInt)
/*     */   {
/* 102 */     add localadd1 = null;
/* 103 */     aay localaay = (aay)this.c.get(paramInt);
/* 104 */     if ((localaay != null) && (localaay.e())) {
/* 105 */       add localadd2 = localaay.d();
/* 106 */       localadd1 = localadd2.m();
/*     */       
/* 108 */       if (paramInt == 0) {
/* 109 */         if (!a(localadd2, 9, 45, true)) {
/* 110 */           return null;
/*     */         }
/* 112 */         localaay.a(localadd2, localadd1);
/* 113 */       } else if ((paramInt >= 1) && (paramInt < 5)) {
/* 114 */         if (!a(localadd2, 9, 45, false)) {
/* 115 */           return null;
/*     */         }
/* 117 */       } else if ((paramInt >= 5) && (paramInt < 9)) {
/* 118 */         if (!a(localadd2, 9, 45, false)) {
/* 119 */           return null;
/*     */         }
/* 121 */       } else if (((localadd1.b() instanceof abb)) && (!((aay)this.c.get(5 + ((abb)localadd1.b()).b)).e())) {
/* 122 */         int i = 5 + ((abb)localadd1.b()).b;
/* 123 */         if (!a(localadd2, i, i + 1, false)) {
/* 124 */           return null;
/*     */         }
/* 126 */       } else if ((paramInt >= 9) && (paramInt < 36)) {
/* 127 */         if (!a(localadd2, 36, 45, false)) {
/* 128 */           return null;
/*     */         }
/* 130 */       } else if ((paramInt >= 36) && (paramInt < 45)) {
/* 131 */         if (!a(localadd2, 9, 36, false)) {
/* 132 */           return null;
/*     */         }
/*     */       }
/* 135 */       else if (!a(localadd2, 9, 45, false)) {
/* 136 */         return null;
/*     */       }
/*     */       
/* 139 */       if (localadd2.b == 0) {
/* 140 */         localaay.c(null);
/*     */       } else {
/* 142 */         localaay.f();
/*     */       }
/* 144 */       if (localadd2.b == localadd1.b)
/*     */       {
/* 146 */         return null;
/*     */       }
/* 148 */       localaay.a(paramyz, localadd2);
/*     */     }
/*     */     
/* 151 */     return localadd1;
/*     */   }
/*     */   
/*     */   public boolean a(add paramadd, aay paramaay)
/*     */   {
/* 156 */     return (paramaay.f != this.f) && (super.a(paramadd, paramaay));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */