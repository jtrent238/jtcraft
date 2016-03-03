/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ public class bhm extends bhr {
/*     */   public bix c;
/*     */   public bix d;
/*     */   public bix e;
/*     */   public bix f;
/*     */   public bix g;
/*     */   public bix h;
/*     */   public bix i;
/*     */   public bix j;
/*     */   public bix k;
/*     */   public int l;
/*     */   public int m;
/*     */   public boolean n;
/*     */   public boolean o;
/*     */   
/*  18 */   public bhm() { this(0.0F); }
/*     */   
/*     */   public bhm(float paramFloat)
/*     */   {
/*  22 */     this(paramFloat, 0.0F, 64, 32);
/*     */   }
/*     */   
/*     */   public bhm(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
/*  26 */     this.t = paramInt1;
/*  27 */     this.u = paramInt2;
/*     */     
/*  29 */     this.k = new bix(this, 0, 0);
/*  30 */     this.k.a(-5.0F, 0.0F, -1.0F, 10, 16, 1, paramFloat1);
/*     */     
/*  32 */     this.j = new bix(this, 24, 0);
/*  33 */     this.j.a(-3.0F, -6.0F, -1.0F, 6, 6, 1, paramFloat1);
/*     */     
/*  35 */     this.c = new bix(this, 0, 0);
/*  36 */     this.c.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1);
/*  37 */     this.c.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  39 */     this.d = new bix(this, 32, 0);
/*  40 */     this.d.a(-4.0F, -8.0F, -4.0F, 8, 8, 8, paramFloat1 + 0.5F);
/*  41 */     this.d.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  43 */     this.e = new bix(this, 16, 16);
/*  44 */     this.e.a(-4.0F, 0.0F, -2.0F, 8, 12, 4, paramFloat1);
/*  45 */     this.e.a(0.0F, 0.0F + paramFloat2, 0.0F);
/*     */     
/*  47 */     this.f = new bix(this, 40, 16);
/*  48 */     this.f.a(-3.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  49 */     this.f.a(-5.0F, 2.0F + paramFloat2, 0.0F);
/*     */     
/*  51 */     this.g = new bix(this, 40, 16);
/*  52 */     this.g.i = true;
/*  53 */     this.g.a(-1.0F, -2.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  54 */     this.g.a(5.0F, 2.0F + paramFloat2, 0.0F);
/*     */     
/*  56 */     this.h = new bix(this, 0, 16);
/*  57 */     this.h.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  58 */     this.h.a(-1.9F, 12.0F + paramFloat2, 0.0F);
/*     */     
/*  60 */     this.i = new bix(this, 0, 16);
/*  61 */     this.i.i = true;
/*  62 */     this.i.a(-2.0F, 0.0F, -2.0F, 4, 12, 4, paramFloat1);
/*  63 */     this.i.a(1.9F, 12.0F + paramFloat2, 0.0F);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  68 */     a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramsa);
/*     */     
/*  70 */     if (this.s) {
/*  71 */       float f1 = 2.0F;
/*  72 */       GL11.glPushMatrix();
/*  73 */       GL11.glScalef(1.5F / f1, 1.5F / f1, 1.5F / f1);
/*  74 */       GL11.glTranslatef(0.0F, 16.0F * paramFloat6, 0.0F);
/*  75 */       this.c.a(paramFloat6);
/*  76 */       GL11.glPopMatrix();
/*  77 */       GL11.glPushMatrix();
/*  78 */       GL11.glScalef(1.0F / f1, 1.0F / f1, 1.0F / f1);
/*  79 */       GL11.glTranslatef(0.0F, 24.0F * paramFloat6, 0.0F);
/*  80 */       this.e.a(paramFloat6);
/*  81 */       this.f.a(paramFloat6);
/*  82 */       this.g.a(paramFloat6);
/*  83 */       this.h.a(paramFloat6);
/*  84 */       this.i.a(paramFloat6);
/*  85 */       this.d.a(paramFloat6);
/*  86 */       GL11.glPopMatrix();
/*     */     } else {
/*  88 */       this.c.a(paramFloat6);
/*  89 */       this.e.a(paramFloat6);
/*  90 */       this.f.a(paramFloat6);
/*  91 */       this.g.a(paramFloat6);
/*  92 */       this.h.a(paramFloat6);
/*  93 */       this.i.a(paramFloat6);
/*  94 */       this.d.a(paramFloat6);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa)
/*     */   {
/* 100 */     this.c.g = (paramFloat4 / 57.295776F);
/* 101 */     this.c.f = (paramFloat5 / 57.295776F);
/* 102 */     this.d.g = this.c.g;
/* 103 */     this.d.f = this.c.f;
/*     */     
/* 105 */     this.f.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 2.0F * paramFloat2 * 0.5F);
/*     */     
/* 107 */     this.g.f = (qh.b(paramFloat1 * 0.6662F) * 2.0F * paramFloat2 * 0.5F);
/* 108 */     this.f.h = 0.0F;
/* 109 */     this.g.h = 0.0F;
/*     */     
/* 111 */     this.h.f = (qh.b(paramFloat1 * 0.6662F) * 1.4F * paramFloat2);
/* 112 */     this.i.f = (qh.b(paramFloat1 * 0.6662F + 3.1415927F) * 1.4F * paramFloat2);
/* 113 */     this.h.g = 0.0F;
/* 114 */     this.i.g = 0.0F;
/*     */     
/* 116 */     if (this.q) {
/* 117 */       this.f.f += -0.62831855F;
/* 118 */       this.g.f += -0.62831855F;
/* 119 */       this.h.f = -1.2566371F;
/* 120 */       this.i.f = -1.2566371F;
/* 121 */       this.h.g = 0.31415927F;
/* 122 */       this.i.g = -0.31415927F;
/*     */     }
/*     */     
/* 125 */     if (this.l != 0) {
/* 126 */       this.g.f = (this.g.f * 0.5F - 0.31415927F * this.l);
/*     */     }
/* 128 */     if (this.m != 0) {
/* 129 */       this.f.f = (this.f.f * 0.5F - 0.31415927F * this.m);
/*     */     }
/* 131 */     this.f.g = 0.0F;
/* 132 */     this.g.g = 0.0F;
/*     */     float f1;
/* 134 */     float f2; if (this.p > -9990.0F) {
/* 135 */       f1 = this.p;
/* 136 */       this.e.g = (qh.a(qh.c(f1) * 3.1415927F * 2.0F) * 0.2F);
/* 137 */       this.f.e = (qh.a(this.e.g) * 5.0F);
/* 138 */       this.f.c = (-qh.b(this.e.g) * 5.0F);
/* 139 */       this.g.e = (-qh.a(this.e.g) * 5.0F);
/* 140 */       this.g.c = (qh.b(this.e.g) * 5.0F);
/* 141 */       this.f.g += this.e.g;
/* 142 */       this.g.g += this.e.g;
/* 143 */       this.g.f += this.e.g;
/*     */       
/* 145 */       f1 = 1.0F - this.p;
/* 146 */       f1 *= f1;
/* 147 */       f1 *= f1;
/* 148 */       f1 = 1.0F - f1;
/* 149 */       f2 = qh.a(f1 * 3.1415927F);
/* 150 */       float f3 = qh.a(this.p * 3.1415927F) * -(this.c.f - 0.7F) * 0.75F; bix 
/* 151 */         tmp570_567 = this.f;tmp570_567.f = ((float)(tmp570_567.f - (f2 * 1.2D + f3)));
/* 152 */       this.f.g += this.e.g * 2.0F;
/* 153 */       this.f.h = (qh.a(this.p * 3.1415927F) * -0.4F);
/*     */     }
/*     */     
/* 156 */     if (this.n) {
/* 157 */       this.e.f = 0.5F;
/* 158 */       this.f.f += 0.4F;
/* 159 */       this.g.f += 0.4F;
/* 160 */       this.h.e = 4.0F;
/* 161 */       this.i.e = 4.0F;
/* 162 */       this.h.d = 9.0F;
/* 163 */       this.i.d = 9.0F;
/* 164 */       this.c.d = 1.0F;
/* 165 */       this.d.d = 1.0F;
/*     */     } else {
/* 167 */       this.e.f = 0.0F;
/* 168 */       this.h.e = 0.1F;
/* 169 */       this.i.e = 0.1F;
/* 170 */       this.h.d = 12.0F;
/* 171 */       this.i.d = 12.0F;
/* 172 */       this.c.d = 0.0F;
/* 173 */       this.d.d = 0.0F;
/*     */     }
/*     */     
/* 176 */     this.f.h += qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 177 */     this.g.h -= qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 178 */     this.f.f += qh.a(paramFloat3 * 0.067F) * 0.05F;
/* 179 */     this.g.f -= qh.a(paramFloat3 * 0.067F) * 0.05F;
/*     */     
/* 181 */     if (this.o) {
/* 182 */       f1 = 0.0F;
/* 183 */       f2 = 0.0F;
/*     */       
/* 185 */       this.f.h = 0.0F;
/* 186 */       this.g.h = 0.0F;
/* 187 */       this.f.g = (-(0.1F - f1 * 0.6F) + this.c.g);
/* 188 */       this.g.g = (0.1F - f1 * 0.6F + this.c.g + 0.4F);
/* 189 */       this.f.f = (-1.5707964F + this.c.f);
/* 190 */       this.g.f = (-1.5707964F + this.c.f);
/* 191 */       this.f.f -= f1 * 1.2F - f2 * 0.4F;
/* 192 */       this.g.f -= f1 * 1.2F - f2 * 0.4F;
/*     */       
/* 194 */       this.f.h += qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 195 */       this.g.h -= qh.b(paramFloat3 * 0.09F) * 0.05F + 0.05F;
/* 196 */       this.f.f += qh.a(paramFloat3 * 0.067F) * 0.05F;
/* 197 */       this.g.f -= qh.a(paramFloat3 * 0.067F) * 0.05F;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void b(float paramFloat)
/*     */   {
/* 208 */     this.j.g = this.c.g;
/* 209 */     this.j.f = this.c.f;
/* 210 */     this.j.c = 0.0F;
/* 211 */     this.j.d = 0.0F;
/* 212 */     this.j.a(paramFloat);
/*     */   }
/*     */   
/*     */   public void c(float paramFloat) {
/* 216 */     this.k.a(paramFloat);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */