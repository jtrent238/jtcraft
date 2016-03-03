/*     */ import org.lwjgl.opengl.GL11;
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
/*     */ public abstract class bno
/*     */ {
/*  23 */   private static final bqx a = new bqx("textures/misc/shadow.png");
/*     */   
/*     */   protected bnn b;
/*  26 */   protected blm c = new blm();
/*     */   
/*     */   protected float d;
/*  29 */   protected float e = 1.0F;
/*     */   
/*     */   public abstract void a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
/*     */   
/*     */   protected abstract bqx a(sa paramsa);
/*     */   
/*  35 */   private boolean f = false;
/*     */   
/*     */   public boolean a() {
/*  38 */     return this.f; }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void b(sa paramsa)
/*     */   {
/*  47 */     a(a(paramsa));
/*     */   }
/*     */   
/*     */   protected void a(bqx parambqx) {
/*  51 */     this.b.e.a(parambqx);
/*     */   }
/*     */   
/*     */   private void a(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*  55 */     GL11.glDisable(2896);
/*     */     
/*  57 */     rf localrf1 = ajn.ab.c(0);
/*  58 */     rf localrf2 = ajn.ab.c(1);
/*     */     
/*  60 */     GL11.glPushMatrix();
/*  61 */     GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*     */     
/*  63 */     float f1 = paramsa.M * 1.4F;
/*  64 */     GL11.glScalef(f1, f1, f1);
/*  65 */     bmh localbmh = bmh.a;
/*     */     
/*  67 */     float f2 = 0.5F;
/*  68 */     float f3 = 0.0F;
/*     */     
/*  70 */     float f4 = paramsa.N / f1;
/*  71 */     float f5 = (float)(paramsa.t - paramsa.C.b);
/*     */     
/*  73 */     GL11.glRotatef(-this.b.j, 0.0F, 1.0F, 0.0F);
/*  74 */     GL11.glTranslatef(0.0F, 0.0F, -0.3F + (int)f4 * 0.02F);
/*  75 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  76 */     float f6 = 0.0F;
/*  77 */     int i = 0;
/*  78 */     localbmh.b();
/*  79 */     while (f4 > 0.0F) {
/*  80 */       rf localrf3 = i % 2 == 0 ? localrf1 : localrf2;
/*     */       
/*  82 */       a(bpz.b);
/*     */       
/*  84 */       float f7 = localrf3.c();
/*  85 */       float f8 = localrf3.e();
/*  86 */       float f9 = localrf3.d();
/*  87 */       float f10 = localrf3.f();
/*  88 */       if (i / 2 % 2 == 0) {
/*  89 */         float f11 = f9;
/*  90 */         f9 = f7;
/*  91 */         f7 = f11;
/*     */       }
/*  93 */       localbmh.a(f2 - f3, 0.0F - f5, f6, f9, f10);
/*  94 */       localbmh.a(-f2 - f3, 0.0F - f5, f6, f7, f10);
/*  95 */       localbmh.a(-f2 - f3, 1.4F - f5, f6, f7, f8);
/*  96 */       localbmh.a(f2 - f3, 1.4F - f5, f6, f9, f8);
/*  97 */       f4 -= 0.45F;
/*  98 */       f5 -= 0.45F;
/*  99 */       f2 *= 0.9F;
/* 100 */       f6 += 0.03F;
/* 101 */       i++;
/*     */     }
/* 103 */     localbmh.a();
/* 104 */     GL11.glPopMatrix();
/* 105 */     GL11.glEnable(2896);
/*     */   }
/*     */   
/*     */   private void c(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 109 */     GL11.glEnable(3042);
/* 110 */     GL11.glBlendFunc(770, 771);
/*     */     
/* 112 */     this.b.e.a(a);
/*     */     
/* 114 */     ahb localahb = d();
/*     */     
/* 116 */     GL11.glDepthMask(false);
/* 117 */     float f1 = this.d;
/* 118 */     if ((paramsa instanceof sw)) {
/* 119 */       sw localsw = (sw)paramsa;
/* 120 */       f1 *= localsw.bz();
/*     */       
/* 122 */       if (localsw.f()) {
/* 123 */         f1 *= 0.5F;
/*     */       }
/*     */     }
/*     */     
/* 127 */     double d1 = paramsa.S + (paramsa.s - paramsa.S) * paramFloat2;
/* 128 */     double d2 = paramsa.T + (paramsa.t - paramsa.T) * paramFloat2 + paramsa.Y();
/* 129 */     double d3 = paramsa.U + (paramsa.u - paramsa.U) * paramFloat2;
/*     */     
/* 131 */     int i = qh.c(d1 - f1);
/* 132 */     int j = qh.c(d1 + f1);
/* 133 */     int k = qh.c(d2 - f1);
/* 134 */     int m = qh.c(d2);
/* 135 */     int n = qh.c(d3 - f1);
/* 136 */     int i1 = qh.c(d3 + f1);
/*     */     
/* 138 */     double d4 = paramDouble1 - d1;
/* 139 */     double d5 = paramDouble2 - d2;
/* 140 */     double d6 = paramDouble3 - d3;
/*     */     
/* 142 */     bmh localbmh = bmh.a;
/* 143 */     localbmh.b();
/* 144 */     for (int i2 = i; i2 <= j; i2++) {
/* 145 */       for (int i3 = k; i3 <= m; i3++)
/* 146 */         for (int i4 = n; i4 <= i1; i4++) {
/* 147 */           aji localaji = localahb.a(i2, i3 - 1, i4);
/* 148 */           if ((localaji.o() != awt.a) && (localahb.k(i2, i3, i4) > 3))
/* 149 */             a(localaji, paramDouble1, paramDouble2 + paramsa.Y(), paramDouble3, i2, i3, i4, paramFloat1, f1, d4, d5 + paramsa.Y(), d6);
/*     */         }
/*     */     }
/* 152 */     localbmh.a();
/*     */     
/* 154 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 155 */     GL11.glDisable(3042);
/* 156 */     GL11.glDepthMask(true);
/*     */   }
/*     */   
/*     */   private ahb d() {
/* 160 */     return this.b.g;
/*     */   }
/*     */   
/*     */   private void a(aji paramaji, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 164 */     bmh localbmh = bmh.a;
/* 165 */     if (!paramaji.d()) { return;
/*     */     }
/* 167 */     double d1 = (paramFloat1 - (paramDouble2 - (paramInt2 + paramDouble5)) / 2.0D) * 0.5D * d().n(paramInt1, paramInt2, paramInt3);
/* 168 */     if (d1 < 0.0D) return;
/* 169 */     if (d1 > 1.0D) d1 = 1.0D;
/* 170 */     localbmh.a(1.0F, 1.0F, 1.0F, (float)d1);
/*     */     
/* 172 */     double d2 = paramInt1 + paramaji.x() + paramDouble4;
/* 173 */     double d3 = paramInt1 + paramaji.y() + paramDouble4;
/* 174 */     double d4 = paramInt2 + paramaji.z() + paramDouble5 + 0.015625D;
/* 175 */     double d5 = paramInt3 + paramaji.B() + paramDouble6;
/* 176 */     double d6 = paramInt3 + paramaji.C() + paramDouble6;
/*     */     
/* 178 */     float f1 = (float)((paramDouble1 - d2) / 2.0D / paramFloat2 + 0.5D);
/* 179 */     float f2 = (float)((paramDouble1 - d3) / 2.0D / paramFloat2 + 0.5D);
/* 180 */     float f3 = (float)((paramDouble3 - d5) / 2.0D / paramFloat2 + 0.5D);
/* 181 */     float f4 = (float)((paramDouble3 - d6) / 2.0D / paramFloat2 + 0.5D);
/*     */     
/* 183 */     localbmh.a(d2, d4, d5, f1, f3);
/* 184 */     localbmh.a(d2, d4, d6, f1, f4);
/* 185 */     localbmh.a(d3, d4, d6, f2, f4);
/* 186 */     localbmh.a(d3, d4, d5, f2, f3);
/*     */   }
/*     */   
/*     */   public static void a(azt paramazt, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 190 */     GL11.glDisable(3553);
/* 191 */     bmh localbmh = bmh.a;
/* 192 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 193 */     localbmh.b();
/* 194 */     localbmh.b(paramDouble1, paramDouble2, paramDouble3);
/* 195 */     localbmh.c(0.0F, 0.0F, -1.0F);
/* 196 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 197 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 198 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 199 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/*     */     
/* 201 */     localbmh.c(0.0F, 0.0F, 1.0F);
/* 202 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 203 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 204 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 205 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/*     */     
/* 207 */     localbmh.c(0.0F, -1.0F, 0.0F);
/* 208 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 209 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 210 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 211 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/*     */     
/* 213 */     localbmh.c(0.0F, 1.0F, 0.0F);
/* 214 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 215 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 216 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 217 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/*     */     
/* 219 */     localbmh.c(-1.0F, 0.0F, 0.0F);
/* 220 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 221 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 222 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 223 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/*     */     
/* 225 */     localbmh.c(1.0F, 0.0F, 0.0F);
/* 226 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 227 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 228 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 229 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 230 */     localbmh.b(0.0D, 0.0D, 0.0D);
/* 231 */     localbmh.a();
/* 232 */     GL11.glEnable(3553);
/*     */   }
/*     */   
/*     */   public static void a(azt paramazt) {
/* 236 */     bmh localbmh = bmh.a;
/* 237 */     localbmh.b();
/* 238 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 239 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 240 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 241 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 242 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 243 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 244 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 245 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 246 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 247 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 248 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 249 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 250 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 251 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 252 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 253 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 254 */     localbmh.a(paramazt.a, paramazt.b, paramazt.f);
/* 255 */     localbmh.a(paramazt.a, paramazt.e, paramazt.f);
/* 256 */     localbmh.a(paramazt.a, paramazt.e, paramazt.c);
/* 257 */     localbmh.a(paramazt.a, paramazt.b, paramazt.c);
/* 258 */     localbmh.a(paramazt.d, paramazt.b, paramazt.c);
/* 259 */     localbmh.a(paramazt.d, paramazt.e, paramazt.c);
/* 260 */     localbmh.a(paramazt.d, paramazt.e, paramazt.f);
/* 261 */     localbmh.a(paramazt.d, paramazt.b, paramazt.f);
/* 262 */     localbmh.a();
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
/*     */   public void a(bnn parambnn)
/*     */   {
/* 296 */     this.b = parambnn;
/*     */   }
/*     */   
/*     */   public void b(sa paramsa, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 300 */     if ((this.b.l.i) && (this.d > 0.0F) && (!paramsa.ap())) {
/* 301 */       double d1 = this.b.a(paramsa.s, paramsa.t, paramsa.u);
/* 302 */       float f1 = (float)((1.0D - d1 / 256.0D) * this.e);
/* 303 */       if (f1 > 0.0F) {
/* 304 */         c(paramsa, paramDouble1, paramDouble2, paramDouble3, f1, paramFloat2);
/*     */       }
/*     */     }
/* 307 */     if (paramsa.aA()) a(paramsa, paramDouble1, paramDouble2, paramDouble3, paramFloat2);
/*     */   }
/*     */   
/*     */   public bbu c() {
/* 311 */     return this.b.a();
/*     */   }
/*     */   
/*     */   public void a(rg paramrg) {}
/*     */   
/*     */   protected void a(sa paramsa, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, int paramInt)
/*     */   {
/* 318 */     double d1 = paramsa.f(this.b.h);
/*     */     
/* 320 */     if (d1 > paramInt * paramInt) {
/* 321 */       return;
/*     */     }
/*     */     
/* 324 */     bbu localbbu = c();
/*     */     
/* 326 */     float f1 = 1.6F;
/* 327 */     float f2 = 0.016666668F * f1;
/*     */     
/* 329 */     GL11.glPushMatrix();
/* 330 */     GL11.glTranslatef((float)paramDouble1 + 0.0F, (float)paramDouble2 + paramsa.N + 0.5F, (float)paramDouble3);
/* 331 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/*     */     
/* 333 */     GL11.glRotatef(-this.b.j, 0.0F, 1.0F, 0.0F);
/* 334 */     GL11.glRotatef(this.b.k, 1.0F, 0.0F, 0.0F);
/*     */     
/* 336 */     GL11.glScalef(-f2, -f2, f2);
/* 337 */     GL11.glDisable(2896);
/*     */     
/* 339 */     GL11.glDepthMask(false);
/* 340 */     GL11.glDisable(2929);
/* 341 */     GL11.glEnable(3042);
/* 342 */     buu.c(770, 771, 1, 0);
/* 343 */     bmh localbmh = bmh.a;
/*     */     
/* 345 */     int i = 0;
/* 346 */     if (paramString.equals("deadmau5")) { i = -10;
/*     */     }
/* 348 */     GL11.glDisable(3553);
/* 349 */     localbmh.b();
/* 350 */     int j = localbbu.a(paramString) / 2;
/* 351 */     localbmh.a(0.0F, 0.0F, 0.0F, 0.25F);
/* 352 */     localbmh.a(-j - 1, -1 + i, 0.0D);
/* 353 */     localbmh.a(-j - 1, 8 + i, 0.0D);
/* 354 */     localbmh.a(j + 1, 8 + i, 0.0D);
/* 355 */     localbmh.a(j + 1, -1 + i, 0.0D);
/* 356 */     localbmh.a();
/* 357 */     GL11.glEnable(3553);
/* 358 */     localbbu.b(paramString, -localbbu.a(paramString) / 2, i, 553648127);
/* 359 */     GL11.glEnable(2929);
/*     */     
/* 361 */     GL11.glDepthMask(true);
/* 362 */     localbbu.b(paramString, -localbbu.a(paramString) / 2, i, -1);
/* 363 */     GL11.glEnable(2896);
/* 364 */     GL11.glDisable(3042);
/* 365 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 366 */     GL11.glPopMatrix();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bno.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */