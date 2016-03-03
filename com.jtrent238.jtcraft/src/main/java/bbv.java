/*     */ import java.awt.Color;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class bbv
/*     */   extends bbw
/*     */ {
/*  38 */   private static final bqx f = new bqx("textures/misc/vignette.png");
/*  39 */   private static final bqx g = new bqx("textures/gui/widgets.png");
/*  40 */   private static final bqx h = new bqx("textures/misc/pumpkinblur.png");
/*     */   
/*  42 */   private static final bny i = new bny();
/*     */   
/*  44 */   private final Random j = new Random();
/*     */   
/*     */   private final bao k;
/*     */   private final bcc l;
/*     */   private final bco m;
/*     */   private int n;
/*  50 */   private String o = "";
/*     */   
/*     */   private int p;
/*     */   private boolean q;
/*  54 */   public float a = 1.0F;
/*     */   private int r;
/*     */   private add s;
/*     */   
/*     */   public bbv(bao parambao) {
/*  59 */     this.k = parambao;
/*  60 */     this.l = new bcc(parambao);
/*  61 */     this.m = new bco(this.k);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat, boolean paramBoolean, int paramInt1, int paramInt2) {
/*  65 */     bca localbca = new bca(this.k, this.k.d, this.k.e);
/*  66 */     int i1 = localbca.a();
/*  67 */     int i2 = localbca.b();
/*     */     
/*  69 */     bbu localbbu = this.k.l;
/*  70 */     this.k.p.g();
/*     */     
/*  72 */     GL11.glEnable(3042);
/*     */     
/*  74 */     if (bao.x()) {
/*  75 */       a(this.k.h.d(paramFloat), i1, i2);
/*     */     }
/*     */     else {
/*  78 */       buu.c(770, 771, 1, 0);
/*     */     }
/*     */     
/*     */ 
/*  82 */     add localadd = this.k.h.bm.d(3);
/*  83 */     if ((this.k.u.aw == 0) && (localadd != null) && (localadd.b() == adb.a(ajn.aK))) { b(i1, i2);
/*     */     }
/*  85 */     if (!this.k.h.a(rv.k)) {
/*  86 */       float f1 = this.k.h.bN + (this.k.h.bM - this.k.h.bN) * paramFloat;
/*  87 */       if (f1 > 0.0F)
/*  88 */         b(f1, i1, i2);
/*     */     }
/*     */     int i6;
/*     */     int i8;
/*  92 */     if (!this.k.c.a()) {
/*  93 */       GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  94 */       this.k.P().a(g);
/*     */       
/*  96 */       yx localyx = this.k.h.bm;
/*     */       
/*  98 */       this.e = -90.0F;
/*  99 */       b(i1 / 2 - 91, i2 - 22, 0, 0, 182, 22);
/* 100 */       b(i1 / 2 - 91 - 1 + localyx.c * 20, i2 - 22 - 1, 0, 22, 24, 22);
/*     */       
/* 102 */       this.k.P().a(d);
/* 103 */       GL11.glEnable(3042);
/* 104 */       buu.c(775, 769, 1, 0);
/* 105 */       b(i1 / 2 - 7, i2 / 2 - 7, 0, 0, 16, 16);
/*     */       
/* 107 */       buu.c(770, 771, 1, 0);
/* 108 */       this.k.z.a("bossHealth");
/* 109 */       d();
/* 110 */       this.k.z.b();
/*     */       
/* 112 */       if (this.k.c.b()) {
/* 113 */         a(i1, i2);
/*     */       }
/*     */       
/* 116 */       this.k.z.a("actionBar");
/* 117 */       GL11.glEnable(32826);
/* 118 */       bam.c();
/*     */       
/* 120 */       for (int i4 = 0; i4 < 9; i4++) {
/* 121 */         i6 = i1 / 2 - 90 + i4 * 20 + 2;
/* 122 */         i8 = i2 - 16 - 3;
/* 123 */         a(i4, i6, i8, paramFloat);
/*     */       }
/* 125 */       bam.a();
/* 126 */       GL11.glDisable(32826);
/* 127 */       this.k.z.b();
/*     */       
/* 129 */       GL11.glDisable(3042);
/*     */     }
/*     */     
/*     */ 
/* 133 */     if (this.k.h.bM() > 0) {
/* 134 */       this.k.z.a("sleep");
/* 135 */       GL11.glDisable(2929);
/* 136 */       GL11.glDisable(3008);
/*     */       
/* 138 */       i3 = this.k.h.bM();
/* 139 */       float f2 = i3 / 100.0F;
/* 140 */       if (f2 > 1.0F)
/*     */       {
/* 142 */         f2 = 1.0F - (i3 - 100) / 10.0F;
/*     */       }
/*     */       
/* 145 */       i6 = (int)(220.0F * f2) << 24 | 0x101020;
/* 146 */       a(0, 0, i1, i2, i6);
/* 147 */       GL11.glEnable(3008);
/* 148 */       GL11.glEnable(2929);
/* 149 */       this.k.z.b();
/*     */     }
/*     */     
/* 152 */     int i3 = 16777215;
/* 153 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 154 */     int i5 = i1 / 2 - 91;
/*     */     int i9;
/* 156 */     int i11; int i14; if (this.k.h.u())
/*     */     {
/* 158 */       this.k.z.a("jumpBar");
/* 159 */       this.k.P().a(bbw.d);
/* 160 */       float f3 = this.k.h.v();
/* 161 */       i8 = 182;
/*     */       
/* 163 */       i9 = (int)(f3 * (i8 + 1));
/*     */       
/* 165 */       i11 = i2 - 32 + 3;
/* 166 */       b(i5, i11, 0, 84, i8, 5);
/* 167 */       if (i9 > 0) {
/* 168 */         b(i5, i11, 0, 89, i9, 5);
/*     */       }
/* 170 */       this.k.z.b();
/* 171 */     } else if (this.k.c.f())
/*     */     {
/* 173 */       this.k.z.a("expBar");
/* 174 */       this.k.P().a(bbw.d);
/* 175 */       int i7 = this.k.h.bP();
/* 176 */       if (i7 > 0) {
/* 177 */         i8 = 182;
/*     */         
/* 179 */         i9 = (int)(this.k.h.bH * (i8 + 1));
/*     */         
/* 181 */         i11 = i2 - 32 + 3;
/* 182 */         b(i5, i11, 0, 64, i8, 5);
/* 183 */         if (i9 > 0) {
/* 184 */           b(i5, i11, 0, 69, i9, 5);
/*     */         }
/*     */       }
/* 187 */       this.k.z.b();
/*     */       
/* 189 */       if (this.k.h.bF > 0) {
/* 190 */         this.k.z.a("expLevel");
/* 191 */         i8 = 0;
/* 192 */         i9 = i8 != 0 ? 16777215 : 8453920;
/*     */         
/* 194 */         String str2 = "" + this.k.h.bF;
/* 195 */         int i12 = (i1 - localbbu.a(str2)) / 2;
/* 196 */         i14 = i2 - 31 - 4;
/*     */         
/* 198 */         int i15 = 0;
/* 199 */         localbbu.b(str2, i12 + 1, i14, 0);
/* 200 */         localbbu.b(str2, i12 - 1, i14, 0);
/* 201 */         localbbu.b(str2, i12, i14 + 1, 0);
/* 202 */         localbbu.b(str2, i12, i14 - 1, 0);
/* 203 */         localbbu.b(str2, i12, i14, i9);
/* 204 */         this.k.z.b();
/*     */       } }
/*     */     String str1;
/*     */     long l3;
/* 208 */     if (this.k.u.B) {
/* 209 */       this.k.z.a("toolHighlight");
/*     */       
/* 211 */       if ((this.r > 0) && (this.s != null)) {
/* 212 */         str1 = this.s.s();
/* 213 */         i8 = (i1 - localbbu.a(str1)) / 2;
/* 214 */         i9 = i2 - 59;
/* 215 */         if (!this.k.c.b())
/*     */         {
/* 217 */           i9 += 14;
/*     */         }
/*     */         
/* 220 */         l3 = (int)(this.r * 256.0F / 10.0F);
/* 221 */         if (l3 > 255) l3 = 255;
/* 222 */         if (l3 > 0) {
/* 223 */           GL11.glPushMatrix();
/* 224 */           GL11.glEnable(3042);
/* 225 */           buu.c(770, 771, 1, 0);
/* 226 */           localbbu.a(str1, i8, i9, 16777215 + (l3 << 24));
/* 227 */           GL11.glDisable(3042);
/* 228 */           GL11.glPopMatrix();
/*     */         }
/*     */       }
/*     */       
/* 232 */       this.k.z.b();
/*     */     }
/*     */     
/* 235 */     if (this.k.u()) {
/* 236 */       this.k.z.a("demo");
/* 237 */       str1 = "";
/*     */       
/* 239 */       if (this.k.f.I() >= 120500L) {
/* 240 */         str1 = brp.a("demo.demoExpired", new Object[0]);
/*     */       } else {
/* 242 */         str1 = brp.a("demo.remainingTime", new Object[] { qn.a((int)(120500L - this.k.f.I())) });
/*     */       }
/*     */       
/* 245 */       i8 = localbbu.a(str1);
/* 246 */       localbbu.a(str1, i1 - i8 - 10, 5, 16777215);
/* 247 */       this.k.z.b(); }
/*     */     long l4;
/*     */     int i19;
/* 250 */     int i20; int i21; Object localObject; if (this.k.u.ax) {
/* 251 */       this.k.z.a("debug");
/* 252 */       GL11.glPushMatrix();
/*     */       
/* 254 */       localbbu.a("Minecraft 1.7.10 (" + this.k.B + ")", 2, 2, 16777215);
/* 255 */       localbbu.a(this.k.q(), 2, 12, 16777215);
/* 256 */       localbbu.a(this.k.r(), 2, 22, 16777215);
/* 257 */       localbbu.a(this.k.t(), 2, 32, 16777215);
/* 258 */       localbbu.a(this.k.s(), 2, 42, 16777215);
/*     */       
/* 260 */       long l1 = Runtime.getRuntime().maxMemory();
/* 261 */       long l2 = Runtime.getRuntime().totalMemory();
/* 262 */       l4 = Runtime.getRuntime().freeMemory();
/* 263 */       long l5 = l2 - l4;
/*     */       
/* 265 */       String str3 = "Used memory: " + l5 * 100L / l1 + "% (" + l5 / 1024L / 1024L + "MB) of " + l1 / 1024L / 1024L + "MB";
/* 266 */       i19 = 14737632;
/* 267 */       b(localbbu, str3, i1 - localbbu.a(str3) - 2, 2, 14737632);
/* 268 */       str3 = "Allocated memory: " + l2 * 100L / l1 + "% (" + l2 / 1024L / 1024L + "MB)";
/* 269 */       b(localbbu, str3, i1 - localbbu.a(str3) - 2, 12, 14737632);
/*     */       
/* 271 */       i20 = qh.c(this.k.h.s);
/* 272 */       i21 = qh.c(this.k.h.t);
/* 273 */       int i22 = qh.c(this.k.h.u);
/*     */       
/* 275 */       b(localbbu, String.format("x: %.5f (%d) // c: %d (%d)", new Object[] { Double.valueOf(this.k.h.s), Integer.valueOf(i20), Integer.valueOf(i20 >> 4), Integer.valueOf(i20 & 0xF) }), 2, 64, 14737632);
/* 276 */       b(localbbu, String.format("y: %.3f (feet pos, %.3f eyes pos)", new Object[] { Double.valueOf(this.k.h.C.b), Double.valueOf(this.k.h.t) }), 2, 72, 14737632);
/* 277 */       b(localbbu, String.format("z: %.5f (%d) // c: %d (%d)", new Object[] { Double.valueOf(this.k.h.u), Integer.valueOf(i22), Integer.valueOf(i22 >> 4), Integer.valueOf(i22 & 0xF) }), 2, 80, 14737632);
/*     */       
/* 279 */       int i23 = qh.c(this.k.h.y * 4.0F / 360.0F + 0.5D) & 0x3;
/* 280 */       b(localbbu, "f: " + i23 + " (" + p.c[i23] + ") / " + qh.g(this.k.h.y), 2, 88, 14737632);
/*     */       
/* 282 */       if ((this.k.f != null) && (this.k.f.d(i20, i21, i22))) {
/* 283 */         localObject = this.k.f.d(i20, i22);
/* 284 */         b(localbbu, "lc: " + (((apx)localObject).h() + 15) + " b: " + ((apx)localObject).a(i20 & 0xF, i22 & 0xF, this.k.f.v()).af + " bl: " + ((apx)localObject).a(ahn.b, i20 & 0xF, i21, i22 & 0xF) + " sl: " + ((apx)localObject).a(ahn.a, i20 & 0xF, i21, i22 & 0xF) + " rl: " + ((apx)localObject).b(i20 & 0xF, i21, i22 & 0xF, 0), 2, 96, 14737632);
/*     */       }
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 291 */       b(localbbu, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", new Object[] { Float.valueOf(this.k.h.bE.b()), Float.valueOf(this.k.h.bE.a()), Boolean.valueOf(this.k.h.D), Integer.valueOf(this.k.f.f(i20, i22)) }), 2, 104, 14737632);
/*     */       
/*     */ 
/* 294 */       if ((this.k.p != null) && (this.k.p.a())) {
/* 295 */         b(localbbu, String.format("shader: %s", new Object[] { this.k.p.e().b() }), 2, 112, 14737632);
/*     */       }
/*     */       
/* 298 */       GL11.glPopMatrix();
/* 299 */       this.k.z.b();
/*     */     }
/*     */     
/* 302 */     if (this.p > 0) {
/* 303 */       this.k.z.a("overlayMessage");
/* 304 */       float f4 = this.p - paramFloat;
/* 305 */       i8 = (int)(f4 * 255.0F / 20.0F);
/* 306 */       if (i8 > 255) i8 = 255;
/* 307 */       if (i8 > 8) {
/* 308 */         GL11.glPushMatrix();
/* 309 */         GL11.glTranslatef(i1 / 2, i2 - 68, 0.0F);
/* 310 */         GL11.glEnable(3042);
/* 311 */         buu.c(770, 771, 1, 0);
/*     */         
/* 313 */         int i10 = 16777215;
/* 314 */         if (this.q) {
/* 315 */           i10 = Color.HSBtoRGB(f4 / 50.0F, 0.7F, 0.6F) & 0xFFFFFF;
/*     */         }
/* 317 */         localbbu.b(this.o, -localbbu.a(this.o) / 2, -4, i10 + (i8 << 24 & 0xFF000000));
/* 318 */         GL11.glDisable(3042);
/* 319 */         GL11.glPopMatrix();
/*     */       }
/* 321 */       this.k.z.b();
/*     */     }
/*     */     
/* 324 */     azx localazx = this.k.f.W().a(1);
/* 325 */     if (localazx != null) {
/* 326 */       a(localazx, i2, i1, localbbu);
/*     */     }
/*     */     
/* 329 */     GL11.glEnable(3042);
/* 330 */     buu.c(770, 771, 1, 0);
/* 331 */     GL11.glDisable(3008);
/*     */     
/* 333 */     GL11.glPushMatrix();
/* 334 */     GL11.glTranslatef(0.0F, i2 - 48, 0.0F);
/*     */     
/* 336 */     this.k.z.a("chat");
/* 337 */     this.l.a(this.n);
/* 338 */     this.k.z.b();
/*     */     
/* 340 */     GL11.glPopMatrix();
/*     */     
/* 342 */     localazx = this.k.f.W().a(0);
/* 343 */     if ((this.k.u.ah.d()) && ((!this.k.F()) || (this.k.h.a.b.size() > 1) || (localazx != null))) {
/* 344 */       this.k.z.a("playerList");
/* 345 */       bjb localbjb = this.k.h.a;
/* 346 */       List localList = localbjb.b;
/* 347 */       l3 = localbjb.c;
/*     */       
/* 349 */       l4 = l3;
/* 350 */       i14 = 1;
/* 351 */       int i13; while (l4 > 20) {
/* 352 */         i14++;
/* 353 */         i13 = (l3 + i14 - 1) / i14;
/*     */       }
/*     */       
/* 356 */       int i16 = 300 / i14;
/* 357 */       if (i16 > 150) { i16 = 150;
/*     */       }
/* 359 */       int i17 = (i1 - i14 * i16) / 2;
/* 360 */       int i18 = 10;
/* 361 */       a(i17 - 1, i18 - 1, i17 + i16 * i14, i18 + 9 * i13, Integer.MIN_VALUE);
/*     */       
/* 363 */       for (i19 = 0; i19 < l3; i19++) {
/* 364 */         i20 = i17 + i19 % i14 * i16;
/* 365 */         i21 = i18 + i19 / i14 * 9;
/*     */         
/* 367 */         a(i20, i21, i20 + i16 - 1, i21 + 8, 553648127);
/* 368 */         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 369 */         GL11.glEnable(3008);
/*     */         
/* 371 */         if (i19 < localList.size()) {
/* 372 */           bjl localbjl = (bjl)localList.get(i19);
/* 373 */           azy localazy = this.k.f.W().i(localbjl.a);
/* 374 */           localObject = azy.a(localazy, localbjl.a);
/*     */           
/* 376 */           localbbu.a((String)localObject, i20, i21, 16777215);
/*     */           
/* 378 */           if (localazx != null) {
/* 379 */             i24 = i20 + localbbu.a((String)localObject) + 5;
/* 380 */             i25 = i20 + i16 - 12 - 5;
/*     */             
/* 382 */             if (i25 - i24 > 5) {
/* 383 */               azz localazz = localazx.a().a(localbjl.a, localazx);
/* 384 */               String str4 = a.o + "" + localazz.c();
/*     */               
/* 386 */               localbbu.a(str4, i25 - localbbu.a(str4), i21, 16777215);
/*     */             }
/*     */           }
/*     */           
/* 390 */           GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 391 */           this.k.P().a(d);
/* 392 */           int i24 = 0;
/* 393 */           int i25 = 0;
/*     */           
/* 395 */           if (localbjl.b < 0) { i25 = 5;
/* 396 */           } else if (localbjl.b < 150) { i25 = 0;
/* 397 */           } else if (localbjl.b < 300) { i25 = 1;
/* 398 */           } else if (localbjl.b < 600) { i25 = 2;
/* 399 */           } else if (localbjl.b < 1000) i25 = 3; else {
/* 400 */             i25 = 4;
/*     */           }
/* 402 */           this.e += 100.0F;
/* 403 */           b(i20 + i16 - 12, i21, 0 + i24 * 10, 176 + i25 * 8, 10, 8);
/* 404 */           this.e -= 100.0F;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 409 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 410 */     GL11.glDisable(2896);
/* 411 */     GL11.glEnable(3008);
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2) {
/* 415 */     this.m.a((int)(paramFloat1 - 10.0F), 10);
/*     */   }
/*     */   
/*     */   private void a(azx paramazx, int paramInt1, int paramInt2, bbu parambbu) {
/* 419 */     bac localbac = paramazx.a();
/* 420 */     Collection localCollection = localbac.i(paramazx);
/* 421 */     if (localCollection.size() > 15) { return;
/*     */     }
/* 423 */     int i1 = parambbu.a(paramazx.d());
/* 424 */     for (azz localazz1 : localCollection) {
/* 425 */       azy localazy1 = localbac.i(localazz1.e());
/* 426 */       String str1 = azy.a(localazy1, localazz1.e()) + ": " + a.m + localazz1.c();
/* 427 */       i1 = Math.max(i1, parambbu.a(str1));
/*     */     }
/*     */     
/* 430 */     int i2 = localCollection.size() * parambbu.a;
/* 431 */     int i3 = paramInt1 / 2 + i2 / 3;
/* 432 */     int i4 = 3;
/* 433 */     int i5 = paramInt2 - i1 - i4;
/* 434 */     int i6 = 0;
/*     */     
/* 436 */     for (azz localazz2 : localCollection) {
/* 437 */       i6++;
/* 438 */       azy localazy2 = localbac.i(localazz2.e());
/* 439 */       String str2 = azy.a(localazy2, localazz2.e());
/* 440 */       String str3 = a.m + "" + localazz2.c();
/* 441 */       int i7 = i5;
/* 442 */       int i8 = i3 - i6 * parambbu.a;
/* 443 */       int i9 = paramInt2 - i4 + 2;
/*     */       
/* 445 */       a(i7 - 2, i8, i9, i8 + parambbu.a, 1342177280);
/* 446 */       parambbu.b(str2, i7, i8, 553648127);
/* 447 */       parambbu.b(str3, i9 - parambbu.a(str3), i8, 553648127);
/*     */       
/* 449 */       if (i6 == localCollection.size()) {
/* 450 */         String str4 = paramazx.d();
/* 451 */         a(i7 - 2, i8 - parambbu.a - 1, i9, i8 - 1, 1610612736);
/* 452 */         a(i7 - 2, i8 - 1, i9, i8, 1342177280);
/* 453 */         parambbu.b(str4, i7 + i1 / 2 - parambbu.a(str4) / 2, i8 - parambbu.a, 553648127);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2) {
/* 459 */     int i1 = this.k.h.ad / 3 % 2 == 1 ? 1 : 0;
/* 460 */     if (this.k.h.ad < 10) i1 = 0;
/* 461 */     int i2 = qh.f(this.k.h.aS());
/* 462 */     int i3 = qh.f(this.k.h.aw);
/* 463 */     this.j.setSeed(this.n * 312871);
/*     */     
/* 465 */     int i4 = 0;
/* 466 */     zr localzr = this.k.h.bQ();
/* 467 */     int i5 = localzr.a();
/* 468 */     int i6 = localzr.b();
/* 469 */     ti localti = this.k.h.a(yj.a);
/*     */     
/* 471 */     int i7 = paramInt1 / 2 - 91;
/* 472 */     int i8 = paramInt1 / 2 + 91;
/*     */     
/* 474 */     int i9 = paramInt2 - 39;
/* 475 */     float f1 = (float)localti.e();
/* 476 */     float f2 = this.k.h.bs();
/* 477 */     int i10 = qh.f((f1 + f2) / 2.0F / 10.0F);
/* 478 */     int i11 = Math.max(10 - (i10 - 2), 3);
/* 479 */     int i12 = i9 - (i10 - 1) * i11 - 10;
/* 480 */     float f3 = f2;
/*     */     
/* 482 */     int i13 = this.k.h.aV();
/* 483 */     int i14 = -1;
/* 484 */     if (this.k.h.a(rv.l)) {
/* 485 */       i14 = this.n % qh.f(f1 + 5.0F);
/*     */     }
/*     */     
/*     */ 
/* 489 */     this.k.z.a("armor");
/* 490 */     int i16; for (int i15 = 0; i15 < 10; i15++) {
/* 491 */       if (i13 > 0) {
/* 492 */         i16 = i7 + i15 * 8;
/* 493 */         if (i15 * 2 + 1 < i13) b(i16, i12, 34, 9, 9, 9);
/* 494 */         if (i15 * 2 + 1 == i13) b(i16, i12, 25, 9, 9, 9);
/* 495 */         if (i15 * 2 + 1 > i13) b(i16, i12, 16, 9, 9, 9);
/*     */       }
/*     */     }
/* 498 */     this.k.z.c("health");
/* 499 */     int i18; int i19; int i21; int i22; int i23; for (i15 = qh.f((f1 + f2) / 2.0F) - 1; i15 >= 0; i15--) {
/* 500 */       i16 = 16;
/* 501 */       if (this.k.h.a(rv.u)) {
/* 502 */         i16 += 36;
/* 503 */       } else if (this.k.h.a(rv.v)) {
/* 504 */         i16 += 72;
/*     */       }
/*     */       
/* 507 */       i18 = 0;
/* 508 */       if (i1 != 0) i18 = 1;
/* 509 */       i19 = qh.f((i15 + 1) / 10.0F) - 1;
/* 510 */       i21 = i7 + i15 % 10 * 8;
/* 511 */       i22 = i9 - i19 * i11;
/* 512 */       if (i2 <= 4) {
/* 513 */         i22 += this.j.nextInt(2);
/*     */       }
/*     */       
/* 516 */       if (i15 == i14) {
/* 517 */         i22 -= 2;
/*     */       }
/*     */       
/* 520 */       i23 = 0;
/* 521 */       if (this.k.f.N().t()) {
/* 522 */         i23 = 5;
/*     */       }
/*     */       
/* 525 */       b(i21, i22, 16 + i18 * 9, 9 * i23, 9, 9);
/* 526 */       if (i1 != 0) {
/* 527 */         if (i15 * 2 + 1 < i3) b(i21, i22, i16 + 54, 9 * i23, 9, 9);
/* 528 */         if (i15 * 2 + 1 == i3) { b(i21, i22, i16 + 63, 9 * i23, 9, 9);
/*     */         }
/*     */       }
/* 531 */       if (f3 > 0.0F) {
/* 532 */         if ((f3 == f2) && (f2 % 2.0F == 1.0F)) {
/* 533 */           b(i21, i22, i16 + 153, 9 * i23, 9, 9);
/*     */         } else {
/* 535 */           b(i21, i22, i16 + 144, 9 * i23, 9, 9);
/*     */         }
/* 537 */         f3 -= 2.0F;
/*     */       } else {
/* 539 */         if (i15 * 2 + 1 < i2) b(i21, i22, i16 + 36, 9 * i23, 9, 9);
/* 540 */         if (i15 * 2 + 1 == i2) { b(i21, i22, i16 + 45, 9 * i23, 9, 9);
/*     */         }
/*     */       }
/*     */     }
/* 544 */     sa localsa = this.k.h.m;
/* 545 */     if (localsa == null)
/*     */     {
/* 547 */       this.k.z.c("food");
/* 548 */       for (i16 = 0; i16 < 10; i16++) {
/* 549 */         i18 = i9;
/*     */         
/* 551 */         i19 = 16;
/* 552 */         i21 = 0;
/* 553 */         if (this.k.h.a(rv.s)) {
/* 554 */           i19 += 36;
/* 555 */           i21 = 13;
/*     */         }
/*     */         
/* 558 */         if ((this.k.h.bQ().e() <= 0.0F) && 
/* 559 */           (this.n % (i5 * 3 + 1) == 0)) {
/* 560 */           i18 += this.j.nextInt(3) - 1;
/*     */         }
/*     */         
/*     */ 
/* 564 */         if (i4 != 0) i21 = 1;
/* 565 */         i22 = i8 - i16 * 8 - 9;
/* 566 */         b(i22, i18, 16 + i21 * 9, 27, 9, 9);
/* 567 */         if (i4 != 0) {
/* 568 */           if (i16 * 2 + 1 < i6) b(i22, i18, i19 + 54, 27, 9, 9);
/* 569 */           if (i16 * 2 + 1 == i6) b(i22, i18, i19 + 63, 27, 9, 9);
/*     */         }
/* 571 */         if (i16 * 2 + 1 < i5) b(i22, i18, i19 + 36, 27, 9, 9);
/* 572 */         if (i16 * 2 + 1 == i5) b(i22, i18, i19 + 45, 27, 9, 9);
/*     */       }
/* 574 */     } else if ((localsa instanceof sv))
/*     */     {
/* 576 */       this.k.z.c("mountHealth");
/*     */       
/* 578 */       sv localsv = (sv)localsa;
/* 579 */       i18 = (int)Math.ceil(localsv.aS());
/* 580 */       float f4 = localsv.aY();
/* 581 */       i21 = (int)(f4 + 0.5F) / 2;
/* 582 */       if (i21 > 30) {
/* 583 */         i21 = 30;
/*     */       }
/*     */       
/* 586 */       i22 = i9;
/* 587 */       i23 = 0;
/*     */       
/* 589 */       while (i21 > 0) {
/* 590 */         int i24 = Math.min(i21, 10);
/* 591 */         i21 -= i24;
/*     */         
/* 593 */         for (int i25 = 0; i25 < i24; i25++)
/*     */         {
/* 595 */           int i26 = 52;
/* 596 */           int i27 = 0;
/*     */           
/* 598 */           if (i4 != 0) i27 = 1;
/* 599 */           int i28 = i8 - i25 * 8 - 9;
/* 600 */           b(i28, i22, i26 + i27 * 9, 9, 9, 9);
/* 601 */           if (i25 * 2 + 1 + i23 < i18) b(i28, i22, i26 + 36, 9, 9, 9);
/* 602 */           if (i25 * 2 + 1 + i23 == i18) b(i28, i22, i26 + 45, 9, 9, 9);
/*     */         }
/* 604 */         i22 -= 10;
/* 605 */         i23 += 20;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 610 */     this.k.z.c("air");
/* 611 */     if (this.k.h.a(awt.h)) {
/* 612 */       int i17 = this.k.h.ar();
/*     */       
/* 614 */       i18 = qh.f((i17 - 2) * 10.0D / 300.0D);
/* 615 */       int i20 = qh.f(i17 * 10.0D / 300.0D) - i18;
/*     */       
/* 617 */       for (i21 = 0; i21 < i18 + i20; i21++) {
/* 618 */         if (i21 < i18) b(i8 - i21 * 8 - 9, i12, 16, 18, 9, 9); else {
/* 619 */           b(i8 - i21 * 8 - 9, i12, 25, 18, 9, 9);
/*     */         }
/*     */       }
/*     */     }
/* 623 */     this.k.z.b();
/*     */   }
/*     */   
/*     */   private void d()
/*     */   {
/* 628 */     if ((bln.c == null) || (bln.b <= 0)) return;
/* 629 */     bln.b -= 1;
/*     */     
/* 631 */     bbu localbbu = this.k.l;
/*     */     
/* 633 */     bca localbca = new bca(this.k, this.k.d, this.k.e);
/* 634 */     int i1 = localbca.a();
/*     */     
/* 636 */     int i2 = 182;
/* 637 */     int i3 = i1 / 2 - i2 / 2;
/*     */     
/* 639 */     int i4 = (int)(bln.a * (i2 + 1));
/*     */     
/* 641 */     int i5 = 12;
/* 642 */     b(i3, i5, 0, 74, i2, 5);
/* 643 */     b(i3, i5, 0, 74, i2, 5);
/* 644 */     if (i4 > 0) {
/* 645 */       b(i3, i5, 0, 79, i4, 5);
/*     */     }
/* 647 */     String str = bln.c;
/* 648 */     localbbu.a(str, i1 / 2 - localbbu.a(str) / 2, i5 - 10, 16777215);
/* 649 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 650 */     this.k.P().a(d);
/*     */   }
/*     */   
/*     */   private void b(int paramInt1, int paramInt2) {
/* 654 */     GL11.glDisable(2929);
/* 655 */     GL11.glDepthMask(false);
/* 656 */     buu.c(770, 771, 1, 0);
/* 657 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 658 */     GL11.glDisable(3008);
/*     */     
/* 660 */     this.k.P().a(h);
/* 661 */     bmh localbmh = bmh.a;
/* 662 */     localbmh.b();
/* 663 */     localbmh.a(0.0D, paramInt2, -90.0D, 0.0D, 1.0D);
/* 664 */     localbmh.a(paramInt1, paramInt2, -90.0D, 1.0D, 1.0D);
/* 665 */     localbmh.a(paramInt1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 666 */     localbmh.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 667 */     localbmh.a();
/* 668 */     GL11.glDepthMask(true);
/* 669 */     GL11.glEnable(2929);
/* 670 */     GL11.glEnable(3008);
/* 671 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void a(float paramFloat, int paramInt1, int paramInt2) {
/* 675 */     paramFloat = 1.0F - paramFloat;
/* 676 */     if (paramFloat < 0.0F) paramFloat = 0.0F;
/* 677 */     if (paramFloat > 1.0F) paramFloat = 1.0F;
/* 678 */     this.a = ((float)(this.a + (paramFloat - this.a) * 0.01D));
/*     */     
/* 680 */     GL11.glDisable(2929);
/* 681 */     GL11.glDepthMask(false);
/* 682 */     buu.c(0, 769, 1, 0);
/* 683 */     GL11.glColor4f(this.a, this.a, this.a, 1.0F);
/* 684 */     this.k.P().a(f);
/* 685 */     bmh localbmh = bmh.a;
/* 686 */     localbmh.b();
/* 687 */     localbmh.a(0.0D, paramInt2, -90.0D, 0.0D, 1.0D);
/* 688 */     localbmh.a(paramInt1, paramInt2, -90.0D, 1.0D, 1.0D);
/* 689 */     localbmh.a(paramInt1, 0.0D, -90.0D, 1.0D, 0.0D);
/* 690 */     localbmh.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
/* 691 */     localbmh.a();
/* 692 */     GL11.glDepthMask(true);
/* 693 */     GL11.glEnable(2929);
/* 694 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 695 */     buu.c(770, 771, 1, 0);
/*     */   }
/*     */   
/*     */   private void b(float paramFloat, int paramInt1, int paramInt2) {
/* 699 */     if (paramFloat < 1.0F) {
/* 700 */       paramFloat *= paramFloat;
/* 701 */       paramFloat *= paramFloat;
/* 702 */       paramFloat = paramFloat * 0.8F + 0.2F;
/*     */     }
/*     */     
/* 705 */     GL11.glDisable(3008);
/* 706 */     GL11.glDisable(2929);
/* 707 */     GL11.glDepthMask(false);
/* 708 */     buu.c(770, 771, 1, 0);
/* 709 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, paramFloat);
/*     */     
/* 711 */     rf localrf = ajn.aO.h(1);
/* 712 */     this.k.P().a(bpz.b);
/*     */     
/* 714 */     float f1 = localrf.c();
/* 715 */     float f2 = localrf.e();
/* 716 */     float f3 = localrf.d();
/* 717 */     float f4 = localrf.f();
/* 718 */     bmh localbmh = bmh.a;
/* 719 */     localbmh.b();
/* 720 */     localbmh.a(0.0D, paramInt2, -90.0D, f1, f4);
/* 721 */     localbmh.a(paramInt1, paramInt2, -90.0D, f3, f4);
/* 722 */     localbmh.a(paramInt1, 0.0D, -90.0D, f3, f2);
/* 723 */     localbmh.a(0.0D, 0.0D, -90.0D, f1, f2);
/* 724 */     localbmh.a();
/* 725 */     GL11.glDepthMask(true);
/* 726 */     GL11.glEnable(2929);
/* 727 */     GL11.glEnable(3008);
/* 728 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   private void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
/* 732 */     add localadd = this.k.h.bm.a[paramInt1];
/* 733 */     if (localadd == null) { return;
/*     */     }
/* 735 */     float f1 = localadd.c - paramFloat;
/* 736 */     if (f1 > 0.0F) {
/* 737 */       GL11.glPushMatrix();
/* 738 */       float f2 = 1.0F + f1 / 5.0F;
/* 739 */       GL11.glTranslatef(paramInt2 + 8, paramInt3 + 12, 0.0F);
/* 740 */       GL11.glScalef(1.0F / f2, (f2 + 1.0F) / 2.0F, 1.0F);
/* 741 */       GL11.glTranslatef(-(paramInt2 + 8), -(paramInt3 + 12), 0.0F);
/*     */     }
/*     */     
/* 744 */     i.b(this.k.l, this.k.P(), localadd, paramInt2, paramInt3);
/*     */     
/* 746 */     if (f1 > 0.0F) {
/* 747 */       GL11.glPopMatrix();
/*     */     }
/*     */     
/* 750 */     i.c(this.k.l, this.k.P(), localadd, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   public void a() {
/* 754 */     if (this.p > 0) this.p -= 1;
/* 755 */     this.n += 1;
/*     */     
/* 757 */     this.m.a();
/*     */     
/* 759 */     if (this.k.h != null) {
/* 760 */       add localadd = this.k.h.bm.h();
/*     */       
/* 762 */       if (localadd == null) {
/* 763 */         this.r = 0;
/* 764 */       } else if ((this.s == null) || (localadd.b() != this.s.b()) || (!add.a(localadd, this.s)) || ((!localadd.g()) && (localadd.k() != this.s.k())))
/*     */       {
/* 766 */         this.r = 40;
/* 767 */       } else if (this.r > 0) {
/* 768 */         this.r -= 1;
/*     */       }
/* 770 */       this.s = localadd;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 775 */     a(brp.a("record.nowPlaying", new Object[] { paramString }), true);
/*     */   }
/*     */   
/*     */   public void a(String paramString, boolean paramBoolean) {
/* 779 */     this.o = paramString;
/* 780 */     this.p = 60;
/* 781 */     this.q = paramBoolean;
/*     */   }
/*     */   
/*     */   public bcc b() {
/* 785 */     return this.l;
/*     */   }
/*     */   
/*     */   public int c() {
/* 789 */     return this.n;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */