/*      */ package net.minecraft.server;
/*      */ 
/*      */ import ab;
/*      */ import ac;
/*      */ import ahb;
/*      */ import ahg;
/*      */ import ahj;
/*      */ import ahk;
/*      */ import ahm;
/*      */ import aqo;
/*      */ import ays;
/*      */ import azc;
/*      */ import aze;
/*      */ import b;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import com.mojang.authlib.GameProfileRepository;
/*      */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*      */ import fj;
/*      */ import io.netty.buffer.ByteBuf;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.net.Proxy;
/*      */ import java.security.KeyPair;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import java.util.UUID;
/*      */ import javax.imageio.ImageIO;
/*      */ import k;
/*      */ import kb;
/*      */ import lr;
/*      */ import mt;
/*      */ import mw;
/*      */ import nc;
/*      */ import ns;
/*      */ import oi;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import qh;
/*      */ import qi;
/*      */ import r;
/*      */ import rd;
/*      */ import ri;
/*      */ import s;
/*      */ import yz;
/*      */ 
/*      */ public abstract class MinecraftServer implements ac, Runnable, rk
/*      */ {
/*   49 */   private static final Logger i = ;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*   58 */   public static final File a = new File("usercache.json");
/*      */   
/*      */   private static MinecraftServer j;
/*      */   
/*      */   private final aze k;
/*      */   
/*   64 */   private final ri l = new ri("server", this, ar());
/*      */   
/*      */   private final File m;
/*   67 */   private final List n = new ArrayList();
/*      */   private final ab o;
/*   69 */   public final qi b = new qi();
/*      */   private final nc p;
/*   71 */   private final kb q = new kb();
/*   72 */   private final Random r = new Random();
/*      */   
/*      */ 
/*   75 */   private int t = -1;
/*      */   public mt[] c;
/*      */   private oi u;
/*   78 */   private boolean v = true;
/*      */   
/*      */   private boolean w;
/*      */   
/*      */   private int x;
/*      */   protected final Proxy d;
/*      */   public String e;
/*      */   public int f;
/*      */   private boolean y;
/*      */   private boolean z;
/*      */   private boolean A;
/*      */   private boolean B;
/*      */   private boolean C;
/*      */   private String D;
/*      */   private int E;
/*   93 */   private int F = 0;
/*   94 */   public final long[] g = new long[100];
/*      */   
/*      */   public long[][] h;
/*      */   private KeyPair G;
/*      */   private String H;
/*      */   private String I;
/*      */   private String J;
/*      */   private boolean K;
/*      */   private boolean L;
/*      */   private boolean M;
/*  104 */   private String N = "";
/*      */   private boolean O;
/*      */   private long P;
/*      */   private String Q;
/*      */   private boolean R;
/*      */   private boolean S;
/*      */   private final YggdrasilAuthenticationService T;
/*      */   private final com.mojang.authlib.minecraft.MinecraftSessionService U;
/*  112 */   private long V = 0L;
/*      */   private final GameProfileRepository W;
/*  114 */   private final ns X = new ns(this, a);
/*      */   
/*      */   public MinecraftServer(File paramFile, Proxy paramProxy) {
/*  117 */     j = this;
/*  118 */     this.d = paramProxy;
/*  119 */     this.m = paramFile;
/*  120 */     this.p = new nc(this);
/*  121 */     this.o = new bl();
/*  122 */     this.k = new ayn(paramFile);
/*  123 */     this.T = new YggdrasilAuthenticationService(paramProxy, UUID.randomUUID().toString());
/*  124 */     this.U = this.T.createMinecraftSessionService();
/*  125 */     this.W = this.T.createProfileRepository();
/*      */   }
/*      */   
/*      */   protected abstract boolean e();
/*      */   
/*      */   protected void a(String paramString) {
/*  131 */     if (S().b(paramString)) {
/*  132 */       i.info("Converting map!");
/*  133 */       b("menu.convertingLevel");
/*  134 */       S().a(paramString, new lh(this));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   protected synchronized void b(String paramString)
/*      */   {
/*  165 */     this.Q = paramString;
/*      */   }
/*      */   
/*      */   public synchronized String f() {
/*  169 */     return this.Q;
/*      */   }
/*      */   
/*      */   protected void a(String paramString1, String paramString2, long paramLong, ahm paramahm, String paramString3) {
/*  173 */     a(paramString1);
/*  174 */     b("menu.loadingLevel");
/*      */     
/*  176 */     this.c = new mt[3];
/*  177 */     this.h = new long[this.c.length][100];
/*      */     
/*  179 */     azc localazc = this.k.a(paramString1, true);
/*      */     
/*      */ 
/*  182 */     ays localays = localazc.d();
/*  183 */     ahj localahj; if (localays == null) {
/*  184 */       localahj = new ahj(paramLong, i(), h(), k(), paramahm);
/*  185 */       localahj.a(paramString3);
/*      */     } else {
/*  187 */       localahj = new ahj(localays);
/*      */     }
/*  189 */     if (this.L) {
/*  190 */       localahj.a();
/*      */     }
/*      */     
/*  193 */     for (int i1 = 0; i1 < this.c.length; i1++)
/*      */     {
/*  195 */       int i2 = 0;
/*  196 */       if (i1 == 1) i2 = -1;
/*  197 */       if (i1 == 2) { i2 = 1;
/*      */       }
/*  199 */       if (i1 == 0) {
/*  200 */         if (R()) {
/*  201 */           this.c[i1] = new mk(this, localazc, paramString2, i2, this.b);
/*      */         } else {
/*  203 */           this.c[i1] = new mt(this, localazc, paramString2, i2, localahj, this.b);
/*      */         }
/*      */       } else {
/*  206 */         this.c[i1] = new mm(this, localazc, paramString2, i2, localahj, this.c[0], this.b);
/*      */       }
/*      */       
/*  209 */       this.c[i1].a(new mp(this, this.c[i1]));
/*      */       
/*  211 */       if (!N()) {
/*  212 */         this.c[i1].N().a(i());
/*      */       }
/*      */       
/*  215 */       this.u.a(this.c);
/*      */     }
/*      */     
/*  218 */     a(j());
/*      */     
/*  220 */     g();
/*      */   }
/*      */   
/*      */   protected void g()
/*      */   {
/*  225 */     int i1 = 16;
/*  226 */     int i2 = 4;
/*      */     
/*  228 */     int i3 = 192;
/*  229 */     int i4 = 625;
/*  230 */     int i5 = 0;
/*      */     
/*  232 */     b("menu.generatingTerrain");
/*      */     
/*  234 */     int i6 = 0;
/*  235 */     i.info("Preparing start region for level " + i6);
/*  236 */     mt localmt = this.c[i6];
/*  237 */     r localr = localmt.K();
/*      */     
/*  239 */     long l1 = ar();
/*  240 */     for (int i7 = 65344; (i7 <= 192) && (q()); i7 += 16) {
/*  241 */       for (int i8 = 65344; (i8 <= 192) && (q()); i8 += 16)
/*      */       {
/*  243 */         long l2 = ar();
/*  244 */         if (l2 - l1 > 1000L) {
/*  245 */           a_("Preparing spawn area", i5 * 100 / 625);
/*  246 */           l1 = l2;
/*      */         }
/*  248 */         i5++;
/*      */         
/*  250 */         localmt.b.c(localr.a + i7 >> 4, localr.c + i8 >> 4);
/*      */       }
/*      */     }
/*      */     
/*  254 */     n();
/*      */   }
/*      */   
/*      */   public abstract boolean h();
/*      */   
/*      */   public abstract ahk i();
/*      */   
/*      */   public abstract rd j();
/*      */   
/*      */   public abstract boolean k();
/*      */   
/*      */   public abstract int l();
/*      */   
/*      */   public abstract boolean m();
/*      */   
/*      */   protected void a_(String paramString, int paramInt) {
/*  270 */     this.e = paramString;
/*  271 */     this.f = paramInt;
/*  272 */     i.info(paramString + ": " + paramInt + "%");
/*      */   }
/*      */   
/*      */   protected void n() {
/*  276 */     this.e = null;
/*  277 */     this.f = 0;
/*      */   }
/*      */   
/*      */   protected void a(boolean paramBoolean) {
/*  281 */     if (this.M) return;
/*  282 */     for (mt localmt : this.c) {
/*  283 */       if (localmt != null) {
/*  284 */         if (!paramBoolean)
/*  285 */           i.info("Saving chunks for level '" + localmt.N().k() + "'/" + localmt.t.l());
/*      */         try {
/*  287 */           localmt.a(true, null);
/*      */         } catch (ahg localahg) {
/*  289 */           i.warn(localahg.getMessage());
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void o() {
/*  296 */     if (this.M) return;
/*  297 */     i.info("Stopping server");
/*  298 */     if (ai() != null) {
/*  299 */       ai().b();
/*      */     }
/*  301 */     if (this.u != null) {
/*  302 */       i.info("Saving players");
/*  303 */       this.u.j();
/*  304 */       this.u.u();
/*      */     }
/*  306 */     if (this.c != null) {
/*  307 */       i.info("Saving worlds");
/*  308 */       a(false);
/*  309 */       for (int i1 = 0; i1 < this.c.length; i1++) {
/*  310 */         mt localmt = this.c[i1];
/*  311 */         localmt.n();
/*      */       }
/*      */     }
/*      */     
/*  315 */     if (this.l.d()) {
/*  316 */       this.l.e();
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean q()
/*      */   {
/*  329 */     return this.v;
/*      */   }
/*      */   
/*      */   public void r() {
/*  333 */     this.v = false;
/*      */   }
/*      */   
/*      */   public void run()
/*      */   {
/*      */     try {
/*  339 */       if (e()) {
/*  340 */         long l1 = ar();
/*  341 */         long l2 = 0L;
/*      */         
/*  343 */         this.q.a(new fq(this.D));
/*  344 */         this.q.a(new kf("1.7.10", 5));
/*      */         
/*  346 */         a(this.q);
/*      */         
/*  348 */         while (this.v) {
/*  349 */           long l3 = ar();
/*  350 */           long l4 = l3 - l1;
/*  351 */           if ((l4 > 2000L) && (l1 - this.P >= 15000L)) {
/*  352 */             i.warn("Can't keep up! Did the system time change, or is the server overloaded? Running {}ms behind, skipping {} tick(s)", new Object[] { Long.valueOf(l4), Long.valueOf(l4 / 50L) });
/*  353 */             l4 = 2000L;
/*  354 */             this.P = l1;
/*      */           }
/*  356 */           if (l4 < 0L) {
/*  357 */             i.warn("Time ran backwards! Did the system time change?");
/*  358 */             l4 = 0L;
/*      */           }
/*  360 */           l2 += l4;
/*  361 */           l1 = l3;
/*      */           
/*  363 */           if (this.c[0].e()) {
/*  364 */             u();
/*  365 */             l2 = 0L;
/*      */           } else {
/*  367 */             while (l2 > 50L) {
/*  368 */               l2 -= 50L;
/*  369 */               u();
/*      */             }
/*      */           }
/*      */           
/*  373 */           Thread.sleep(Math.max(1L, 50L - l2));
/*  374 */           this.O = true;
/*      */         }
/*      */       } else {
/*  377 */         a(null);
/*      */       }
/*      */     } catch (Throwable localThrowable2) {
/*  380 */       i.error("Encountered an unexpected exception", localThrowable2);
/*      */       
/*  382 */       b localb = null;
/*      */       
/*  384 */       if ((localThrowable2 instanceof s)) {
/*  385 */         localb = b(((s)localThrowable2).a());
/*      */       } else {
/*  387 */         localb = b(new b("Exception in server tick loop", localThrowable2));
/*      */       }
/*      */       
/*  390 */       File localFile = new File(new File(s(), "crash-reports"), "crash-" + new java.text.SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new java.util.Date()) + "-server.txt");
/*      */       
/*  392 */       if (localb.a(localFile)) {
/*  393 */         i.error("This crash report has been saved to: " + localFile.getAbsolutePath());
/*      */       } else {
/*  395 */         i.error("We were unable to save this crash report to disk.");
/*      */       }
/*      */       
/*  398 */       a(localb);
/*      */     } finally {
/*      */       try {
/*  401 */         o();
/*  402 */         this.w = true;
/*      */       } catch (Throwable localThrowable4) {
/*  404 */         i.error("Exception stopping the server", localThrowable4);
/*      */       } finally {
/*  406 */         t();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(kb paramkb) {
/*  412 */     File localFile = d("server-icon.png");
/*  413 */     if (localFile.isFile()) {
/*  414 */       ByteBuf localByteBuf1 = io.netty.buffer.Unpooled.buffer();
/*      */       try
/*      */       {
/*  417 */         BufferedImage localBufferedImage = ImageIO.read(localFile);
/*  418 */         org.apache.commons.lang3.Validate.validState(localBufferedImage.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
/*  419 */         org.apache.commons.lang3.Validate.validState(localBufferedImage.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
/*  420 */         ImageIO.write(localBufferedImage, "PNG", new io.netty.buffer.ByteBufOutputStream(localByteBuf1));
/*  421 */         ByteBuf localByteBuf2 = io.netty.handler.codec.base64.Base64.encode(localByteBuf1);
/*  422 */         paramkb.a("data:image/png;base64," + localByteBuf2.toString(com.google.common.base.Charsets.UTF_8));
/*      */       } catch (Exception localException) {
/*  424 */         i.error("Couldn't load server icon", localException);
/*      */       } finally {
/*  426 */         localByteBuf1.release();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected File s() {
/*  432 */     return new File(".");
/*      */   }
/*      */   
/*      */ 
/*      */   protected void a(b paramb) {}
/*      */   
/*      */   protected void t() {}
/*      */   
/*      */   public void u()
/*      */   {
/*  442 */     long l1 = System.nanoTime();
/*      */     
/*  444 */     this.x += 1;
/*      */     
/*  446 */     if (this.R) {
/*  447 */       this.R = false;
/*  448 */       this.b.a = true;
/*  449 */       this.b.a();
/*      */     }
/*      */     
/*  452 */     this.b.a("root");
/*  453 */     v();
/*      */     
/*  455 */     if (l1 - this.V >= 5000000000L) {
/*  456 */       this.V = l1;
/*  457 */       this.q.a(new kc(D(), C()));
/*      */       
/*  459 */       GameProfile[] arrayOfGameProfile = new GameProfile[Math.min(C(), 12)];
/*  460 */       int i1 = qh.a(this.r, 0, C() - arrayOfGameProfile.length);
/*  461 */       for (int i2 = 0; i2 < arrayOfGameProfile.length; i2++) {
/*  462 */         arrayOfGameProfile[i2] = ((mw)this.u.e.get(i1 + i2)).bJ();
/*      */       }
/*  464 */       java.util.Collections.shuffle(java.util.Arrays.asList(arrayOfGameProfile));
/*  465 */       this.q.b().a(arrayOfGameProfile);
/*      */     }
/*      */     
/*  468 */     if (this.x % 900 == 0) {
/*  469 */       this.b.a("save");
/*  470 */       this.u.j();
/*  471 */       a(true);
/*  472 */       this.b.b();
/*      */     }
/*      */     
/*  475 */     this.b.a("tallying");
/*  476 */     this.g[(this.x % 100)] = (System.nanoTime() - l1);
/*      */     
/*  478 */     this.b.b();
/*      */     
/*  480 */     this.b.a("snooper");
/*  481 */     if ((!this.l.d()) && (this.x > 100)) {
/*  482 */       this.l.a();
/*      */     }
/*      */     
/*  485 */     if (this.x % 6000 == 0) {
/*  486 */       this.l.b();
/*      */     }
/*  488 */     this.b.b();
/*      */     
/*  490 */     this.b.b();
/*      */   }
/*      */   
/*      */   public void v() {
/*  494 */     this.b.a("levels");
/*      */     
/*  496 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/*  497 */       long l1 = System.nanoTime();
/*      */       
/*  499 */       if ((i1 == 0) || (w())) {
/*  500 */         mt localmt = this.c[i1];
/*  501 */         this.b.a(localmt.N().k());
/*      */         
/*  503 */         this.b.a("pools");
/*  504 */         this.b.b();
/*      */         
/*  506 */         if (this.x % 20 == 0) {
/*  507 */           this.b.a("timeSync");
/*  508 */           this.u.a(new ih(localmt.I(), localmt.J(), localmt.O().b("doDaylightCycle")), localmt.t.i);
/*  509 */           this.b.b();
/*      */         }
/*      */         
/*  512 */         this.b.a("tick");
/*      */         b localb;
/*  514 */         try { localmt.b();
/*      */         } catch (Throwable localThrowable1) {
/*  516 */           localb = b.a(localThrowable1, "Exception ticking world");
/*  517 */           localmt.a(localb);
/*  518 */           throw new s(localb);
/*      */         }
/*      */         try
/*      */         {
/*  522 */           localmt.h();
/*      */         } catch (Throwable localThrowable2) {
/*  524 */           localb = b.a(localThrowable2, "Exception ticking world entities");
/*  525 */           localmt.a(localb);
/*  526 */           throw new s(localb);
/*      */         }
/*  528 */         this.b.b();
/*  529 */         this.b.a("tracker");
/*  530 */         localmt.r().a();
/*  531 */         this.b.b();
/*      */         
/*  533 */         this.b.b();
/*      */       }
/*      */       
/*  536 */       this.h[i1][(this.x % 100)] = (System.nanoTime() - l1);
/*      */     }
/*      */     
/*  539 */     this.b.c("connection");
/*  540 */     ai().c();
/*  541 */     this.b.c("players");
/*  542 */     this.u.e();
/*      */     
/*  544 */     this.b.c("tickables");
/*  545 */     for (i1 = 0; i1 < this.n.size(); i1++) {
/*  546 */       ((lr)this.n.get(i1)).a();
/*      */     }
/*  548 */     this.b.b();
/*      */   }
/*      */   
/*      */   public boolean w() {
/*  552 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void x()
/*      */   {
/*  625 */     new lj(this, "Server thread").start();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public File d(String paramString)
/*      */   {
/*  634 */     return new File(s(), paramString);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void f(String paramString)
/*      */   {
/*  642 */     i.warn(paramString);
/*      */   }
/*      */   
/*      */   public mt a(int paramInt) {
/*  646 */     if (paramInt == -1) return this.c[1];
/*  647 */     if (paramInt == 1) return this.c[2];
/*  648 */     return this.c[0];
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String B()
/*      */   {
/*  664 */     return "1.7.10";
/*      */   }
/*      */   
/*      */   public int C() {
/*  668 */     return this.u.o();
/*      */   }
/*      */   
/*      */   public int D() {
/*  672 */     return this.u.p();
/*      */   }
/*      */   
/*      */   public String[] E() {
/*  676 */     return this.u.f();
/*      */   }
/*      */   
/*      */   public GameProfile[] F() {
/*  680 */     return this.u.g();
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String getServerModName()
/*      */   {
/*  708 */     return "vanilla";
/*      */   }
/*      */   
/*      */   public b b(b paramb)
/*      */   {
/*  713 */     paramb.g().a("Profiler Position", new lk(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  720 */     if ((this.c != null) && (this.c.length > 0) && (this.c[0] != null)) {
/*  721 */       paramb.g().a("Vec3 Pool Size", new ll(this));
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  736 */     if (this.u != null) {
/*  737 */       paramb.g().a("Player Count", new lm(this));
/*      */     }
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  745 */     return paramb;
/*      */   }
/*      */   
/*      */   public List a(ac paramac, String paramString) {
/*  749 */     ArrayList localArrayList = new ArrayList();
/*      */     Object localObject2;
/*  751 */     if (paramString.startsWith("/")) {
/*  752 */       paramString = paramString.substring(1);
/*  753 */       int i1 = !paramString.contains(" ") ? 1 : 0;
/*      */       
/*  755 */       localObject1 = this.o.b(paramac, paramString);
/*      */       
/*  757 */       if (localObject1 != null) {
/*  758 */         for (localObject2 = ((List)localObject1).iterator(); ((Iterator)localObject2).hasNext();) { String str1 = (String)((Iterator)localObject2).next();
/*  759 */           if (i1 != 0) {
/*  760 */             localArrayList.add("/" + str1);
/*      */           } else {
/*  762 */             localArrayList.add(str1);
/*      */           }
/*      */         }
/*      */       }
/*      */       
/*  767 */       return localArrayList;
/*      */     }
/*  769 */     String[] arrayOfString = paramString.split(" ", -1);
/*  770 */     Object localObject1 = arrayOfString[(arrayOfString.length - 1)];
/*      */     
/*  772 */     for (String str2 : this.u.f()) {
/*  773 */       if (y.a((String)localObject1, str2)) {
/*  774 */         localArrayList.add(str2);
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  779 */     return localArrayList;
/*      */   }
/*      */   
/*      */   public static MinecraftServer I() {
/*  783 */     return j;
/*      */   }
/*      */   
/*      */   public String b_()
/*      */   {
/*  788 */     return "Server";
/*      */   }
/*      */   
/*      */   public void a(fj paramfj)
/*      */   {
/*  793 */     i.info(paramfj.c());
/*      */   }
/*      */   
/*      */   public boolean a(int paramInt, String paramString)
/*      */   {
/*  798 */     return true;
/*      */   }
/*      */   
/*      */   public ab J() {
/*  802 */     return this.o;
/*      */   }
/*      */   
/*      */   public KeyPair K() {
/*  806 */     return this.G;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public String M()
/*      */   {
/*  818 */     return this.H;
/*      */   }
/*      */   
/*      */   public void j(String paramString) {
/*  822 */     this.H = paramString;
/*      */   }
/*      */   
/*      */   public boolean N() {
/*  826 */     return this.H != null;
/*      */   }
/*      */   
/*      */   public String O() {
/*  830 */     return this.I;
/*      */   }
/*      */   
/*      */   public void k(String paramString) {
/*  834 */     this.I = paramString;
/*      */   }
/*      */   
/*      */   public void l(String paramString) {
/*  838 */     this.J = paramString;
/*      */   }
/*      */   
/*      */   public String P() {
/*  842 */     return this.J;
/*      */   }
/*      */   
/*      */   public void a(KeyPair paramKeyPair) {
/*  846 */     this.G = paramKeyPair;
/*      */   }
/*      */   
/*      */   public void a(rd paramrd) {
/*  850 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/*  851 */       mt localmt = this.c[i1];
/*      */       
/*  853 */       if (localmt != null) {
/*  854 */         if (localmt.N().t()) {
/*  855 */           localmt.r = rd.d;
/*  856 */           localmt.a(true, true);
/*  857 */         } else if (N()) {
/*  858 */           localmt.r = paramrd;
/*  859 */           localmt.a(localmt.r != rd.a, true);
/*      */         } else {
/*  861 */           localmt.r = paramrd;
/*  862 */           localmt.a(Q(), this.z);
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   protected boolean Q() {
/*  869 */     return true;
/*      */   }
/*      */   
/*      */   public boolean R() {
/*  873 */     return this.K;
/*      */   }
/*      */   
/*      */   public void b(boolean paramBoolean) {
/*  877 */     this.K = paramBoolean;
/*      */   }
/*      */   
/*      */   public void c(boolean paramBoolean) {
/*  881 */     this.L = paramBoolean;
/*      */   }
/*      */   
/*      */   public aze S() {
/*  885 */     return this.k;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public void U()
/*      */   {
/*  893 */     this.M = true;
/*      */     
/*  895 */     S().d();
/*      */     
/*  897 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/*  898 */       mt localmt = this.c[i1];
/*      */       
/*  900 */       if (localmt != null) {
/*  901 */         localmt.n();
/*      */       }
/*      */     }
/*      */     
/*  905 */     S().e(this.c[0].M().g());
/*  906 */     r();
/*      */   }
/*      */   
/*      */   public String V() {
/*  910 */     return this.N;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(ri paramri)
/*      */   {
/*  919 */     paramri.a("whitelist_enabled", Boolean.valueOf(false));
/*  920 */     paramri.a("whitelist_count", Integer.valueOf(0));
/*  921 */     paramri.a("players_current", Integer.valueOf(C()));
/*  922 */     paramri.a("players_max", Integer.valueOf(D()));
/*  923 */     paramri.a("players_seen", Integer.valueOf(this.u.q().length));
/*  924 */     paramri.a("uses_auth", Boolean.valueOf(this.y));
/*  925 */     paramri.a("gui_state", ak() ? "enabled" : "disabled");
/*  926 */     paramri.a("run_time", Long.valueOf((ar() - paramri.g()) / 60L * 1000L));
/*      */     
/*  928 */     paramri.a("avg_tick_ms", Integer.valueOf((int)(qh.a(this.g) * 1.0E-6D)));
/*      */     
/*  930 */     int i1 = 0;
/*  931 */     for (int i2 = 0; i2 < this.c.length; i2++) {
/*  932 */       if (this.c[i2] != null) {
/*  933 */         mt localmt = this.c[i2];
/*  934 */         ays localays = localmt.N();
/*      */         
/*  936 */         paramri.a("world[" + i1 + "][dimension]", Integer.valueOf(localmt.t.i));
/*  937 */         paramri.a("world[" + i1 + "][mode]", localays.r());
/*  938 */         paramri.a("world[" + i1 + "][difficulty]", localmt.r);
/*  939 */         paramri.a("world[" + i1 + "][hardcore]", Boolean.valueOf(localays.t()));
/*  940 */         paramri.a("world[" + i1 + "][generator_name]", localays.u().a());
/*  941 */         paramri.a("world[" + i1 + "][generator_version]", Integer.valueOf(localays.u().d()));
/*  942 */         paramri.a("world[" + i1 + "][height]", Integer.valueOf(this.E));
/*  943 */         paramri.a("world[" + i1 + "][chunks_loaded]", Integer.valueOf(localmt.L().g()));
/*      */         
/*  945 */         i1++;
/*      */       }
/*      */     }
/*      */     
/*  949 */     paramri.a("worlds", Integer.valueOf(i1));
/*      */   }
/*      */   
/*      */   public void b(ri paramri)
/*      */   {
/*  954 */     paramri.b("singleplayer", Boolean.valueOf(N()));
/*  955 */     paramri.b("server_brand", getServerModName());
/*  956 */     paramri.b("gui_supported", java.awt.GraphicsEnvironment.isHeadless() ? "headless" : "supported");
/*  957 */     paramri.b("dedicated", Boolean.valueOf(X()));
/*      */   }
/*      */   
/*      */   public boolean W()
/*      */   {
/*  962 */     return true;
/*      */   }
/*      */   
/*      */   public abstract boolean X();
/*      */   
/*      */   public boolean Y() {
/*  968 */     return this.y;
/*      */   }
/*      */   
/*      */   public void d(boolean paramBoolean) {
/*  972 */     this.y = paramBoolean;
/*      */   }
/*      */   
/*      */   public boolean Z() {
/*  976 */     return this.z;
/*      */   }
/*      */   
/*      */   public void e(boolean paramBoolean) {
/*  980 */     this.z = paramBoolean;
/*      */   }
/*      */   
/*      */   public boolean aa() {
/*  984 */     return this.A;
/*      */   }
/*      */   
/*      */   public void f(boolean paramBoolean) {
/*  988 */     this.A = paramBoolean;
/*      */   }
/*      */   
/*      */   public boolean ab() {
/*  992 */     return this.B;
/*      */   }
/*      */   
/*      */   public void g(boolean paramBoolean) {
/*  996 */     this.B = paramBoolean;
/*      */   }
/*      */   
/*      */   public boolean ac() {
/* 1000 */     return this.C;
/*      */   }
/*      */   
/*      */   public void h(boolean paramBoolean) {
/* 1004 */     this.C = paramBoolean;
/*      */   }
/*      */   
/*      */   public abstract boolean ad();
/*      */   
/*      */   public String ae() {
/* 1010 */     return this.D;
/*      */   }
/*      */   
/*      */   public void n(String paramString) {
/* 1014 */     this.D = paramString;
/*      */   }
/*      */   
/*      */   public int af() {
/* 1018 */     return this.E;
/*      */   }
/*      */   
/*      */   public void c(int paramInt) {
/* 1022 */     this.E = paramInt;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public oi ah()
/*      */   {
/* 1030 */     return this.u;
/*      */   }
/*      */   
/*      */   public void a(oi paramoi) {
/* 1034 */     this.u = paramoi;
/*      */   }
/*      */   
/*      */   public void a(ahk paramahk) {
/* 1038 */     for (int i1 = 0; i1 < this.c.length; i1++) {
/* 1039 */       I().c[i1].N().a(paramahk);
/*      */     }
/*      */   }
/*      */   
/*      */   public nc ai() {
/* 1044 */     return this.p;
/*      */   }
/*      */   
/*      */   public boolean aj() {
/* 1048 */     return this.O;
/*      */   }
/*      */   
/*      */   public boolean ak() {
/* 1052 */     return false;
/*      */   }
/*      */   
/*      */   public abstract String a(ahk paramahk, boolean paramBoolean);
/*      */   
/*      */   public int al() {
/* 1058 */     return this.x;
/*      */   }
/*      */   
/*      */   public void am() {
/* 1062 */     this.R = true;
/*      */   }
/*      */   
/*      */   public ri an() {
/* 1066 */     return this.l;
/*      */   }
/*      */   
/*      */   public r f_()
/*      */   {
/* 1071 */     return new r(0, 0, 0);
/*      */   }
/*      */   
/*      */   public ahb d()
/*      */   {
/* 1076 */     return this.c[0];
/*      */   }
/*      */   
/*      */   public int ao() {
/* 1080 */     return 16;
/*      */   }
/*      */   
/*      */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz) {
/* 1084 */     return false;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public boolean ap()
/*      */   {
/* 1092 */     return this.S;
/*      */   }
/*      */   
/*      */   public Proxy aq() {
/* 1096 */     return this.d;
/*      */   }
/*      */   
/*      */   public static long ar() {
/* 1100 */     return System.currentTimeMillis();
/*      */   }
/*      */   
/*      */   public int as() {
/* 1104 */     return this.F;
/*      */   }
/*      */   
/*      */   public void d(int paramInt) {
/* 1108 */     this.F = paramInt;
/*      */   }
/*      */   
/*      */   public fj c_()
/*      */   {
/* 1113 */     return new fq(b_());
/*      */   }
/*      */   
/*      */   public boolean at() {
/* 1117 */     return true;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   public com.mojang.authlib.minecraft.MinecraftSessionService av()
/*      */   {
/* 1125 */     return this.U;
/*      */   }
/*      */   
/*      */   public GameProfileRepository aw() {
/* 1129 */     return this.W;
/*      */   }
/*      */   
/*      */   public ns ax() {
/* 1133 */     return this.X;
/*      */   }
/*      */   
/*      */   public kb ay() {
/* 1137 */     return this.q;
/*      */   }
/*      */   
/*      */   public void az() {
/* 1141 */     this.V = 0L;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\net\minecraft\server\MinecraftServer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */