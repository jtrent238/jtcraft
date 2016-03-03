/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Lists;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import io.netty.util.concurrent.GenericFutureListener;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class nh
/*     */   implements io
/*     */ {
/*  46 */   private static final Logger c = ;
/*     */   
/*     */   public final ej a;
/*     */   
/*     */   private final MinecraftServer d;
/*     */   
/*     */   public mw b;
/*     */   private int e;
/*     */   private int f;
/*     */   private boolean g;
/*     */   private int h;
/*     */   private long i;
/*  58 */   private static Random j = new Random();
/*     */   
/*     */   private long k;
/*     */   
/*     */   private int l;
/*     */   private int m;
/*  64 */   private pz n = new pz();
/*     */   private double o;
/*     */   
/*  67 */   public nh(MinecraftServer paramMinecraftServer, ej paramej, mw parammw) { this.d = paramMinecraftServer;
/*  68 */     this.a = paramej;
/*  69 */     paramej.a(this);
/*  70 */     this.b = parammw;
/*  71 */     parammw.a = this;
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/*  76 */     this.g = false;
/*  77 */     this.e += 1;
/*     */     
/*  79 */     this.d.b.a("keepAlive");
/*  80 */     if (this.e - this.k > 40L) {
/*  81 */       this.k = this.e;
/*  82 */       this.i = d();
/*  83 */       this.h = ((int)this.i);
/*  84 */       a(new gw(this.h));
/*     */     }
/*     */     
/*  87 */     if (this.l > 0) {
/*  88 */       this.l -= 1;
/*     */     }
/*  90 */     if (this.m > 0) {
/*  91 */       this.m -= 1;
/*     */     }
/*     */     
/*  94 */     if ((this.b.x() > 0L) && (this.d.as() > 0) && (MinecraftServer.ar() - this.b.x() > this.d.as() * 1000 * 60)) {
/*  95 */       c("You have been idle for too long!");
/*     */     }
/*     */   }
/*     */   
/*     */   public ej b()
/*     */   {
/* 101 */     return this.a;
/*     */   }
/*     */   
/*     */   public void c(String paramString) {
/* 105 */     fq localfq = new fq(paramString);
/* 106 */     this.a.a(new gs(localfq), new GenericFutureListener[] { new ni(this, localfq) });
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 112 */     this.a.g(); }
/*     */   
/*     */   private double p;
/*     */   private double q;
/* 116 */   private boolean r = true;
/*     */   
/*     */   public void a(jk paramjk)
/*     */   {
/* 120 */     this.b.a(paramjk.c(), paramjk.d(), paramjk.e(), paramjk.f());
/*     */   }
/*     */   
/*     */   public void a(jd paramjd)
/*     */   {
/* 125 */     mt localmt = this.d.a(this.b.ap);
/*     */     
/* 127 */     this.g = true;
/*     */     
/* 129 */     if (this.b.i) return;
/* 130 */     if (!this.r) {
/* 131 */       double d1 = paramjd.d() - this.p;
/* 132 */       if ((paramjd.c() == this.o) && (d1 * d1 < 0.01D) && (paramjd.e() == this.q)) {
/* 133 */         this.r = true;
/*     */       }
/*     */     }
/*     */     
/* 137 */     if (this.r) {
/* 138 */       if (this.b.m != null) {
/* 139 */         float f1 = this.b.y;
/* 140 */         float f2 = this.b.z;
/* 141 */         this.b.m.ac();
/* 142 */         d3 = this.b.s;
/* 143 */         d4 = this.b.t;
/* 144 */         d5 = this.b.u;
/*     */         
/* 146 */         if (paramjd.k()) {
/* 147 */           f1 = paramjd.g();
/* 148 */           f2 = paramjd.h();
/*     */         }
/*     */         
/* 151 */         this.b.D = paramjd.i();
/* 152 */         this.b.i();
/* 153 */         this.b.V = 0.0F;
/* 154 */         this.b.a(d3, d4, d5, f1, f2);
/* 155 */         if (this.b.m != null) this.b.m.ac();
/* 156 */         this.d.ah().d(this.b);
/*     */         
/*     */ 
/* 159 */         if (this.r) {
/* 160 */           this.o = this.b.s;
/* 161 */           this.p = this.b.t;
/* 162 */           this.q = this.b.u;
/*     */         }
/* 164 */         localmt.g(this.b);
/* 165 */         return;
/*     */       }
/*     */       
/* 168 */       if (this.b.bm()) {
/* 169 */         this.b.i();
/* 170 */         this.b.a(this.o, this.p, this.q, this.b.y, this.b.z);
/* 171 */         localmt.g(this.b);
/* 172 */         return;
/*     */       }
/*     */       
/* 175 */       double d2 = this.b.t;
/* 176 */       this.o = this.b.s;
/* 177 */       this.p = this.b.t;
/* 178 */       this.q = this.b.u;
/*     */       
/* 180 */       double d3 = this.b.s;
/* 181 */       double d4 = this.b.t;
/* 182 */       double d5 = this.b.u;
/*     */       
/* 184 */       float f3 = this.b.y;
/* 185 */       float f4 = this.b.z;
/*     */       
/* 187 */       if ((paramjd.j()) && (paramjd.d() == -999.0D) && (paramjd.f() == -999.0D)) {
/* 188 */         paramjd.a(false);
/*     */       }
/*     */       
/* 191 */       if (paramjd.j()) {
/* 192 */         d3 = paramjd.c();
/* 193 */         d4 = paramjd.d();
/* 194 */         d5 = paramjd.e();
/* 195 */         d6 = paramjd.f() - paramjd.d();
/* 196 */         if ((!this.b.bm()) && ((d6 > 1.65D) || (d6 < 0.1D))) {
/* 197 */           c("Illegal stance");
/* 198 */           c.warn(this.b.b_() + " had an illegal stance: " + d6);
/* 199 */           return;
/*     */         }
/* 201 */         if ((Math.abs(paramjd.c()) > 3.2E7D) || (Math.abs(paramjd.e()) > 3.2E7D)) {
/* 202 */           c("Illegal position");
/* 203 */           return;
/*     */         }
/*     */       }
/* 206 */       if (paramjd.k()) {
/* 207 */         f3 = paramjd.g();
/* 208 */         f4 = paramjd.h();
/*     */       }
/*     */       
/* 211 */       this.b.i();
/* 212 */       this.b.V = 0.0F;
/* 213 */       this.b.a(this.o, this.p, this.q, f3, f4);
/* 214 */       if (!this.r) {
/* 215 */         return;
/*     */       }
/*     */       
/* 218 */       double d6 = d3 - this.b.s;
/* 219 */       double d7 = d4 - this.b.t;
/* 220 */       double d8 = d5 - this.b.u;
/*     */       
/* 222 */       double d9 = Math.min(Math.abs(d6), Math.abs(this.b.v));
/* 223 */       double d10 = Math.min(Math.abs(d7), Math.abs(this.b.w));
/* 224 */       double d11 = Math.min(Math.abs(d8), Math.abs(this.b.x));
/*     */       
/* 226 */       double d12 = d9 * d9 + d10 * d10 + d11 * d11;
/* 227 */       if ((d12 > 100.0D) && ((!this.d.N()) || (!this.d.M().equals(this.b.b_())))) {
/* 228 */         c.warn(this.b.b_() + " moved too quickly! " + d6 + "," + d7 + "," + d8 + " (" + d9 + ", " + d10 + ", " + d11 + ")");
/* 229 */         a(this.o, this.p, this.q, this.b.y, this.b.z);
/* 230 */         return;
/*     */       }
/*     */       
/* 233 */       float f5 = 0.0625F;
/* 234 */       boolean bool1 = localmt.a(this.b, this.b.C.b().e(f5, f5, f5)).isEmpty();
/*     */       
/* 236 */       if ((this.b.D) && (!paramjd.i()) && (d7 > 0.0D))
/*     */       {
/* 238 */         this.b.bj();
/*     */       }
/*     */       
/* 241 */       this.b.d(d6, d7, d8);
/* 242 */       this.b.D = paramjd.i();
/*     */       
/* 244 */       this.b.k(d6, d7, d8);
/*     */       
/* 246 */       double d13 = d7;
/*     */       
/* 248 */       d6 = d3 - this.b.s;
/* 249 */       d7 = d4 - this.b.t;
/* 250 */       if ((d7 > -0.5D) || (d7 < 0.5D)) {
/* 251 */         d7 = 0.0D;
/*     */       }
/* 253 */       d8 = d5 - this.b.u;
/* 254 */       d12 = d6 * d6 + d7 * d7 + d8 * d8;
/* 255 */       int i1 = 0;
/* 256 */       if ((d12 > 0.0625D) && (!this.b.bm()) && (!this.b.c.d())) {
/* 257 */         i1 = 1;
/* 258 */         c.warn(this.b.b_() + " moved wrongly!");
/*     */       }
/* 260 */       this.b.a(d3, d4, d5, f3, f4);
/*     */       
/* 262 */       boolean bool2 = localmt.a(this.b, this.b.C.b().e(f5, f5, f5)).isEmpty();
/* 263 */       if ((bool1) && ((i1 != 0) || (!bool2)) && (!this.b.bm())) {
/* 264 */         a(this.o, this.p, this.q, f3, f4);
/* 265 */         return;
/*     */       }
/* 267 */       azt localazt = this.b.C.b().b(f5, f5, f5).a(0.0D, -0.55D, 0.0D);
/* 268 */       if ((!this.d.ac()) && (!this.b.c.d()) && (!localmt.c(localazt))) {
/* 269 */         if (d13 >= -0.03125D) {
/* 270 */           this.f += 1;
/* 271 */           if (this.f > 80) {
/* 272 */             c.warn(this.b.b_() + " was kicked for floating too long!");
/* 273 */             c("Flying is not enabled on this server");
/*     */           }
/*     */         }
/*     */       }
/*     */       else {
/* 278 */         this.f = 0;
/*     */       }
/*     */       
/* 281 */       this.b.D = paramjd.i();
/* 282 */       this.d.ah().d(this.b);
/* 283 */       this.b.b(this.b.t - d2, paramjd.i());
/* 284 */     } else if (this.e % 20 == 0) {
/* 285 */       a(this.o, this.p, this.q, this.b.y, this.b.z);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
/* 290 */     this.r = false;
/* 291 */     this.o = paramDouble1;
/* 292 */     this.p = paramDouble2;
/* 293 */     this.q = paramDouble3;
/* 294 */     this.b.a(paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 295 */     this.b.a.a(new fu(paramDouble1, paramDouble2 + 1.6200000047683716D, paramDouble3, paramFloat1, paramFloat2, false));
/*     */   }
/*     */   
/*     */   public void a(ji paramji)
/*     */   {
/* 300 */     mt localmt = this.d.a(this.b.ap);
/* 301 */     this.b.v();
/*     */     
/* 303 */     if (paramji.g() == 4) {
/* 304 */       this.b.a(false);
/* 305 */       return; }
/* 306 */     if (paramji.g() == 3) {
/* 307 */       this.b.a(true);
/* 308 */       return; }
/* 309 */     if (paramji.g() == 5) {
/* 310 */       this.b.bA();
/* 311 */       return;
/*     */     }
/*     */     
/* 314 */     int i1 = 0;
/* 315 */     if (paramji.g() == 0) i1 = 1;
/* 316 */     if (paramji.g() == 1) i1 = 1;
/* 317 */     if (paramji.g() == 2) { i1 = 1;
/*     */     }
/* 319 */     int i2 = paramji.c();
/* 320 */     int i3 = paramji.d();
/* 321 */     int i4 = paramji.e();
/* 322 */     if (i1 != 0) {
/* 323 */       double d1 = this.b.s - (i2 + 0.5D);
/*     */       
/*     */ 
/* 326 */       double d2 = this.b.t - (i3 + 0.5D) + 1.5D;
/* 327 */       double d3 = this.b.u - (i4 + 0.5D);
/* 328 */       double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/* 329 */       if (d4 > 36.0D) {
/* 330 */         return;
/*     */       }
/* 332 */       if (i3 >= this.d.af()) {
/* 333 */         return;
/*     */       }
/*     */     }
/*     */     
/* 337 */     if (paramji.g() == 0) {
/* 338 */       if (!this.d.a(localmt, i2, i3, i4, this.b)) this.b.c.a(i2, i3, i4, paramji.f()); else {
/* 339 */         this.b.a.a(new gh(i2, i3, i4, localmt));
/*     */       }
/* 341 */     } else if (paramji.g() == 2) {
/* 342 */       this.b.c.a(i2, i3, i4);
/* 343 */       if (localmt.a(i2, i3, i4).o() != awt.a) this.b.a.a(new gh(i2, i3, i4, localmt));
/* 344 */     } else if (paramji.g() == 1) {
/* 345 */       this.b.c.c(i2, i3, i4);
/* 346 */       if (localmt.a(i2, i3, i4).o() != awt.a) this.b.a.a(new gh(i2, i3, i4, localmt));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jo paramjo)
/*     */   {
/* 352 */     mt localmt = this.d.a(this.b.ap);
/* 353 */     add localadd = this.b.bm.h();
/* 354 */     int i1 = 0;
/* 355 */     int i2 = paramjo.c();
/* 356 */     int i3 = paramjo.d();
/* 357 */     int i4 = paramjo.e();
/* 358 */     int i5 = paramjo.f();
/* 359 */     this.b.v();
/*     */     Object localObject;
/* 361 */     if (paramjo.f() == 255) {
/* 362 */       if (localadd == null) return;
/* 363 */       this.b.c.a(this.b, localmt, localadd);
/* 364 */     } else if ((paramjo.d() < this.d.af() - 1) || ((paramjo.f() != 1) && (paramjo.d() < this.d.af()))) {
/* 365 */       if ((this.r) && (this.b.e(i2 + 0.5D, i3 + 0.5D, i4 + 0.5D) < 64.0D) && 
/* 366 */         (!this.d.a(localmt, i2, i3, i4, this.b))) {
/* 367 */         this.b.c.a(this.b, localmt, localadd, i2, i3, i4, i5, paramjo.h(), paramjo.i(), paramjo.j());
/*     */       }
/*     */       
/*     */ 
/* 371 */       i1 = 1;
/*     */     } else {
/* 373 */       localObject = new fr("build.tooHigh", new Object[] { Integer.valueOf(this.d.af()) });
/* 374 */       ((fr)localObject).b().a(a.m);
/* 375 */       this.b.a.a(new gj((fj)localObject));
/* 376 */       i1 = 1;
/*     */     }
/*     */     
/* 379 */     if (i1 != 0) {
/* 380 */       this.b.a.a(new gh(i2, i3, i4, localmt));
/*     */       
/* 382 */       if (i5 == 0) i3--;
/* 383 */       if (i5 == 1) i3++;
/* 384 */       if (i5 == 2) i4--;
/* 385 */       if (i5 == 3) i4++;
/* 386 */       if (i5 == 4) i2--;
/* 387 */       if (i5 == 5) { i2++;
/*     */       }
/* 389 */       this.b.a.a(new gh(i2, i3, i4, localmt));
/*     */     }
/*     */     
/* 392 */     localadd = this.b.bm.h();
/* 393 */     if ((localadd != null) && (localadd.b == 0)) {
/* 394 */       this.b.bm.a[this.b.bm.c] = null;
/* 395 */       localadd = null;
/*     */     }
/*     */     
/* 398 */     if ((localadd == null) || (localadd.n() == 0)) {
/* 399 */       this.b.g = true;
/* 400 */       this.b.bm.a[this.b.bm.c] = add.b(this.b.bm.a[this.b.bm.c]);
/* 401 */       localObject = this.b.bo.a(this.b.bm, this.b.bm.c);
/* 402 */       this.b.bo.b();
/* 403 */       this.b.g = false;
/*     */       
/* 405 */       if (!add.b(this.b.bm.h(), paramjo.g())) {
/* 406 */         a(new gq(this.b.bo.d, ((aay)localObject).g, this.b.bm.h()));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 413 */     c.info(this.b.b_() + " lost connection: " + paramfj);
/* 414 */     this.d.az();
/* 415 */     fr localfr = new fr("multiplayer.player.left", new Object[] { this.b.c_() });
/* 416 */     localfr.b().a(a.o);
/* 417 */     this.d.ah().a(localfr);
/* 418 */     this.b.n();
/* 419 */     this.d.ah().e(this.b);
/*     */     
/* 421 */     if ((this.d.N()) && (this.b.b_().equals(this.d.M()))) {
/* 422 */       c.info("Stopping singleplayer server as player logged out");
/* 423 */       this.d.r();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ft paramft) { Object localObject;
/* 428 */     if ((paramft instanceof gj)) {
/* 429 */       gj localgj = (gj)paramft;
/* 430 */       localObject = this.b.u();
/*     */       
/* 432 */       if (localObject == zb.c) return;
/* 433 */       if ((localObject == zb.b) && (!localgj.d())) return;
/*     */     }
/*     */     try
/*     */     {
/* 437 */       this.a.a(paramft, new GenericFutureListener[0]);
/*     */     } catch (Throwable localThrowable) {
/* 439 */       localObject = b.a(localThrowable, "Sending packet");
/* 440 */       k localk = ((b)localObject).a("Packet being sent");
/*     */       
/* 442 */       localk.a("Packet class", new nj(this, paramft));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 449 */       throw new s((b)localObject);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jl paramjl)
/*     */   {
/* 455 */     if ((paramjl.c() < 0) || (paramjl.c() >= yx.i())) {
/* 456 */       c.warn(this.b.b_() + " tried to set an invalid carried item");
/* 457 */       return;
/*     */     }
/* 459 */     this.b.bm.c = paramjl.c();
/* 460 */     this.b.v();
/*     */   }
/*     */   
/*     */   public void a(ir paramir)
/*     */   {
/* 465 */     if (this.b.u() == zb.c) {
/* 466 */       localObject = new fr("chat.cannotSend", new Object[0]);
/* 467 */       ((fr)localObject).b().a(a.m);
/* 468 */       a(new gj((fj)localObject));
/* 469 */       return;
/*     */     }
/* 471 */     this.b.v();
/*     */     
/* 473 */     Object localObject = paramir.c();
/* 474 */     localObject = StringUtils.normalizeSpace((String)localObject);
/* 475 */     for (int i1 = 0; i1 < ((String)localObject).length(); i1++) {
/* 476 */       if (!t.a(((String)localObject).charAt(i1))) {
/* 477 */         c("Illegal characters in chat");
/* 478 */         return;
/*     */       }
/*     */     }
/*     */     
/* 482 */     if (((String)localObject).startsWith("/")) {
/* 483 */       d((String)localObject);
/*     */     } else {
/* 485 */       fr localfr = new fr("chat.type.text", new Object[] { this.b.c_(), localObject });
/* 486 */       this.d.ah().a(localfr, false);
/*     */     }
/*     */     
/* 489 */     this.l += 20;
/* 490 */     if ((this.l > 200) && (!this.d.ah().g(this.b.bJ()))) {
/* 491 */       c("disconnect.spam");
/*     */     }
/*     */   }
/*     */   
/*     */   private void d(String paramString) {
/* 496 */     this.d.J().a(this.b, paramString);
/*     */   }
/*     */   
/*     */   public void a(ip paramip)
/*     */   {
/* 501 */     this.b.v();
/* 502 */     if (paramip.d() == 1) {
/* 503 */       this.b.ba();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jj paramjj)
/*     */   {
/* 509 */     this.b.v();
/* 510 */     if (paramjj.d() == 1) {
/* 511 */       this.b.b(true);
/* 512 */     } else if (paramjj.d() == 2) {
/* 513 */       this.b.b(false);
/* 514 */     } else if (paramjj.d() == 4) {
/* 515 */       this.b.c(true);
/* 516 */     } else if (paramjj.d() == 5) {
/* 517 */       this.b.c(false);
/* 518 */     } else if (paramjj.d() == 3) {
/* 519 */       this.b.a(false, true, true);
/* 520 */       this.r = false;
/* 521 */     } else if (paramjj.d() == 6)
/*     */     {
/* 523 */       if ((this.b.m != null) && ((this.b.m instanceof wi))) {
/* 524 */         ((wi)this.b.m).w(paramjj.e());
/*     */       }
/*     */     }
/* 527 */     else if (paramjj.d() == 7)
/*     */     {
/* 529 */       if ((this.b.m != null) && ((this.b.m instanceof wi))) {
/* 530 */         ((wi)this.b.m).g(this.b);
/*     */       }
/*     */     }
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
/*     */   public void a(ja paramja)
/*     */   {
/* 556 */     mt localmt = this.d.a(this.b.ap);
/* 557 */     sa localsa = paramja.a(localmt);
/* 558 */     this.b.v();
/*     */     
/* 560 */     if (localsa != null) {
/* 561 */       boolean bool = this.b.p(localsa);
/* 562 */       double d1 = 36.0D;
/* 563 */       if (!bool) {
/* 564 */         d1 = 9.0D;
/*     */       }
/*     */       
/* 567 */       if (this.b.f(localsa) < d1) {
/* 568 */         if (paramja.c() == jb.a) {
/* 569 */           this.b.q(localsa);
/* 570 */         } else if (paramja.c() == jb.b) {
/* 571 */           if (((localsa instanceof xk)) || ((localsa instanceof sq)) || ((localsa instanceof zc)) || (localsa == this.b)) {
/* 572 */             c("Attempting to attack an invalid entity");
/* 573 */             this.d.f("Player " + this.b.b_() + " tried to attack an invalid entity");
/* 574 */             return;
/*     */           }
/*     */           
/* 577 */           this.b.r(localsa);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(is paramis)
/*     */   {
/* 585 */     this.b.v();
/* 586 */     it localit = paramis.c();
/* 587 */     switch (nk.a[localit.ordinal()]) {
/*     */     case 1: 
/* 589 */       if (this.b.i) {
/* 590 */         this.b = this.d.ah().a(this.b, 0, true);
/* 591 */       } else if (this.b.r().N().t()) {
/* 592 */         if ((this.d.N()) && (this.b.b_().equals(this.d.M()))) {
/* 593 */           this.b.a.c("You have died. Game over, man, it's game over!");
/* 594 */           this.d.U();
/*     */         } else {
/* 596 */           oq localoq = new oq(this.b.bJ(), null, "(You just lost the game)", null, "Death in Hardcore");
/*     */           
/* 598 */           this.d.ah().h().a(localoq);
/* 599 */           this.b.a.c("You have died. Game over, man, it's game over!");
/*     */         }
/*     */       } else {
/* 602 */         if (this.b.aS() > 0.0F) return;
/* 603 */         this.b = this.d.ah().a(this.b, 0, false);
/*     */       }
/* 605 */       break;
/*     */     case 2: 
/* 607 */       this.b.w().a(this.b);
/* 608 */       break;
/*     */     case 3: 
/* 610 */       this.b.a(pc.f);
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */   public void a(iy paramiy)
/*     */   {
/* 617 */     this.b.m();
/*     */   }
/*     */   
/*     */   public void a(ix paramix)
/*     */   {
/* 622 */     this.b.v();
/* 623 */     if ((this.b.bo.d == paramix.c()) && (this.b.bo.c(this.b))) {
/* 624 */       add localadd = this.b.bo.a(paramix.d(), paramix.e(), paramix.h(), this.b);
/*     */       
/* 626 */       if (add.b(paramix.g(), localadd))
/*     */       {
/* 628 */         this.b.a.a(new gl(paramix.c(), paramix.f(), true));
/* 629 */         this.b.g = true;
/* 630 */         this.b.bo.b();
/* 631 */         this.b.l();
/* 632 */         this.b.g = false;
/*     */       }
/*     */       else {
/* 635 */         this.n.a(this.b.bo.d, Short.valueOf(paramix.f()));
/* 636 */         this.b.a.a(new gl(paramix.c(), paramix.f(), false));
/* 637 */         this.b.bo.a(this.b, false);
/*     */         
/* 639 */         ArrayList localArrayList = new ArrayList();
/* 640 */         for (int i1 = 0; i1 < this.b.bo.c.size(); i1++) {
/* 641 */           localArrayList.add(((aay)this.b.bo.c.get(i1)).d());
/*     */         }
/* 643 */         this.b.a(this.b.bo, localArrayList);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(iw paramiw)
/*     */   {
/* 651 */     this.b.v();
/* 652 */     if ((this.b.bo.d == paramiw.c()) && (this.b.bo.c(this.b))) {
/* 653 */       this.b.bo.a(this.b, paramiw.d());
/* 654 */       this.b.bo.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jm paramjm)
/*     */   {
/* 660 */     if (this.b.c.d())
/*     */     {
/* 662 */       int i1 = paramjm.c() < 0 ? 1 : 0;
/* 663 */       add localadd = paramjm.d();
/*     */       
/* 665 */       int i2 = (paramjm.c() >= 1) && (paramjm.c() < 36 + yx.i()) ? 1 : 0;
/* 666 */       int i3 = (localadd == null) || (localadd.b() != null) ? 1 : 0;
/* 667 */       int i4 = (localadd == null) || ((localadd.k() >= 0) && (localadd.b <= 64) && (localadd.b > 0)) ? 1 : 0;
/*     */       
/* 669 */       if ((i2 != 0) && (i3 != 0) && (i4 != 0)) {
/* 670 */         if (localadd == null) {
/* 671 */           this.b.bn.a(paramjm.c(), null);
/*     */         } else {
/* 673 */           this.b.bn.a(paramjm.c(), localadd);
/*     */         }
/* 675 */         this.b.bn.a(this.b, true);
/* 676 */       } else if ((i1 != 0) && (i3 != 0) && (i4 != 0) && 
/* 677 */         (this.m < 200)) {
/* 678 */         this.m += 20;
/*     */         
/* 680 */         xk localxk = this.b.a(localadd, true);
/* 681 */         if (localxk != null) {
/* 682 */           localxk.e();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(iv paramiv)
/*     */   {
/* 691 */     Short localShort = (Short)this.n.a(this.b.bo.d);
/* 692 */     if ((localShort != null) && (paramiv.d() == localShort.shortValue()) && (this.b.bo.d == paramiv.c()) && (!this.b.bo.c(this.b))) {
/* 693 */       this.b.bo.a(this.b, true);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jn paramjn)
/*     */   {
/* 699 */     this.b.v();
/* 700 */     mt localmt = this.d.a(this.b.ap);
/* 701 */     if (localmt.d(paramjn.c(), paramjn.d(), paramjn.e())) {
/* 702 */       aor localaor = localmt.o(paramjn.c(), paramjn.d(), paramjn.e());
/*     */       
/* 704 */       if ((localaor instanceof apm)) {
/* 705 */         apm localapm1 = (apm)localaor;
/* 706 */         if ((!localapm1.a()) || (localapm1.b() != this.b)) {
/* 707 */           this.d.f("Player " + this.b.b_() + " just tried to change non-editable sign"); return;
/*     */         }
/*     */       }
/*     */       int i2;
/*     */       int i3;
/* 712 */       for (int i1 = 0; i1 < 4; i1++) {
/* 713 */         i2 = 1;
/* 714 */         if (paramjn.f()[i1].length() > 15) {
/* 715 */           i2 = 0;
/*     */         } else {
/* 717 */           for (i3 = 0; i3 < paramjn.f()[i1].length(); i3++) {
/* 718 */             if (!t.a(paramjn.f()[i1].charAt(i3))) {
/* 719 */               i2 = 0;
/*     */             }
/*     */           }
/*     */         }
/* 723 */         if (i2 == 0) {
/* 724 */           paramjn.f()[i1] = "!?";
/*     */         }
/*     */       }
/* 727 */       if ((localaor instanceof apm)) {
/* 728 */         i1 = paramjn.c();
/* 729 */         i2 = paramjn.d();
/* 730 */         i3 = paramjn.e();
/* 731 */         apm localapm2 = (apm)localaor;
/* 732 */         System.arraycopy(paramjn.f(), 0, localapm2.a, 0, 4);
/* 733 */         localapm2.e();
/* 734 */         localmt.g(i1, i2, i3);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(jc paramjc)
/*     */   {
/* 741 */     if (paramjc.c() == this.h) {
/* 742 */       int i1 = (int)(d() - this.i);
/* 743 */       this.b.h = ((this.b.h * 3 + i1) / 4);
/*     */     }
/*     */   }
/*     */   
/*     */   private long d() {
/* 748 */     return System.nanoTime() / 1000000L;
/*     */   }
/*     */   
/*     */   public void a(jh paramjh)
/*     */   {
/* 753 */     this.b.bE.b = ((paramjh.d()) && (this.b.bE.c));
/*     */   }
/*     */   
/*     */   public void a(iq paramiq)
/*     */   {
/* 758 */     ArrayList localArrayList = Lists.newArrayList();
/*     */     
/* 760 */     for (String str : this.d.a(this.b, paramiq.c())) {
/* 761 */       localArrayList.add(str);
/*     */     }
/*     */     
/* 764 */     this.b.a.a(new gi((String[])localArrayList.toArray(new String[localArrayList.size()])));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/* 769 */   public void a(iu paramiu) { this.b.a(paramiu); }
/*     */   
/*     */   public void a(iz paramiz) {
/*     */     Object localObject1;
/*     */     Object localObject3;
/* 774 */     if ("MC|BEdit".equals(paramiz.c())) {
/* 775 */       localObject1 = new et(Unpooled.wrappedBuffer(paramiz.e()));
/*     */       try {
/* 777 */         add localadd1 = ((et)localObject1).c();
/* 778 */         if (localadd1 == null) {
/*     */           return;
/*     */         }
/*     */         
/* 782 */         if (!ael.a(localadd1.q())) {
/* 783 */           throw new IOException("Invalid book tag!");
/*     */         }
/*     */         
/*     */ 
/* 787 */         localObject3 = this.b.bm.h();
/* 788 */         if (localObject3 == null) {
/*     */           return;
/*     */         }
/* 791 */         if ((localadd1.b() == ade.bA) && (localadd1.b() == ((add)localObject3).b())) {
/* 792 */           ((add)localObject3).a("pages", localadd1.q().c("pages", 8));
/*     */         }
/*     */       }
/*     */       catch (Exception localException3) {
/* 796 */         c.error("Couldn't handle book info", localException3);
/*     */       } finally {
/* 798 */         ((et)localObject1).release();
/*     */       }
/* 800 */     } else if ("MC|BSign".equals(paramiz.c())) {
/* 801 */       localObject1 = new et(Unpooled.wrappedBuffer(paramiz.e()));
/*     */       try {
/* 803 */         add localadd2 = ((et)localObject1).c();
/* 804 */         if (localadd2 == null) {
/*     */           return;
/*     */         }
/*     */         
/* 808 */         if (!aem.a(localadd2.q())) {
/* 809 */           throw new IOException("Invalid book tag!");
/*     */         }
/*     */         
/*     */ 
/* 813 */         localObject3 = this.b.bm.h();
/* 814 */         if (localObject3 == null) {
/*     */           return;
/*     */         }
/* 817 */         if ((localadd2.b() == ade.bB) && (((add)localObject3).b() == ade.bA)) {
/* 818 */           ((add)localObject3).a("author", new dx(this.b.b_()));
/* 819 */           ((add)localObject3).a("title", new dx(localadd2.q().j("title")));
/* 820 */           ((add)localObject3).a("pages", localadd2.q().c("pages", 8));
/* 821 */           ((add)localObject3).a(ade.bB);
/*     */         }
/*     */       }
/*     */       catch (Exception localException4) {
/* 825 */         c.error("Couldn't sign book", localException4);
/*     */       } finally {
/* 827 */         ((et)localObject1).release();
/*     */       } } else { int i1;
/* 829 */       if ("MC|TrSel".equals(paramiz.c())) {
/*     */         try {
/* 831 */           localObject1 = new DataInputStream(new ByteArrayInputStream(paramiz.e()));
/* 832 */           i1 = ((DataInputStream)localObject1).readInt();
/*     */           
/* 834 */           localObject3 = this.b.bo;
/* 835 */           if ((localObject3 instanceof aat)) {
/* 836 */             ((aat)localObject3).e(i1);
/*     */           }
/*     */         } catch (Exception localException1) {
/* 839 */           c.error("Couldn't select trade", localException1); } } else { Object localObject2;
/*     */         Object localObject5;
/* 841 */         if ("MC|AdvCdm".equals(paramiz.c())) {
/* 842 */           if (!this.d.ad()) {
/* 843 */             this.b.a(new fr("advMode.notEnabled", new Object[0]));
/* 844 */           } else if ((this.b.a(2, "")) && (this.b.bE.d)) {
/* 845 */             localObject2 = new et(Unpooled.wrappedBuffer(paramiz.e()));
/*     */             try {
/* 847 */               i1 = ((et)localObject2).readByte();
/* 848 */               localObject3 = null;
/*     */               
/* 850 */               if (i1 == 0) {
/* 851 */                 localObject5 = this.b.o.o(((et)localObject2).readInt(), ((et)localObject2).readInt(), ((et)localObject2).readInt());
/* 852 */                 if ((localObject5 instanceof aox)) {
/* 853 */                   localObject3 = ((aox)localObject5).a();
/*     */                 }
/* 855 */               } else if (i1 == 1) {
/* 856 */                 localObject5 = this.b.o.a(((et)localObject2).readInt());
/*     */                 
/* 858 */                 if ((localObject5 instanceof xn)) {
/* 859 */                   localObject3 = ((xn)localObject5).e();
/*     */                 }
/*     */               }
/*     */               
/* 863 */               localObject5 = ((et)localObject2).c(((et)localObject2).readableBytes());
/*     */               
/* 865 */               if (localObject3 != null) {
/* 866 */                 ((agp)localObject3).a((String)localObject5);
/* 867 */                 ((agp)localObject3).e();
/* 868 */                 this.b.a(new fr("advMode.setCommand.success", new Object[] { localObject5 }));
/*     */               }
/*     */             } catch (Exception localException5) {
/* 871 */               c.error("Couldn't set command block", localException5);
/*     */             } finally {
/* 873 */               ((et)localObject2).release();
/*     */             }
/*     */           } else {
/* 876 */             this.b.a(new fr("advMode.notAllowed", new Object[0]));
/*     */           }
/* 878 */         } else if ("MC|Beacon".equals(paramiz.c())) {
/* 879 */           if ((this.b.bo instanceof zx)) {
/*     */             try {
/* 881 */               localObject2 = new DataInputStream(new ByteArrayInputStream(paramiz.e()));
/* 882 */               int i2 = ((DataInputStream)localObject2).readInt();
/* 883 */               int i3 = ((DataInputStream)localObject2).readInt();
/*     */               
/* 885 */               localObject5 = (zx)this.b.bo;
/* 886 */               aay localaay = ((zx)localObject5).a(0);
/* 887 */               if (localaay.e()) {
/* 888 */                 localaay.a(1);
/* 889 */                 aoq localaoq = ((zx)localObject5).e();
/* 890 */                 localaoq.d(i2);
/* 891 */                 localaoq.e(i3);
/* 892 */                 localaoq.e();
/*     */               }
/*     */             } catch (Exception localException2) {
/* 895 */               c.error("Couldn't set beacon", localException2);
/*     */             }
/*     */           }
/* 898 */         } else if (("MC|ItemName".equals(paramiz.c())) && 
/* 899 */           ((this.b.bo instanceof zu))) {
/* 900 */           zu localzu = (zu)this.b.bo;
/*     */           
/* 902 */           if ((paramiz.e() == null) || (paramiz.e().length < 1)) {
/* 903 */             localzu.a("");
/*     */           } else {
/* 905 */             String str = t.a(new String(paramiz.e(), Charsets.UTF_8));
/* 906 */             if (str.length() <= 30) {
/* 907 */               localzu.a(str);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(eo parameo1, eo parameo2) {
/* 916 */     if (parameo2 != eo.b) {
/* 917 */       throw new IllegalStateException("Unexpected change in protocol!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */