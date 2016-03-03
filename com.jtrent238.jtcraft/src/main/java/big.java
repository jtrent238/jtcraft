/*     */ public class big extends bhr
/*     */ {
/*     */   public bix a;
/*     */   public bix b;
/*     */   public bix c;
/*     */   public bix d;
/*     */   public bix e;
/*     */   
/*     */   public big()
/*     */   {
/*  11 */     float f1 = 0.0F;
/*     */     
/*  13 */     int m = 15;
/*     */     
/*  15 */     this.a = new bix(this, 32, 4);
/*  16 */     this.a.a(-4.0F, -4.0F, -8.0F, 8, 8, 8, f1);
/*  17 */     this.a.a(0.0F, m, -3.0F);
/*     */     
/*  19 */     this.b = new bix(this, 0, 0);
/*  20 */     this.b.a(-3.0F, -3.0F, -3.0F, 6, 6, 6, f1);
/*  21 */     this.b.a(0.0F, m, 0.0F);
/*     */     
/*  23 */     this.c = new bix(this, 0, 12);
/*  24 */     this.c.a(-5.0F, -4.0F, -6.0F, 10, 8, 12, f1);
/*  25 */     this.c.a(0.0F, m, 9.0F);
/*     */     
/*  27 */     this.d = new bix(this, 18, 0);
/*  28 */     this.d.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  29 */     this.d.a(-4.0F, m, 2.0F);
/*     */     
/*  31 */     this.e = new bix(this, 18, 0);
/*  32 */     this.e.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  33 */     this.e.a(4.0F, m, 2.0F);
/*     */     
/*  35 */     this.f = new bix(this, 18, 0);
/*  36 */     this.f.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  37 */     this.f.a(-4.0F, m, 1.0F);
/*     */     
/*  39 */     this.g = new bix(this, 18, 0);
/*  40 */     this.g.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  41 */     this.g.a(4.0F, m, 1.0F);
/*     */     
/*  43 */     this.h = new bix(this, 18, 0);
/*  44 */     this.h.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  45 */     this.h.a(-4.0F, m, 0.0F);
/*     */     
/*  47 */     this.i = new bix(this, 18, 0);
/*  48 */     this.i.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  49 */     this.i.a(4.0F, m, 0.0F);
/*     */     
/*  51 */     this.j = new bix(this, 18, 0);
/*  52 */     this.j.a(-15.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  53 */     this.j.a(-4.0F, m, -1.0F);
/*     */     
/*  55 */     this.k = new bix(this, 18, 0);
/*  56 */     this.k.a(-1.0F, -1.0F, -1.0F, 16, 2, 2, f1);
/*  57 */     this.k.a(4.0F, m, -1.0F);
/*     */   }
/*     */   
/*     */   public bix f;
/*     */   
/*  62 */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) { a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*     */     
/*  64 */     this.a.a(paramFloat6);
/*  65 */     this.b.a(paramFloat6);
/*  66 */     this.c.a(paramFloat6);
/*  67 */     this.d.a(paramFloat6);
/*  68 */     this.e.a(paramFloat6);
/*  69 */     this.f.a(paramFloat6);
/*  70 */     this.g.a(paramFloat6);
/*  71 */     this.h.a(paramFloat6);
/*  72 */     this.i.a(paramFloat6);
/*  73 */     this.j.a(paramFloat6);
/*  74 */     this.k.a(paramFloat6); }
/*     */   
/*     */   public bix g;
/*     */   public bix h;
/*     */   
/*  79 */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa) { this.a.g = (paramFloat4 / 57.295776F);
/*  80 */     this.a.f = (paramFloat5 / 57.295776F);
/*     */     
/*  82 */     float f1 = 0.7853982F;
/*  83 */     this.d.h = (-f1);
/*  84 */     this.e.h = f1;
/*     */     
/*  86 */     this.f.h = (-f1 * 0.74F);
/*  87 */     this.g.h = (f1 * 0.74F);
/*     */     
/*  89 */     this.h.h = (-f1 * 0.74F);
/*  90 */     this.i.h = (f1 * 0.74F);
/*     */     
/*  92 */     this.j.h = (-f1);
/*  93 */     this.k.h = f1;
/*     */     
/*  95 */     float f2 = -0.0F;
/*  96 */     float f3 = 0.3926991F;
/*  97 */     this.d.g = (f3 * 2.0F + f2);
/*  98 */     this.e.g = (-f3 * 2.0F - f2);
/*  99 */     this.f.g = (f3 * 1.0F + f2);
/* 100 */     this.g.g = (-f3 * 1.0F - f2);
/* 101 */     this.h.g = (-f3 * 1.0F + f2);
/* 102 */     this.i.g = (f3 * 1.0F - f2);
/* 103 */     this.j.g = (-f3 * 2.0F + f2);
/* 104 */     this.k.g = (f3 * 2.0F - f2);
/*     */     
/* 106 */     float f4 = -(qh.b(paramFloat1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * paramFloat2;
/* 107 */     float f5 = -(qh.b(paramFloat1 * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * paramFloat2;
/* 108 */     float f6 = -(qh.b(paramFloat1 * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * paramFloat2;
/* 109 */     float f7 = -(qh.b(paramFloat1 * 0.6662F * 2.0F + 4.712389F) * 0.4F) * paramFloat2;
/*     */     
/* 111 */     float f8 = Math.abs(qh.a(paramFloat1 * 0.6662F + 0.0F) * 0.4F) * paramFloat2;
/* 112 */     float f9 = Math.abs(qh.a(paramFloat1 * 0.6662F + 3.1415927F) * 0.4F) * paramFloat2;
/* 113 */     float f10 = Math.abs(qh.a(paramFloat1 * 0.6662F + 1.5707964F) * 0.4F) * paramFloat2;
/* 114 */     float f11 = Math.abs(qh.a(paramFloat1 * 0.6662F + 4.712389F) * 0.4F) * paramFloat2;
/*     */     
/* 116 */     this.d.g += f4;
/* 117 */     this.e.g += -f4;
/* 118 */     this.f.g += f5;
/* 119 */     this.g.g += -f5;
/* 120 */     this.h.g += f6;
/* 121 */     this.i.g += -f6;
/* 122 */     this.j.g += f7;
/* 123 */     this.k.g += -f7;
/*     */     
/* 125 */     this.d.h += f8;
/* 126 */     this.e.h += -f8;
/* 127 */     this.f.h += f9;
/* 128 */     this.g.h += -f9;
/* 129 */     this.h.h += f10;
/* 130 */     this.i.h += -f10;
/* 131 */     this.j.h += f11;
/* 132 */     this.k.h += -f11;
/*     */   }
/*     */   
/*     */   public bix i;
/*     */   public bix j;
/*     */   public bix k;
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\big.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */