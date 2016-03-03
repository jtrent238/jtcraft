/*      */ import com.google.common.collect.Iterables;
/*      */ import com.google.common.collect.Lists;
/*      */ import com.google.common.collect.Multimap;
/*      */ import com.google.common.collect.Queues;
/*      */ import com.google.common.util.concurrent.Futures;
/*      */ import com.google.common.util.concurrent.ListenableFuture;
/*      */ import com.google.common.util.concurrent.ListenableFutureTask;
/*      */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*      */ import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
/*      */ import io.netty.util.concurrent.GenericFutureListener;
/*      */ import java.awt.image.BufferedImage;
/*      */ import java.io.File;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.PrintStream;
/*      */ import java.net.Proxy;
/*      */ import java.net.SocketAddress;
/*      */ import java.nio.ByteBuffer;
/*      */ import java.text.DecimalFormat;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collections;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Queue;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.concurrent.Callable;
/*      */ import java.util.concurrent.Executors;
/*      */ import java.util.concurrent.FutureTask;
/*      */ import javax.imageio.ImageIO;
/*      */ import net.minecraft.client.ClientBrandRetriever;
/*      */ import net.minecraft.server.MinecraftServer;
/*      */ import org.apache.commons.lang3.Validate;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.LWJGLException;
/*      */ import org.lwjgl.Sys;
/*      */ import org.lwjgl.input.Keyboard;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.ContextCapabilities;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.DisplayMode;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.opengl.OpenGLException;
/*      */ import org.lwjgl.opengl.PixelFormat;
/*      */ import org.lwjgl.util.glu.GLU;
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
/*      */ public class bao
/*      */   implements rk
/*      */ {
/*   84 */   private static final Logger F = ;
/*   85 */   private static final bqx G = new bqx("textures/gui/title/mojang.png");
/*   86 */   public static final boolean a = u.a() == v.d;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*   91 */   public static byte[] b = new byte[10485760];
/*   92 */   private static final List H = Lists.newArrayList(new DisplayMode[] { new DisplayMode(2560, 1600), new DisplayMode(2880, 1800) });
/*      */   
/*      */   private final File I;
/*      */   
/*      */   private final Multimap J;
/*      */   
/*      */   private bjn K;
/*      */   
/*      */   private bqf L;
/*      */   
/*      */   private static bao M;
/*      */   public bje c;
/*      */   private boolean N;
/*      */   private boolean O;
/*      */   private b P;
/*      */   public int d;
/*      */   public int e;
/*  109 */   private bbr Q = new bbr(20.0F);
/*  110 */   private ri R = new ri("client", this, MinecraftServer.ar());
/*      */   
/*      */   public bjf f;
/*      */   
/*      */   public bma g;
/*      */   
/*      */   public bjk h;
/*      */   
/*      */   public sv i;
/*      */   
/*      */   public sa j;
/*      */   
/*      */   public bkn k;
/*      */   
/*      */   private final bbs S;
/*      */   
/*      */   private boolean T;
/*      */   
/*      */   public bbu l;
/*      */   
/*      */   public bbu m;
/*      */   public bdw n;
/*      */   public bbo o;
/*      */   public blt p;
/*      */   private int U;
/*      */   private int V;
/*      */   private int W;
/*      */   private bsx X;
/*      */   public beh q;
/*      */   public bbv r;
/*      */   public boolean s;
/*      */   public azu t;
/*      */   public bbj u;
/*      */   public bbg v;
/*      */   public final File w;
/*      */   private final File Y;
/*      */   private final String Z;
/*      */   private final Proxy aa;
/*      */   private aze ab;
/*      */   private static int ac;
/*      */   private int ad;
/*      */   private boolean ae;
/*      */   private String af;
/*      */   private int ag;
/*      */   public boolean x;
/*  155 */   long y = K();
/*      */   
/*      */   private int ah;
/*      */   private final boolean ai;
/*      */   private final boolean aj;
/*      */   private ej ak;
/*      */   private boolean al;
/*  162 */   public final qi z = new qi();
/*  163 */   private long am = -1L;
/*      */   private bqv an;
/*  165 */   private final brw ao = new brw();
/*  166 */   private List ap = Lists.newArrayList();
/*      */   
/*      */   private bqp aq;
/*      */   
/*      */   private brc ar;
/*      */   
/*      */   private brr as;
/*      */   private bum at;
/*      */   private bmg au;
/*      */   private bpz av;
/*      */   private btp aw;
/*      */   private btg ax;
/*      */   private bqx ay;
/*      */   private final MinecraftSessionService az;
/*      */   private brj aA;
/*  181 */   private final Queue aB = Queues.newArrayDeque();
/*  182 */   private final Thread aC = Thread.currentThread();
/*      */   
/*      */   public bao(bbs parambbs, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, File paramFile1, File paramFile2, File paramFile3, Proxy paramProxy, String paramString1, Multimap paramMultimap, String paramString2) {
/*  185 */     M = this;
/*  186 */     this.w = paramFile1;
/*  187 */     this.Y = paramFile2;
/*  188 */     this.I = paramFile3;
/*  189 */     this.Z = paramString1;
/*  190 */     this.J = paramMultimap;
/*  191 */     this.aq = new bqp(new bqo(paramFile2, paramString2).a());
/*      */     
/*  193 */     ah();
/*      */     
/*  195 */     this.aa = (paramProxy == null ? Proxy.NO_PROXY : paramProxy);
/*  196 */     this.az = new YggdrasilAuthenticationService(paramProxy, UUID.randomUUID().toString()).createMinecraftSessionService();
/*  197 */     af();
/*      */     
/*  199 */     this.S = parambbs;
/*      */     
/*  201 */     F.info("Setting user: " + parambbs.c());
/*  202 */     F.info("(Session ID is " + parambbs.a() + ")");
/*      */     
/*  204 */     this.aj = paramBoolean2;
/*  205 */     this.d = paramInt1;
/*  206 */     this.e = paramInt2;
/*  207 */     this.V = paramInt1;
/*  208 */     this.W = paramInt2;
/*  209 */     this.N = paramBoolean1;
/*      */     
/*  211 */     this.ai = ae();
/*      */     
/*      */ 
/*  214 */     ImageIO.setUseCache(false);
/*      */     
/*  216 */     kl.b();
/*      */   }
/*      */   
/*      */   private static boolean ae() {
/*  220 */     String[] arrayOfString1 = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
/*      */     
/*      */ 
/*      */ 
/*  224 */     for (String str1 : arrayOfString1) {
/*  225 */       String str2 = System.getProperty(str1);
/*  226 */       if ((str2 != null) && 
/*  227 */         (str2.contains("64"))) {
/*  228 */         return true;
/*      */       }
/*      */     }
/*      */     
/*      */ 
/*  233 */     return false;
/*      */   }
/*      */   
/*      */   public bmg a() {
/*  237 */     return this.au;
/*      */   }
/*      */   
/*      */   private void af()
/*      */   {
/*  242 */     bap localbap = new bap(this, "Timer hack thread");
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
/*  253 */     localbap.setDaemon(true);
/*  254 */     localbap.start();
/*      */   }
/*      */   
/*      */   public void a(b paramb) {
/*  258 */     this.O = true;
/*  259 */     this.P = paramb;
/*      */   }
/*      */   
/*      */   public void c(b paramb) {
/*  263 */     File localFile1 = new File(B().w, "crash-reports");
/*  264 */     File localFile2 = new File(localFile1, "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-client.txt");
/*      */     
/*      */ 
/*  267 */     System.out.println(paramb.e());
/*  268 */     if (paramb.f() != null) {
/*  269 */       System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + paramb.f());
/*  270 */       System.exit(-1);
/*  271 */     } else if (paramb.a(localFile2)) {
/*  272 */       System.out.println("#@!@# Game crashed! Crash report saved to: #@!@# " + localFile2.getAbsolutePath());
/*  273 */       System.exit(-1);
/*      */     } else {
/*  275 */       System.out.println("#@?@# Game crashed! Crash report could not be saved. #@?@#");
/*  276 */       System.exit(-2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(String paramString, int paramInt) {
/*  281 */     this.af = paramString;
/*  282 */     this.ag = paramInt;
/*      */   }
/*      */   
/*      */   private void ag() {
/*  286 */     this.u = new bbj(this, this.w);
/*  287 */     if ((this.u.A > 0) && (this.u.z > 0)) {
/*  288 */       this.d = this.u.z;
/*  289 */       this.e = this.u.A;
/*      */     }
/*      */     
/*  292 */     if (this.N) {
/*  293 */       Display.setFullscreen(true);
/*  294 */       this.d = Display.getDisplayMode().getWidth();
/*  295 */       this.e = Display.getDisplayMode().getHeight();
/*  296 */       if (this.d <= 0) this.d = 1;
/*  297 */       if (this.e <= 0) this.e = 1;
/*      */     } else {
/*  299 */       Display.setDisplayMode(new DisplayMode(this.d, this.e));
/*      */     }
/*      */     
/*  302 */     Display.setResizable(true);
/*  303 */     Display.setTitle("Minecraft 1.7.10");
/*      */     
/*  305 */     F.info("LWJGL Version: " + Sys.getVersion());
/*      */     
/*      */ 
/*  308 */     v localv = u.a();
/*  309 */     if (localv != v.d) {
/*      */       try {
/*  311 */         InputStream localInputStream1 = this.aq.c(new bqx("icons/icon_16x16.png"));
/*  312 */         InputStream localInputStream2 = this.aq.c(new bqx("icons/icon_32x32.png"));
/*      */         
/*  314 */         if ((localInputStream1 != null) && (localInputStream2 != null)) {
/*  315 */           Display.setIcon(new ByteBuffer[] { a(localInputStream1), a(localInputStream2) });
/*      */         }
/*      */         
/*      */       }
/*      */       catch (IOException localIOException)
/*      */       {
/*  321 */         F.error("Couldn't set icon", localIOException);
/*      */       }
/*      */     }
/*      */     
/*      */     try
/*      */     {
/*  327 */       Display.create(new PixelFormat().withDepthBits(24));
/*      */     }
/*      */     catch (LWJGLException localLWJGLException) {
/*  330 */       F.error("Couldn't set pixel format", localLWJGLException);
/*      */       try {
/*  332 */         Thread.sleep(1000L);
/*      */       }
/*      */       catch (InterruptedException localInterruptedException) {}
/*      */       
/*  336 */       if (this.N) {
/*  337 */         ai();
/*      */       }
/*      */       
/*  340 */       Display.create();
/*      */     }
/*      */     
/*      */ 
/*  344 */     buu.a();
/*      */     try
/*      */     {
/*  347 */       this.at = new buo(this, (String)Iterables.getFirst(this.J.get("twitch_access_token"), null));
/*      */     } catch (Throwable localThrowable) {
/*  349 */       this.at = new bur(localThrowable);
/*  350 */       F.error("Couldn't initialize twitch stream");
/*      */     }
/*      */     
/*  353 */     this.au = new bmg(this.d, this.e, true);
/*  354 */     this.au.a(0.0F, 0.0F, 0.0F, 0.0F);
/*      */     
/*  356 */     this.q = new beh(this);
/*      */     
/*  358 */     this.ao.a(new bsj(), bsi.class);
/*  359 */     this.ao.a(new bsd(), bsc.class);
/*  360 */     this.ao.a(new bsb(), bsa.class);
/*  361 */     this.ao.a(new bsh(), bsg.class);
/*  362 */     this.ao.a(new bsf(), bse.class);
/*      */     
/*  364 */     this.ab = new ayn(new File(this.w, "saves"));
/*      */     
/*  366 */     this.ar = new brc(this.I, new File(this.w, "server-resource-packs"), this.aq, this.ao, this.u);
/*  367 */     this.an = new brg(this.ao);
/*      */     
/*  369 */     this.as = new brr(this.ao, this.u.aK);
/*  370 */     this.an.a(this.as);
/*      */     
/*  372 */     c();
/*      */     
/*  374 */     this.L = new bqf(this.an);
/*  375 */     this.an.a(this.L);
/*      */     
/*  377 */     this.aA = new brj(this.L, new File(this.Y, "skins"), this.az);
/*      */     
/*  379 */     aj();
/*      */     
/*  381 */     this.aw = new btp(this.an, this.u);
/*  382 */     this.an.a(this.aw);
/*      */     
/*  384 */     this.ax = new btg(this);
/*      */     
/*      */ 
/*  387 */     this.l = new bbu(this.u, new bqx("textures/font/ascii.png"), this.L, false);
/*  388 */     if (this.u.aK != null) {
/*  389 */       this.l.a(b());
/*  390 */       this.l.b(this.as.b());
/*      */     }
/*      */     
/*  393 */     this.m = new bbu(this.u, new bqx("textures/font/ascii_sga.png"), this.L, false);
/*      */     
/*  395 */     this.an.a(this.l);
/*  396 */     this.an.a(this.m);
/*      */     
/*  398 */     this.an.a(new bqu());
/*  399 */     this.an.a(new bqt());
/*      */     
/*  401 */     bnn.a.f = new bly(this);
/*  402 */     this.p = new blt(this, this.an);
/*  403 */     this.an.a(this.p);
/*      */     
/*  405 */     pc.f.a(new bay(this));
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
/*  416 */     this.v = new bbg();
/*      */     
/*  418 */     b("Pre startup");
/*      */     
/*  420 */     GL11.glEnable(3553);
/*  421 */     GL11.glShadeModel(7425);
/*  422 */     GL11.glClearDepth(1.0D);
/*  423 */     GL11.glEnable(2929);
/*  424 */     GL11.glDepthFunc(515);
/*  425 */     GL11.glEnable(3008);
/*  426 */     GL11.glAlphaFunc(516, 0.1F);
/*  427 */     GL11.glCullFace(1029);
/*      */     
/*  429 */     GL11.glMatrixMode(5889);
/*  430 */     GL11.glLoadIdentity();
/*  431 */     GL11.glMatrixMode(5888);
/*  432 */     b("Startup");
/*      */     
/*  434 */     this.g = new bma(this);
/*      */     
/*  436 */     this.av = new bpz(0, "textures/blocks");
/*  437 */     this.av.b(this.u.I);
/*  438 */     this.av.a(this.u.H);
/*  439 */     this.L.a(bpz.b, this.av);
/*  440 */     this.L.a(bpz.c, new bpz(1, "textures/items"));
/*      */     
/*  442 */     GL11.glViewport(0, 0, this.d, this.e);
/*      */     
/*  444 */     this.k = new bkn(this.f, this.L);
/*      */     
/*  446 */     b("Post startup");
/*  447 */     this.r = new bbv(this);
/*      */     
/*  449 */     if (this.af != null) {
/*  450 */       a(new bcx(new bee(), this, this.af, this.ag));
/*      */     } else {
/*  452 */       a(new bee());
/*      */     }
/*      */     
/*      */ 
/*  456 */     this.L.c(this.ay);
/*  457 */     this.ay = null;
/*      */     
/*  459 */     this.o = new bbo(this);
/*      */     
/*  461 */     if ((this.u.s) && (!this.N)) o();
/*      */     try {
/*  463 */       Display.setVSyncEnabled(this.u.t);
/*      */     } catch (OpenGLException localOpenGLException) {
/*  465 */       this.u.t = false;
/*  466 */       this.u.b();
/*      */     }
/*      */   }
/*      */   
/*      */   public boolean b() {
/*  471 */     return (this.as.a()) || (this.u.aL);
/*      */   }
/*      */   
/*      */   public void c() {
/*  475 */     ArrayList localArrayList = Lists.newArrayList(this.ap);
/*      */     
/*  477 */     for (brf localbrf : this.ar.c()) {
/*  478 */       localArrayList.add(localbrf.c());
/*      */     }
/*      */     
/*  481 */     if (this.ar.e() != null) {
/*  482 */       localArrayList.add(this.ar.e());
/*      */     }
/*      */     try
/*      */     {
/*  486 */       this.an.a(localArrayList);
/*      */     } catch (RuntimeException localRuntimeException) {
/*  488 */       F.info("Caught error stitching, removing all assigned resourcepacks", localRuntimeException);
/*      */       
/*  490 */       localArrayList.clear();
/*  491 */       localArrayList.addAll(this.ap);
/*  492 */       this.ar.a(Collections.emptyList());
/*      */       
/*  494 */       this.an.a(localArrayList);
/*      */       
/*  496 */       this.u.l.clear();
/*  497 */       this.u.b();
/*      */     }
/*  499 */     this.as.a(localArrayList);
/*      */     
/*  501 */     if (this.g != null) {
/*  502 */       this.g.a();
/*      */     }
/*      */   }
/*      */   
/*      */   private void ah() {
/*  507 */     this.ap.add(this.aq);
/*      */   }
/*      */   
/*      */   private ByteBuffer a(InputStream paramInputStream) {
/*  511 */     BufferedImage localBufferedImage = ImageIO.read(paramInputStream);
/*  512 */     int[] arrayOfInt1 = localBufferedImage.getRGB(0, 0, localBufferedImage.getWidth(), localBufferedImage.getHeight(), null, 0, localBufferedImage.getWidth());
/*      */     
/*  514 */     ByteBuffer localByteBuffer = ByteBuffer.allocate(4 * arrayOfInt1.length);
/*  515 */     for (int i3 : arrayOfInt1) {
/*  516 */       localByteBuffer.putInt(i3 << 8 | i3 >> 24 & 0xFF);
/*      */     }
/*  518 */     localByteBuffer.flip();
/*  519 */     return localByteBuffer;
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
/*      */   private void ai()
/*      */   {
/*  534 */     HashSet localHashSet = new HashSet();
/*  535 */     Collections.addAll(localHashSet, Display.getAvailableDisplayModes());
/*      */     
/*  537 */     Object localObject = Display.getDesktopDisplayMode();
/*  538 */     Iterator localIterator1; if (!localHashSet.contains(localObject))
/*      */     {
/*  540 */       if (u.a() == v.d)
/*  541 */         for (localIterator1 = H.iterator(); localIterator1.hasNext();) { localDisplayMode1 = (DisplayMode)localIterator1.next();
/*      */           
/*  543 */           int i1 = 1;
/*  544 */           for (localIterator2 = localHashSet.iterator(); localIterator2.hasNext();) { localDisplayMode2 = (DisplayMode)localIterator2.next();
/*  545 */             if ((localDisplayMode2.getBitsPerPixel() == 32) && (localDisplayMode2.getWidth() == localDisplayMode1.getWidth()) && (localDisplayMode2.getHeight() == localDisplayMode1.getHeight())) {
/*  546 */               i1 = 0;
/*  547 */               break;
/*      */             }
/*      */           }
/*      */           
/*  551 */           if (i1 == 0)
/*      */           {
/*      */ 
/*  554 */             for (localIterator2 = localHashSet.iterator(); localIterator2.hasNext();) { localDisplayMode2 = (DisplayMode)localIterator2.next();
/*  555 */               if ((localDisplayMode2.getBitsPerPixel() == 32) && (localDisplayMode2.getWidth() == localDisplayMode1.getWidth() / 2) && (localDisplayMode2.getHeight() == localDisplayMode1.getHeight() / 2)) {
/*  556 */                 localObject = localDisplayMode2;
/*  557 */                 break;
/*      */               }
/*      */             } }
/*      */         } }
/*      */     DisplayMode localDisplayMode1;
/*      */     Iterator localIterator2;
/*      */     DisplayMode localDisplayMode2;
/*  564 */     Display.setDisplayMode((DisplayMode)localObject);
/*  565 */     this.d = ((DisplayMode)localObject).getWidth();
/*  566 */     this.e = ((DisplayMode)localObject).getHeight();
/*      */   }
/*      */   
/*      */   private void aj() {
/*  570 */     bca localbca = new bca(this, this.d, this.e);
/*  571 */     int i1 = localbca.e();
/*  572 */     bmg localbmg = new bmg(localbca.a() * i1, localbca.b() * i1, true);
/*  573 */     localbmg.a(false);
/*      */     
/*  575 */     GL11.glMatrixMode(5889);
/*  576 */     GL11.glLoadIdentity();
/*  577 */     GL11.glOrtho(0.0D, localbca.a(), localbca.b(), 0.0D, 1000.0D, 3000.0D);
/*  578 */     GL11.glMatrixMode(5888);
/*  579 */     GL11.glLoadIdentity();
/*  580 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*      */     
/*  582 */     GL11.glDisable(2896);
/*  583 */     GL11.glDisable(2912);
/*  584 */     GL11.glDisable(2929);
/*      */     
/*  586 */     GL11.glEnable(3553);
/*      */     try
/*      */     {
/*  589 */       this.ay = this.L.a("logo", new bpq(ImageIO.read(this.aq.a(G))));
/*  590 */       this.L.a(this.ay);
/*      */     } catch (IOException localIOException) {
/*  592 */       F.error("Unable to load logo: " + G, localIOException);
/*      */     }
/*      */     
/*  595 */     bmh localbmh = bmh.a;
/*  596 */     localbmh.b();
/*  597 */     localbmh.c(16777215);
/*  598 */     localbmh.a(0.0D, this.e, 0.0D, 0.0D, 0.0D);
/*  599 */     localbmh.a(this.d, this.e, 0.0D, 0.0D, 0.0D);
/*  600 */     localbmh.a(this.d, 0.0D, 0.0D, 0.0D, 0.0D);
/*  601 */     localbmh.a(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
/*  602 */     localbmh.a();
/*      */     
/*  604 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  605 */     localbmh.c(16777215);
/*      */     
/*  607 */     int i2 = 256;
/*  608 */     int i3 = 256;
/*  609 */     a((localbca.a() - i2) / 2, (localbca.b() - i3) / 2, 0, 0, i2, i3);
/*      */     
/*  611 */     GL11.glDisable(2896);
/*  612 */     GL11.glDisable(2912);
/*      */     
/*  614 */     localbmg.e();
/*  615 */     localbmg.c(localbca.a() * i1, localbca.b() * i1);
/*      */     
/*  617 */     GL11.glEnable(3008);
/*  618 */     GL11.glAlphaFunc(516, 0.1F);
/*  619 */     GL11.glFlush();
/*      */     
/*  621 */     g();
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*  625 */     float f1 = 0.00390625F;
/*  626 */     float f2 = 0.00390625F;
/*  627 */     bmh localbmh = bmh.a;
/*  628 */     localbmh.b();
/*  629 */     localbmh.a(paramInt1 + 0, paramInt2 + paramInt6, 0.0D, (paramInt3 + 0) * f1, (paramInt4 + paramInt6) * f2);
/*  630 */     localbmh.a(paramInt1 + paramInt5, paramInt2 + paramInt6, 0.0D, (paramInt3 + paramInt5) * f1, (paramInt4 + paramInt6) * f2);
/*  631 */     localbmh.a(paramInt1 + paramInt5, paramInt2 + 0, 0.0D, (paramInt3 + paramInt5) * f1, (paramInt4 + 0) * f2);
/*  632 */     localbmh.a(paramInt1 + 0, paramInt2 + 0, 0.0D, (paramInt3 + 0) * f1, (paramInt4 + 0) * f2);
/*  633 */     localbmh.a();
/*      */   }
/*      */   
/*      */   public aze d() {
/*  637 */     return this.ab;
/*      */   }
/*      */   
/*      */   public void a(bdw parambdw) {
/*  641 */     if (this.n != null) {
/*  642 */       this.n.m();
/*      */     }
/*      */     
/*  645 */     if ((parambdw == null) && (this.f == null)) {
/*  646 */       parambdw = new bee();
/*  647 */     } else if ((parambdw == null) && (this.h.aS() <= 0.0F)) {
/*  648 */       parambdw = new bdc();
/*      */     }
/*      */     
/*  651 */     if ((parambdw instanceof bee)) {
/*  652 */       this.u.ax = false;
/*  653 */       this.r.b().a();
/*      */     }
/*      */     
/*  656 */     this.n = parambdw;
/*      */     
/*  658 */     if (parambdw != null) {
/*  659 */       m();
/*  660 */       bca localbca = new bca(this, this.d, this.e);
/*  661 */       int i1 = localbca.a();
/*  662 */       int i2 = localbca.b();
/*  663 */       parambdw.a(this, i1, i2);
/*  664 */       this.s = false;
/*      */     } else {
/*  666 */       this.aw.e();
/*  667 */       l();
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(String paramString) {
/*  672 */     int i1 = GL11.glGetError();
/*  673 */     if (i1 != 0) {
/*  674 */       String str = GLU.gluErrorString(i1);
/*  675 */       F.error("########## GL ERROR ##########");
/*  676 */       F.error("@ " + paramString);
/*  677 */       F.error(i1 + ": " + str);
/*      */     }
/*      */   }
/*      */   
/*      */   public void e() {
/*      */     try {
/*  683 */       this.at.i();
/*      */       
/*  685 */       F.info("Stopping!");
/*      */       try {
/*  687 */         a(null);
/*      */       }
/*      */       catch (Throwable localThrowable1) {}
/*      */       try
/*      */       {
/*  692 */         ban.a();
/*      */       }
/*      */       catch (Throwable localThrowable2) {}
/*      */       
/*  696 */       this.aw.d();
/*      */     } finally {
/*  698 */       Display.destroy();
/*  699 */       if (!this.O) System.exit(0);
/*      */     }
/*  701 */     System.gc();
/*      */   }
/*      */   
/*  704 */   volatile boolean A = true;
/*  705 */   public String B = "";
/*      */   
/*  707 */   long C = K();
/*      */   int D;
/*      */   
/*      */   public void f() {
/*  711 */     this.A = true;
/*      */     b localb;
/*  713 */     try { ag();
/*      */     } catch (Throwable localThrowable1) {
/*  715 */       localb = b.a(localThrowable1, "Initializing game");
/*  716 */       localb.a("Initialization");
/*  717 */       c(b(localb));
/*  718 */       return;
/*      */     }
/*      */     try {
/*  721 */       while (this.A) {
/*  722 */         if ((this.O) && (this.P != null)) {
/*  723 */           c(this.P); return;
/*      */         }
/*      */         
/*      */         try
/*      */         {
/*  728 */           ak();
/*      */         } catch (OutOfMemoryError localOutOfMemoryError) {
/*  730 */           j();
/*  731 */           a(new bdo());
/*  732 */           System.gc();
/*      */         }
/*      */       }
/*      */     }
/*      */     catch (bbq localbbq) {}catch (s locals) {
/*  737 */       b(locals.a());
/*  738 */       j();
/*  739 */       F.fatal("Reported exception thrown!", locals);
/*  740 */       c(locals.a());
/*      */     } catch (Throwable localThrowable2) {
/*  742 */       localb = b(new b("Unexpected error", localThrowable2));
/*  743 */       j();
/*  744 */       F.fatal("Unreported exception thrown!", localThrowable2);
/*  745 */       c(localb);
/*      */     } finally {
/*  747 */       e();
/*      */     }
/*      */   }
/*      */   
/*      */   private void ak() {
/*  752 */     this.z.a("root");
/*  753 */     if ((Display.isCreated()) && (Display.isCloseRequested())) {
/*  754 */       k();
/*      */     }
/*      */     
/*      */ 
/*  758 */     if ((this.T) && (this.f != null)) {
/*  759 */       float f1 = this.Q.c;
/*  760 */       this.Q.a();
/*  761 */       this.Q.c = f1;
/*      */     } else {
/*  763 */       this.Q.a();
/*      */     }
/*      */     
/*  766 */     if (((this.f == null) || (this.n == null)) && (this.ae)) {
/*  767 */       this.ae = false;
/*  768 */       c();
/*      */     }
/*      */     
/*  771 */     long l1 = System.nanoTime();
/*  772 */     this.z.a("tick");
/*  773 */     for (int i1 = 0; i1 < this.Q.b; i1++) {
/*  774 */       p();
/*      */     }
/*  776 */     this.z.c("preRenderErrors");
/*  777 */     long l2 = System.nanoTime() - l1;
/*  778 */     b("Pre render");
/*      */     
/*  780 */     blm.b = this.u.i;
/*      */     
/*  782 */     this.z.c("sound");
/*  783 */     this.aw.a(this.h, this.Q.c);
/*  784 */     this.z.b();
/*      */     
/*  786 */     this.z.a("render");
/*      */     
/*  788 */     GL11.glPushMatrix();
/*  789 */     GL11.glClear(16640);
/*  790 */     this.au.a(true);
/*      */     
/*  792 */     this.z.a("display");
/*  793 */     GL11.glEnable(3553);
/*      */     
/*  795 */     if ((this.h != null) && (this.h.aa())) {
/*  796 */       this.u.aw = 0;
/*      */     }
/*  798 */     this.z.b();
/*  799 */     if (!this.s) {
/*  800 */       this.z.c("gameRenderer");
/*  801 */       this.p.b(this.Q.c);
/*  802 */       this.z.b();
/*      */     }
/*      */     
/*  805 */     GL11.glFlush();
/*      */     
/*  807 */     this.z.b();
/*      */     
/*  809 */     if ((!Display.isActive()) && 
/*  810 */       (this.N)) {
/*  811 */       o();
/*      */     }
/*      */     
/*      */ 
/*  815 */     if ((this.u.ax) && (this.u.ay)) {
/*  816 */       if (!this.z.a) {
/*  817 */         this.z.a();
/*      */       }
/*  819 */       this.z.a = true;
/*  820 */       a(l2);
/*      */     } else {
/*  822 */       this.z.a = false;
/*  823 */       this.E = System.nanoTime();
/*      */     }
/*      */     
/*  826 */     this.q.a();
/*      */     
/*  828 */     this.au.e();
/*  829 */     GL11.glPopMatrix();
/*  830 */     GL11.glPushMatrix();
/*  831 */     this.au.c(this.d, this.e);
/*  832 */     GL11.glPopMatrix();
/*  833 */     GL11.glPushMatrix();
/*  834 */     this.p.c(this.Q.c);
/*  835 */     GL11.glPopMatrix();
/*  836 */     this.z.a("root");
/*      */     
/*  838 */     g();
/*      */     
/*  840 */     Thread.yield();
/*      */     
/*  842 */     this.z.a("stream");
/*  843 */     this.z.a("update");
/*  844 */     this.at.j();
/*  845 */     this.z.c("submit");
/*  846 */     this.at.k();
/*  847 */     this.z.b();
/*  848 */     this.z.b();
/*      */     
/*  850 */     b("Post render");
/*  851 */     this.D += 1;
/*  852 */     this.T = ((G()) && (this.n != null) && (this.n.d()) && (!this.X.a()));
/*      */     
/*  854 */     while (K() >= this.C + 1000L) {
/*  855 */       ac = this.D;
/*  856 */       this.B = (ac + " fps, " + blo.b + " chunk updates");
/*  857 */       blo.b = 0;
/*  858 */       this.C += 1000L;
/*  859 */       this.D = 0;
/*  860 */       this.R.b();
/*      */       
/*  862 */       if (!this.R.d()) this.R.a();
/*      */     }
/*  864 */     this.z.b();
/*  865 */     if (i()) Display.sync(h());
/*      */   }
/*      */   
/*      */   public void g() {
/*      */     
/*  870 */     if ((!this.N) && (Display.wasResized())) {
/*  871 */       int i1 = this.d;
/*  872 */       int i2 = this.e;
/*  873 */       this.d = Display.getWidth();
/*  874 */       this.e = Display.getHeight();
/*  875 */       if ((this.d != i1) || (this.e != i2)) {
/*  876 */         if (this.d <= 0) this.d = 1;
/*  877 */         if (this.e <= 0) { this.e = 1;
/*      */         }
/*  879 */         a(this.d, this.e);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public int h() {
/*  885 */     if ((this.f == null) && (this.n != null)) {
/*  886 */       return 30;
/*      */     }
/*  888 */     return this.u.h;
/*      */   }
/*      */   
/*      */   public boolean i()
/*      */   {
/*  893 */     return h() < bbm.j.f();
/*      */   }
/*      */   
/*      */   public void j() {
/*      */     try {
/*  898 */       b = new byte[0];
/*  899 */       this.g.h();
/*      */     }
/*      */     catch (Throwable localThrowable1) {}
/*      */     try {
/*  903 */       System.gc();
/*      */     }
/*      */     catch (Throwable localThrowable2) {}
/*      */     try {
/*  907 */       System.gc();
/*  908 */       a(null);
/*      */     }
/*      */     catch (Throwable localThrowable3) {}
/*  911 */     System.gc();
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  989 */   long E = -1L;
/*      */   
/*  991 */   private String aD = "root";
/*      */   
/*      */   private void b(int paramInt) {
/*  994 */     List localList = this.z.b(this.aD);
/*  995 */     if ((localList == null) || (localList.isEmpty())) { return;
/*      */     }
/*  997 */     qj localqj = (qj)localList.remove(0);
/*  998 */     if (paramInt == 0) {
/*  999 */       if (localqj.c.length() > 0) {
/* 1000 */         int i1 = this.aD.lastIndexOf(".");
/* 1001 */         if (i1 >= 0) this.aD = this.aD.substring(0, i1);
/*      */       }
/*      */     } else {
/* 1004 */       paramInt--;
/* 1005 */       if ((paramInt < localList.size()) && (!((qj)localList.get(paramInt)).c.equals("unspecified"))) {
/* 1006 */         if (this.aD.length() > 0) this.aD += ".";
/* 1007 */         this.aD += ((qj)localList.get(paramInt)).c;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(long paramLong) {
/* 1013 */     if (!this.z.a) return;
/* 1014 */     List localList = this.z.b(this.aD);
/* 1015 */     qj localqj1 = (qj)localList.remove(0);
/*      */     
/* 1017 */     GL11.glClear(256);
/* 1018 */     GL11.glMatrixMode(5889);
/* 1019 */     GL11.glEnable(2903);
/* 1020 */     GL11.glLoadIdentity();
/* 1021 */     GL11.glOrtho(0.0D, this.d, this.e, 0.0D, 1000.0D, 3000.0D);
/* 1022 */     GL11.glMatrixMode(5888);
/* 1023 */     GL11.glLoadIdentity();
/* 1024 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*      */     
/* 1026 */     GL11.glLineWidth(1.0F);
/* 1027 */     GL11.glDisable(3553);
/* 1028 */     bmh localbmh = bmh.a;
/*      */     
/* 1030 */     int i1 = 160;
/* 1031 */     int i2 = this.d - i1 - 10;
/* 1032 */     int i3 = this.e - i1 * 2;
/* 1033 */     GL11.glEnable(3042);
/* 1034 */     localbmh.b();
/* 1035 */     localbmh.a(0, 200);
/* 1036 */     localbmh.a(i2 - i1 * 1.1F, i3 - i1 * 0.6F - 16.0F, 0.0D);
/* 1037 */     localbmh.a(i2 - i1 * 1.1F, i3 + i1 * 2, 0.0D);
/* 1038 */     localbmh.a(i2 + i1 * 1.1F, i3 + i1 * 2, 0.0D);
/* 1039 */     localbmh.a(i2 + i1 * 1.1F, i3 - i1 * 0.6F - 16.0F, 0.0D);
/* 1040 */     localbmh.a();
/* 1041 */     GL11.glDisable(3042);
/*      */     
/* 1043 */     double d1 = 0.0D;
/* 1044 */     for (int i4 = 0; i4 < localList.size(); i4++) {
/* 1045 */       localObject = (qj)localList.get(i4);
/*      */       
/* 1047 */       i6 = qh.c(((qj)localObject).a / 4.0D) + 1;
/*      */       
/* 1049 */       localbmh.a(6);
/* 1050 */       localbmh.c(((qj)localObject).a());
/* 1051 */       localbmh.a(i2, i3, 0.0D);
/* 1052 */       float f1; float f2; float f3; for (int i7 = i6; i7 >= 0; i7--) {
/* 1053 */         f1 = (float)((d1 + ((qj)localObject).a * i7 / i6) * 3.1415927410125732D * 2.0D / 100.0D);
/* 1054 */         f2 = qh.a(f1) * i1;
/* 1055 */         f3 = qh.b(f1) * i1 * 0.5F;
/* 1056 */         localbmh.a(i2 + f2, i3 - f3, 0.0D);
/*      */       }
/* 1058 */       localbmh.a();
/* 1059 */       localbmh.a(5);
/* 1060 */       localbmh.c((((qj)localObject).a() & 0xFEFEFE) >> 1);
/* 1061 */       for (i7 = i6; i7 >= 0; i7--) {
/* 1062 */         f1 = (float)((d1 + ((qj)localObject).a * i7 / i6) * 3.1415927410125732D * 2.0D / 100.0D);
/* 1063 */         f2 = qh.a(f1) * i1;
/* 1064 */         f3 = qh.b(f1) * i1 * 0.5F;
/* 1065 */         localbmh.a(i2 + f2, i3 - f3, 0.0D);
/* 1066 */         localbmh.a(i2 + f2, i3 - f3 + 10.0F, 0.0D);
/*      */       }
/* 1068 */       localbmh.a();
/*      */       
/* 1070 */       d1 += ((qj)localObject).a;
/*      */     }
/* 1072 */     DecimalFormat localDecimalFormat = new DecimalFormat("##0.00");
/*      */     
/* 1074 */     GL11.glEnable(3553);
/*      */     
/*      */ 
/* 1077 */     Object localObject = "";
/* 1078 */     if (!localqj1.c.equals("unspecified")) {
/* 1079 */       localObject = (String)localObject + "[0] ";
/*      */     }
/* 1081 */     if (localqj1.c.length() == 0) {
/* 1082 */       localObject = (String)localObject + "ROOT ";
/*      */     } else {
/* 1084 */       localObject = (String)localObject + localqj1.c + " ";
/*      */     }
/* 1086 */     int i6 = 16777215;
/* 1087 */     this.l.a((String)localObject, i2 - i1, i3 - i1 / 2 - 16, i6);
/* 1088 */     this.l.a(localObject = localDecimalFormat.format(localqj1.b) + "%", i2 + i1 - this.l.a((String)localObject), i3 - i1 / 2 - 16, i6);
/*      */     
/*      */ 
/* 1091 */     for (int i5 = 0; i5 < localList.size(); i5++) {
/* 1092 */       qj localqj2 = (qj)localList.get(i5);
/* 1093 */       String str = "";
/* 1094 */       if (localqj2.c.equals("unspecified")) {
/* 1095 */         str = str + "[?] ";
/*      */       } else {
/* 1097 */         str = str + "[" + (i5 + 1) + "] ";
/*      */       }
/*      */       
/* 1100 */       str = str + localqj2.c;
/* 1101 */       this.l.a(str, i2 - i1, i3 + i1 / 2 + i5 * 8 + 20, localqj2.a());
/* 1102 */       this.l.a(str = localDecimalFormat.format(localqj2.a) + "%", i2 + i1 - 50 - this.l.a(str), i3 + i1 / 2 + i5 * 8 + 20, localqj2.a());
/* 1103 */       this.l.a(str = localDecimalFormat.format(localqj2.b) + "%", i2 + i1 - this.l.a(str), i3 + i1 / 2 + i5 * 8 + 20, localqj2.a());
/*      */     }
/*      */   }
/*      */   
/*      */   public void k() {
/* 1108 */     this.A = false;
/*      */   }
/*      */   
/*      */   public void l() {
/* 1112 */     if (!Display.isActive()) return;
/* 1113 */     if (this.x) return;
/* 1114 */     this.x = true;
/* 1115 */     this.v.a();
/* 1116 */     a(null);
/* 1117 */     this.U = 10000;
/*      */   }
/*      */   
/*      */   public void m() {
/* 1121 */     if (!this.x) return;
/* 1122 */     bal.a();
/* 1123 */     this.x = false;
/* 1124 */     this.v.b();
/*      */   }
/*      */   
/*      */   public void n() {
/* 1128 */     if (this.n != null) { return;
/*      */     }
/* 1130 */     a(new bdp());
/* 1131 */     if ((G()) && (!this.X.a())) {
/* 1132 */       this.aw.b();
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(boolean paramBoolean) {
/* 1137 */     if (!paramBoolean) this.U = 0;
/* 1138 */     if (this.U > 0) { return;
/*      */     }
/* 1140 */     if ((paramBoolean) && (this.t != null) && (this.t.a == azv.b)) {
/* 1141 */       int i1 = this.t.b;
/* 1142 */       int i2 = this.t.c;
/* 1143 */       int i3 = this.t.d;
/*      */       
/* 1145 */       if (this.f.a(i1, i2, i3).o() != awt.a) {
/* 1146 */         this.c.c(i1, i2, i3, this.t.e);
/* 1147 */         if (this.h.d(i1, i2, i3)) {
/* 1148 */           this.k.a(i1, i2, i3, this.t.e);
/* 1149 */           this.h.ba();
/*      */         }
/*      */       }
/* 1152 */       return;
/*      */     }
/*      */     
/* 1155 */     this.c.c();
/*      */   }
/*      */   
/*      */   private void al() {
/* 1159 */     if (this.U > 0) return;
/* 1160 */     this.h.ba();
/*      */     
/* 1162 */     if (this.t == null) {
/* 1163 */       F.error("Null returned as 'hitResult', this shouldn't happen!");
/* 1164 */       if (this.c.g()) {
/* 1165 */         this.U = 10;
/*      */       }
/* 1167 */       return;
/*      */     }
/*      */     
/* 1170 */     switch (bax.a[this.t.a.ordinal()]) {
/*      */     case 1: 
/* 1172 */       this.c.a(this.h, this.t.g);
/* 1173 */       break;
/*      */     case 2: 
/* 1175 */       int i1 = this.t.b;
/* 1176 */       int i2 = this.t.c;
/* 1177 */       int i3 = this.t.d;
/*      */       
/* 1179 */       if (this.f.a(i1, i2, i3).o() == awt.a) {
/* 1180 */         if (this.c.g()) {
/* 1181 */           this.U = 10;
/*      */         }
/*      */       } else {
/* 1184 */         this.c.b(i1, i2, i3, this.t.e);
/*      */       }
/*      */       break;
/*      */     }
/*      */   }
/*      */   
/*      */   private void am() {
/* 1191 */     this.ad = 4;
/* 1192 */     int i1 = 1;
/*      */     
/* 1194 */     add localadd1 = this.h.bm.h();
/* 1195 */     if (this.t == null) {
/* 1196 */       F.warn("Null returned as 'hitResult', this shouldn't happen!");
/*      */     } else {
/* 1198 */       switch (bax.a[this.t.a.ordinal()]) {
/*      */       case 1: 
/* 1200 */         if (this.c.b(this.h, this.t.g)) {
/* 1201 */           i1 = 0;
/*      */         }
/*      */         break;
/*      */       case 2: 
/* 1205 */         int i2 = this.t.b;
/* 1206 */         int i3 = this.t.c;
/* 1207 */         int i4 = this.t.d;
/*      */         
/* 1209 */         if (this.f.a(i2, i3, i4).o() != awt.a) {
/* 1210 */           int i5 = localadd1 != null ? localadd1.b : 0;
/* 1211 */           if (this.c.a(this.h, this.f, localadd1, i2, i3, i4, this.t.e, this.t.f)) {
/* 1212 */             i1 = 0;
/* 1213 */             this.h.ba();
/*      */           }
/* 1215 */           if (localadd1 == null) {
/* 1216 */             return;
/*      */           }
/*      */           
/* 1219 */           if (localadd1.b == 0) {
/* 1220 */             this.h.bm.a[this.h.bm.c] = null;
/* 1221 */           } else if ((localadd1.b != i5) || (this.c.h())) {
/* 1222 */             this.p.c.b();
/*      */           }
/*      */         }
/*      */         break;
/*      */       }
/*      */       
/*      */     }
/* 1229 */     if (i1 != 0) {
/* 1230 */       add localadd2 = this.h.bm.h();
/* 1231 */       if ((localadd2 != null) && 
/* 1232 */         (this.c.a(this.h, this.f, localadd2))) {
/* 1233 */         this.p.c.c();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void o()
/*      */   {
/*      */     try {
/* 1241 */       this.N = (!this.N);
/* 1242 */       if (this.N) {
/* 1243 */         ai();
/* 1244 */         this.d = Display.getDisplayMode().getWidth();
/* 1245 */         this.e = Display.getDisplayMode().getHeight();
/* 1246 */         if (this.d <= 0) this.d = 1;
/* 1247 */         if (this.e <= 0) this.e = 1;
/*      */       } else {
/* 1249 */         Display.setDisplayMode(new DisplayMode(this.V, this.W));
/* 1250 */         this.d = this.V;
/* 1251 */         this.e = this.W;
/* 1252 */         if (this.d <= 0) this.d = 1;
/* 1253 */         if (this.e <= 0) this.e = 1;
/*      */       }
/* 1255 */       if (this.n != null) {
/* 1256 */         a(this.d, this.e);
/*      */       } else {
/* 1258 */         an();
/*      */       }
/* 1260 */       Display.setFullscreen(this.N);
/* 1261 */       Display.setVSyncEnabled(this.u.t);
/* 1262 */       g();
/*      */     } catch (Exception localException) {
/* 1264 */       F.error("Couldn't toggle fullscreen", localException);
/*      */     }
/*      */   }
/*      */   
/*      */   private void a(int paramInt1, int paramInt2) {
/* 1269 */     this.d = (paramInt1 <= 0 ? 1 : paramInt1);
/* 1270 */     this.e = (paramInt2 <= 0 ? 1 : paramInt2);
/*      */     
/* 1272 */     if (this.n != null) {
/* 1273 */       bca localbca = new bca(this, paramInt1, paramInt2);
/* 1274 */       int i1 = localbca.a();
/* 1275 */       int i2 = localbca.b();
/* 1276 */       this.n.a(this, i1, i2);
/*      */     }
/* 1278 */     this.o = new bbo(this);
/* 1279 */     an();
/*      */   }
/*      */   
/*      */   private void an() {
/* 1283 */     this.au.a(this.d, this.e);
/* 1284 */     if (this.p != null) {
/* 1285 */       this.p.a(this.d, this.e);
/*      */     }
/*      */   }
/*      */   
/*      */   public void p() {
/* 1290 */     this.z.a("scheduledExecutables");
/* 1291 */     synchronized (this.aB) {
/* 1292 */       while (!this.aB.isEmpty()) {
/* 1293 */         ((FutureTask)this.aB.poll()).run();
/*      */       }
/*      */     }
/* 1296 */     this.z.b();
/*      */     
/* 1298 */     if (this.ad > 0) { this.ad -= 1;
/*      */     }
/* 1300 */     this.z.a("gui");
/* 1301 */     if (!this.T) this.r.a();
/* 1302 */     this.z.c("pick");
/* 1303 */     this.p.a(1.0F);
/*      */     
/* 1305 */     this.z.c("gameMode");
/* 1306 */     if ((!this.T) && (this.f != null)) this.c.e();
/* 1307 */     this.z.c("textures");
/* 1308 */     if (!this.T) {
/* 1309 */       this.L.e();
/*      */     }
/*      */     
/* 1312 */     if ((this.n == null) && (this.h != null)) {
/* 1313 */       if (this.h.aS() <= 0.0F) {
/* 1314 */         a(null);
/* 1315 */       } else if ((this.h.bm()) && (this.f != null)) {
/* 1316 */         a(new bdi());
/*      */       }
/* 1318 */     } else if ((this.n != null) && ((this.n instanceof bdi)) && (!this.h.bm())) {
/* 1319 */       a(null);
/*      */     }
/*      */     
/* 1322 */     if (this.n != null) {
/* 1323 */       this.U = 10000;
/*      */     }
/*      */     k localk;
/* 1326 */     if (this.n != null) {
/*      */       b localb1;
/* 1328 */       try { this.n.p();
/*      */       } catch (Throwable localThrowable1) {
/* 1330 */         localb1 = b.a(localThrowable1, "Updating screen events");
/* 1331 */         localk = localb1.a("Affected screen");
/* 1332 */         localk.a("Screen name", new baz(this));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1338 */         throw new s(localb1);
/*      */       }
/*      */       
/* 1341 */       if (this.n != null) {
/*      */         try {
/* 1343 */           this.n.e();
/*      */         } catch (Throwable localThrowable2) {
/* 1345 */           localb1 = b.a(localThrowable2, "Ticking screen");
/* 1346 */           localk = localb1.a("Affected screen");
/* 1347 */           localk.a("Screen name", new bba(this));
/*      */           
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1353 */           throw new s(localb1);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1358 */     if ((this.n == null) || (this.n.p)) {
/* 1359 */       this.z.c("mouse");
/*      */       
/* 1361 */       while (Mouse.next()) {
/* 1362 */         int i1 = Mouse.getEventButton();
/*      */         
/* 1364 */         bal.a(i1 - 100, Mouse.getEventButtonState());
/* 1365 */         if (Mouse.getEventButtonState()) {
/* 1366 */           bal.a(i1 - 100);
/*      */         }
/*      */         
/* 1369 */         long l1 = K() - this.y;
/* 1370 */         if (l1 <= 200L)
/*      */         {
/* 1372 */           int i3 = Mouse.getEventDWheel();
/* 1373 */           if (i3 != 0) {
/* 1374 */             this.h.bm.c(i3);
/*      */             
/* 1376 */             if (this.u.aA) {
/* 1377 */               if (i3 > 0) i3 = 1;
/* 1378 */               if (i3 < 0) { i3 = -1;
/*      */               }
/* 1380 */               this.u.aD += i3 * 0.25F;
/*      */             }
/*      */           }
/*      */           
/* 1384 */           if (this.n == null) {
/* 1385 */             if ((!this.x) && (Mouse.getEventButtonState())) {
/* 1386 */               l();
/*      */             }
/* 1388 */           } else if (this.n != null) {
/* 1389 */             this.n.k();
/*      */           }
/*      */         }
/*      */       }
/* 1393 */       if (this.U > 0) { this.U -= 1;
/*      */       }
/* 1395 */       this.z.c("keyboard");
/* 1396 */       while (Keyboard.next()) {
/* 1397 */         bal.a(Keyboard.getEventKey(), Keyboard.getEventKeyState());
/*      */         
/* 1399 */         if (Keyboard.getEventKeyState()) {
/* 1400 */           bal.a(Keyboard.getEventKey());
/*      */         }
/*      */         
/* 1403 */         if (this.am > 0L) {
/* 1404 */           if (K() - this.am >= 6000L) {
/* 1405 */             throw new s(new b("Manually triggered debug crash", new Throwable()));
/*      */           }
/*      */           
/* 1408 */           if ((!Keyboard.isKeyDown(46)) || (!Keyboard.isKeyDown(61))) {
/* 1409 */             this.am = -1L;
/*      */           }
/* 1411 */         } else if ((Keyboard.isKeyDown(46)) && (Keyboard.isKeyDown(61))) {
/* 1412 */           this.am = K();
/*      */         }
/*      */         
/* 1415 */         aa();
/*      */         
/* 1417 */         if (Keyboard.getEventKeyState()) {
/* 1418 */           if ((Keyboard.getEventKey() == 62) && 
/* 1419 */             (this.p != null)) {
/* 1420 */             this.p.b();
/*      */           }
/*      */           
/*      */ 
/* 1424 */           if (this.n != null) {
/* 1425 */             this.n.l();
/*      */           } else {
/* 1427 */             if (Keyboard.getEventKey() == 1) {
/* 1428 */               n();
/*      */             }
/*      */             
/* 1431 */             if ((Keyboard.getEventKey() == 31) && (Keyboard.isKeyDown(61))) {
/* 1432 */               c();
/*      */             }
/* 1434 */             if ((Keyboard.getEventKey() == 20) && (Keyboard.isKeyDown(61))) {
/* 1435 */               c();
/*      */             }
/* 1437 */             if ((Keyboard.getEventKey() == 33) && (Keyboard.isKeyDown(61))) {
/* 1438 */               i2 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
/* 1439 */               this.u.a(bbm.f, i2 != 0 ? -1 : 1);
/*      */             }
/* 1441 */             if ((Keyboard.getEventKey() == 30) && (Keyboard.isKeyDown(61))) {
/* 1442 */               this.g.a();
/*      */             }
/* 1444 */             if ((Keyboard.getEventKey() == 35) && (Keyboard.isKeyDown(61))) {
/* 1445 */               this.u.v = (!this.u.v);
/* 1446 */               this.u.b();
/*      */             }
/* 1448 */             if ((Keyboard.getEventKey() == 48) && (Keyboard.isKeyDown(61))) {
/* 1449 */               bnn.p = !bnn.p;
/*      */             }
/* 1451 */             if ((Keyboard.getEventKey() == 25) && (Keyboard.isKeyDown(61))) {
/* 1452 */               this.u.w = (!this.u.w);
/* 1453 */               this.u.b();
/*      */             }
/* 1455 */             if (Keyboard.getEventKey() == 59) {
/* 1456 */               this.u.av = (!this.u.av);
/*      */             }
/* 1458 */             if (Keyboard.getEventKey() == 61) {
/* 1459 */               this.u.ax = (!this.u.ax);
/* 1460 */               this.u.ay = bdw.r();
/*      */             }
/* 1462 */             if (this.u.ak.f()) {
/* 1463 */               this.u.aw += 1;
/* 1464 */               if (this.u.aw > 2) {
/* 1465 */                 this.u.aw = 0;
/*      */               }
/*      */             }
/* 1468 */             if (this.u.al.f()) {
/* 1469 */               this.u.aB = (!this.u.aB);
/*      */             }
/*      */           }
/*      */           
/* 1473 */           if ((this.u.ax) && (this.u.ay)) {
/* 1474 */             if (Keyboard.getEventKey() == 11) {
/* 1475 */               b(0);
/*      */             }
/* 1477 */             for (i2 = 0; i2 < 9; i2++) {
/* 1478 */               if (Keyboard.getEventKey() == 2 + i2) {
/* 1479 */                 b(i2 + 1);
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       
/* 1486 */       for (int i2 = 0; i2 < 9; i2++) {
/* 1487 */         if (this.u.ar[i2].f()) { this.h.bm.c = i2;
/*      */         }
/*      */       }
/* 1490 */       i2 = this.u.m != zb.c ? 1 : 0;
/*      */       
/* 1492 */       while (this.u.aa.f()) {
/* 1493 */         if (this.c.j()) {
/* 1494 */           this.h.j();
/*      */         } else {
/* 1496 */           v().a(new is(it.c));
/* 1497 */           a(new bfu(this.h));
/*      */         }
/*      */       }
/* 1500 */       while (this.u.ac.f())
/* 1501 */         this.h.a(bdw.q());
/* 1502 */       while ((this.u.ag.f()) && (i2 != 0))
/* 1503 */         a(new bct());
/* 1504 */       if ((this.n == null) && (this.u.ai.f()) && (i2 != 0)) { a(new bct("/"));
/*      */       }
/* 1506 */       if (this.h.by()) {
/* 1507 */         if (!this.u.ab.d()) {
/* 1508 */           this.c.c(this.h);
/*      */         }
/*      */         
/* 1511 */         while (this.u.ad.f()) {}
/*      */         
/* 1513 */         while (this.u.ab.f()) {}
/*      */         
/* 1515 */         while (this.u.ae.f()) {}
/*      */       }
/*      */       
/* 1518 */       while (this.u.ad.f()) {
/* 1519 */         al();
/*      */       }
/* 1521 */       while (this.u.ab.f()) {
/* 1522 */         am();
/*      */       }
/* 1524 */       while (this.u.ae.f()) {
/* 1525 */         ao();
/*      */       }
/*      */       
/*      */ 
/* 1529 */       if ((this.u.ab.d()) && (this.ad == 0) && (!this.h.by())) {
/* 1530 */         am();
/*      */       }
/*      */       
/* 1533 */       a((this.n == null) && (this.u.ad.d()) && (this.x));
/*      */     }
/*      */     
/* 1536 */     if (this.f != null) {
/* 1537 */       if (this.h != null) {
/* 1538 */         this.ah += 1;
/* 1539 */         if (this.ah == 30) {
/* 1540 */           this.ah = 0;
/* 1541 */           this.f.h(this.h);
/*      */         }
/*      */       }
/*      */       
/* 1545 */       this.z.c("gameRenderer");
/* 1546 */       if (!this.T) this.p.d();
/* 1547 */       this.z.c("levelRenderer");
/* 1548 */       if (!this.T) this.g.g();
/* 1549 */       this.z.c("level");
/* 1550 */       if (!this.T) {
/* 1551 */         if (this.f.q > 0) this.f.q -= 1;
/* 1552 */         this.f.h();
/*      */       }
/*      */     }
/*      */     
/*      */ 
/* 1557 */     if (!this.T) {
/* 1558 */       this.ax.a();
/* 1559 */       this.aw.a();
/*      */     }
/*      */     
/* 1562 */     if (this.f != null) {
/* 1563 */       if (!this.T) {
/* 1564 */         this.f.a(this.f.r != rd.a, true);
/*      */         try
/*      */         {
/* 1567 */           this.f.b();
/*      */         } catch (Throwable localThrowable3) {
/* 1569 */           b localb2 = b.a(localThrowable3, "Exception in world tick");
/* 1570 */           if (this.f == null) {
/* 1571 */             localk = localb2.a("Affected level");
/* 1572 */             localk.a("Problem", "Level is null!");
/*      */           } else {
/* 1574 */             this.f.a(localb2);
/*      */           }
/* 1576 */           throw new s(localb2);
/*      */         }
/*      */       }
/* 1579 */       this.z.c("animateTick");
/* 1580 */       if ((!this.T) && (this.f != null)) this.f.C(qh.c(this.h.s), qh.c(this.h.t), qh.c(this.h.u));
/* 1581 */       this.z.c("particles");
/* 1582 */       if (!this.T) this.k.a();
/* 1583 */     } else if (this.ak != null) {
/* 1584 */       this.z.c("pendingConnection");
/* 1585 */       this.ak.a();
/*      */     }
/*      */     
/* 1588 */     this.z.b();
/*      */     
/* 1590 */     this.y = K();
/*      */   }
/*      */   
/*      */   public void a(String paramString1, String paramString2, ahj paramahj) {
/* 1594 */     a(null);
/* 1595 */     System.gc();
/*      */     
/* 1597 */     azc localazc = this.ab.a(paramString1, false);
/* 1598 */     ays localays = localazc.d();
/*      */     
/* 1600 */     if ((localays == null) && (paramahj != null)) {
/* 1601 */       localays = new ays(paramahj, paramString1);
/* 1602 */       localazc.a(localays);
/*      */     }
/*      */     
/* 1605 */     if (paramahj == null) {
/* 1606 */       paramahj = new ahj(localays);
/*      */     }
/*      */     try
/*      */     {
/* 1610 */       this.X = new bsx(this, paramString1, paramString2, paramahj);
/* 1611 */       this.X.x();
/* 1612 */       this.al = true;
/*      */     } catch (Throwable localThrowable) {
/* 1614 */       b localb = b.a(localThrowable, "Starting integrated server");
/* 1615 */       k localk = localb.a("Starting integrated server");
/*      */       
/* 1617 */       localk.a("Level ID", paramString1);
/* 1618 */       localk.a("Level Name", paramString2);
/*      */       
/* 1620 */       throw new s(localb);
/*      */     }
/*      */     
/* 1623 */     this.o.a(brp.a("menu.loadingLevel", new Object[0]));
/* 1624 */     while (!this.X.aj()) {
/* 1625 */       localObject = this.X.f();
/* 1626 */       if (localObject != null) {
/* 1627 */         this.o.c(brp.a((String)localObject, new Object[0]));
/*      */       } else {
/* 1629 */         this.o.c("");
/*      */       }
/*      */       try {
/* 1632 */         Thread.sleep(200L);
/*      */       }
/*      */       catch (InterruptedException localInterruptedException) {}
/*      */     }
/* 1636 */     a(null);
/*      */     
/* 1638 */     Object localObject = this.X.ai().a();
/* 1639 */     ej localej = ej.a((SocketAddress)localObject);
/* 1640 */     localej.a(new biz(localej, this, null));
/* 1641 */     localej.a(new jp(5, localObject.toString(), 0, eo.d), new GenericFutureListener[0]);
/* 1642 */     localej.a(new jw(M().e()), new GenericFutureListener[0]);
/* 1643 */     this.ak = localej;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(bjf parambjf)
/*      */   {
/* 1652 */     a(parambjf, "");
/*      */   }
/*      */   
/*      */   public void a(bjf parambjf, String paramString) {
/* 1656 */     if (parambjf == null)
/*      */     {
/* 1658 */       bjb localbjb = v();
/* 1659 */       if (localbjb != null) {
/* 1660 */         localbjb.c();
/*      */       }
/*      */       
/* 1663 */       if (this.X != null) {
/* 1664 */         this.X.r();
/*      */       }
/* 1666 */       this.X = null;
/* 1667 */       this.q.b();
/*      */       
/* 1669 */       this.p.i().a();
/*      */     }
/*      */     
/* 1672 */     this.i = null;
/* 1673 */     this.ak = null;
/*      */     
/* 1675 */     if (this.o != null) {
/* 1676 */       this.o.b(paramString);
/* 1677 */       this.o.c("");
/*      */     }
/*      */     
/* 1680 */     if ((parambjf == null) && (this.f != null)) {
/* 1681 */       if (this.ar.e() != null) {
/* 1682 */         C();
/*      */       }
/* 1684 */       this.ar.f();
/* 1685 */       a(null);
/* 1686 */       this.al = false;
/*      */     }
/*      */     
/* 1689 */     this.aw.c();
/*      */     
/* 1691 */     this.f = parambjf;
/*      */     
/* 1693 */     if (parambjf != null) {
/* 1694 */       if (this.g != null) this.g.a(parambjf);
/* 1695 */       if (this.k != null) { this.k.a(parambjf);
/*      */       }
/* 1697 */       if (this.h == null) {
/* 1698 */         this.h = this.c.a(parambjf, new pq());
/* 1699 */         this.c.b(this.h);
/*      */       }
/*      */       
/* 1702 */       this.h.A();
/* 1703 */       parambjf.d(this.h);
/*      */       
/* 1705 */       this.h.c = new blj(this.u);
/*      */       
/* 1707 */       this.c.a(this.h);
/* 1708 */       this.i = this.h;
/*      */     } else {
/* 1710 */       this.ab.d();
/* 1711 */       this.h = null;
/*      */     }
/*      */     
/* 1714 */     System.gc();
/* 1715 */     this.y = 0L;
/*      */   }
/*      */   
/*      */   public String q() {
/* 1719 */     return this.g.d();
/*      */   }
/*      */   
/*      */   public String r() {
/* 1723 */     return this.g.e();
/*      */   }
/*      */   
/*      */   public String s() {
/* 1727 */     return this.f.A();
/*      */   }
/*      */   
/*      */   public String t() {
/* 1731 */     return "P: " + this.k.b() + ". T: " + this.f.z();
/*      */   }
/*      */   
/*      */   public void a(int paramInt) {
/* 1735 */     this.f.f();
/* 1736 */     this.f.a();
/*      */     
/* 1738 */     int i1 = 0;
/* 1739 */     String str = null;
/* 1740 */     if (this.h != null) {
/* 1741 */       i1 = this.h.y();
/* 1742 */       this.f.e(this.h);
/* 1743 */       str = this.h.l();
/*      */     }
/*      */     
/* 1746 */     this.i = null;
/* 1747 */     this.h = this.c.a(this.f, this.h == null ? new pq() : this.h.m());
/* 1748 */     this.h.ap = paramInt;
/* 1749 */     this.i = this.h;
/* 1750 */     this.h.A();
/* 1751 */     this.h.b(str);
/* 1752 */     this.f.d(this.h);
/* 1753 */     this.c.b(this.h);
/*      */     
/* 1755 */     this.h.c = new blj(this.u);
/* 1756 */     this.h.d(i1);
/* 1757 */     this.c.a(this.h);
/*      */     
/* 1759 */     if ((this.n instanceof bdc)) a(null);
/*      */   }
/*      */   
/*      */   public final boolean u() {
/* 1763 */     return this.aj;
/*      */   }
/*      */   
/*      */   public bjb v() {
/* 1767 */     if (this.h != null) {
/* 1768 */       return this.h.a;
/*      */     }
/* 1770 */     return null;
/*      */   }
/*      */   
/*      */   public static boolean w() {
/* 1774 */     return (M == null) || (!M.u.av);
/*      */   }
/*      */   
/*      */   public static boolean x() {
/* 1778 */     return (M != null) && (M.u.i);
/*      */   }
/*      */   
/*      */   public static boolean y() {
/* 1782 */     return (M != null) && (M.u.j != 0);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   private void ao()
/*      */   {
/* 1794 */     if (this.t == null) {
/* 1795 */       return;
/*      */     }
/*      */     
/* 1798 */     boolean bool1 = this.h.bE.d;
/*      */     
/* 1800 */     int i1 = 0;
/* 1801 */     boolean bool2 = false;
/*      */     adb localadb;
/* 1803 */     if (this.t.a == azv.b) {
/* 1804 */       int i2 = this.t.b;
/* 1805 */       int i4 = this.t.c;
/* 1806 */       int i5 = this.t.d;
/*      */       
/* 1808 */       aji localaji1 = this.f.a(i2, i4, i5);
/*      */       
/* 1810 */       if (localaji1.o() == awt.a) {
/* 1811 */         return;
/*      */       }
/*      */       
/* 1814 */       localadb = localaji1.d(this.f, i2, i4, i5);
/* 1815 */       if (localadb == null) {
/* 1816 */         return;
/*      */       }
/*      */       
/* 1819 */       bool2 = localadb.n();
/*      */       
/* 1821 */       aji localaji2 = ((localadb instanceof abh)) && (!localaji1.K()) ? aji.a(localadb) : localaji1;
/*      */       
/* 1823 */       i1 = localaji2.k(this.f, i2, i4, i5);
/* 1824 */     } else if ((this.t.a == azv.c) && (this.t.g != null) && (bool1)) {
/* 1825 */       if ((this.t.g instanceof tb)) {
/* 1826 */         localadb = ade.an;
/* 1827 */       } else if ((this.t.g instanceof su)) {
/* 1828 */         localadb = ade.ca; } else { Object localObject;
/* 1829 */         if ((this.t.g instanceof st)) {
/* 1830 */           localObject = (st)this.t.g;
/* 1831 */           add localadd = ((st)localObject).j();
/* 1832 */           if (localadd == null) {
/* 1833 */             localadb = ade.bD;
/*      */           } else {
/* 1835 */             localadb = localadd.b();
/* 1836 */             i1 = localadd.k();
/* 1837 */             bool2 = true;
/*      */           }
/* 1839 */         } else if ((this.t.g instanceof xl)) {
/* 1840 */           localObject = (xl)this.t.g;
/*      */           
/* 1842 */           if (((xl)localObject).m() == 2) {
/* 1843 */             localadb = ade.aJ;
/* 1844 */           } else if (((xl)localObject).m() == 1) {
/* 1845 */             localadb = ade.aI;
/* 1846 */           } else if (((xl)localObject).m() == 3) {
/* 1847 */             localadb = ade.bV;
/* 1848 */           } else if (((xl)localObject).m() == 5) {
/* 1849 */             localadb = ade.bW;
/* 1850 */           } else if (((xl)localObject).m() == 6) {
/* 1851 */             localadb = ade.cc;
/*      */           } else {
/* 1853 */             localadb = ade.au;
/*      */           }
/* 1855 */         } else if ((this.t.g instanceof xi)) {
/* 1856 */           localadb = ade.az;
/*      */         } else {
/* 1858 */           localadb = ade.bx;
/* 1859 */           i1 = sg.a(this.t.g);
/* 1860 */           bool2 = true;
/*      */           
/* 1862 */           if ((i1 > 0) && (sg.a.containsKey(Integer.valueOf(i1)))) {}
/*      */         }
/*      */       }
/*      */     }
/*      */     else {
/* 1867 */       return;
/*      */     }
/*      */     
/* 1870 */     this.h.bm.a(localadb, i1, bool2, bool1);
/*      */     
/* 1872 */     if (bool1) {
/* 1873 */       int i3 = this.h.bn.c.size() - 9 + this.h.bm.c;
/* 1874 */       this.c.a(this.h.bm.a(this.h.bm.c), i3);
/*      */     }
/*      */   }
/*      */   
/*      */   public b b(b paramb)
/*      */   {
/* 1880 */     paramb.g().a("Launched Version", new bbb(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1887 */     paramb.g().a("LWJGL", new bbc(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1894 */     paramb.g().a("OpenGL", new bbd(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1901 */     paramb.g().a("GL Caps", new bbe(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1908 */     paramb.g().a("Is Modded", new bbf(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1918 */     paramb.g().a("Type", new baq(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1925 */     paramb.g().a("Resource Packs", new bar(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1932 */     paramb.g().a("Current Language", new bas(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1939 */     paramb.g().a("Profiler Position", new bat(this));
/*      */     
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/* 1946 */     paramb.g().a("Vec3 Pool Size", new bau(this));
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
/* 1960 */     paramb.g().a("Anisotropic Filtering", new bav(this));
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
/* 1971 */     if (this.f != null) {
/* 1972 */       this.f.a(paramb);
/*      */     }
/*      */     
/* 1975 */     return paramb;
/*      */   }
/*      */   
/*      */   public static bao B() {
/* 1979 */     return M;
/*      */   }
/*      */   
/*      */   public void C() {
/* 1983 */     this.ae = true;
/*      */   }
/*      */   
/*      */   public void a(ri paramri)
/*      */   {
/* 1988 */     paramri.a("fps", Integer.valueOf(ac));
/* 1989 */     paramri.a("vsync_enabled", Boolean.valueOf(this.u.t));
/* 1990 */     paramri.a("display_frequency", Integer.valueOf(Display.getDisplayMode().getFrequency()));
/* 1991 */     paramri.a("display_type", this.N ? "fullscreen" : "windowed");
/* 1992 */     paramri.a("run_time", Long.valueOf((MinecraftServer.ar() - paramri.g()) / 60L * 1000L));
/*      */     
/* 1994 */     paramri.a("resource_packs", Integer.valueOf(this.ar.c().size()));
/* 1995 */     int i1 = 0;
/* 1996 */     for (brf localbrf : this.ar.c()) {
/* 1997 */       paramri.a("resource_pack[" + i1++ + "]", localbrf.d());
/*      */     }
/*      */     
/* 2000 */     if ((this.X != null) && (this.X.an() != null)) {
/* 2001 */       paramri.a("snooper_partner", this.X.an().f());
/*      */     }
/*      */   }
/*      */   
/*      */   public void b(ri paramri)
/*      */   {
/* 2007 */     paramri.b("opengl_version", GL11.glGetString(7938));
/* 2008 */     paramri.b("opengl_vendor", GL11.glGetString(7936));
/* 2009 */     paramri.b("client_brand", ClientBrandRetriever.getClientModName());
/* 2010 */     paramri.b("launched_version", this.Z);
/*      */     
/* 2012 */     ContextCapabilities localContextCapabilities = GLContext.getCapabilities();
/* 2013 */     paramri.b("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(localContextCapabilities.GL_ARB_arrays_of_arrays));
/* 2014 */     paramri.b("gl_caps[ARB_base_instance]", Boolean.valueOf(localContextCapabilities.GL_ARB_base_instance));
/* 2015 */     paramri.b("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(localContextCapabilities.GL_ARB_blend_func_extended));
/* 2016 */     paramri.b("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_clear_buffer_object));
/* 2017 */     paramri.b("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_color_buffer_float));
/* 2018 */     paramri.b("gl_caps[ARB_compatibility]", Boolean.valueOf(localContextCapabilities.GL_ARB_compatibility));
/* 2019 */     paramri.b("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(localContextCapabilities.GL_ARB_compressed_texture_pixel_storage));
/* 2020 */     paramri.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_compute_shader));
/* 2021 */     paramri.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_buffer));
/* 2022 */     paramri.b("gl_caps[ARB_copy_image]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_image));
/* 2023 */     paramri.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_buffer_float));
/* 2024 */     paramri.b("gl_caps[ARB_compute_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_compute_shader));
/* 2025 */     paramri.b("gl_caps[ARB_copy_buffer]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_buffer));
/* 2026 */     paramri.b("gl_caps[ARB_copy_image]", Boolean.valueOf(localContextCapabilities.GL_ARB_copy_image));
/* 2027 */     paramri.b("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_buffer_float));
/* 2028 */     paramri.b("gl_caps[ARB_depth_clamp]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_clamp));
/* 2029 */     paramri.b("gl_caps[ARB_depth_texture]", Boolean.valueOf(localContextCapabilities.GL_ARB_depth_texture));
/* 2030 */     paramri.b("gl_caps[ARB_draw_buffers]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_buffers));
/* 2031 */     paramri.b("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_buffers_blend));
/* 2032 */     paramri.b("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_elements_base_vertex));
/* 2033 */     paramri.b("gl_caps[ARB_draw_indirect]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_indirect));
/* 2034 */     paramri.b("gl_caps[ARB_draw_instanced]", Boolean.valueOf(localContextCapabilities.GL_ARB_draw_instanced));
/* 2035 */     paramri.b("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(localContextCapabilities.GL_ARB_explicit_attrib_location));
/* 2036 */     paramri.b("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(localContextCapabilities.GL_ARB_explicit_uniform_location));
/* 2037 */     paramri.b("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_layer_viewport));
/* 2038 */     paramri.b("gl_caps[ARB_fragment_program]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_program));
/* 2039 */     paramri.b("gl_caps[ARB_fragment_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_shader));
/* 2040 */     paramri.b("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(localContextCapabilities.GL_ARB_fragment_program_shadow));
/* 2041 */     paramri.b("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_framebuffer_object));
/* 2042 */     paramri.b("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(localContextCapabilities.GL_ARB_framebuffer_sRGB));
/* 2043 */     paramri.b("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(localContextCapabilities.GL_ARB_geometry_shader4));
/* 2044 */     paramri.b("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(localContextCapabilities.GL_ARB_gpu_shader5));
/* 2045 */     paramri.b("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(localContextCapabilities.GL_ARB_half_float_pixel));
/* 2046 */     paramri.b("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(localContextCapabilities.GL_ARB_half_float_vertex));
/* 2047 */     paramri.b("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(localContextCapabilities.GL_ARB_instanced_arrays));
/* 2048 */     paramri.b("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(localContextCapabilities.GL_ARB_map_buffer_alignment));
/* 2049 */     paramri.b("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(localContextCapabilities.GL_ARB_map_buffer_range));
/* 2050 */     paramri.b("gl_caps[ARB_multisample]", Boolean.valueOf(localContextCapabilities.GL_ARB_multisample));
/* 2051 */     paramri.b("gl_caps[ARB_multitexture]", Boolean.valueOf(localContextCapabilities.GL_ARB_multitexture));
/* 2052 */     paramri.b("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(localContextCapabilities.GL_ARB_occlusion_query2));
/* 2053 */     paramri.b("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_pixel_buffer_object));
/* 2054 */     paramri.b("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(localContextCapabilities.GL_ARB_seamless_cube_map));
/* 2055 */     paramri.b("gl_caps[ARB_shader_objects]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_objects));
/* 2056 */     paramri.b("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_stencil_export));
/* 2057 */     paramri.b("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(localContextCapabilities.GL_ARB_shader_texture_lod));
/* 2058 */     paramri.b("gl_caps[ARB_shadow]", Boolean.valueOf(localContextCapabilities.GL_ARB_shadow));
/* 2059 */     paramri.b("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(localContextCapabilities.GL_ARB_shadow_ambient));
/* 2060 */     paramri.b("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(localContextCapabilities.GL_ARB_stencil_texturing));
/* 2061 */     paramri.b("gl_caps[ARB_sync]", Boolean.valueOf(localContextCapabilities.GL_ARB_sync));
/* 2062 */     paramri.b("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_tessellation_shader));
/* 2063 */     paramri.b("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_border_clamp));
/* 2064 */     paramri.b("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_buffer_object));
/* 2065 */     paramri.b("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_cube_map));
/* 2066 */     paramri.b("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_cube_map_array));
/* 2067 */     paramri.b("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(localContextCapabilities.GL_ARB_texture_non_power_of_two));
/* 2068 */     paramri.b("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_uniform_buffer_object));
/* 2069 */     paramri.b("gl_caps[ARB_vertex_blend]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_blend));
/* 2070 */     paramri.b("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_buffer_object));
/* 2071 */     paramri.b("gl_caps[ARB_vertex_program]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_program));
/* 2072 */     paramri.b("gl_caps[ARB_vertex_shader]", Boolean.valueOf(localContextCapabilities.GL_ARB_vertex_shader));
/*      */     
/* 2074 */     paramri.b("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(localContextCapabilities.GL_EXT_bindable_uniform));
/* 2075 */     paramri.b("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_equation_separate));
/* 2076 */     paramri.b("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_func_separate));
/* 2077 */     paramri.b("gl_caps[EXT_blend_minmax]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_minmax));
/* 2078 */     paramri.b("gl_caps[EXT_blend_subtract]", Boolean.valueOf(localContextCapabilities.GL_EXT_blend_subtract));
/* 2079 */     paramri.b("gl_caps[EXT_draw_instanced]", Boolean.valueOf(localContextCapabilities.GL_EXT_draw_instanced));
/* 2080 */     paramri.b("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_multisample));
/* 2081 */     paramri.b("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_object));
/* 2082 */     paramri.b("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(localContextCapabilities.GL_EXT_framebuffer_sRGB));
/* 2083 */     paramri.b("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(localContextCapabilities.GL_EXT_geometry_shader4));
/* 2084 */     paramri.b("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(localContextCapabilities.GL_EXT_gpu_program_parameters));
/* 2085 */     paramri.b("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(localContextCapabilities.GL_EXT_gpu_shader4));
/* 2086 */     paramri.b("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(localContextCapabilities.GL_EXT_multi_draw_arrays));
/* 2087 */     paramri.b("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(localContextCapabilities.GL_EXT_packed_depth_stencil));
/* 2088 */     paramri.b("gl_caps[EXT_paletted_texture]", Boolean.valueOf(localContextCapabilities.GL_EXT_paletted_texture));
/* 2089 */     paramri.b("gl_caps[EXT_rescale_normal]", Boolean.valueOf(localContextCapabilities.GL_EXT_rescale_normal));
/* 2090 */     paramri.b("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(localContextCapabilities.GL_EXT_separate_shader_objects));
/* 2091 */     paramri.b("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(localContextCapabilities.GL_EXT_shader_image_load_store));
/* 2092 */     paramri.b("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(localContextCapabilities.GL_EXT_shadow_funcs));
/* 2093 */     paramri.b("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(localContextCapabilities.GL_EXT_shared_texture_palette));
/* 2094 */     paramri.b("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_clear_tag));
/* 2095 */     paramri.b("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_two_side));
/* 2096 */     paramri.b("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(localContextCapabilities.GL_EXT_stencil_wrap));
/* 2097 */     paramri.b("gl_caps[EXT_texture_3d]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_3d));
/* 2098 */     paramri.b("gl_caps[EXT_texture_array]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_array));
/* 2099 */     paramri.b("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_buffer_object));
/* 2100 */     paramri.b("gl_caps[EXT_texture_filter_anisotropic]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_filter_anisotropic));
/* 2101 */     paramri.b("gl_caps[EXT_texture_integer]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_integer));
/* 2102 */     paramri.b("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_lod_bias));
/* 2103 */     paramri.b("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(localContextCapabilities.GL_EXT_texture_sRGB));
/* 2104 */     paramri.b("gl_caps[EXT_vertex_shader]", Boolean.valueOf(localContextCapabilities.GL_EXT_vertex_shader));
/* 2105 */     paramri.b("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(localContextCapabilities.GL_EXT_vertex_weighting));
/*      */     
/* 2107 */     paramri.b("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger(35658)));
/* 2108 */     GL11.glGetError();
/* 2109 */     paramri.b("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger(35657)));
/* 2110 */     GL11.glGetError();
/* 2111 */     paramri.b("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger(34921)));
/* 2112 */     GL11.glGetError();
/* 2113 */     paramri.b("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35660)));
/* 2114 */     GL11.glGetError();
/* 2115 */     paramri.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(34930)));
/* 2116 */     GL11.glGetError();
/* 2117 */     paramri.b("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger(35071)));
/* 2118 */     GL11.glGetError();
/*      */     
/* 2120 */     paramri.b("gl_max_texture_size", Integer.valueOf(D()));
/*      */   }
/*      */   
/*      */   public static int D() {
/* 2124 */     for (int i1 = 16384; i1 > 0; i1 >>= 1) {
/* 2125 */       GL11.glTexImage2D(32868, 0, 6408, i1, i1, 0, 6408, 5121, (ByteBuffer)null);
/* 2126 */       int i2 = GL11.glGetTexLevelParameteri(32868, 0, 4096);
/* 2127 */       if (i2 != 0) {
/* 2128 */         return i1;
/*      */       }
/*      */     }
/* 2131 */     return -1;
/*      */   }
/*      */   
/*      */   public boolean W()
/*      */   {
/* 2136 */     return this.u.r;
/*      */   }
/*      */   
/*      */   public void a(bjn parambjn) {
/* 2140 */     this.K = parambjn;
/*      */   }
/*      */   
/*      */   public bjn E() {
/* 2144 */     return this.K;
/*      */   }
/*      */   
/*      */   public boolean F() {
/* 2148 */     return this.al;
/*      */   }
/*      */   
/*      */   public boolean G() {
/* 2152 */     return (this.al) && (this.X != null);
/*      */   }
/*      */   
/*      */   public bsx H() {
/* 2156 */     return this.X;
/*      */   }
/*      */   
/*      */   public static void I() {
/* 2160 */     if (M == null) { return;
/*      */     }
/* 2162 */     bsx localbsx = M.H();
/* 2163 */     if (localbsx != null) {
/* 2164 */       localbsx.o();
/*      */     }
/*      */   }
/*      */   
/*      */   public ri J() {
/* 2169 */     return this.R;
/*      */   }
/*      */   
/*      */   public static long K() {
/* 2173 */     return Sys.getTime() * 1000L / Sys.getTimerResolution();
/*      */   }
/*      */   
/*      */   public boolean L() {
/* 2177 */     return this.N;
/*      */   }
/*      */   
/*      */   public bbs M() {
/* 2181 */     return this.S;
/*      */   }
/*      */   
/*      */   public Multimap N() {
/* 2185 */     return this.J;
/*      */   }
/*      */   
/*      */   public Proxy O() {
/* 2189 */     return this.aa;
/*      */   }
/*      */   
/*      */   public bqf P() {
/* 2193 */     return this.L;
/*      */   }
/*      */   
/*      */   public bqy Q() {
/* 2197 */     return this.an;
/*      */   }
/*      */   
/*      */   public brc R() {
/* 2201 */     return this.ar;
/*      */   }
/*      */   
/*      */   public brr S() {
/* 2205 */     return this.as;
/*      */   }
/*      */   
/*      */   public bpz T() {
/* 2209 */     return this.av;
/*      */   }
/*      */   
/*      */   public boolean U() {
/* 2213 */     return this.ai;
/*      */   }
/*      */   
/*      */   public boolean V() {
/* 2217 */     return this.T;
/*      */   }
/*      */   
/*      */   public btp X() {
/* 2221 */     return this.aw;
/*      */   }
/*      */   
/*      */   public bth Y() {
/* 2225 */     if ((this.n instanceof beg)) {
/* 2226 */       return bth.d;
/*      */     }
/*      */     
/* 2229 */     if (this.h != null) {
/* 2230 */       if ((this.h.o.t instanceof aqp))
/* 2231 */         return bth.e;
/* 2232 */       if ((this.h.o.t instanceof aqr)) {
/* 2233 */         if ((bln.c != null) && (bln.b > 0)) {
/* 2234 */           return bth.f;
/*      */         }
/* 2236 */         return bth.g;
/*      */       }
/*      */       
/*      */ 
/* 2240 */       if ((this.h.bE.d) && (this.h.bE.c)) {
/* 2241 */         return bth.c;
/*      */       }
/*      */       
/* 2244 */       return bth.b;
/*      */     }
/*      */     
/* 2247 */     return bth.a;
/*      */   }
/*      */   
/*      */   public bum Z() {
/* 2251 */     return this.at;
/*      */   }
/*      */   
/*      */   public void aa() {
/* 2255 */     int i1 = Keyboard.getEventKey();
/* 2256 */     if ((i1 == 0) || (Keyboard.isRepeatEvent())) { return;
/*      */     }
/* 2258 */     if (((this.n instanceof bew)) && (((bew)this.n).g > K() - 20L)) { return;
/*      */     }
/* 2260 */     if (Keyboard.getEventKeyState()) {
/* 2261 */       if (i1 == this.u.an.i()) {
/* 2262 */         if (Z().n()) {
/* 2263 */           Z().u();
/* 2264 */         } else if (Z().m()) {
/* 2265 */           a(new bcw(new baw(this), brp.a("stream.confirm_start", new Object[0]), "", 0));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         }
/* 2274 */         else if ((!Z().D()) || (!Z().l())) {
/* 2275 */           bgp.a(this.n);
/* 2276 */         } else if (this.f != null) {
/* 2277 */           this.r.b().a(new fq("Not ready to start streaming yet!"));
/*      */         }
/* 2279 */       } else if (i1 == this.u.ao.i()) {
/* 2280 */         if (Z().n()) {
/* 2281 */           if (Z().o()) {
/* 2282 */             Z().r();
/*      */           } else {
/* 2284 */             Z().q();
/*      */           }
/*      */         }
/* 2287 */       } else if (i1 == this.u.ap.i()) {
/* 2288 */         if (Z().n()) {
/* 2289 */           Z().p();
/*      */         }
/* 2291 */       } else if (i1 == this.u.aq.i()) {
/* 2292 */         this.at.a(true);
/* 2293 */       } else if (i1 == this.u.am.i()) {
/* 2294 */         o();
/* 2295 */       } else if (i1 == this.u.aj.i()) {
/* 2296 */         this.r.b().a(bbp.a(this.w, this.d, this.e, this.au));
/*      */       }
/*      */     }
/* 2299 */     else if (i1 == this.u.aq.i()) {
/* 2300 */       this.at.a(false);
/*      */     }
/*      */   }
/*      */   
/*      */   public ListenableFuture a(Callable paramCallable)
/*      */   {
/* 2306 */     Validate.notNull(paramCallable);
/*      */     
/* 2308 */     if (!ab()) {
/* 2309 */       ListenableFutureTask localListenableFutureTask = ListenableFutureTask.create(paramCallable);
/* 2310 */       synchronized (this.aB) {
/* 2311 */         this.aB.add(localListenableFutureTask);
/*      */       }
/* 2313 */       return localListenableFutureTask;
/*      */     }
/*      */     try {
/* 2316 */       return Futures.immediateFuture(paramCallable.call());
/*      */     } catch (Exception localException) {
/* 2318 */       return Futures.immediateFailedCheckedFuture(localException);
/*      */     }
/*      */   }
/*      */   
/*      */   public ListenableFuture a(Runnable paramRunnable)
/*      */   {
/* 2324 */     Validate.notNull(paramRunnable);
/*      */     
/* 2326 */     return a(Executors.callable(paramRunnable));
/*      */   }
/*      */   
/*      */   public boolean ab() {
/* 2330 */     return Thread.currentThread() == this.aC;
/*      */   }
/*      */   
/*      */   public MinecraftSessionService ac() {
/* 2334 */     return this.az;
/*      */   }
/*      */   
/*      */   public brj ad() {
/* 2338 */     return this.aA;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */