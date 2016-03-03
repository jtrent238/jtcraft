/*      */ import com.google.gson.JsonSyntaxException;
/*      */ import java.io.IOException;
/*      */ import java.nio.FloatBuffer;
/*      */ import java.util.List;
/*      */ import java.util.Random;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
/*      */ import org.lwjgl.input.Mouse;
/*      */ import org.lwjgl.opengl.ContextCapabilities;
/*      */ import org.lwjgl.opengl.Display;
/*      */ import org.lwjgl.opengl.GL11;
/*      */ import org.lwjgl.opengl.GLContext;
/*      */ import org.lwjgl.util.glu.Project;
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
/*      */ public class blt
/*      */   implements bqz
/*      */ {
/*   44 */   private static final Logger q = ;
/*   45 */   private static final bqx r = new bqx("textures/environment/rain.png");
/*   46 */   private static final bqx s = new bqx("textures/environment/snow.png");
/*      */   
/*      */   public static boolean a;
/*      */   
/*      */   public static int b;
/*      */   
/*      */   private bao t;
/*      */   
/*      */   private float u;
/*      */   public final bly c;
/*      */   private final bbx v;
/*      */   private int w;
/*      */   private sa x;
/*   59 */   private qm y = new qm();
/*   60 */   private qm z = new qm();
/*      */   
/*      */ 
/*   63 */   private qm A = new qm();
/*   64 */   private qm B = new qm();
/*   65 */   private qm C = new qm();
/*   66 */   private qm D = new qm();
/*   67 */   private float E = 4.0F;
/*   68 */   private float F = 4.0F;
/*      */   
/*      */   private float G;
/*      */   
/*      */   private float H;
/*      */   
/*      */   private float I;
/*      */   
/*      */   private float J;
/*      */   
/*      */   private float K;
/*      */   
/*      */   private float L;
/*      */   
/*      */   private float M;
/*      */   private float N;
/*      */   private float O;
/*      */   private float P;
/*      */   private float Q;
/*      */   private float R;
/*      */   private float S;
/*      */   private final bpq T;
/*      */   private final int[] U;
/*      */   private final bqx V;
/*      */   private float W;
/*      */   private float X;
/*      */   private float Y;
/*      */   private float Z;
/*      */   private float aa;
/*      */   private boolean ab;
/*      */   private final bqy ac;
/*      */   public bpj d;
/*  100 */   private static final bqx[] ad = { new bqx("shaders/post/notch.json"), new bqx("shaders/post/fxaa.json"), new bqx("shaders/post/art.json"), new bqx("shaders/post/bumpy.json"), new bqx("shaders/post/blobs2.json"), new bqx("shaders/post/pencil.json"), new bqx("shaders/post/color_convolve.json"), new bqx("shaders/post/deconverge.json"), new bqx("shaders/post/flip.json"), new bqx("shaders/post/invert.json"), new bqx("shaders/post/ntsc.json"), new bqx("shaders/post/outline.json"), new bqx("shaders/post/phosphor.json"), new bqx("shaders/post/scan_pincushion.json"), new bqx("shaders/post/sobel.json"), new bqx("shaders/post/bits.json"), new bqx("shaders/post/desaturate.json"), new bqx("shaders/post/green.json"), new bqx("shaders/post/blur.json"), new bqx("shaders/post/wobble.json"), new bqx("shaders/post/blobs.json"), new bqx("shaders/post/antialias.json") };
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
/*  124 */   public static final int e = ad.length;
/*  125 */   private int ae = e;
/*      */   
/*      */   public blt(bao parambao, bqy parambqy) {
/*  128 */     this.t = parambao;
/*  129 */     this.ac = parambqy;
/*  130 */     this.v = new bbx(parambao.P());
/*  131 */     this.c = new bly(parambao);
/*      */     
/*  133 */     this.T = new bpq(16, 16);
/*  134 */     this.V = parambao.P().a("lightMap", this.T);
/*  135 */     this.U = this.T.d();
/*      */     
/*  137 */     this.d = null;
/*      */   }
/*      */   
/*      */   public boolean a() {
/*  141 */     return (buu.v) && (this.d != null);
/*      */   }
/*      */   
/*      */   public void b() {
/*  145 */     if (this.d != null) this.d.a();
/*  146 */     this.d = null;
/*  147 */     this.ae = e;
/*      */   }
/*      */   
/*      */   public void c() {
/*  151 */     if (!buu.v) {
/*  152 */       return;
/*      */     }
/*      */     
/*  155 */     if (this.d != null) {
/*  156 */       this.d.a();
/*      */     }
/*      */     
/*      */ 
/*  160 */     this.ae = ((this.ae + 1) % (ad.length + 1));
/*  161 */     if (this.ae != e) {
/*      */       try {
/*  163 */         q.info("Selecting effect " + ad[this.ae]);
/*  164 */         this.d = new bpj(this.t.P(), this.ac, this.t.a(), ad[this.ae]);
/*  165 */         this.d.a(this.t.d, this.t.e);
/*      */       } catch (IOException localIOException) {
/*  167 */         q.warn("Failed to load shader: " + ad[this.ae], localIOException);
/*  168 */         this.ae = e;
/*      */       } catch (JsonSyntaxException localJsonSyntaxException) {
/*  170 */         q.warn("Failed to load shader: " + ad[this.ae], localJsonSyntaxException);
/*  171 */         this.ae = e;
/*      */       }
/*      */     } else {
/*  174 */       this.d = null;
/*  175 */       q.info("No effect selected");
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(bqy parambqy)
/*      */   {
/*  181 */     if (this.d != null) {
/*  182 */       this.d.a();
/*      */     }
/*  184 */     if (this.ae != e) {
/*      */       try {
/*  186 */         this.d = new bpj(this.t.P(), parambqy, this.t.a(), ad[this.ae]);
/*  187 */         this.d.a(this.t.d, this.t.e);
/*      */       } catch (IOException localIOException) {
/*  189 */         q.warn("Failed to load shader: " + ad[this.ae], localIOException);
/*  190 */         this.ae = e;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void d() {
/*  196 */     if ((buu.v) && (bpn.b() == null)) {
/*  197 */       bpn.a();
/*      */     }
/*      */     
/*  200 */     j();
/*  201 */     k();
/*  202 */     this.an = this.ao;
/*  203 */     this.F = this.E;
/*  204 */     this.H = this.G;
/*  205 */     this.J = this.I;
/*  206 */     this.Q = this.P;
/*  207 */     this.S = this.R;
/*      */     
/*  209 */     if (this.t.u.aB)
/*      */     {
/*      */ 
/*  212 */       f1 = this.t.u.a * 0.6F + 0.2F;
/*  213 */       f2 = f1 * f1 * f1 * 8.0F;
/*  214 */       this.M = this.y.a(this.K, 0.05F * f2);
/*  215 */       this.N = this.z.a(this.L, 0.05F * f2);
/*  216 */       this.O = 0.0F;
/*      */       
/*  218 */       this.K = 0.0F;
/*  219 */       this.L = 0.0F;
/*      */     }
/*      */     
/*  222 */     if (this.t.i == null) {
/*  223 */       this.t.i = this.t.h;
/*      */     }
/*      */     
/*  226 */     float f1 = this.t.f.n(qh.c(this.t.i.s), qh.c(this.t.i.t), qh.c(this.t.i.u));
/*  227 */     float f2 = this.t.u.c / 16.0F;
/*  228 */     float f3 = f1 * (1.0F - f2) + f2;
/*  229 */     this.ao += (f3 - this.ao) * 0.1F;
/*      */     
/*  231 */     this.w += 1;
/*      */     
/*  233 */     this.c.a();
/*  234 */     l();
/*      */     
/*  236 */     this.aa = this.Z;
/*  237 */     if (bln.d) {
/*  238 */       this.Z += 0.05F;
/*  239 */       if (this.Z > 1.0F) {
/*  240 */         this.Z = 1.0F;
/*      */       }
/*  242 */       bln.d = false;
/*  243 */     } else if (this.Z > 0.0F) {
/*  244 */       this.Z -= 0.0125F;
/*      */     }
/*      */   }
/*      */   
/*      */   public bpj e() {
/*  249 */     return this.d;
/*      */   }
/*      */   
/*      */   public void a(int paramInt1, int paramInt2) {
/*  253 */     if (!buu.v) {
/*  254 */       return;
/*      */     }
/*      */     
/*  257 */     if (this.d != null) {
/*  258 */       this.d.a(paramInt1, paramInt2);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(float paramFloat) {
/*  263 */     if (this.t.i == null) return;
/*  264 */     if (this.t.f == null) { return;
/*      */     }
/*  266 */     this.t.j = null;
/*      */     
/*  268 */     double d1 = this.t.c.d();
/*  269 */     this.t.t = this.t.i.a(d1, paramFloat);
/*      */     
/*  271 */     double d2 = d1;
/*  272 */     azw localazw1 = this.t.i.l(paramFloat);
/*      */     
/*  274 */     if (this.t.c.i()) {
/*  275 */       d2 = d1 = 6.0D;
/*      */     } else {
/*  277 */       if (d2 > 3.0D) d2 = 3.0D;
/*  278 */       d1 = d2;
/*      */     }
/*      */     
/*  281 */     if (this.t.t != null) {
/*  282 */       d2 = this.t.t.f.d(localazw1);
/*      */     }
/*      */     
/*  285 */     azw localazw2 = this.t.i.j(paramFloat);
/*  286 */     azw localazw3 = localazw1.c(localazw2.a * d1, localazw2.b * d1, localazw2.c * d1);
/*  287 */     this.x = null;
/*  288 */     azw localazw4 = null;
/*  289 */     float f1 = 1.0F;
/*      */     
/*  291 */     List localList = this.t.f.b(this.t.i, this.t.i.C.a(localazw2.a * d1, localazw2.b * d1, localazw2.c * d1).b(f1, f1, f1));
/*  292 */     double d3 = d2;
/*  293 */     for (int i1 = 0; i1 < localList.size(); i1++) {
/*  294 */       sa localsa = (sa)localList.get(i1);
/*  295 */       if (localsa.R())
/*      */       {
/*  297 */         float f2 = localsa.af();
/*  298 */         azt localazt = localsa.C.b(f2, f2, f2);
/*  299 */         azu localazu = localazt.a(localazw1, localazw3);
/*  300 */         if (localazt.a(localazw1)) {
/*  301 */           if ((0.0D < d3) || (d3 == 0.0D)) {
/*  302 */             this.x = localsa;
/*  303 */             localazw4 = localazu == null ? localazw1 : localazu.f;
/*  304 */             d3 = 0.0D;
/*      */           }
/*  306 */         } else if (localazu != null) {
/*  307 */           double d4 = localazw1.d(localazu.f);
/*  308 */           if ((d4 < d3) || (d3 == 0.0D)) {
/*  309 */             if (localsa == this.t.i.m) {
/*  310 */               if (d3 == 0.0D) {
/*  311 */                 this.x = localsa;
/*  312 */                 localazw4 = localazu.f;
/*      */               }
/*      */             } else {
/*  315 */               this.x = localsa;
/*  316 */               localazw4 = localazu.f;
/*  317 */               d3 = d4;
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/*  323 */     if ((this.x != null) && (
/*  324 */       (d3 < d2) || (this.t.t == null))) {
/*  325 */       this.t.t = new azu(this.x, localazw4);
/*  326 */       if (((this.x instanceof sv)) || ((this.x instanceof st))) {
/*  327 */         this.t.j = this.x;
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   private void j()
/*      */   {
/*  334 */     blk localblk = (blk)this.t.i;
/*      */     
/*  336 */     this.Y = localblk.t();
/*      */     
/*  338 */     this.X = this.W;
/*  339 */     this.W += (this.Y - this.W) * 0.5F;
/*      */     
/*  341 */     if (this.W > 1.5F) this.W = 1.5F;
/*  342 */     if (this.W < 0.1F) this.W = 0.1F;
/*      */   }
/*      */   
/*      */   private float a(float paramFloat, boolean paramBoolean) {
/*  346 */     if (this.p > 0) { return 90.0F;
/*      */     }
/*  348 */     yz localyz = (yz)this.t.i;
/*  349 */     float f1 = 70.0F;
/*  350 */     if (paramBoolean) {
/*  351 */       f1 = this.t.u.aF;
/*  352 */       f1 *= (this.X + (this.W - this.X) * paramFloat);
/*      */     }
/*  354 */     if (localyz.aS() <= 0.0F) {
/*  355 */       float f2 = localyz.aA + paramFloat;
/*      */       
/*  357 */       f1 /= ((1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F);
/*      */     }
/*      */     
/*  360 */     aji localaji = baj.a(this.t.f, localyz, paramFloat);
/*  361 */     if (localaji.o() == awt.h) { f1 = f1 * 60.0F / 70.0F;
/*      */     }
/*  363 */     return f1 + this.Q + (this.P - this.Q) * paramFloat;
/*      */   }
/*      */   
/*      */   private void f(float paramFloat) {
/*  367 */     sv localsv = this.t.i;
/*      */     
/*  369 */     float f1 = localsv.ax - paramFloat;
/*      */     
/*  371 */     if (localsv.aS() <= 0.0F) {
/*  372 */       f2 = localsv.aA + paramFloat;
/*      */       
/*  374 */       GL11.glRotatef(40.0F - 8000.0F / (f2 + 200.0F), 0.0F, 0.0F, 1.0F);
/*      */     }
/*      */     
/*  377 */     if (f1 < 0.0F) return;
/*  378 */     f1 /= localsv.ay;
/*  379 */     f1 = qh.a(f1 * f1 * f1 * f1 * 3.1415927F);
/*      */     
/*  381 */     float f2 = localsv.az;
/*      */     
/*  383 */     GL11.glRotatef(-f2, 0.0F, 1.0F, 0.0F);
/*  384 */     GL11.glRotatef(-f1 * 14.0F, 0.0F, 0.0F, 1.0F);
/*  385 */     GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*      */   }
/*      */   
/*      */   private void g(float paramFloat) {
/*  389 */     if (!(this.t.i instanceof yz)) {
/*  390 */       return;
/*      */     }
/*  392 */     yz localyz = (yz)this.t.i;
/*      */     
/*  394 */     float f1 = localyz.P - localyz.O;
/*  395 */     float f2 = -(localyz.P + f1 * paramFloat);
/*  396 */     float f3 = localyz.br + (localyz.bs - localyz.br) * paramFloat;
/*  397 */     float f4 = localyz.aI + (localyz.aJ - localyz.aI) * paramFloat;
/*  398 */     GL11.glTranslatef(qh.a(f2 * 3.1415927F) * f3 * 0.5F, -Math.abs(qh.b(f2 * 3.1415927F) * f3), 0.0F);
/*  399 */     GL11.glRotatef(qh.a(f2 * 3.1415927F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
/*  400 */     GL11.glRotatef(Math.abs(qh.b(f2 * 3.1415927F - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
/*  401 */     GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
/*      */   }
/*      */   
/*      */   private void h(float paramFloat) {
/*  405 */     sv localsv = this.t.i;
/*      */     
/*  407 */     float f1 = localsv.L - 1.62F;
/*      */     
/*  409 */     double d1 = localsv.p + (localsv.s - localsv.p) * paramFloat;
/*  410 */     double d2 = localsv.q + (localsv.t - localsv.q) * paramFloat - f1;
/*  411 */     double d3 = localsv.r + (localsv.u - localsv.r) * paramFloat;
/*      */     
/*  413 */     GL11.glRotatef(this.S + (this.R - this.S) * paramFloat, 0.0F, 0.0F, 1.0F);
/*      */     
/*  415 */     if (localsv.bm()) {
/*  416 */       f1 = (float)(f1 + 1.0D);
/*  417 */       GL11.glTranslatef(0.0F, 0.3F, 0.0F);
/*  418 */       if (!this.t.u.aC) {
/*  419 */         aji localaji = this.t.f.a(qh.c(localsv.s), qh.c(localsv.t), qh.c(localsv.u));
/*  420 */         if (localaji == ajn.C) {
/*  421 */           int i1 = this.t.f.e(qh.c(localsv.s), qh.c(localsv.t), qh.c(localsv.u));
/*      */           
/*  423 */           int i2 = i1 & 0x3;
/*  424 */           GL11.glRotatef(i2 * 90, 0.0F, 1.0F, 0.0F);
/*      */         }
/*  426 */         GL11.glRotatef(localsv.A + (localsv.y - localsv.A) * paramFloat + 180.0F, 0.0F, -1.0F, 0.0F);
/*  427 */         GL11.glRotatef(localsv.B + (localsv.z - localsv.B) * paramFloat, -1.0F, 0.0F, 0.0F);
/*      */       }
/*  429 */     } else if (this.t.u.aw > 0) {
/*  430 */       double d4 = this.F + (this.E - this.F) * paramFloat;
/*      */       float f2;
/*  432 */       float f3; if (this.t.u.aC)
/*      */       {
/*  434 */         f2 = this.H + (this.G - this.H) * paramFloat;
/*  435 */         f3 = this.J + (this.I - this.J) * paramFloat;
/*      */         
/*  437 */         GL11.glTranslatef(0.0F, 0.0F, (float)-d4);
/*  438 */         GL11.glRotatef(f3, 1.0F, 0.0F, 0.0F);
/*  439 */         GL11.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*      */       } else {
/*  441 */         f2 = localsv.y;
/*  442 */         f3 = localsv.z;
/*      */         
/*  444 */         if (this.t.u.aw == 2) {
/*  445 */           f3 += 180.0F;
/*      */         }
/*      */         
/*  448 */         double d5 = -qh.a(f2 / 180.0F * 3.1415927F) * qh.b(f3 / 180.0F * 3.1415927F) * d4;
/*  449 */         double d6 = qh.b(f2 / 180.0F * 3.1415927F) * qh.b(f3 / 180.0F * 3.1415927F) * d4;
/*  450 */         double d7 = -qh.a(f3 / 180.0F * 3.1415927F) * d4;
/*      */         
/*  452 */         for (int i3 = 0; i3 < 8; i3++) {
/*  453 */           float f4 = (i3 & 0x1) * 2 - 1;
/*  454 */           float f5 = (i3 >> 1 & 0x1) * 2 - 1;
/*  455 */           float f6 = (i3 >> 2 & 0x1) * 2 - 1;
/*      */           
/*  457 */           f4 *= 0.1F;
/*  458 */           f5 *= 0.1F;
/*  459 */           f6 *= 0.1F;
/*      */           
/*  461 */           azu localazu = this.t.f.a(azw.a(d1 + f4, d2 + f5, d3 + f6), azw.a(d1 - d5 + f4 + f6, d2 - d7 + f5, d3 - d6 + f6));
/*  462 */           if (localazu != null) {
/*  463 */             double d8 = localazu.f.d(azw.a(d1, d2, d3));
/*  464 */             if (d8 < d4) { d4 = d8;
/*      */             }
/*      */           }
/*      */         }
/*  468 */         if (this.t.u.aw == 2) {
/*  469 */           GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*      */         }
/*      */         
/*  472 */         GL11.glRotatef(localsv.z - f3, 1.0F, 0.0F, 0.0F);
/*  473 */         GL11.glRotatef(localsv.y - f2, 0.0F, 1.0F, 0.0F);
/*  474 */         GL11.glTranslatef(0.0F, 0.0F, (float)-d4);
/*  475 */         GL11.glRotatef(f2 - localsv.y, 0.0F, 1.0F, 0.0F);
/*  476 */         GL11.glRotatef(f3 - localsv.z, 1.0F, 0.0F, 0.0F);
/*      */       }
/*      */     } else {
/*  479 */       GL11.glTranslatef(0.0F, 0.0F, -0.1F);
/*      */     }
/*      */     
/*  482 */     if (!this.t.u.aC) {
/*  483 */       GL11.glRotatef(localsv.B + (localsv.z - localsv.B) * paramFloat, 1.0F, 0.0F, 0.0F);
/*  484 */       GL11.glRotatef(localsv.A + (localsv.y - localsv.A) * paramFloat + 180.0F, 0.0F, 1.0F, 0.0F);
/*      */     }
/*      */     
/*  487 */     GL11.glTranslatef(0.0F, f1, 0.0F);
/*      */     
/*  489 */     d1 = localsv.p + (localsv.s - localsv.p) * paramFloat;
/*  490 */     d2 = localsv.q + (localsv.t - localsv.q) * paramFloat - f1;
/*  491 */     d3 = localsv.r + (localsv.u - localsv.r) * paramFloat;
/*      */     
/*  493 */     this.ab = this.t.g.a(d1, d2, d3, paramFloat);
/*      */   }
/*      */   
/*  496 */   private double af = 1.0D;
/*      */   
/*      */ 
/*      */ 
/*      */   private double ag;
/*      */   
/*      */ 
/*      */ 
/*      */   private double ah;
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */   private void a(float paramFloat, int paramInt)
/*      */   {
/*  511 */     this.u = (this.t.u.c * 16);
/*  512 */     GL11.glMatrixMode(5889);
/*  513 */     GL11.glLoadIdentity();
/*      */     
/*  515 */     float f1 = 0.07F;
/*  516 */     if (this.t.u.e) GL11.glTranslatef(-(paramInt * 2 - 1) * f1, 0.0F, 0.0F);
/*  517 */     if (this.af != 1.0D) {
/*  518 */       GL11.glTranslatef((float)this.ag, (float)-this.ah, 0.0F);
/*  519 */       GL11.glScaled(this.af, this.af, 1.0D);
/*      */     }
/*      */     
/*  522 */     Project.gluPerspective(a(paramFloat, true), this.t.d / this.t.e, 0.05F, this.u * 2.0F);
/*      */     
/*  524 */     if (this.t.c.a()) {
/*  525 */       f2 = 0.6666667F;
/*  526 */       GL11.glScalef(1.0F, f2, 1.0F);
/*      */     }
/*      */     
/*  529 */     GL11.glMatrixMode(5888);
/*  530 */     GL11.glLoadIdentity();
/*  531 */     if (this.t.u.e) { GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */     }
/*  533 */     f(paramFloat);
/*  534 */     if (this.t.u.d) g(paramFloat);
/*  535 */     float f2 = this.t.h.bN + (this.t.h.bM - this.t.h.bN) * paramFloat;
/*  536 */     int i1; if (f2 > 0.0F) {
/*  537 */       i1 = 20;
/*  538 */       if (this.t.h.a(rv.k)) {
/*  539 */         i1 = 7;
/*      */       }
/*      */       
/*  542 */       float f3 = 5.0F / (f2 * f2 + 5.0F) - f2 * 0.04F;
/*  543 */       f3 *= f3;
/*  544 */       GL11.glRotatef((this.w + paramFloat) * i1, 0.0F, 1.0F, 1.0F);
/*  545 */       GL11.glScalef(1.0F / f3, 1.0F, 1.0F);
/*  546 */       GL11.glRotatef(-(this.w + paramFloat) * i1, 0.0F, 1.0F, 1.0F);
/*      */     }
/*      */     
/*  549 */     h(paramFloat);
/*      */     
/*  551 */     if (this.p > 0) {
/*  552 */       i1 = this.p - 1;
/*  553 */       if (i1 == 1) GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
/*  554 */       if (i1 == 2) GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*  555 */       if (i1 == 3) GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
/*  556 */       if (i1 == 4) GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
/*  557 */       if (i1 == 5) GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
/*      */     }
/*      */   }
/*      */   
/*      */   private void b(float paramFloat, int paramInt) {
/*  562 */     if (this.p > 0) { return;
/*      */     }
/*  564 */     GL11.glMatrixMode(5889);
/*  565 */     GL11.glLoadIdentity();
/*      */     
/*  567 */     float f1 = 0.07F;
/*  568 */     if (this.t.u.e) GL11.glTranslatef(-(paramInt * 2 - 1) * f1, 0.0F, 0.0F);
/*  569 */     if (this.af != 1.0D) {
/*  570 */       GL11.glTranslatef((float)this.ag, (float)-this.ah, 0.0F);
/*  571 */       GL11.glScaled(this.af, this.af, 1.0D);
/*      */     }
/*      */     
/*  574 */     Project.gluPerspective(a(paramFloat, false), this.t.d / this.t.e, 0.05F, this.u * 2.0F);
/*      */     
/*  576 */     if (this.t.c.a()) {
/*  577 */       float f2 = 0.6666667F;
/*  578 */       GL11.glScalef(1.0F, f2, 1.0F);
/*      */     }
/*      */     
/*  581 */     GL11.glMatrixMode(5888);
/*  582 */     GL11.glLoadIdentity();
/*      */     
/*  584 */     if (this.t.u.e) { GL11.glTranslatef((paramInt * 2 - 1) * 0.1F, 0.0F, 0.0F);
/*      */     }
/*  586 */     GL11.glPushMatrix();
/*  587 */     f(paramFloat);
/*  588 */     if (this.t.u.d) { g(paramFloat);
/*      */     }
/*  590 */     if ((this.t.u.aw == 0) && (!this.t.i.bm()) && 
/*  591 */       (!this.t.u.av) && (!this.t.c.a())) {
/*  592 */       b(paramFloat);
/*  593 */       this.c.a(paramFloat);
/*  594 */       a(paramFloat);
/*      */     }
/*      */     
/*  597 */     GL11.glPopMatrix();
/*  598 */     if ((this.t.u.aw == 0) && (!this.t.i.bm())) {
/*  599 */       this.c.b(paramFloat);
/*  600 */       f(paramFloat);
/*      */     }
/*  602 */     if (this.t.u.d) g(paramFloat);
/*      */   }
/*      */   
/*  605 */   private long ai = bao.K();
/*      */   private long aj;
/*      */   private boolean ak;
/*      */   float f;
/*      */   float g;
/*      */   float h;
/*      */   float i;
/*      */   
/*      */   public void a(double paramDouble)
/*      */   {
/*  615 */     buu.j(buu.c);
/*  616 */     GL11.glDisable(3553);
/*  617 */     buu.j(buu.b);
/*      */   }
/*      */   
/*      */   public void b(double paramDouble) {
/*  621 */     buu.j(buu.c);
/*  622 */     GL11.glMatrixMode(5890);
/*  623 */     GL11.glLoadIdentity();
/*  624 */     float f1 = 0.00390625F;
/*  625 */     GL11.glScalef(f1, f1, f1);
/*  626 */     GL11.glTranslatef(8.0F, 8.0F, 8.0F);
/*  627 */     GL11.glMatrixMode(5888);
/*      */     
/*  629 */     this.t.P().a(this.V);
/*  630 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  631 */     GL11.glTexParameteri(3553, 10240, 9729);
/*      */     
/*  633 */     GL11.glTexParameteri(3553, 10241, 9729);
/*  634 */     GL11.glTexParameteri(3553, 10240, 9729);
/*  635 */     GL11.glTexParameteri(3553, 10242, 10496);
/*  636 */     GL11.glTexParameteri(3553, 10243, 10496);
/*  637 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  638 */     GL11.glEnable(3553);
/*  639 */     buu.j(buu.b);
/*      */   }
/*      */   
/*      */   private void k() {
/*  643 */     this.g = ((float)(this.g + (Math.random() - Math.random()) * Math.random() * Math.random()));
/*  644 */     this.i = ((float)(this.i + (Math.random() - Math.random()) * Math.random() * Math.random()));
/*  645 */     this.g = ((float)(this.g * 0.9D));
/*  646 */     this.i = ((float)(this.i * 0.9D));
/*  647 */     this.f += (this.g - this.f) * 1.0F;
/*  648 */     this.h += (this.i - this.h) * 1.0F;
/*  649 */     this.ak = true;
/*      */   }
/*      */   
/*      */   private void i(float paramFloat) {
/*  653 */     bjf localbjf = this.t.f;
/*  654 */     if (localbjf == null) return;
/*  655 */     for (int i1 = 0; i1 < 256; i1++) {
/*  656 */       float f1 = localbjf.b(1.0F) * 0.95F + 0.05F;
/*  657 */       float f2 = localbjf.t.h[(i1 / 16)] * f1;
/*  658 */       float f3 = localbjf.t.h[(i1 % 16)] * (this.f * 0.1F + 1.5F);
/*      */       
/*  660 */       if (localbjf.q > 0) {
/*  661 */         f2 = localbjf.t.h[(i1 / 16)];
/*      */       }
/*      */       
/*  664 */       float f4 = f2 * (localbjf.b(1.0F) * 0.65F + 0.35F);
/*  665 */       float f5 = f2 * (localbjf.b(1.0F) * 0.65F + 0.35F);
/*  666 */       float f6 = f2;
/*  667 */       float f7 = f3;
/*  668 */       float f8 = f3 * ((f3 * 0.6F + 0.4F) * 0.6F + 0.4F);
/*  669 */       float f9 = f3 * (f3 * f3 * 0.6F + 0.4F);
/*      */       
/*  671 */       float f10 = f4 + f7;
/*  672 */       float f11 = f5 + f8;
/*  673 */       float f12 = f6 + f9;
/*      */       
/*  675 */       f10 = f10 * 0.96F + 0.03F;
/*  676 */       f11 = f11 * 0.96F + 0.03F;
/*  677 */       f12 = f12 * 0.96F + 0.03F;
/*      */       
/*  679 */       if (this.Z > 0.0F) {
/*  680 */         f13 = this.aa + (this.Z - this.aa) * paramFloat;
/*  681 */         f10 = f10 * (1.0F - f13) + f10 * 0.7F * f13;
/*  682 */         f11 = f11 * (1.0F - f13) + f11 * 0.6F * f13;
/*  683 */         f12 = f12 * (1.0F - f13) + f12 * 0.6F * f13;
/*      */       }
/*      */       
/*  686 */       if (localbjf.t.i == 1) {
/*  687 */         f10 = 0.22F + f7 * 0.75F;
/*  688 */         f11 = 0.28F + f8 * 0.75F;
/*  689 */         f12 = 0.25F + f9 * 0.75F;
/*      */       }
/*      */       
/*  692 */       if (this.t.h.a(rv.r)) {
/*  693 */         f13 = a(this.t.h, paramFloat);
/*      */         
/*  695 */         f14 = 1.0F / f10;
/*  696 */         if (f14 > 1.0F / f11) {
/*  697 */           f14 = 1.0F / f11;
/*      */         }
/*  699 */         if (f14 > 1.0F / f12) {
/*  700 */           f14 = 1.0F / f12;
/*      */         }
/*  702 */         f10 = f10 * (1.0F - f13) + f10 * f14 * f13;
/*  703 */         f11 = f11 * (1.0F - f13) + f11 * f14 * f13;
/*  704 */         f12 = f12 * (1.0F - f13) + f12 * f14 * f13;
/*      */       }
/*      */       
/*      */ 
/*      */ 
/*  709 */       if (f10 > 1.0F) f10 = 1.0F;
/*  710 */       if (f11 > 1.0F) f11 = 1.0F;
/*  711 */       if (f12 > 1.0F) { f12 = 1.0F;
/*      */       }
/*  713 */       float f13 = this.t.u.aG;
/*      */       
/*  715 */       float f14 = 1.0F - f10;
/*  716 */       float f15 = 1.0F - f11;
/*  717 */       float f16 = 1.0F - f12;
/*  718 */       f14 = 1.0F - f14 * f14 * f14 * f14;
/*  719 */       f15 = 1.0F - f15 * f15 * f15 * f15;
/*  720 */       f16 = 1.0F - f16 * f16 * f16 * f16;
/*  721 */       f10 = f10 * (1.0F - f13) + f14 * f13;
/*  722 */       f11 = f11 * (1.0F - f13) + f15 * f13;
/*  723 */       f12 = f12 * (1.0F - f13) + f16 * f13;
/*      */       
/*  725 */       f10 = f10 * 0.96F + 0.03F;
/*  726 */       f11 = f11 * 0.96F + 0.03F;
/*  727 */       f12 = f12 * 0.96F + 0.03F;
/*      */       
/*  729 */       if (f10 > 1.0F) f10 = 1.0F;
/*  730 */       if (f11 > 1.0F) f11 = 1.0F;
/*  731 */       if (f12 > 1.0F) f12 = 1.0F;
/*  732 */       if (f10 < 0.0F) f10 = 0.0F;
/*  733 */       if (f11 < 0.0F) f11 = 0.0F;
/*  734 */       if (f12 < 0.0F) { f12 = 0.0F;
/*      */       }
/*  736 */       int i2 = 255;
/*  737 */       int i3 = (int)(f10 * 255.0F);
/*  738 */       int i4 = (int)(f11 * 255.0F);
/*  739 */       int i5 = (int)(f12 * 255.0F);
/*      */       
/*  741 */       this.U[i1] = (i2 << 24 | i3 << 16 | i4 << 8 | i5);
/*      */     }
/*  743 */     this.T.a();
/*  744 */     this.ak = false;
/*      */   }
/*      */   
/*      */   private float a(yz paramyz, float paramFloat) {
/*  748 */     int i1 = paramyz.b(rv.r).b();
/*  749 */     if (i1 > 200) {
/*  750 */       return 1.0F;
/*      */     }
/*  752 */     return 0.7F + qh.a((i1 - paramFloat) * 3.1415927F * 0.2F) * 0.3F;
/*      */   }
/*      */   
/*      */ 
/*      */   public void b(float paramFloat)
/*      */   {
/*  758 */     this.t.z.a("lightTex");
/*  759 */     if (this.ak) i(paramFloat);
/*  760 */     this.t.z.b();
/*  761 */     boolean bool = Display.isActive();
/*      */     
/*  763 */     if ((bool) || (!this.t.u.w) || ((this.t.u.y) && (Mouse.isButtonDown(1)))) {
/*  764 */       this.ai = bao.K();
/*      */     }
/*  766 */     else if (bao.K() - this.ai > 500L) {
/*  767 */       this.t.n();
/*      */     }
/*      */     
/*      */ 
/*  771 */     this.t.z.a("mouse");
/*  772 */     if ((this.t.x) && (bool)) {
/*  773 */       this.t.v.c();
/*      */       
/*  775 */       float f1 = this.t.u.a * 0.6F + 0.2F;
/*  776 */       float f2 = f1 * f1 * f1 * 8.0F;
/*  777 */       float f3 = this.t.v.a * f2;
/*  778 */       float f4 = this.t.v.b * f2;
/*      */       
/*  780 */       i4 = 1;
/*  781 */       if (this.t.u.b) { i4 = -1;
/*      */       }
/*  783 */       if (this.t.u.aB) {
/*  784 */         this.K += f3;
/*  785 */         this.L += f4;
/*      */         
/*  787 */         float f5 = paramFloat - this.O;
/*  788 */         this.O = paramFloat;
/*      */         
/*  790 */         f3 = this.M * f5;
/*  791 */         f4 = this.N * f5;
/*      */         
/*  793 */         this.t.h.c(f3, f4 * i4);
/*      */       } else {
/*  795 */         this.t.h.c(f3, f4 * i4);
/*      */       }
/*      */     }
/*      */     
/*  799 */     this.t.z.b();
/*  800 */     if (this.t.s) return;
/*  801 */     a = this.t.u.e;
/*      */     
/*  803 */     bca localbca = new bca(this.t, this.t.d, this.t.e);
/*  804 */     int i1 = localbca.a();
/*  805 */     int i2 = localbca.b();
/*  806 */     int i3 = Mouse.getX() * i1 / this.t.d;
/*  807 */     int i4 = i2 - Mouse.getY() * i2 / this.t.e - 1;
/*      */     
/*  809 */     int i5 = this.t.u.h;
/*      */     
/*  811 */     if (this.t.f != null) {
/*  812 */       this.t.z.a("level");
/*  813 */       if (this.t.i()) {
/*  814 */         a(paramFloat, this.aj + 1000000000 / i5);
/*      */       } else {
/*  816 */         a(paramFloat, 0L);
/*      */       }
/*      */       
/*  819 */       if (buu.v) {
/*  820 */         if (this.d != null) {
/*  821 */           GL11.glMatrixMode(5890);
/*  822 */           GL11.glPushMatrix();
/*  823 */           GL11.glLoadIdentity();
/*  824 */           this.d.a(paramFloat);
/*  825 */           GL11.glPopMatrix();
/*      */         }
/*  827 */         this.t.a().a(true);
/*      */       }
/*      */       
/*  830 */       this.aj = System.nanoTime();
/*  831 */       this.t.z.c("gui");
/*  832 */       if ((!this.t.u.av) || (this.t.n != null)) {
/*  833 */         GL11.glAlphaFunc(516, 0.1F);
/*  834 */         this.t.r.a(paramFloat, this.t.n != null, i3, i4);
/*      */       }
/*  836 */       this.t.z.b();
/*      */     } else {
/*  838 */       GL11.glViewport(0, 0, this.t.d, this.t.e);
/*  839 */       GL11.glMatrixMode(5889);
/*  840 */       GL11.glLoadIdentity();
/*  841 */       GL11.glMatrixMode(5888);
/*  842 */       GL11.glLoadIdentity();
/*  843 */       g();
/*      */       
/*  845 */       this.aj = System.nanoTime();
/*      */     }
/*      */     
/*  848 */     if (this.t.n != null) {
/*  849 */       GL11.glClear(256);
/*      */       try
/*      */       {
/*  852 */         this.t.n.a(i3, i4, paramFloat);
/*      */       } catch (Throwable localThrowable) {
/*  854 */         b localb = b.a(localThrowable, "Rendering screen");
/*  855 */         k localk = localb.a("Screen render details");
/*      */         
/*  857 */         localk.a("Screen name", new blu(this));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  864 */         localk.a("Mouse location", new blv(this, i3, i4));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  871 */         localk.a("Screen size", new blw(this, localbca));
/*      */         
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*  878 */         throw new s(localb);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void c(float paramFloat) {
/*  884 */     g();
/*  885 */     bca localbca = new bca(this.t, this.t.d, this.t.e);
/*  886 */     int i1 = localbca.a();
/*  887 */     int i2 = localbca.b();
/*  888 */     this.t.r.a(i1, i2);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(float paramFloat, long paramLong)
/*      */   {
/*  897 */     this.t.z.a("lightTex");
/*  898 */     if (this.ak) i(paramFloat);
/*  899 */     GL11.glEnable(2884);
/*  900 */     GL11.glEnable(2929);
/*  901 */     GL11.glEnable(3008);
/*  902 */     GL11.glAlphaFunc(516, 0.5F);
/*      */     
/*  904 */     if (this.t.i == null) {
/*  905 */       this.t.i = this.t.h;
/*      */     }
/*      */     
/*  908 */     this.t.z.c("pick");
/*  909 */     a(paramFloat);
/*      */     
/*  911 */     sv localsv = this.t.i;
/*  912 */     bma localbma = this.t.g;
/*  913 */     bkn localbkn = this.t.k;
/*  914 */     double d1 = localsv.S + (localsv.s - localsv.S) * paramFloat;
/*  915 */     double d2 = localsv.T + (localsv.t - localsv.T) * paramFloat;
/*  916 */     double d3 = localsv.U + (localsv.u - localsv.U) * paramFloat;
/*      */     
/*  918 */     this.t.z.c("center");
/*  919 */     for (int i1 = 0; i1 < 2; i1++) {
/*  920 */       if (this.t.u.e) {
/*  921 */         b = i1;
/*  922 */         if (b == 0) GL11.glColorMask(false, true, true, false); else {
/*  923 */           GL11.glColorMask(true, false, false, false);
/*      */         }
/*      */       }
/*  926 */       this.t.z.c("clear");
/*  927 */       GL11.glViewport(0, 0, this.t.d, this.t.e);
/*  928 */       j(paramFloat);
/*  929 */       GL11.glClear(16640);
/*  930 */       GL11.glEnable(2884);
/*      */       
/*  932 */       this.t.z.c("camera");
/*  933 */       a(paramFloat, i1);
/*  934 */       baj.a(this.t.h, this.t.u.aw == 2);
/*      */       
/*  936 */       this.t.z.c("frustrum");
/*  937 */       bmw.a();
/*  938 */       if (this.t.u.c >= 4) {
/*  939 */         a(-1, paramFloat);
/*  940 */         this.t.z.c("sky");
/*  941 */         localbma.a(paramFloat);
/*      */       }
/*  943 */       GL11.glEnable(2912);
/*  944 */       a(1, paramFloat);
/*      */       
/*  946 */       if (this.t.u.j != 0) {
/*  947 */         GL11.glShadeModel(7425);
/*      */       }
/*      */       
/*  950 */       this.t.z.c("culling");
/*  951 */       bmx localbmx = new bmx();
/*  952 */       localbmx.a(d1, d2, d3);
/*      */       
/*  954 */       this.t.g.a(localbmx, paramFloat);
/*  955 */       if (i1 == 0) {
/*  956 */         this.t.z.c("updatechunks");
/*      */         
/*  958 */         while (!this.t.g.a(localsv, false))
/*      */         {
/*  960 */           if (paramLong == 0L)
/*      */             break;
/*  962 */           long l1 = paramLong - System.nanoTime();
/*  963 */           if ((l1 < 0L) || 
/*  964 */             (l1 > 1000000000L)) {
/*      */             break;
/*      */           }
/*      */         }
/*      */       }
/*  969 */       if (localsv.t < 128.0D) {
/*  970 */         a(localbma, paramFloat);
/*      */       }
/*      */       
/*  973 */       this.t.z.c("prepareterrain");
/*      */       
/*  975 */       a(0, paramFloat);
/*  976 */       GL11.glEnable(2912);
/*  977 */       this.t.P().a(bpz.b);
/*  978 */       bam.a();
/*  979 */       this.t.z.c("terrain");
/*      */       
/*  981 */       GL11.glMatrixMode(5888);
/*  982 */       GL11.glPushMatrix();
/*  983 */       localbma.a(localsv, 0, paramFloat);
/*      */       
/*  985 */       GL11.glShadeModel(7424);
/*      */       
/*  987 */       GL11.glAlphaFunc(516, 0.1F);
/*  988 */       yz localyz; if (this.p == 0) {
/*  989 */         GL11.glMatrixMode(5888);
/*  990 */         GL11.glPopMatrix();
/*  991 */         GL11.glPushMatrix();
/*  992 */         bam.b();
/*  993 */         this.t.z.c("entities");
/*  994 */         localbma.a(localsv, localbmx, paramFloat);
/*  995 */         bam.a();
/*  996 */         a(paramFloat);
/*      */         
/*  998 */         GL11.glMatrixMode(5888);
/*  999 */         GL11.glPopMatrix();
/* 1000 */         GL11.glPushMatrix();
/* 1001 */         if ((this.t.t != null) && (localsv.a(awt.h)) && ((localsv instanceof yz)) && (!this.t.u.av)) {
/* 1002 */           localyz = (yz)localsv;
/* 1003 */           GL11.glDisable(3008);
/* 1004 */           this.t.z.c("outline");
/* 1005 */           localbma.a(localyz, this.t.t, 0, paramFloat);
/* 1006 */           GL11.glEnable(3008);
/*      */         }
/*      */       }
/*      */       
/* 1010 */       GL11.glMatrixMode(5888);
/* 1011 */       GL11.glPopMatrix();
/*      */       
/* 1013 */       if ((this.af == 1.0D) && ((localsv instanceof yz)) && (!this.t.u.av) && 
/* 1014 */         (this.t.t != null) && (!localsv.a(awt.h))) {
/* 1015 */         localyz = (yz)localsv;
/* 1016 */         GL11.glDisable(3008);
/*      */         
/* 1018 */         this.t.z.c("outline");
/* 1019 */         localbma.a(localyz, this.t.t, 0, paramFloat);
/* 1020 */         GL11.glEnable(3008);
/*      */       }
/*      */       
/*      */ 
/* 1024 */       this.t.z.c("destroyProgress");
/* 1025 */       GL11.glEnable(3042);
/* 1026 */       buu.c(770, 1, 1, 0);
/* 1027 */       localbma.a(bmh.a, (yz)localsv, paramFloat);
/* 1028 */       GL11.glDisable(3042);
/*      */       
/* 1030 */       if (this.p == 0) {
/* 1031 */         b(paramFloat);
/* 1032 */         this.t.z.c("litParticles");
/* 1033 */         localbkn.b(localsv, paramFloat);
/* 1034 */         bam.a();
/* 1035 */         a(0, paramFloat);
/* 1036 */         this.t.z.c("particles");
/* 1037 */         localbkn.a(localsv, paramFloat);
/* 1038 */         a(paramFloat);
/*      */       }
/*      */       
/* 1041 */       GL11.glDepthMask(false);
/* 1042 */       GL11.glEnable(2884);
/* 1043 */       this.t.z.c("weather");
/* 1044 */       e(paramFloat);
/* 1045 */       GL11.glDepthMask(true);
/*      */       
/* 1047 */       GL11.glDisable(3042);
/* 1048 */       GL11.glEnable(2884);
/* 1049 */       buu.c(770, 771, 1, 0);
/* 1050 */       GL11.glAlphaFunc(516, 0.1F);
/* 1051 */       a(0, paramFloat);
/* 1052 */       GL11.glEnable(3042);
/* 1053 */       GL11.glDepthMask(false);
/* 1054 */       this.t.P().a(bpz.b);
/* 1055 */       if (this.t.u.i) {
/* 1056 */         this.t.z.c("water");
/* 1057 */         if (this.t.u.j != 0) {
/* 1058 */           GL11.glShadeModel(7425);
/*      */         }
/*      */         
/*      */ 
/* 1062 */         GL11.glEnable(3042);
/* 1063 */         buu.c(770, 771, 1, 0);
/*      */         
/* 1065 */         if (this.t.u.e) {
/* 1066 */           if (b == 0) {
/* 1067 */             GL11.glColorMask(false, true, true, true);
/*      */           } else {
/* 1069 */             GL11.glColorMask(true, false, false, true);
/*      */           }
/* 1071 */           localbma.a(localsv, 1, paramFloat);
/*      */         } else {
/* 1073 */           localbma.a(localsv, 1, paramFloat);
/*      */         }
/* 1075 */         GL11.glDisable(3042);
/*      */         
/* 1077 */         GL11.glShadeModel(7424);
/*      */       } else {
/* 1079 */         this.t.z.c("water");
/* 1080 */         localbma.a(localsv, 1, paramFloat);
/*      */       }
/*      */       
/* 1083 */       GL11.glDepthMask(true);
/* 1084 */       GL11.glEnable(2884);
/* 1085 */       GL11.glDisable(3042);
/* 1086 */       GL11.glDisable(2912);
/*      */       
/* 1088 */       if (localsv.t >= 128.0D) {
/* 1089 */         this.t.z.c("aboveClouds");
/* 1090 */         a(localbma, paramFloat);
/*      */       }
/*      */       
/* 1093 */       this.t.z.c("hand");
/* 1094 */       if (this.af == 1.0D) {
/* 1095 */         GL11.glClear(256);
/* 1096 */         b(paramFloat, i1);
/*      */       }
/*      */       
/* 1099 */       if (!this.t.u.e) {
/* 1100 */         this.t.z.b();
/* 1101 */         return;
/*      */       }
/*      */     }
/* 1104 */     GL11.glColorMask(true, true, true, false);
/* 1105 */     this.t.z.b();
/*      */   }
/*      */   
/*      */   private void a(bma parambma, float paramFloat) {
/* 1109 */     if (this.t.u.d()) {
/* 1110 */       this.t.z.c("clouds");
/* 1111 */       GL11.glPushMatrix();
/* 1112 */       a(0, paramFloat);
/* 1113 */       GL11.glEnable(2912);
/* 1114 */       parambma.b(paramFloat);
/* 1115 */       GL11.glDisable(2912);
/* 1116 */       a(1, paramFloat);
/* 1117 */       GL11.glPopMatrix();
/*      */     }
/*      */   }
/*      */   
/* 1121 */   private Random al = new Random();
/*      */   private int am;
/*      */   
/*      */   private void l() {
/* 1125 */     float f1 = this.t.f.j(1.0F);
/* 1126 */     if (!this.t.u.i) f1 /= 2.0F;
/* 1127 */     if (f1 == 0.0F) { return;
/*      */     }
/* 1129 */     this.al.setSeed(this.w * 312987231L);
/* 1130 */     sv localsv = this.t.i;
/* 1131 */     bjf localbjf = this.t.f;
/*      */     
/* 1133 */     int i1 = qh.c(localsv.s);
/* 1134 */     int i2 = qh.c(localsv.t);
/* 1135 */     int i3 = qh.c(localsv.u);
/*      */     
/* 1137 */     int i4 = 10;
/*      */     
/* 1139 */     double d1 = 0.0D;
/* 1140 */     double d2 = 0.0D;
/* 1141 */     double d3 = 0.0D;
/* 1142 */     int i5 = 0;
/* 1143 */     int i6 = (int)(100.0F * f1 * f1);
/* 1144 */     if (this.t.u.aJ == 1) {
/* 1145 */       i6 >>= 1;
/* 1146 */     } else if (this.t.u.aJ == 2) {
/* 1147 */       i6 = 0;
/*      */     }
/* 1149 */     for (int i7 = 0; i7 < i6; i7++) {
/* 1150 */       int i8 = i1 + this.al.nextInt(i4) - this.al.nextInt(i4);
/* 1151 */       int i9 = i3 + this.al.nextInt(i4) - this.al.nextInt(i4);
/* 1152 */       int i10 = localbjf.h(i8, i9);
/* 1153 */       aji localaji = localbjf.a(i8, i10 - 1, i9);
/* 1154 */       ahu localahu = localbjf.a(i8, i9);
/* 1155 */       if ((i10 <= i2 + i4) && (i10 >= i2 - i4) && (localahu.e()) && (localahu.a(i8, i10, i9) >= 0.15F)) {
/* 1156 */         float f2 = this.al.nextFloat();
/* 1157 */         float f3 = this.al.nextFloat();
/* 1158 */         if (localaji.o() == awt.i) {
/* 1159 */           this.t.k.a(new bkv(localbjf, i8 + f2, i10 + 0.1F - localaji.z(), i9 + f3, 0.0D, 0.0D, 0.0D));
/* 1160 */         } else if (localaji.o() != awt.a) {
/* 1161 */           if (this.al.nextInt(++i5) == 0) {
/* 1162 */             d1 = i8 + f2;
/* 1163 */             d2 = i10 + 0.1F - localaji.z();
/* 1164 */             d3 = i9 + f3;
/*      */           }
/* 1166 */           this.t.k.a(new blf(localbjf, i8 + f2, i10 + 0.1F - localaji.z(), i9 + f3));
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1171 */     if ((i5 > 0) && (this.al.nextInt(3) < this.am++)) {
/* 1172 */       this.am = 0;
/* 1173 */       if ((d2 > localsv.t + 1.0D) && (localbjf.h(qh.c(localsv.s), qh.c(localsv.u)) > qh.c(localsv.t))) {
/* 1174 */         this.t.f.a(d1, d2, d3, "ambient.weather.rain", 0.1F, 0.5F, false);
/*      */       } else {
/* 1176 */         this.t.f.a(d1, d2, d3, "ambient.weather.rain", 0.2F, 1.0F, false);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   float[] j;
/*      */   float[] k;
/*      */   protected void e(float paramFloat)
/*      */   {
/* 1185 */     float f1 = this.t.f.j(paramFloat);
/* 1186 */     if (f1 <= 0.0F) return;
/* 1187 */     b(paramFloat);
/*      */     
/* 1189 */     if (this.j == null) {
/* 1190 */       this.j = new float['Ѐ'];
/* 1191 */       this.k = new float['Ѐ'];
/*      */       
/* 1193 */       for (int i1 = 0; i1 < 32; i1++) {
/* 1194 */         for (int i2 = 0; i2 < 32; i2++) {
/* 1195 */           float f2 = i2 - 16;
/* 1196 */           float f3 = i1 - 16;
/* 1197 */           float f4 = qh.c(f2 * f2 + f3 * f3);
/* 1198 */           this.j[(i1 << 5 | i2)] = (-f3 / f4);
/* 1199 */           this.k[(i1 << 5 | i2)] = (f2 / f4);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1204 */     sv localsv = this.t.i;
/* 1205 */     bjf localbjf = this.t.f;
/*      */     
/* 1207 */     int i3 = qh.c(localsv.s);
/* 1208 */     int i4 = qh.c(localsv.t);
/* 1209 */     int i5 = qh.c(localsv.u);
/*      */     
/* 1211 */     bmh localbmh = bmh.a;
/* 1212 */     GL11.glDisable(2884);
/* 1213 */     GL11.glNormal3f(0.0F, 1.0F, 0.0F);
/* 1214 */     GL11.glEnable(3042);
/* 1215 */     buu.c(770, 771, 1, 0);
/* 1216 */     GL11.glAlphaFunc(516, 0.1F);
/*      */     
/* 1218 */     double d1 = localsv.S + (localsv.s - localsv.S) * paramFloat;
/* 1219 */     double d2 = localsv.T + (localsv.t - localsv.T) * paramFloat;
/* 1220 */     double d3 = localsv.U + (localsv.u - localsv.U) * paramFloat;
/*      */     
/* 1222 */     int i6 = qh.c(d2);
/*      */     
/* 1224 */     int i7 = 5;
/* 1225 */     if (this.t.u.i) { i7 = 10;
/*      */     }
/* 1227 */     int i8 = 0;
/*      */     
/* 1229 */     int i9 = -1;
/* 1230 */     float f5 = this.w + paramFloat;
/*      */     
/* 1232 */     if (this.t.u.i) i7 = 10;
/* 1233 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 1234 */     i8 = 0;
/* 1235 */     for (int i10 = i5 - i7; i10 <= i5 + i7; i10++) {
/* 1236 */       for (int i11 = i3 - i7; i11 <= i3 + i7; i11++) {
/* 1237 */         int i12 = (i10 - i5 + 16) * 32 + (i11 - i3 + 16);
/* 1238 */         float f6 = this.j[i12] * 0.5F;
/* 1239 */         float f7 = this.k[i12] * 0.5F;
/* 1240 */         ahu localahu = localbjf.a(i11, i10);
/* 1241 */         if ((localahu.e()) || (localahu.d()))
/*      */         {
/* 1243 */           int i13 = localbjf.h(i11, i10);
/*      */           
/* 1245 */           int i14 = i4 - i7;
/* 1246 */           int i15 = i4 + i7;
/*      */           
/* 1248 */           if (i14 < i13) i14 = i13;
/* 1249 */           if (i15 < i13) i15 = i13;
/* 1250 */           float f8 = 1.0F;
/*      */           
/* 1252 */           int i16 = i13;
/* 1253 */           if (i16 < i6) { i16 = i6;
/*      */           }
/* 1255 */           if (i14 != i15) {
/* 1256 */             this.al.setSeed(i11 * i11 * 3121 + i11 * 45238971 ^ i10 * i10 * 418711 + i10 * 13761);
/*      */             
/* 1258 */             float f9 = localahu.a(i11, i14, i10);
/*      */             float f10;
/* 1260 */             double d5; if (localbjf.v().a(f9, i13) >= 0.15F) {
/* 1261 */               if (i9 != 0) {
/* 1262 */                 if (i9 >= 0) localbmh.a();
/* 1263 */                 i9 = 0;
/* 1264 */                 this.t.P().a(r);
/* 1265 */                 localbmh.b();
/*      */               }
/*      */               
/* 1268 */               f10 = ((this.w + i11 * i11 * 3121 + i11 * 45238971 + i10 * i10 * 418711 + i10 * 13761 & 0x1F) + paramFloat) / 32.0F * (3.0F + this.al.nextFloat());
/*      */               
/* 1270 */               double d4 = i11 + 0.5F - localsv.s;
/* 1271 */               d5 = i10 + 0.5F - localsv.u;
/* 1272 */               float f13 = qh.a(d4 * d4 + d5 * d5) / i7;
/*      */               
/* 1274 */               float f14 = 1.0F;
/* 1275 */               localbmh.b(localbjf.c(i11, i16, i10, 0));
/* 1276 */               localbmh.a(f14, f14, f14, ((1.0F - f13 * f13) * 0.5F + 0.5F) * f1);
/* 1277 */               localbmh.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 1278 */               localbmh.a(i11 - f6 + 0.5D, i14, i10 - f7 + 0.5D, 0.0F * f8, i14 * f8 / 4.0F + f10 * f8);
/* 1279 */               localbmh.a(i11 + f6 + 0.5D, i14, i10 + f7 + 0.5D, 1.0F * f8, i14 * f8 / 4.0F + f10 * f8);
/* 1280 */               localbmh.a(i11 + f6 + 0.5D, i15, i10 + f7 + 0.5D, 1.0F * f8, i15 * f8 / 4.0F + f10 * f8);
/* 1281 */               localbmh.a(i11 - f6 + 0.5D, i15, i10 - f7 + 0.5D, 0.0F * f8, i15 * f8 / 4.0F + f10 * f8);
/*      */               
/* 1283 */               localbmh.b(0.0D, 0.0D, 0.0D);
/*      */             } else {
/* 1285 */               if (i9 != 1) {
/* 1286 */                 if (i9 >= 0) localbmh.a();
/* 1287 */                 i9 = 1;
/* 1288 */                 this.t.P().a(s);
/*      */                 
/* 1290 */                 localbmh.b();
/*      */               }
/* 1292 */               f10 = ((this.w & 0x1FF) + paramFloat) / 512.0F;
/* 1293 */               float f11 = this.al.nextFloat() + f5 * 0.01F * (float)this.al.nextGaussian();
/* 1294 */               float f12 = this.al.nextFloat() + f5 * (float)this.al.nextGaussian() * 0.001F;
/* 1295 */               d5 = i11 + 0.5F - localsv.s;
/* 1296 */               double d6 = i10 + 0.5F - localsv.u;
/* 1297 */               float f15 = qh.a(d5 * d5 + d6 * d6) / i7;
/* 1298 */               float f16 = 1.0F;
/* 1299 */               localbmh.b((localbjf.c(i11, i16, i10, 0) * 3 + 15728880) / 4);
/* 1300 */               localbmh.a(f16, f16, f16, ((1.0F - f15 * f15) * 0.3F + 0.5F) * f1);
/* 1301 */               localbmh.b(-d1 * 1.0D, -d2 * 1.0D, -d3 * 1.0D);
/* 1302 */               localbmh.a(i11 - f6 + 0.5D, i14, i10 - f7 + 0.5D, 0.0F * f8 + f11, i14 * f8 / 4.0F + f10 * f8 + f12);
/* 1303 */               localbmh.a(i11 + f6 + 0.5D, i14, i10 + f7 + 0.5D, 1.0F * f8 + f11, i14 * f8 / 4.0F + f10 * f8 + f12);
/* 1304 */               localbmh.a(i11 + f6 + 0.5D, i15, i10 + f7 + 0.5D, 1.0F * f8 + f11, i15 * f8 / 4.0F + f10 * f8 + f12);
/* 1305 */               localbmh.a(i11 - f6 + 0.5D, i15, i10 - f7 + 0.5D, 0.0F * f8 + f11, i15 * f8 / 4.0F + f10 * f8 + f12);
/* 1306 */               localbmh.b(0.0D, 0.0D, 0.0D);
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1312 */     if (i9 >= 0) localbmh.a();
/* 1313 */     GL11.glEnable(2884);
/* 1314 */     GL11.glDisable(3042);
/* 1315 */     GL11.glAlphaFunc(516, 0.1F);
/* 1316 */     a(paramFloat);
/*      */   }
/*      */   
/*      */   public void g() {
/* 1320 */     bca localbca = new bca(this.t, this.t.d, this.t.e);
/*      */     
/* 1322 */     GL11.glClear(256);
/* 1323 */     GL11.glMatrixMode(5889);
/* 1324 */     GL11.glLoadIdentity();
/* 1325 */     GL11.glOrtho(0.0D, localbca.c(), localbca.d(), 0.0D, 1000.0D, 3000.0D);
/* 1326 */     GL11.glMatrixMode(5888);
/* 1327 */     GL11.glLoadIdentity();
/* 1328 */     GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
/*      */   }
/*      */   
/* 1331 */   FloatBuffer l = ban.h(16);
/*      */   float m;
/*      */   float n;
/*      */   float o;
/*      */   
/*      */   private void j(float paramFloat) {
/* 1337 */     bjf localbjf = this.t.f;
/* 1338 */     sv localsv = this.t.i;
/*      */     
/* 1340 */     float f1 = 0.25F + 0.75F * this.t.u.c / 16.0F;
/* 1341 */     f1 = 1.0F - (float)Math.pow(f1, 0.25D);
/*      */     
/* 1343 */     azw localazw1 = localbjf.a(this.t.i, paramFloat);
/* 1344 */     float f2 = (float)localazw1.a;
/* 1345 */     float f3 = (float)localazw1.b;
/* 1346 */     float f4 = (float)localazw1.c;
/*      */     
/* 1348 */     azw localazw2 = localbjf.f(paramFloat);
/* 1349 */     this.m = ((float)localazw2.a);
/* 1350 */     this.n = ((float)localazw2.b);
/* 1351 */     this.o = ((float)localazw2.c);
/*      */     
/* 1353 */     if (this.t.u.c >= 4) {
/* 1354 */       azw localazw3 = qh.a(localbjf.d(paramFloat)) > 0.0F ? azw.a(-1.0D, 0.0D, 0.0D) : azw.a(1.0D, 0.0D, 0.0D);
/* 1355 */       f6 = (float)localsv.j(paramFloat).b(localazw3);
/* 1356 */       if (f6 < 0.0F) f6 = 0.0F;
/* 1357 */       if (f6 > 0.0F) {
/* 1358 */         float[] arrayOfFloat = localbjf.t.a(localbjf.c(paramFloat), paramFloat);
/* 1359 */         if (arrayOfFloat != null) {
/* 1360 */           f6 *= arrayOfFloat[3];
/* 1361 */           this.m = (this.m * (1.0F - f6) + arrayOfFloat[0] * f6);
/* 1362 */           this.n = (this.n * (1.0F - f6) + arrayOfFloat[1] * f6);
/* 1363 */           this.o = (this.o * (1.0F - f6) + arrayOfFloat[2] * f6);
/*      */         }
/*      */       }
/*      */     }
/*      */     
/* 1368 */     this.m += (f2 - this.m) * f1;
/* 1369 */     this.n += (f3 - this.n) * f1;
/* 1370 */     this.o += (f4 - this.o) * f1;
/*      */     
/* 1372 */     float f5 = localbjf.j(paramFloat);
/* 1373 */     float f7; if (f5 > 0.0F) {
/* 1374 */       f6 = 1.0F - f5 * 0.5F;
/* 1375 */       f7 = 1.0F - f5 * 0.4F;
/* 1376 */       this.m *= f6;
/* 1377 */       this.n *= f6;
/* 1378 */       this.o *= f7;
/*      */     }
/* 1380 */     float f6 = localbjf.h(paramFloat);
/* 1381 */     if (f6 > 0.0F) {
/* 1382 */       f7 = 1.0F - f6 * 0.5F;
/* 1383 */       this.m *= f7;
/* 1384 */       this.n *= f7;
/* 1385 */       this.o *= f7;
/*      */     }
/*      */     
/* 1388 */     aji localaji = baj.a(this.t.f, localsv, paramFloat);
/* 1389 */     if (this.ab) {
/* 1390 */       azw localazw4 = localbjf.e(paramFloat);
/* 1391 */       this.m = ((float)localazw4.a);
/* 1392 */       this.n = ((float)localazw4.b);
/* 1393 */       this.o = ((float)localazw4.c);
/* 1394 */     } else if (localaji.o() == awt.h) {
/* 1395 */       f8 = afv.b(localsv) * 0.2F;
/*      */       
/* 1397 */       this.m = (0.02F + f8);
/* 1398 */       this.n = (0.02F + f8);
/* 1399 */       this.o = (0.2F + f8);
/* 1400 */     } else if (localaji.o() == awt.i) {
/* 1401 */       this.m = 0.6F;
/* 1402 */       this.n = 0.1F;
/* 1403 */       this.o = 0.0F;
/*      */     }
/*      */     
/* 1406 */     float f8 = this.an + (this.ao - this.an) * paramFloat;
/* 1407 */     this.m *= f8;
/* 1408 */     this.n *= f8;
/* 1409 */     this.o *= f8;
/*      */     
/* 1411 */     double d1 = (localsv.T + (localsv.t - localsv.T) * paramFloat) * localbjf.t.k();
/* 1412 */     if (localsv.a(rv.q)) {
/* 1413 */       int i1 = localsv.b(rv.q).b();
/* 1414 */       if (i1 < 20) {
/* 1415 */         d1 *= (1.0F - i1 / 20.0F);
/*      */       } else {
/* 1417 */         d1 = 0.0D;
/*      */       }
/*      */     }
/* 1420 */     if (d1 < 1.0D) {
/* 1421 */       if (d1 < 0.0D) d1 = 0.0D;
/* 1422 */       d1 *= d1;
/* 1423 */       this.m = ((float)(this.m * d1));
/* 1424 */       this.n = ((float)(this.n * d1));
/* 1425 */       this.o = ((float)(this.o * d1));
/*      */     }
/*      */     float f9;
/* 1428 */     if (this.Z > 0.0F) {
/* 1429 */       f9 = this.aa + (this.Z - this.aa) * paramFloat;
/* 1430 */       this.m = (this.m * (1.0F - f9) + this.m * 0.7F * f9);
/* 1431 */       this.n = (this.n * (1.0F - f9) + this.n * 0.6F * f9);
/* 1432 */       this.o = (this.o * (1.0F - f9) + this.o * 0.6F * f9);
/*      */     }
/*      */     float f10;
/* 1435 */     if (localsv.a(rv.r)) {
/* 1436 */       f9 = a(this.t.h, paramFloat);
/*      */       
/* 1438 */       f10 = 1.0F / this.m;
/* 1439 */       if (f10 > 1.0F / this.n) {
/* 1440 */         f10 = 1.0F / this.n;
/*      */       }
/* 1442 */       if (f10 > 1.0F / this.o) {
/* 1443 */         f10 = 1.0F / this.o;
/*      */       }
/* 1445 */       this.m = (this.m * (1.0F - f9) + this.m * f10 * f9);
/* 1446 */       this.n = (this.n * (1.0F - f9) + this.n * f10 * f9);
/* 1447 */       this.o = (this.o * (1.0F - f9) + this.o * f10 * f9);
/*      */     }
/*      */     
/*      */ 
/*      */ 
/* 1452 */     if (this.t.u.e) {
/* 1453 */       f9 = (this.m * 30.0F + this.n * 59.0F + this.o * 11.0F) / 100.0F;
/* 1454 */       f10 = (this.m * 30.0F + this.n * 70.0F) / 100.0F;
/* 1455 */       float f11 = (this.m * 30.0F + this.o * 70.0F) / 100.0F;
/*      */       
/* 1457 */       this.m = f9;
/* 1458 */       this.n = f10;
/* 1459 */       this.o = f11;
/*      */     }
/*      */     
/* 1462 */     GL11.glClearColor(this.m, this.n, this.o, 0.0F);
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private void a(int paramInt, float paramFloat)
/*      */   {
/* 1469 */     sv localsv = this.t.i;
/*      */     
/* 1471 */     boolean bool = false;
/* 1472 */     if ((localsv instanceof yz)) {
/* 1473 */       bool = ((yz)localsv).bE.d;
/*      */     }
/*      */     
/* 1476 */     if (paramInt == 999) {
/* 1477 */       GL11.glFog(2918, a(0.0F, 0.0F, 0.0F, 1.0F));
/* 1478 */       GL11.glFogi(2917, 9729);
/* 1479 */       GL11.glFogf(2915, 0.0F);
/* 1480 */       GL11.glFogf(2916, 8.0F);
/*      */       
/* 1482 */       if (GLContext.getCapabilities().GL_NV_fog_distance) {
/* 1483 */         GL11.glFogi(34138, 34139);
/*      */       }
/*      */       
/* 1486 */       GL11.glFogf(2915, 0.0F);
/* 1487 */       return;
/*      */     }
/*      */     
/* 1490 */     GL11.glFog(2918, a(this.m, this.n, this.o, 1.0F));
/* 1491 */     GL11.glNormal3f(0.0F, -1.0F, 0.0F);
/* 1492 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*      */     
/* 1494 */     aji localaji = baj.a(this.t.f, localsv, paramFloat);
/*      */     float f1;
/* 1496 */     if (localsv.a(rv.q)) {
/* 1497 */       f1 = 5.0F;
/* 1498 */       int i1 = localsv.b(rv.q).b();
/* 1499 */       if (i1 < 20) {
/* 1500 */         f1 = 5.0F + (this.u - 5.0F) * (1.0F - i1 / 20.0F);
/*      */       }
/*      */       
/* 1503 */       GL11.glFogi(2917, 9729);
/* 1504 */       if (paramInt < 0) {
/* 1505 */         GL11.glFogf(2915, 0.0F);
/* 1506 */         GL11.glFogf(2916, f1 * 0.8F);
/*      */       } else {
/* 1508 */         GL11.glFogf(2915, f1 * 0.25F);
/* 1509 */         GL11.glFogf(2916, f1);
/*      */       }
/* 1511 */       if (GLContext.getCapabilities().GL_NV_fog_distance) {
/* 1512 */         GL11.glFogi(34138, 34139);
/*      */       }
/* 1514 */     } else if (this.ab) {
/* 1515 */       GL11.glFogi(2917, 2048);
/* 1516 */       GL11.glFogf(2914, 0.1F);
/* 1517 */     } else if (localaji.o() == awt.h) {
/* 1518 */       GL11.glFogi(2917, 2048);
/* 1519 */       if (localsv.a(rv.o)) {
/* 1520 */         GL11.glFogf(2914, 0.05F);
/*      */       } else {
/* 1522 */         GL11.glFogf(2914, 0.1F - afv.b(localsv) * 0.03F);
/*      */       }
/* 1524 */     } else if (localaji.o() == awt.i) {
/* 1525 */       GL11.glFogi(2917, 2048);
/* 1526 */       GL11.glFogf(2914, 2.0F);
/*      */     } else {
/* 1528 */       f1 = this.u;
/* 1529 */       if ((this.t.f.t.j()) && (!bool)) {
/* 1530 */         double d1 = ((localsv.c(paramFloat) & 0xF00000) >> 20) / 16.0D + (localsv.T + (localsv.t - localsv.T) * paramFloat + 4.0D) / 32.0D;
/* 1531 */         if (d1 < 1.0D) {
/* 1532 */           if (d1 < 0.0D) d1 = 0.0D;
/* 1533 */           d1 *= d1;
/* 1534 */           float f2 = 100.0F * (float)d1;
/* 1535 */           if (f2 < 5.0F) f2 = 5.0F;
/* 1536 */           if (f1 > f2) { f1 = f2;
/*      */           }
/*      */         }
/*      */       }
/* 1540 */       GL11.glFogi(2917, 9729);
/* 1541 */       if (paramInt < 0) {
/* 1542 */         GL11.glFogf(2915, 0.0F);
/* 1543 */         GL11.glFogf(2916, f1);
/*      */       } else {
/* 1545 */         GL11.glFogf(2915, f1 * 0.75F);
/* 1546 */         GL11.glFogf(2916, f1);
/*      */       }
/* 1548 */       if (GLContext.getCapabilities().GL_NV_fog_distance) {
/* 1549 */         GL11.glFogi(34138, 34139);
/*      */       }
/*      */       
/* 1552 */       if (this.t.f.t.b((int)localsv.s, (int)localsv.u)) {
/* 1553 */         GL11.glFogf(2915, f1 * 0.05F);
/* 1554 */         GL11.glFogf(2916, Math.min(f1, 192.0F) * 0.5F);
/*      */       }
/*      */     }
/*      */     
/* 1558 */     GL11.glEnable(2903);
/* 1559 */     GL11.glColorMaterial(1028, 4608);
/*      */   }
/*      */   
/*      */   private FloatBuffer a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/* 1563 */     this.l.clear();
/* 1564 */     this.l.put(paramFloat1).put(paramFloat2).put(paramFloat3).put(paramFloat4);
/* 1565 */     this.l.flip();
/* 1566 */     return this.l;
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */   private float an;
/*      */   
/*      */ 
/*      */   private float ao;
/*      */   
/*      */ 
/*      */   public int p;
/*      */   
/*      */   public bbx i()
/*      */   {
/* 1581 */     return this.v;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\blt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */