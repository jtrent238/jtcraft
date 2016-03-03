/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.Gson;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.lang.reflect.ParameterizedType;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.input.Keyboard;
/*     */ import org.lwjgl.input.Mouse;
/*     */ import org.lwjgl.opengl.Display;
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
/*     */ public class bbj
/*     */ {
/*  30 */   private static final Logger aM = ;
/*  31 */   private static final Gson aN = new Gson();
/*  32 */   private static final ParameterizedType aO = new bbk();
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
/*     */ 
/*     */ 
/*     */ 
/* 216 */   private static final String[] aP = { "options.guiScale.auto", "options.guiScale.small", "options.guiScale.normal", "options.guiScale.large" };
/*     */   
/*     */ 
/* 219 */   private static final String[] aQ = { "options.particles.all", "options.particles.decreased", "options.particles.minimal" };
/*     */   
/*     */ 
/* 222 */   private static final String[] aR = { "options.ao.off", "options.ao.min", "options.ao.max" };
/*     */   
/*     */ 
/* 225 */   private static final String[] aS = { "options.stream.compression.low", "options.stream.compression.medium", "options.stream.compression.high" };
/*     */   
/*     */ 
/* 228 */   private static final String[] aT = { "options.stream.chat.enabled.streaming", "options.stream.chat.enabled.always", "options.stream.chat.enabled.never" };
/*     */   
/*     */ 
/* 231 */   private static final String[] aU = { "options.stream.chat.userFilter.all", "options.stream.chat.userFilter.subs", "options.stream.chat.userFilter.mods" };
/*     */   
/*     */ 
/* 234 */   private static final String[] aV = { "options.stream.mic_toggle.mute", "options.stream.mic_toggle.talk" };
/*     */   
/*     */ 
/*     */ 
/* 238 */   public float a = 0.5F;
/*     */   public boolean b;
/* 240 */   public int c = -1;
/* 241 */   public boolean d = true;
/*     */   public boolean e;
/*     */   public boolean f;
/* 244 */   public boolean g = true;
/* 245 */   public int h = 120;
/* 246 */   public boolean i = true;
/* 247 */   public int j = 2;
/* 248 */   public boolean k = true;
/* 249 */   public List l = new ArrayList();
/* 250 */   public zb m = zb.a;
/* 251 */   public boolean n = true;
/* 252 */   public boolean o = true;
/* 253 */   public boolean p = true;
/* 254 */   public float q = 1.0F;
/* 255 */   public boolean r = true;
/*     */   public boolean s;
/* 257 */   public boolean t = true;
/*     */   public boolean u;
/*     */   public boolean v;
/* 260 */   public boolean w = true;
/* 261 */   public boolean x = true;
/*     */   public boolean y;
/*     */   public int z;
/*     */   public int A;
/* 265 */   public boolean B = true;
/* 266 */   public float C = 1.0F;
/* 267 */   public float D = 1.0F;
/* 268 */   public float E = 0.44366196F;
/* 269 */   public float F = 1.0F;
/* 270 */   public boolean G = true;
/* 271 */   public int H = 4;
/* 272 */   public int I = 1;
/* 273 */   private Map aW = Maps.newEnumMap(w.class);
/* 274 */   public float J = 0.5F;
/* 275 */   public float K = 1.0F;
/* 276 */   public float L = 1.0F;
/* 277 */   public float M = 0.5412844F;
/* 278 */   public float N = 0.31690142F;
/* 279 */   public int O = 1;
/* 280 */   public boolean P = true;
/* 281 */   public String Q = "";
/* 282 */   public int R = 0;
/* 283 */   public int S = 0;
/* 284 */   public int T = 0;
/*     */   
/* 286 */   public bal U = new bal("key.forward", 17, "key.categories.movement");
/* 287 */   public bal V = new bal("key.left", 30, "key.categories.movement");
/* 288 */   public bal W = new bal("key.back", 31, "key.categories.movement");
/* 289 */   public bal X = new bal("key.right", 32, "key.categories.movement");
/* 290 */   public bal Y = new bal("key.jump", 57, "key.categories.movement");
/* 291 */   public bal Z = new bal("key.sneak", 42, "key.categories.movement");
/*     */   
/* 293 */   public bal aa = new bal("key.inventory", 18, "key.categories.inventory");
/* 294 */   public bal ab = new bal("key.use", -99, "key.categories.gameplay");
/* 295 */   public bal ac = new bal("key.drop", 16, "key.categories.gameplay");
/* 296 */   public bal ad = new bal("key.attack", -100, "key.categories.gameplay");
/* 297 */   public bal ae = new bal("key.pickItem", -98, "key.categories.gameplay");
/* 298 */   public bal af = new bal("key.sprint", 29, "key.categories.gameplay");
/*     */   
/* 300 */   public bal ag = new bal("key.chat", 20, "key.categories.multiplayer");
/* 301 */   public bal ah = new bal("key.playerlist", 15, "key.categories.multiplayer");
/* 302 */   public bal ai = new bal("key.command", 53, "key.categories.multiplayer");
/*     */   
/* 304 */   public bal aj = new bal("key.screenshot", 60, "key.categories.misc");
/* 305 */   public bal ak = new bal("key.togglePerspective", 63, "key.categories.misc");
/* 306 */   public bal al = new bal("key.smoothCamera", 0, "key.categories.misc");
/* 307 */   public bal am = new bal("key.fullscreen", 87, "key.categories.misc");
/*     */   
/* 309 */   public bal an = new bal("key.streamStartStop", 64, "key.categories.stream");
/* 310 */   public bal ao = new bal("key.streamPauseUnpause", 65, "key.categories.stream");
/* 311 */   public bal ap = new bal("key.streamCommercial", 0, "key.categories.stream");
/* 312 */   public bal aq = new bal("key.streamToggleMic", 0, "key.categories.stream");
/*     */   
/* 314 */   public bal[] ar = { new bal("key.hotbar.1", 2, "key.categories.inventory"), new bal("key.hotbar.2", 3, "key.categories.inventory"), new bal("key.hotbar.3", 4, "key.categories.inventory"), new bal("key.hotbar.4", 5, "key.categories.inventory"), new bal("key.hotbar.5", 6, "key.categories.inventory"), new bal("key.hotbar.6", 7, "key.categories.inventory"), new bal("key.hotbar.7", 8, "key.categories.inventory"), new bal("key.hotbar.8", 9, "key.categories.inventory"), new bal("key.hotbar.9", 10, "key.categories.inventory") };
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
/* 326 */   public bal[] as = (bal[])ArrayUtils.addAll(new bal[] { this.ad, this.ab, this.U, this.V, this.W, this.X, this.Y, this.Z, this.ac, this.aa, this.ag, this.ah, this.ae, this.ai, this.aj, this.ak, this.al, this.af, this.an, this.ao, this.ap, this.aq, this.am }, this.ar);
/*     */   
/*     */ 
/*     */ 
/*     */   protected bao at;
/*     */   
/*     */ 
/*     */ 
/*     */   private File aX;
/*     */   
/*     */ 
/*     */ 
/* 338 */   public rd au = rd.c;
/*     */   public boolean av;
/*     */   public int aw;
/*     */   public boolean ax;
/*     */   public boolean ay;
/* 343 */   public String az = "";
/*     */   
/*     */   public boolean aA;
/*     */   public boolean aB;
/*     */   public boolean aC;
/* 348 */   public float aD = 1.0F;
/* 349 */   public float aE = 1.0F;
/* 350 */   public float aF = 70.0F;
/*     */   public float aG;
/*     */   public float aH;
/*     */   public int aI;
/*     */   public int aJ;
/* 355 */   public String aK = "en_US";
/* 356 */   public boolean aL = false;
/*     */   
/*     */   public bbj(bao parambao, File paramFile) {
/* 359 */     this.at = parambao;
/* 360 */     this.aX = new File(paramFile, "options.txt");
/*     */     
/* 362 */     bbm.f.a(16.0F);
/* 363 */     this.c = (parambao.U() ? 12 : 8);
/*     */     
/* 365 */     a();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bbj() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static String c(int paramInt)
/*     */   {
/* 381 */     if (paramInt < 0) {
/* 382 */       return brp.a("key.mouseButton", new Object[] { Integer.valueOf(paramInt + 101) });
/*     */     }
/* 384 */     return Keyboard.getKeyName(paramInt);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static boolean a(bal parambal)
/*     */   {
/* 395 */     if (parambal.i() == 0) return false;
/* 396 */     if (parambal.i() < 0) {
/* 397 */       return Mouse.isButtonDown(parambal.i() + 100);
/*     */     }
/* 399 */     return Keyboard.isKeyDown(parambal.i());
/*     */   }
/*     */   
/*     */   public void a(bal parambal, int paramInt)
/*     */   {
/* 404 */     parambal.b(paramInt);
/* 405 */     b();
/*     */   }
/*     */   
/*     */   public void a(bbm parambbm, float paramFloat) {
/* 409 */     if (parambbm == bbm.b) {
/* 410 */       this.a = paramFloat;
/*     */     }
/* 412 */     if (parambbm == bbm.c) {
/* 413 */       this.aF = paramFloat;
/*     */     }
/* 415 */     if (parambbm == bbm.d) {
/* 416 */       this.aG = paramFloat;
/*     */     }
/* 418 */     if (parambbm == bbm.j) {
/* 419 */       this.h = ((int)paramFloat);
/*     */     }
/* 421 */     if (parambbm == bbm.u) {
/* 422 */       this.q = paramFloat;
/* 423 */       this.at.r.b().b();
/*     */     }
/* 425 */     if (parambbm == bbm.D) {
/* 426 */       this.F = paramFloat;
/* 427 */       this.at.r.b().b();
/*     */     }
/* 429 */     if (parambbm == bbm.E) {
/* 430 */       this.E = paramFloat;
/* 431 */       this.at.r.b().b();
/*     */     }
/* 433 */     if (parambbm == bbm.C) {
/* 434 */       this.D = paramFloat;
/* 435 */       this.at.r.b().b();
/*     */     }
/* 437 */     if (parambbm == bbm.B) {
/* 438 */       this.C = paramFloat;
/* 439 */       this.at.r.b().b(); }
/*     */     int i1;
/* 441 */     if (parambbm == bbm.G) {
/* 442 */       i1 = this.I;
/* 443 */       this.I = ((int)paramFloat);
/* 444 */       if (i1 != paramFloat) {
/* 445 */         this.at.T().b(this.I);
/* 446 */         this.at.C();
/*     */       }
/*     */     }
/* 449 */     if (parambbm == bbm.F) {
/* 450 */       i1 = this.H;
/* 451 */       this.H = ((int)paramFloat);
/* 452 */       if (i1 != paramFloat) {
/* 453 */         this.at.T().a(this.H);
/* 454 */         this.at.C();
/*     */       }
/*     */     }
/* 457 */     if (parambbm == bbm.f) {
/* 458 */       this.c = ((int)paramFloat);
/*     */     }
/* 460 */     if (parambbm == bbm.I) {
/* 461 */       this.J = paramFloat;
/*     */     }
/* 463 */     if (parambbm == bbm.J) {
/* 464 */       this.K = paramFloat;
/* 465 */       this.at.Z().s();
/*     */     }
/* 467 */     if (parambbm == bbm.K) {
/* 468 */       this.L = paramFloat;
/* 469 */       this.at.Z().s();
/*     */     }
/* 471 */     if (parambbm == bbm.L) {
/* 472 */       this.M = paramFloat;
/*     */     }
/* 474 */     if (parambbm == bbm.M) {
/* 475 */       this.N = paramFloat;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bbm parambbm, int paramInt) {
/* 480 */     if (parambbm == bbm.a) this.b = (!this.b);
/* 481 */     if (parambbm == bbm.o) this.aI = (this.aI + paramInt & 0x3);
/* 482 */     if (parambbm == bbm.q) this.aJ = ((this.aJ + paramInt) % 3);
/* 483 */     if (parambbm == bbm.g) this.d = (!this.d);
/* 484 */     if (parambbm == bbm.p) this.k = (!this.k);
/* 485 */     if (parambbm == bbm.H) {
/* 486 */       this.aL = (!this.aL);
/* 487 */       this.at.l.a((this.at.S().a()) || (this.aL));
/*     */     }
/* 489 */     if (parambbm == bbm.i) {
/* 490 */       this.f = (!this.f);
/* 491 */       this.at.g.a();
/*     */     }
/* 493 */     if (parambbm == bbm.k) {
/* 494 */       this.g = (!this.g);
/*     */     }
/* 496 */     if (parambbm == bbm.h) {
/* 497 */       this.e = (!this.e);
/* 498 */       this.at.c();
/*     */     }
/* 500 */     if (parambbm == bbm.l) this.au = rd.a(this.au.a() + paramInt & 0x3);
/* 501 */     if (parambbm == bbm.m) {
/* 502 */       this.i = (!this.i);
/* 503 */       this.at.g.a();
/*     */     }
/* 505 */     if (parambbm == bbm.n) {
/* 506 */       this.j = ((this.j + paramInt) % 3);
/* 507 */       this.at.g.a();
/*     */     }
/* 509 */     if (parambbm == bbm.r) this.m = zb.a((this.m.a() + paramInt) % 3);
/* 510 */     if (parambbm == bbm.N) this.O = ((this.O + paramInt) % 3);
/* 511 */     if (parambbm == bbm.O) this.P = (!this.P);
/* 512 */     if (parambbm == bbm.P) this.R = ((this.R + paramInt) % 3);
/* 513 */     if (parambbm == bbm.Q) this.S = ((this.S + paramInt) % 3);
/* 514 */     if (parambbm == bbm.R) this.T = ((this.T + paramInt) % 2);
/* 515 */     if (parambbm == bbm.s) this.n = (!this.n);
/* 516 */     if (parambbm == bbm.t) this.o = (!this.o);
/* 517 */     if (parambbm == bbm.v) this.p = (!this.p);
/* 518 */     if (parambbm == bbm.w) this.r = (!this.r);
/* 519 */     if (parambbm == bbm.z) this.x = (!this.x);
/* 520 */     if (parambbm == bbm.A) this.y = (!this.y);
/* 521 */     if (parambbm == bbm.x) {
/* 522 */       this.s = (!this.s);
/* 523 */       if (this.at.L() != this.s) this.at.o();
/*     */     }
/* 525 */     if (parambbm == bbm.y) {
/* 526 */       this.t = (!this.t);
/* 527 */       Display.setVSyncEnabled(this.t);
/*     */     }
/* 529 */     b();
/*     */   }
/*     */   
/*     */   public float a(bbm parambbm) {
/* 533 */     if (parambbm == bbm.c) return this.aF;
/* 534 */     if (parambbm == bbm.d) return this.aG;
/* 535 */     if (parambbm == bbm.e) return this.aH;
/* 536 */     if (parambbm == bbm.b) return this.a;
/* 537 */     if (parambbm == bbm.u) return this.q;
/* 538 */     if (parambbm == bbm.D) return this.F;
/* 539 */     if (parambbm == bbm.E) return this.E;
/* 540 */     if (parambbm == bbm.B) return this.C;
/* 541 */     if (parambbm == bbm.C) return this.D;
/* 542 */     if (parambbm == bbm.j) return this.h;
/* 543 */     if (parambbm == bbm.G) return this.I;
/* 544 */     if (parambbm == bbm.F) return this.H;
/* 545 */     if (parambbm == bbm.f) return this.c;
/* 546 */     if (parambbm == bbm.I) return this.J;
/* 547 */     if (parambbm == bbm.J) return this.K;
/* 548 */     if (parambbm == bbm.K) return this.L;
/* 549 */     if (parambbm == bbm.L) return this.M;
/* 550 */     if (parambbm == bbm.M) return this.N;
/* 551 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public boolean b(bbm parambbm) {
/* 555 */     switch (bbl.a[parambbm.ordinal()]) {
/*     */     case 1: 
/* 557 */       return this.b;
/*     */     case 2: 
/* 559 */       return this.d;
/*     */     case 3: 
/* 561 */       return this.e;
/*     */     case 4: 
/* 563 */       return this.f;
/*     */     case 5: 
/* 565 */       return this.g;
/*     */     case 6: 
/* 567 */       return this.k;
/*     */     case 7: 
/* 569 */       return this.n;
/*     */     case 8: 
/* 571 */       return this.o;
/*     */     case 9: 
/* 573 */       return this.p;
/*     */     case 10: 
/* 575 */       return this.r;
/*     */     case 11: 
/* 577 */       return this.s;
/*     */     case 12: 
/* 579 */       return this.t;
/*     */     case 13: 
/* 581 */       return this.x;
/*     */     case 14: 
/* 583 */       return this.y;
/*     */     case 15: 
/* 585 */       return this.P;
/*     */     case 16: 
/* 587 */       return this.aL;
/*     */     }
/* 589 */     return false;
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
/*     */   private static String a(String[] paramArrayOfString, int paramInt)
/*     */   {
/* 603 */     if ((paramInt < 0) || (paramInt >= paramArrayOfString.length)) {
/* 604 */       paramInt = 0;
/*     */     }
/*     */     
/* 607 */     return brp.a(paramArrayOfString[paramInt], new Object[0]);
/*     */   }
/*     */   
/*     */   public String c(bbm parambbm) {
/* 611 */     String str1 = brp.a(parambbm.d(), new Object[0]) + ": ";
/*     */     
/* 613 */     if (parambbm.a()) {
/* 614 */       float f1 = a(parambbm);
/* 615 */       float f2 = parambbm.c(f1);
/*     */       
/* 617 */       if (parambbm == bbm.b) {
/* 618 */         if (f2 == 0.0F) {
/* 619 */           return str1 + brp.a("options.sensitivity.min", new Object[0]);
/*     */         }
/* 621 */         if (f2 == 1.0F) {
/* 622 */           return str1 + brp.a("options.sensitivity.max", new Object[0]);
/*     */         }
/* 624 */         return str1 + (int)(f2 * 200.0F) + "%"; }
/* 625 */       if (parambbm == bbm.c) {
/* 626 */         if (f1 == 70.0F) {
/* 627 */           return str1 + brp.a("options.fov.min", new Object[0]);
/*     */         }
/* 629 */         if (f1 == 110.0F) {
/* 630 */           return str1 + brp.a("options.fov.max", new Object[0]);
/*     */         }
/* 632 */         return str1 + (int)f1; }
/* 633 */       if (parambbm == bbm.j) {
/* 634 */         if (f1 == bbm.a(parambbm)) {
/* 635 */           return str1 + brp.a("options.framerateLimit.max", new Object[0]);
/*     */         }
/* 637 */         return str1 + (int)f1 + " fps";
/*     */       }
/* 639 */       if (parambbm == bbm.d) {
/* 640 */         if (f2 == 0.0F) {
/* 641 */           return str1 + brp.a("options.gamma.min", new Object[0]);
/*     */         }
/* 643 */         if (f2 == 1.0F) {
/* 644 */           return str1 + brp.a("options.gamma.max", new Object[0]);
/*     */         }
/* 646 */         return str1 + "+" + (int)(f2 * 100.0F) + "%"; }
/* 647 */       if (parambbm == bbm.e)
/* 648 */         return str1 + (int)(f2 * 400.0F) + "%";
/* 649 */       if (parambbm == bbm.u)
/* 650 */         return str1 + (int)(f2 * 90.0F + 10.0F) + "%";
/* 651 */       if (parambbm == bbm.E)
/* 652 */         return str1 + bcc.b(f2) + "px";
/* 653 */       if (parambbm == bbm.D)
/* 654 */         return str1 + bcc.b(f2) + "px";
/* 655 */       if (parambbm == bbm.C)
/* 656 */         return str1 + bcc.a(f2) + "px";
/* 657 */       if (parambbm == bbm.f)
/* 658 */         return str1 + (int)f1 + " chunks";
/* 659 */       if (parambbm == bbm.G) {
/* 660 */         if (f1 == 1.0F) {
/* 661 */           return str1 + brp.a("options.off", new Object[0]);
/*     */         }
/* 663 */         return str1 + (int)f1; }
/* 664 */       if (parambbm == bbm.F) {
/* 665 */         if (f1 == 0.0F) {
/* 666 */           return str1 + brp.a("options.off", new Object[0]);
/*     */         }
/* 668 */         return str1 + (int)f1; }
/* 669 */       if (parambbm == bbm.M)
/* 670 */         return str1 + buo.a(f2) + " fps";
/* 671 */       if (parambbm == bbm.L)
/* 672 */         return str1 + buo.b(f2) + " Kbps";
/* 673 */       if (parambbm == bbm.I) {
/* 674 */         return str1 + String.format("%.3f bpp", new Object[] { Float.valueOf(buo.c(f2)) });
/*     */       }
/* 676 */       if (f2 == 0.0F) {
/* 677 */         return str1 + brp.a("options.off", new Object[0]);
/*     */       }
/* 679 */       return str1 + (int)(f2 * 100.0F) + "%";
/*     */     }
/* 681 */     if (parambbm.b()) {
/* 682 */       boolean bool = b(parambbm);
/* 683 */       if (bool) {
/* 684 */         return str1 + brp.a("options.on", new Object[0]);
/*     */       }
/* 686 */       return str1 + brp.a("options.off", new Object[0]); }
/* 687 */     if (parambbm == bbm.l)
/* 688 */       return str1 + brp.a(this.au.b(), new Object[0]);
/* 689 */     if (parambbm == bbm.o)
/* 690 */       return str1 + a(aP, this.aI);
/* 691 */     if (parambbm == bbm.r)
/* 692 */       return str1 + brp.a(this.m.b(), new Object[0]);
/* 693 */     if (parambbm == bbm.q)
/* 694 */       return str1 + a(aQ, this.aJ);
/* 695 */     if (parambbm == bbm.n)
/* 696 */       return str1 + a(aR, this.j);
/* 697 */     if (parambbm == bbm.N)
/* 698 */       return str1 + a(aS, this.O);
/* 699 */     if (parambbm == bbm.P)
/* 700 */       return str1 + a(aT, this.R);
/* 701 */     if (parambbm == bbm.Q)
/* 702 */       return str1 + a(aU, this.S);
/* 703 */     if (parambbm == bbm.R)
/* 704 */       return str1 + a(aV, this.T);
/* 705 */     if (parambbm == bbm.m) {
/* 706 */       if (this.i) {
/* 707 */         return str1 + brp.a("options.graphics.fancy", new Object[0]);
/*     */       }
/* 709 */       String str2 = "options.graphics.fast";
/* 710 */       return str1 + brp.a("options.graphics.fast", new Object[0]);
/*     */     }
/*     */     
/* 713 */     return str1;
/*     */   }
/*     */   
/*     */   public void a()
/*     */   {
/*     */     try {
/* 719 */       if (!this.aX.exists()) return;
/* 720 */       BufferedReader localBufferedReader = new BufferedReader(new FileReader(this.aX));
/* 721 */       String str = "";
/* 722 */       this.aW.clear();
/* 723 */       while ((str = localBufferedReader.readLine()) != null) {
/*     */         try {
/* 725 */           String[] arrayOfString = str.split(":");
/* 726 */           if (arrayOfString[0].equals("mouseSensitivity")) this.a = a(arrayOfString[1]);
/* 727 */           if (arrayOfString[0].equals("invertYMouse")) this.b = arrayOfString[1].equals("true");
/* 728 */           if (arrayOfString[0].equals("fov")) this.aF = a(arrayOfString[1]);
/* 729 */           if (arrayOfString[0].equals("gamma")) this.aG = a(arrayOfString[1]);
/* 730 */           if (arrayOfString[0].equals("saturation")) this.aH = a(arrayOfString[1]);
/* 731 */           if (arrayOfString[0].equals("fov")) this.aF = (a(arrayOfString[1]) * 40.0F + 70.0F);
/* 732 */           if (arrayOfString[0].equals("renderDistance")) this.c = Integer.parseInt(arrayOfString[1]);
/* 733 */           if (arrayOfString[0].equals("guiScale")) this.aI = Integer.parseInt(arrayOfString[1]);
/* 734 */           if (arrayOfString[0].equals("particles")) this.aJ = Integer.parseInt(arrayOfString[1]);
/* 735 */           if (arrayOfString[0].equals("bobView")) this.d = arrayOfString[1].equals("true");
/* 736 */           if (arrayOfString[0].equals("anaglyph3d")) this.e = arrayOfString[1].equals("true");
/* 737 */           if (arrayOfString[0].equals("advancedOpengl")) this.f = arrayOfString[1].equals("true");
/* 738 */           if (arrayOfString[0].equals("maxFps")) this.h = Integer.parseInt(arrayOfString[1]);
/* 739 */           if (arrayOfString[0].equals("fboEnable")) this.g = arrayOfString[1].equals("true");
/* 740 */           if (arrayOfString[0].equals("difficulty")) this.au = rd.a(Integer.parseInt(arrayOfString[1]));
/* 741 */           if (arrayOfString[0].equals("fancyGraphics")) this.i = arrayOfString[1].equals("true");
/* 742 */           if (arrayOfString[0].equals("ao")) {
/* 743 */             if (arrayOfString[1].equals("true")) {
/* 744 */               this.j = 2;
/* 745 */             } else if (arrayOfString[1].equals("false")) {
/* 746 */               this.j = 0;
/*     */             } else {
/* 748 */               this.j = Integer.parseInt(arrayOfString[1]);
/*     */             }
/*     */           }
/* 751 */           if (arrayOfString[0].equals("clouds")) this.k = arrayOfString[1].equals("true");
/* 752 */           if (arrayOfString[0].equals("resourcePacks")) {
/* 753 */             this.l = ((List)aN.fromJson(str.substring(str.indexOf(':') + 1), aO));
/* 754 */             if (this.l == null) this.l = new ArrayList();
/*     */           }
/* 756 */           if ((arrayOfString[0].equals("lastServer")) && (arrayOfString.length >= 2)) this.az = str.substring(str.indexOf(':') + 1);
/* 757 */           if ((arrayOfString[0].equals("lang")) && (arrayOfString.length >= 2)) this.aK = arrayOfString[1];
/* 758 */           if (arrayOfString[0].equals("chatVisibility")) this.m = zb.a(Integer.parseInt(arrayOfString[1]));
/* 759 */           if (arrayOfString[0].equals("chatColors")) this.n = arrayOfString[1].equals("true");
/* 760 */           if (arrayOfString[0].equals("chatLinks")) this.o = arrayOfString[1].equals("true");
/* 761 */           if (arrayOfString[0].equals("chatLinksPrompt")) this.p = arrayOfString[1].equals("true");
/* 762 */           if (arrayOfString[0].equals("chatOpacity")) this.q = a(arrayOfString[1]);
/* 763 */           if (arrayOfString[0].equals("snooperEnabled")) this.r = arrayOfString[1].equals("true");
/* 764 */           if (arrayOfString[0].equals("fullscreen")) this.s = arrayOfString[1].equals("true");
/* 765 */           if (arrayOfString[0].equals("enableVsync")) this.t = arrayOfString[1].equals("true");
/* 766 */           if (arrayOfString[0].equals("hideServerAddress")) this.u = arrayOfString[1].equals("true");
/* 767 */           if (arrayOfString[0].equals("advancedItemTooltips")) this.v = arrayOfString[1].equals("true");
/* 768 */           if (arrayOfString[0].equals("pauseOnLostFocus")) this.w = arrayOfString[1].equals("true");
/* 769 */           if (arrayOfString[0].equals("showCape")) this.x = arrayOfString[1].equals("true");
/* 770 */           if (arrayOfString[0].equals("touchscreen")) this.y = arrayOfString[1].equals("true");
/* 771 */           if (arrayOfString[0].equals("overrideHeight")) this.A = Integer.parseInt(arrayOfString[1]);
/* 772 */           if (arrayOfString[0].equals("overrideWidth")) this.z = Integer.parseInt(arrayOfString[1]);
/* 773 */           if (arrayOfString[0].equals("heldItemTooltips")) this.B = arrayOfString[1].equals("true");
/* 774 */           if (arrayOfString[0].equals("chatHeightFocused")) this.F = a(arrayOfString[1]);
/* 775 */           if (arrayOfString[0].equals("chatHeightUnfocused")) this.E = a(arrayOfString[1]);
/* 776 */           if (arrayOfString[0].equals("chatScale")) this.C = a(arrayOfString[1]);
/* 777 */           if (arrayOfString[0].equals("chatWidth")) this.D = a(arrayOfString[1]);
/* 778 */           if (arrayOfString[0].equals("showInventoryAchievementHint")) this.G = arrayOfString[1].equals("true");
/* 779 */           if (arrayOfString[0].equals("mipmapLevels")) this.H = Integer.parseInt(arrayOfString[1]);
/* 780 */           if (arrayOfString[0].equals("anisotropicFiltering")) this.I = Integer.parseInt(arrayOfString[1]);
/* 781 */           if (arrayOfString[0].equals("streamBytesPerPixel")) this.J = a(arrayOfString[1]);
/* 782 */           if (arrayOfString[0].equals("streamMicVolume")) this.K = a(arrayOfString[1]);
/* 783 */           if (arrayOfString[0].equals("streamSystemVolume")) this.L = a(arrayOfString[1]);
/* 784 */           if (arrayOfString[0].equals("streamKbps")) this.M = a(arrayOfString[1]);
/* 785 */           if (arrayOfString[0].equals("streamFps")) this.N = a(arrayOfString[1]);
/* 786 */           if (arrayOfString[0].equals("streamCompression")) this.O = Integer.parseInt(arrayOfString[1]);
/* 787 */           if (arrayOfString[0].equals("streamSendMetadata")) this.P = arrayOfString[1].equals("true");
/* 788 */           if ((arrayOfString[0].equals("streamPreferredServer")) && (arrayOfString.length >= 2)) this.Q = str.substring(str.indexOf(':') + 1);
/* 789 */           if (arrayOfString[0].equals("streamChatEnabled")) this.R = Integer.parseInt(arrayOfString[1]);
/* 790 */           if (arrayOfString[0].equals("streamChatUserFilter")) this.S = Integer.parseInt(arrayOfString[1]);
/* 791 */           if (arrayOfString[0].equals("streamMicToggleBehavior")) this.T = Integer.parseInt(arrayOfString[1]);
/* 792 */           if (arrayOfString[0].equals("forceUnicodeFont")) this.aL = arrayOfString[1].equals("true");
/*     */           Object localObject2;
/* 794 */           for (localObject2 : this.as) {
/* 795 */             if (arrayOfString[0].equals("key_" + ((bal)localObject2).g())) {
/* 796 */               ((bal)localObject2).b(Integer.parseInt(arrayOfString[1]));
/*     */             }
/*     */           }
/*     */           
/* 800 */           for (localObject2 : w.values()) {
/* 801 */             if (arrayOfString[0].equals("soundCategory_" + ((w)localObject2).a())) {
/* 802 */               this.aW.put(localObject2, Float.valueOf(a(arrayOfString[1])));
/*     */             }
/*     */           }
/*     */         } catch (Exception localException2) {
/* 806 */           aM.warn("Skipping bad option: " + str);
/*     */         }
/*     */       }
/* 809 */       bal.b();
/* 810 */       localBufferedReader.close();
/*     */     } catch (Exception localException1) {
/* 812 */       aM.error("Failed to load options", localException1);
/*     */     }
/*     */   }
/*     */   
/*     */   private float a(String paramString) {
/* 817 */     if (paramString.equals("true")) return 1.0F;
/* 818 */     if (paramString.equals("false")) return 0.0F;
/* 819 */     return Float.parseFloat(paramString);
/*     */   }
/*     */   
/*     */   public void b() {
/*     */     try {
/* 824 */       PrintWriter localPrintWriter = new PrintWriter(new FileWriter(this.aX));
/*     */       
/* 826 */       localPrintWriter.println("invertYMouse:" + this.b);
/* 827 */       localPrintWriter.println("mouseSensitivity:" + this.a);
/* 828 */       localPrintWriter.println("fov:" + (this.aF - 70.0F) / 40.0F);
/* 829 */       localPrintWriter.println("gamma:" + this.aG);
/* 830 */       localPrintWriter.println("saturation:" + this.aH);
/* 831 */       localPrintWriter.println("renderDistance:" + this.c);
/* 832 */       localPrintWriter.println("guiScale:" + this.aI);
/* 833 */       localPrintWriter.println("particles:" + this.aJ);
/* 834 */       localPrintWriter.println("bobView:" + this.d);
/* 835 */       localPrintWriter.println("anaglyph3d:" + this.e);
/* 836 */       localPrintWriter.println("advancedOpengl:" + this.f);
/* 837 */       localPrintWriter.println("maxFps:" + this.h);
/* 838 */       localPrintWriter.println("fboEnable:" + this.g);
/* 839 */       localPrintWriter.println("difficulty:" + this.au.a());
/* 840 */       localPrintWriter.println("fancyGraphics:" + this.i);
/* 841 */       localPrintWriter.println("ao:" + this.j);
/* 842 */       localPrintWriter.println("clouds:" + this.k);
/* 843 */       localPrintWriter.println("resourcePacks:" + aN.toJson(this.l));
/* 844 */       localPrintWriter.println("lastServer:" + this.az);
/* 845 */       localPrintWriter.println("lang:" + this.aK);
/* 846 */       localPrintWriter.println("chatVisibility:" + this.m.a());
/* 847 */       localPrintWriter.println("chatColors:" + this.n);
/* 848 */       localPrintWriter.println("chatLinks:" + this.o);
/* 849 */       localPrintWriter.println("chatLinksPrompt:" + this.p);
/* 850 */       localPrintWriter.println("chatOpacity:" + this.q);
/* 851 */       localPrintWriter.println("snooperEnabled:" + this.r);
/* 852 */       localPrintWriter.println("fullscreen:" + this.s);
/* 853 */       localPrintWriter.println("enableVsync:" + this.t);
/* 854 */       localPrintWriter.println("hideServerAddress:" + this.u);
/* 855 */       localPrintWriter.println("advancedItemTooltips:" + this.v);
/* 856 */       localPrintWriter.println("pauseOnLostFocus:" + this.w);
/* 857 */       localPrintWriter.println("showCape:" + this.x);
/* 858 */       localPrintWriter.println("touchscreen:" + this.y);
/* 859 */       localPrintWriter.println("overrideWidth:" + this.z);
/* 860 */       localPrintWriter.println("overrideHeight:" + this.A);
/* 861 */       localPrintWriter.println("heldItemTooltips:" + this.B);
/* 862 */       localPrintWriter.println("chatHeightFocused:" + this.F);
/* 863 */       localPrintWriter.println("chatHeightUnfocused:" + this.E);
/* 864 */       localPrintWriter.println("chatScale:" + this.C);
/* 865 */       localPrintWriter.println("chatWidth:" + this.D);
/* 866 */       localPrintWriter.println("showInventoryAchievementHint:" + this.G);
/* 867 */       localPrintWriter.println("mipmapLevels:" + this.H);
/* 868 */       localPrintWriter.println("anisotropicFiltering:" + this.I);
/* 869 */       localPrintWriter.println("streamBytesPerPixel:" + this.J);
/* 870 */       localPrintWriter.println("streamMicVolume:" + this.K);
/* 871 */       localPrintWriter.println("streamSystemVolume:" + this.L);
/* 872 */       localPrintWriter.println("streamKbps:" + this.M);
/* 873 */       localPrintWriter.println("streamFps:" + this.N);
/* 874 */       localPrintWriter.println("streamCompression:" + this.O);
/* 875 */       localPrintWriter.println("streamSendMetadata:" + this.P);
/* 876 */       localPrintWriter.println("streamPreferredServer:" + this.Q);
/* 877 */       localPrintWriter.println("streamChatEnabled:" + this.R);
/* 878 */       localPrintWriter.println("streamChatUserFilter:" + this.S);
/* 879 */       localPrintWriter.println("streamMicToggleBehavior:" + this.T);
/* 880 */       localPrintWriter.println("forceUnicodeFont:" + this.aL);
/*     */       w localw;
/* 882 */       for (localw : this.as) {
/* 883 */         localPrintWriter.println("key_" + localw.g() + ":" + localw.i());
/*     */       }
/*     */       
/* 886 */       for (localw : w.values()) {
/* 887 */         localPrintWriter.println("soundCategory_" + localw.a() + ":" + a(localw));
/*     */       }
/*     */       
/* 890 */       localPrintWriter.close();
/*     */     } catch (Exception localException) {
/* 892 */       aM.error("Failed to save options", localException);
/*     */     }
/*     */     
/* 895 */     c();
/*     */   }
/*     */   
/*     */   public float a(w paramw) {
/* 899 */     if (this.aW.containsKey(paramw)) {
/* 900 */       return ((Float)this.aW.get(paramw)).floatValue();
/*     */     }
/*     */     
/* 903 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public void a(w paramw, float paramFloat) {
/* 907 */     this.at.X().a(paramw, paramFloat);
/* 908 */     this.aW.put(paramw, Float.valueOf(paramFloat));
/*     */   }
/*     */   
/*     */   public void c() {
/* 912 */     if (this.at.h != null) {
/* 913 */       this.at.h.a.a(new iu(this.aK, this.c, this.m, this.n, this.au, this.x));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 918 */     return (this.c >= 4) && (this.k);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */