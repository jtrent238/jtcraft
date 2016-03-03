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
/*     */ public class bhs
/*     */   extends bhr
/*     */ {
/*     */   private bix a;
/*     */   private bix b;
/*     */   private bix c;
/*     */   private bix d;
/*     */   private bix e;
/*     */   private bix f;
/*     */   private bix g;
/*     */   private bix h;
/*     */   private bix i;
/*     */   private bix j;
/*     */   private bix k;
/*     */   private bix l;
/*     */   private bix m;
/*     */   private bix n;
/*     */   private bix o;
/*     */   private bix v;
/*     */   private bix w;
/*     */   private bix x;
/*     */   private bix y;
/*     */   private bix z;
/*     */   private bix A;
/*     */   private bix B;
/*     */   private bix C;
/*     */   private bix D;
/*     */   private bix E;
/*     */   private bix F;
/*     */   private bix G;
/*     */   private bix H;
/*     */   private bix I;
/*     */   private bix J;
/*     */   private bix K;
/*     */   private bix L;
/*     */   private bix M;
/*     */   private bix N;
/*     */   private bix O;
/*     */   private bix P;
/*     */   private bix Q;
/*     */   private bix R;
/*     */   private bix S;
/*     */   
/*     */   public bhs()
/*     */   {
/*  63 */     this.t = 128;
/*  64 */     this.u = 128;
/*     */     
/*     */ 
/*  67 */     this.k = new bix(this, 0, 34);
/*  68 */     this.k.a(-5.0F, -8.0F, -19.0F, 10, 10, 24);
/*  69 */     this.k.a(0.0F, 11.0F, 9.0F);
/*     */     
/*  71 */     this.l = new bix(this, 44, 0);
/*  72 */     this.l.a(-1.0F, -1.0F, 0.0F, 2, 2, 3);
/*  73 */     this.l.a(0.0F, 3.0F, 14.0F);
/*  74 */     a(this.l, -1.134464F, 0.0F, 0.0F);
/*     */     
/*  76 */     this.m = new bix(this, 38, 7);
/*  77 */     this.m.a(-1.5F, -2.0F, 3.0F, 3, 4, 7);
/*  78 */     this.m.a(0.0F, 3.0F, 14.0F);
/*  79 */     a(this.m, -1.134464F, 0.0F, 0.0F);
/*     */     
/*  81 */     this.n = new bix(this, 24, 3);
/*  82 */     this.n.a(-1.5F, -4.5F, 9.0F, 3, 4, 7);
/*  83 */     this.n.a(0.0F, 3.0F, 14.0F);
/*  84 */     a(this.n, -1.40215F, 0.0F, 0.0F);
/*     */     
/*  86 */     this.o = new bix(this, 78, 29);
/*  87 */     this.o.a(-2.5F, -2.0F, -2.5F, 4, 9, 5);
/*  88 */     this.o.a(4.0F, 9.0F, 11.0F);
/*     */     
/*  90 */     this.v = new bix(this, 78, 43);
/*  91 */     this.v.a(-2.0F, 0.0F, -1.5F, 3, 5, 3);
/*  92 */     this.v.a(4.0F, 16.0F, 11.0F);
/*     */     
/*  94 */     this.w = new bix(this, 78, 51);
/*  95 */     this.w.a(-2.5F, 5.1F, -2.0F, 4, 3, 4);
/*  96 */     this.w.a(4.0F, 16.0F, 11.0F);
/*     */     
/*  98 */     this.x = new bix(this, 96, 29);
/*  99 */     this.x.a(-1.5F, -2.0F, -2.5F, 4, 9, 5);
/* 100 */     this.x.a(-4.0F, 9.0F, 11.0F);
/*     */     
/* 102 */     this.y = new bix(this, 96, 43);
/* 103 */     this.y.a(-1.0F, 0.0F, -1.5F, 3, 5, 3);
/* 104 */     this.y.a(-4.0F, 16.0F, 11.0F);
/*     */     
/* 106 */     this.z = new bix(this, 96, 51);
/* 107 */     this.z.a(-1.5F, 5.1F, -2.0F, 4, 3, 4);
/* 108 */     this.z.a(-4.0F, 16.0F, 11.0F);
/*     */     
/* 110 */     this.A = new bix(this, 44, 29);
/* 111 */     this.A.a(-1.9F, -1.0F, -2.1F, 3, 8, 4);
/* 112 */     this.A.a(4.0F, 9.0F, -8.0F);
/*     */     
/* 114 */     this.B = new bix(this, 44, 41);
/* 115 */     this.B.a(-1.9F, 0.0F, -1.6F, 3, 5, 3);
/* 116 */     this.B.a(4.0F, 16.0F, -8.0F);
/*     */     
/* 118 */     this.C = new bix(this, 44, 51);
/* 119 */     this.C.a(-2.4F, 5.1F, -2.1F, 4, 3, 4);
/* 120 */     this.C.a(4.0F, 16.0F, -8.0F);
/*     */     
/* 122 */     this.D = new bix(this, 60, 29);
/* 123 */     this.D.a(-1.1F, -1.0F, -2.1F, 3, 8, 4);
/* 124 */     this.D.a(-4.0F, 9.0F, -8.0F);
/*     */     
/* 126 */     this.E = new bix(this, 60, 41);
/* 127 */     this.E.a(-1.1F, 0.0F, -1.6F, 3, 5, 3);
/* 128 */     this.E.a(-4.0F, 16.0F, -8.0F);
/*     */     
/* 130 */     this.F = new bix(this, 60, 51);
/* 131 */     this.F.a(-1.6F, 5.1F, -2.1F, 4, 3, 4);
/* 132 */     this.F.a(-4.0F, 16.0F, -8.0F);
/*     */     
/* 134 */     this.a = new bix(this, 0, 0);
/* 135 */     this.a.a(-2.5F, -10.0F, -1.5F, 5, 5, 7);
/* 136 */     this.a.a(0.0F, 4.0F, -10.0F);
/* 137 */     a(this.a, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 139 */     this.b = new bix(this, 24, 18);
/* 140 */     this.b.a(-2.0F, -10.0F, -7.0F, 4, 3, 6);
/* 141 */     this.b.a(0.0F, 3.95F, -10.0F);
/* 142 */     a(this.b, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 144 */     this.c = new bix(this, 24, 27);
/* 145 */     this.c.a(-2.0F, -7.0F, -6.5F, 4, 2, 5);
/* 146 */     this.c.a(0.0F, 4.0F, -10.0F);
/* 147 */     a(this.c, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 149 */     this.a.a(this.b);
/* 150 */     this.a.a(this.c);
/*     */     
/* 152 */     this.d = new bix(this, 0, 0);
/* 153 */     this.d.a(0.45F, -12.0F, 4.0F, 2, 3, 1);
/* 154 */     this.d.a(0.0F, 4.0F, -10.0F);
/* 155 */     a(this.d, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 157 */     this.e = new bix(this, 0, 0);
/* 158 */     this.e.a(-2.45F, -12.0F, 4.0F, 2, 3, 1);
/* 159 */     this.e.a(0.0F, 4.0F, -10.0F);
/* 160 */     a(this.e, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 162 */     this.f = new bix(this, 0, 12);
/* 163 */     this.f.a(-2.0F, -16.0F, 4.0F, 2, 7, 1);
/* 164 */     this.f.a(0.0F, 4.0F, -10.0F);
/* 165 */     a(this.f, 0.5235988F, 0.0F, 0.2617994F);
/*     */     
/* 167 */     this.g = new bix(this, 0, 12);
/* 168 */     this.g.a(0.0F, -16.0F, 4.0F, 2, 7, 1);
/* 169 */     this.g.a(0.0F, 4.0F, -10.0F);
/* 170 */     a(this.g, 0.5235988F, 0.0F, -0.2617994F);
/*     */     
/* 172 */     this.h = new bix(this, 0, 12);
/* 173 */     this.h.a(-2.05F, -9.8F, -2.0F, 4, 14, 8);
/* 174 */     this.h.a(0.0F, 4.0F, -10.0F);
/* 175 */     a(this.h, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 177 */     this.G = new bix(this, 0, 34);
/* 178 */     this.G.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
/* 179 */     this.G.a(-7.5F, 3.0F, 10.0F);
/* 180 */     a(this.G, 0.0F, 1.570796F, 0.0F);
/*     */     
/* 182 */     this.H = new bix(this, 0, 47);
/* 183 */     this.H.a(-3.0F, 0.0F, 0.0F, 8, 8, 3);
/* 184 */     this.H.a(4.5F, 3.0F, 10.0F);
/* 185 */     a(this.H, 0.0F, 1.570796F, 0.0F);
/*     */     
/* 187 */     this.I = new bix(this, 80, 0);
/* 188 */     this.I.a(-5.0F, 0.0F, -3.0F, 10, 1, 8);
/* 189 */     this.I.a(0.0F, 2.0F, 2.0F);
/*     */     
/* 191 */     this.J = new bix(this, 106, 9);
/* 192 */     this.J.a(-1.5F, -1.0F, -3.0F, 3, 1, 2);
/* 193 */     this.J.a(0.0F, 2.0F, 2.0F);
/*     */     
/* 195 */     this.K = new bix(this, 80, 9);
/* 196 */     this.K.a(-4.0F, -1.0F, 3.0F, 8, 1, 2);
/* 197 */     this.K.a(0.0F, 2.0F, 2.0F);
/*     */     
/* 199 */     this.M = new bix(this, 74, 0);
/* 200 */     this.M.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
/* 201 */     this.M.a(5.0F, 3.0F, 2.0F);
/*     */     
/* 203 */     this.L = new bix(this, 70, 0);
/* 204 */     this.L.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
/* 205 */     this.L.a(5.0F, 3.0F, 2.0F);
/*     */     
/* 207 */     this.O = new bix(this, 74, 4);
/* 208 */     this.O.a(-0.5F, 6.0F, -1.0F, 1, 2, 2);
/* 209 */     this.O.a(-5.0F, 3.0F, 2.0F);
/*     */     
/* 211 */     this.N = new bix(this, 80, 0);
/* 212 */     this.N.a(-0.5F, 0.0F, -0.5F, 1, 6, 1);
/* 213 */     this.N.a(-5.0F, 3.0F, 2.0F);
/*     */     
/* 215 */     this.P = new bix(this, 74, 13);
/* 216 */     this.P.a(1.5F, -8.0F, -4.0F, 1, 2, 2);
/* 217 */     this.P.a(0.0F, 4.0F, -10.0F);
/* 218 */     a(this.P, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 220 */     this.Q = new bix(this, 74, 13);
/* 221 */     this.Q.a(-2.5F, -8.0F, -4.0F, 1, 2, 2);
/* 222 */     this.Q.a(0.0F, 4.0F, -10.0F);
/* 223 */     a(this.Q, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 225 */     this.R = new bix(this, 44, 10);
/* 226 */     this.R.a(2.6F, -6.0F, -6.0F, 0, 3, 16);
/* 227 */     this.R.a(0.0F, 4.0F, -10.0F);
/*     */     
/* 229 */     this.S = new bix(this, 44, 5);
/* 230 */     this.S.a(-2.6F, -6.0F, -6.0F, 0, 3, 16);
/* 231 */     this.S.a(0.0F, 4.0F, -10.0F);
/*     */     
/* 233 */     this.j = new bix(this, 58, 0);
/* 234 */     this.j.a(-1.0F, -11.5F, 5.0F, 2, 16, 4);
/* 235 */     this.j.a(0.0F, 4.0F, -10.0F);
/* 236 */     a(this.j, 0.5235988F, 0.0F, 0.0F);
/*     */     
/* 238 */     this.i = new bix(this, 80, 12);
/* 239 */     this.i.a(-2.5F, -10.1F, -7.0F, 5, 5, 12, 0.2F);
/* 240 */     this.i.a(0.0F, 4.0F, -10.0F);
/* 241 */     a(this.i, 0.5235988F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/* 246 */     wi localwi = (wi)paramsa;
/*     */     
/* 248 */     int i1 = localwi.bZ();
/* 249 */     float f1 = localwi.p(0.0F);
/* 250 */     boolean bool = localwi.cb();
/* 251 */     int i2 = (bool) && (localwi.cu()) ? 1 : 0;
/* 252 */     int i3 = (bool) && (localwi.ck()) ? 1 : 0;
/* 253 */     int i4 = (i1 == 1) || (i1 == 2) ? 1 : 0;
/* 254 */     float f2 = localwi.ci();
/*     */     
/* 256 */     int i5 = localwi.l != null ? 1 : 0;
/*     */     
/* 258 */     if (i2 != 0) {
/* 259 */       this.i.a(paramFloat6);
/* 260 */       this.I.a(paramFloat6);
/* 261 */       this.J.a(paramFloat6);
/* 262 */       this.K.a(paramFloat6);
/* 263 */       this.L.a(paramFloat6);
/* 264 */       this.M.a(paramFloat6);
/* 265 */       this.N.a(paramFloat6);
/* 266 */       this.O.a(paramFloat6);
/* 267 */       this.P.a(paramFloat6);
/* 268 */       this.Q.a(paramFloat6);
/* 269 */       if (i5 != 0) {
/* 270 */         this.R.a(paramFloat6);
/* 271 */         this.S.a(paramFloat6);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 276 */     if (!bool) {
/* 277 */       GL11.glPushMatrix();
/* 278 */       GL11.glScalef(f2, 0.5F + f2 * 0.5F, f2);
/* 279 */       GL11.glTranslatef(0.0F, 0.95F * (1.0F - f2), 0.0F);
/*     */     }
/* 281 */     this.o.a(paramFloat6);
/* 282 */     this.v.a(paramFloat6);
/* 283 */     this.w.a(paramFloat6);
/*     */     
/* 285 */     this.x.a(paramFloat6);
/* 286 */     this.y.a(paramFloat6);
/* 287 */     this.z.a(paramFloat6);
/*     */     
/* 289 */     this.A.a(paramFloat6);
/* 290 */     this.B.a(paramFloat6);
/* 291 */     this.C.a(paramFloat6);
/*     */     
/* 293 */     this.D.a(paramFloat6);
/* 294 */     this.E.a(paramFloat6);
/* 295 */     this.F.a(paramFloat6);
/* 296 */     if (!bool) {
/* 297 */       GL11.glPopMatrix();
/*     */       
/* 299 */       GL11.glPushMatrix();
/* 300 */       GL11.glScalef(f2, f2, f2);
/* 301 */       GL11.glTranslatef(0.0F, 1.35F * (1.0F - f2), 0.0F);
/*     */     }
/*     */     
/* 304 */     this.k.a(paramFloat6);
/* 305 */     this.l.a(paramFloat6);
/* 306 */     this.m.a(paramFloat6);
/* 307 */     this.n.a(paramFloat6);
/* 308 */     this.h.a(paramFloat6);
/* 309 */     this.j.a(paramFloat6);
/* 310 */     if (!bool) {
/* 311 */       GL11.glPopMatrix();
/*     */       
/* 313 */       GL11.glPushMatrix();
/* 314 */       float f3 = 0.5F + f2 * f2 * 0.5F;
/* 315 */       GL11.glScalef(f3, f3, f3);
/* 316 */       if (f1 <= 0.0F) {
/* 317 */         GL11.glTranslatef(0.0F, 1.35F * (1.0F - f2), 0.0F);
/*     */       } else {
/* 319 */         GL11.glTranslatef(0.0F, 0.9F * (1.0F - f2) * f1 + 1.35F * (1.0F - f2) * (1.0F - f1), 0.15F * (1.0F - f2) * f1);
/*     */       }
/*     */     }
/*     */     
/* 323 */     if (i4 != 0) {
/* 324 */       this.f.a(paramFloat6);
/* 325 */       this.g.a(paramFloat6);
/*     */     } else {
/* 327 */       this.d.a(paramFloat6);
/* 328 */       this.e.a(paramFloat6);
/*     */     }
/* 330 */     this.a.a(paramFloat6);
/* 331 */     if (!bool) {
/* 332 */       GL11.glPopMatrix();
/*     */     }
/* 334 */     if (i3 != 0) {
/* 335 */       this.G.a(paramFloat6);
/* 336 */       this.H.a(paramFloat6);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(bix parambix, float paramFloat1, float paramFloat2, float paramFloat3) {
/* 341 */     parambix.f = paramFloat1;
/* 342 */     parambix.g = paramFloat2;
/* 343 */     parambix.h = paramFloat3;
/*     */   }
/*     */   
/*     */   private float a(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 347 */     float f1 = paramFloat2 - paramFloat1;
/* 348 */     while (f1 < -180.0F)
/* 349 */       f1 += 360.0F;
/* 350 */     while (f1 >= 180.0F)
/* 351 */       f1 -= 360.0F;
/* 352 */     return paramFloat1 + paramFloat3 * f1;
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3)
/*     */   {
/* 357 */     super.a(paramsv, paramFloat1, paramFloat2, paramFloat3);
/*     */     
/* 359 */     float f1 = a(paramsv.aN, paramsv.aM, paramFloat3);
/* 360 */     float f2 = a(paramsv.aP, paramsv.aO, paramFloat3);
/* 361 */     float f3 = paramsv.B + (paramsv.z - paramsv.B) * paramFloat3;
/* 362 */     float f4 = f2 - f1;
/*     */     
/*     */ 
/* 365 */     float f5 = f3 / 57.29578F;
/* 366 */     if (f4 > 20.0F) {
/* 367 */       f4 = 20.0F;
/*     */     }
/* 369 */     if (f4 < -20.0F) {
/* 370 */       f4 = -20.0F;
/*     */     }
/*     */     
/* 373 */     if (paramFloat2 > 0.2F) {
/* 374 */       f5 += qh.b(paramFloat1 * 0.4F) * 0.15F * paramFloat2;
/*     */     }
/*     */     
/* 377 */     wi localwi = (wi)paramsv;
/* 378 */     float f6 = localwi.p(paramFloat3);
/* 379 */     float f7 = localwi.q(paramFloat3);
/* 380 */     float f8 = 1.0F - f7;
/* 381 */     float f9 = localwi.r(paramFloat3);
/* 382 */     int i1 = localwi.bp != 0 ? 1 : 0;
/* 383 */     boolean bool = localwi.cu();
/* 384 */     int i2 = localwi.l != null ? 1 : 0;
/* 385 */     float f10 = paramsv.aa + paramFloat3;
/*     */     
/* 387 */     float f11 = qh.b(paramFloat1 * 0.6662F + 3.141593F);
/* 388 */     float f12 = f11 * 0.8F * paramFloat2;
/*     */     
/*     */ 
/* 391 */     this.a.d = 4.0F;
/* 392 */     this.a.e = -10.0F;
/* 393 */     this.l.d = 3.0F;
/* 394 */     this.m.e = 14.0F;
/* 395 */     this.H.d = 3.0F;
/* 396 */     this.H.e = 10.0F;
/* 397 */     this.k.f = 0.0F;
/*     */     
/*     */ 
/* 400 */     this.a.f = (0.5235988F + f5);
/* 401 */     this.a.g = (f4 / 57.29578F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 406 */     this.a.f = (f7 * (0.2617994F + f5) + f6 * 2.18166F + (1.0F - Math.max(f7, f6)) * this.a.f);
/* 407 */     this.a.g = (f7 * (f4 / 57.29578F) + (1.0F - Math.max(f7, f6)) * this.a.g);
/*     */     
/* 409 */     this.a.d = (f7 * -6.0F + f6 * 11.0F + (1.0F - Math.max(f7, f6)) * this.a.d);
/* 410 */     this.a.e = (f7 * -1.0F + f6 * -10.0F + (1.0F - Math.max(f7, f6)) * this.a.e);
/*     */     
/* 412 */     this.l.d = (f7 * 9.0F + f8 * this.l.d);
/* 413 */     this.m.e = (f7 * 18.0F + f8 * this.m.e);
/* 414 */     this.H.d = (f7 * 5.5F + f8 * this.H.d);
/* 415 */     this.H.e = (f7 * 15.0F + f8 * this.H.e);
/* 416 */     this.k.f = (f7 * -0.7853981F + f8 * this.k.f);
/*     */     
/*     */ 
/* 419 */     this.d.d = this.a.d;
/* 420 */     this.e.d = this.a.d;
/* 421 */     this.f.d = this.a.d;
/* 422 */     this.g.d = this.a.d;
/* 423 */     this.h.d = this.a.d;
/* 424 */     this.b.d = 0.02F;
/* 425 */     this.c.d = 0.0F;
/* 426 */     this.j.d = this.a.d;
/*     */     
/* 428 */     this.d.e = this.a.e;
/* 429 */     this.e.e = this.a.e;
/* 430 */     this.f.e = this.a.e;
/* 431 */     this.g.e = this.a.e;
/* 432 */     this.h.e = this.a.e;
/* 433 */     this.b.e = (0.02F - f9 * 1.0F);
/* 434 */     this.c.e = (0.0F + f9 * 1.0F);
/* 435 */     this.j.e = this.a.e;
/*     */     
/* 437 */     this.d.f = this.a.f;
/* 438 */     this.e.f = this.a.f;
/* 439 */     this.f.f = this.a.f;
/* 440 */     this.g.f = this.a.f;
/* 441 */     this.h.f = this.a.f;
/* 442 */     this.b.f = (0.0F - 0.09424778F * f9);
/* 443 */     this.c.f = (0.0F + 0.15707964F * f9);
/*     */     
/* 445 */     this.j.f = this.a.f;
/*     */     
/* 447 */     this.d.g = this.a.g;
/* 448 */     this.e.g = this.a.g;
/* 449 */     this.f.g = this.a.g;
/* 450 */     this.g.g = this.a.g;
/* 451 */     this.h.g = this.a.g;
/* 452 */     this.b.g = 0.0F;
/* 453 */     this.c.g = 0.0F;
/* 454 */     this.j.g = this.a.g;
/*     */     
/*     */ 
/* 457 */     this.G.f = (f12 / 5.0F);
/* 458 */     this.H.f = (-f12 / 5.0F);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 464 */     float f13 = 1.5707964F;
/* 465 */     float f14 = 4.712389F;
/* 466 */     float f15 = -1.0471976F;
/* 467 */     float f16 = 0.2617994F * f7;
/* 468 */     float f17 = qh.b(f10 * 0.6F + 3.141593F);
/*     */     
/* 470 */     this.A.d = (-2.0F * f7 + 9.0F * f8);
/* 471 */     this.A.e = (-2.0F * f7 + -8.0F * f8);
/* 472 */     this.D.d = this.A.d;
/* 473 */     this.D.e = this.A.e;
/*     */     
/* 475 */     this.v.d = (this.o.d + qh.a(1.5707964F + f16 + f8 * (-f11 * 0.5F * paramFloat2)) * 7.0F);
/* 476 */     this.v.e = (this.o.e + qh.b(4.712389F + f16 + f8 * (-f11 * 0.5F * paramFloat2)) * 7.0F);
/*     */     
/* 478 */     this.y.d = (this.x.d + qh.a(1.5707964F + f16 + f8 * (f11 * 0.5F * paramFloat2)) * 7.0F);
/* 479 */     this.y.e = (this.x.e + qh.b(4.712389F + f16 + f8 * (f11 * 0.5F * paramFloat2)) * 7.0F);
/*     */     
/* 481 */     float f18 = (-1.0471976F + f17) * f7 + f12 * f8;
/* 482 */     float f19 = (-1.0471976F + -f17) * f7 + -f12 * f8;
/* 483 */     this.B.d = (this.A.d + qh.a(1.5707964F + f18) * 7.0F);
/* 484 */     this.B.e = (this.A.e + qh.b(4.712389F + f18) * 7.0F);
/*     */     
/* 486 */     this.E.d = (this.D.d + qh.a(1.5707964F + f19) * 7.0F);
/* 487 */     this.E.e = (this.D.e + qh.b(4.712389F + f19) * 7.0F);
/*     */     
/* 489 */     this.o.f = (f16 + -f11 * 0.5F * paramFloat2 * f8);
/* 490 */     this.v.f = (-0.08726646F * f7 + (-f11 * 0.5F * paramFloat2 - Math.max(0.0F, f11 * 0.5F * paramFloat2)) * f8);
/* 491 */     this.w.f = this.v.f;
/*     */     
/* 493 */     this.x.f = (f16 + f11 * 0.5F * paramFloat2 * f8);
/* 494 */     this.y.f = (-0.08726646F * f7 + (f11 * 0.5F * paramFloat2 - Math.max(0.0F, -f11 * 0.5F * paramFloat2)) * f8);
/* 495 */     this.z.f = this.y.f;
/*     */     
/* 497 */     this.A.f = f18;
/* 498 */     this.B.f = ((this.A.f + 3.1415927F * Math.max(0.0F, 0.2F + f17 * 0.2F)) * f7 + (f12 + Math.max(0.0F, f11 * 0.5F * paramFloat2)) * f8);
/* 499 */     this.C.f = this.B.f;
/*     */     
/* 501 */     this.D.f = f19;
/* 502 */     this.E.f = ((this.D.f + 3.1415927F * Math.max(0.0F, 0.2F - f17 * 0.2F)) * f7 + (-f12 + Math.max(0.0F, -f11 * 0.5F * paramFloat2)) * f8);
/* 503 */     this.F.f = this.E.f;
/*     */     
/*     */ 
/* 506 */     this.w.d = this.v.d;
/* 507 */     this.w.e = this.v.e;
/* 508 */     this.z.d = this.y.d;
/* 509 */     this.z.e = this.y.e;
/* 510 */     this.C.d = this.B.d;
/* 511 */     this.C.e = this.B.e;
/* 512 */     this.F.d = this.E.d;
/* 513 */     this.F.e = this.E.e;
/*     */     
/* 515 */     if (bool)
/*     */     {
/* 517 */       this.I.d = (f7 * 0.5F + f8 * 2.0F);
/* 518 */       this.I.e = (f7 * 11.0F + f8 * 2.0F);
/*     */       
/* 520 */       this.J.d = this.I.d;
/* 521 */       this.K.d = this.I.d;
/* 522 */       this.L.d = this.I.d;
/* 523 */       this.N.d = this.I.d;
/* 524 */       this.M.d = this.I.d;
/* 525 */       this.O.d = this.I.d;
/* 526 */       this.G.d = this.H.d;
/*     */       
/* 528 */       this.J.e = this.I.e;
/* 529 */       this.K.e = this.I.e;
/* 530 */       this.L.e = this.I.e;
/* 531 */       this.N.e = this.I.e;
/* 532 */       this.M.e = this.I.e;
/* 533 */       this.O.e = this.I.e;
/* 534 */       this.G.e = this.H.e;
/*     */       
/* 536 */       this.I.f = this.k.f;
/* 537 */       this.J.f = this.k.f;
/* 538 */       this.K.f = this.k.f;
/*     */       
/* 540 */       this.R.d = this.a.d;
/* 541 */       this.S.d = this.a.d;
/* 542 */       this.i.d = this.a.d;
/* 543 */       this.P.d = this.a.d;
/* 544 */       this.Q.d = this.a.d;
/*     */       
/* 546 */       this.R.e = this.a.e;
/* 547 */       this.S.e = this.a.e;
/* 548 */       this.i.e = this.a.e;
/* 549 */       this.P.e = this.a.e;
/* 550 */       this.Q.e = this.a.e;
/*     */       
/* 552 */       this.R.f = f5;
/* 553 */       this.S.f = f5;
/* 554 */       this.i.f = this.a.f;
/* 555 */       this.P.f = this.a.f;
/* 556 */       this.Q.f = this.a.f;
/* 557 */       this.i.g = this.a.g;
/* 558 */       this.P.g = this.a.g;
/* 559 */       this.R.g = this.a.g;
/* 560 */       this.Q.g = this.a.g;
/* 561 */       this.S.g = this.a.g;
/*     */       
/* 563 */       if (i2 != 0)
/*     */       {
/* 565 */         this.L.f = -1.0471976F;
/* 566 */         this.M.f = -1.0471976F;
/* 567 */         this.N.f = -1.0471976F;
/* 568 */         this.O.f = -1.0471976F;
/*     */         
/* 570 */         this.L.h = 0.0F;
/* 571 */         this.M.h = 0.0F;
/* 572 */         this.N.h = 0.0F;
/* 573 */         this.O.h = 0.0F;
/*     */       } else {
/* 575 */         this.L.f = (f12 / 3.0F);
/* 576 */         this.M.f = (f12 / 3.0F);
/* 577 */         this.N.f = (f12 / 3.0F);
/* 578 */         this.O.f = (f12 / 3.0F);
/*     */         
/* 580 */         this.L.h = (f12 / 5.0F);
/* 581 */         this.M.h = (f12 / 5.0F);
/* 582 */         this.N.h = (-f12 / 5.0F);
/* 583 */         this.O.h = (-f12 / 5.0F);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 588 */     f13 = -1.3089F + paramFloat2 * 1.5F;
/* 589 */     if (f13 > 0.0F) {
/* 590 */       f13 = 0.0F;
/*     */     }
/*     */     
/* 593 */     if (i1 != 0) {
/* 594 */       this.l.g = qh.b(f10 * 0.7F);
/* 595 */       f13 = 0.0F;
/*     */     } else {
/* 597 */       this.l.g = 0.0F;
/*     */     }
/* 599 */     this.m.g = this.l.g;
/* 600 */     this.n.g = this.l.g;
/*     */     
/* 602 */     this.m.d = this.l.d;
/* 603 */     this.n.d = this.l.d;
/* 604 */     this.m.e = this.l.e;
/* 605 */     this.n.e = this.l.e;
/*     */     
/*     */ 
/* 608 */     this.l.f = f13;
/* 609 */     this.m.f = f13;
/* 610 */     this.n.f = (-0.2618F + f13);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */