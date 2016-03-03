/*      */ import com.google.common.base.Charsets;
/*      */ import com.mojang.authlib.GameProfile;
/*      */ import io.netty.buffer.ByteBuf;
/*      */ import io.netty.buffer.Unpooled;
/*      */ import io.netty.util.concurrent.GenericFutureListener;
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.IOException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.HashMap;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Map.Entry;
/*      */ import java.util.Random;
/*      */ import net.minecraft.client.ClientBrandRetriever;
/*      */ import net.minecraft.realms.DisconnectedOnlineScreen;
/*      */ import org.apache.logging.log4j.LogManager;
/*      */ import org.apache.logging.log4j.Logger;
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
/*      */ public class bjb
/*      */   implements fv
/*      */ {
/*   90 */   private static final Logger d = ;
/*      */   
/*      */   private final ej e;
/*      */   private bao f;
/*      */   private bjf g;
/*      */   private boolean h;
/*   96 */   public azq a = new azq(null);
/*   97 */   private Map i = new HashMap();
/*   98 */   public List b = new ArrayList();
/*   99 */   public int c = 20;
/*      */   private bdw j;
/*  101 */   private boolean k = false;
/*      */   
/*  103 */   private Random l = new Random();
/*      */   
/*      */   public bjb(bao parambao, bdw parambdw, ej paramej) {
/*  106 */     this.f = parambao;
/*  107 */     this.j = parambdw;
/*  108 */     this.e = paramej;
/*      */   }
/*      */   
/*      */   public void c() {
/*  112 */     this.g = null;
/*      */   }
/*      */   
/*      */ 
/*      */   public void a() {}
/*      */   
/*      */ 
/*      */   public void a(hd paramhd)
/*      */   {
/*  121 */     this.f.c = new bje(this.f, this);
/*      */     
/*  123 */     this.g = new bjf(this, new ahj(0L, paramhd.e(), false, paramhd.d(), paramhd.i()), paramhd.f(), paramhd.g(), this.f.z);
/*  124 */     this.g.E = true;
/*  125 */     this.f.a(this.g);
/*  126 */     this.f.h.ap = paramhd.f();
/*  127 */     this.f.a(new bdu(this));
/*  128 */     this.f.h.d(paramhd.c());
/*  129 */     this.c = paramhd.h();
/*      */     
/*  131 */     this.f.c.a(paramhd.e());
/*  132 */     this.f.u.c();
/*  133 */     this.e.a(new iz("MC|Brand", ClientBrandRetriever.getClientModName().getBytes(Charsets.UTF_8)), new GenericFutureListener[0]);
/*      */   }
/*      */   
/*      */   public void a(fw paramfw)
/*      */   {
/*  138 */     double d1 = paramfw.d() / 32.0D;
/*  139 */     double d2 = paramfw.e() / 32.0D;
/*  140 */     double d3 = paramfw.f() / 32.0D;
/*  141 */     Object localObject1 = null;
/*  142 */     Object localObject2; if (paramfw.l() == 10) {
/*  143 */       localObject1 = xl.a(this.g, d1, d2, d3, paramfw.m());
/*  144 */     } else if (paramfw.l() == 90) {
/*  145 */       localObject2 = this.g.a(paramfw.m());
/*  146 */       if ((localObject2 instanceof yz)) {
/*  147 */         localObject1 = new xe(this.g, d1, d2, d3, (yz)localObject2);
/*      */       }
/*  149 */       paramfw.g(0);
/*  150 */     } else if (paramfw.l() == 60) { localObject1 = new zc(this.g, d1, d2, d3);
/*  151 */     } else if (paramfw.l() == 61) { localObject1 = new zj(this.g, d1, d2, d3);
/*  152 */     } else if (paramfw.l() == 71) {
/*  153 */       localObject1 = new st(this.g, (int)d1, (int)d2, (int)d3, paramfw.m());
/*  154 */       paramfw.g(0);
/*  155 */     } else if (paramfw.l() == 77) {
/*  156 */       localObject1 = new su(this.g, (int)d1, (int)d2, (int)d3);
/*  157 */       paramfw.g(0);
/*  158 */     } else if (paramfw.l() == 65) {
/*  159 */       localObject1 = new zm(this.g, d1, d2, d3);
/*  160 */     } else if (paramfw.l() == 72) { localObject1 = new zd(this.g, d1, d2, d3);
/*  161 */     } else if (paramfw.l() == 76) {
/*  162 */       localObject1 = new zf(this.g, d1, d2, d3, null);
/*  163 */     } else if (paramfw.l() == 63) {
/*  164 */       localObject1 = new zg(this.g, d1, d2, d3, paramfw.g() / 8000.0D, paramfw.h() / 8000.0D, paramfw.i() / 8000.0D);
/*  165 */       paramfw.g(0);
/*  166 */     } else if (paramfw.l() == 64) {
/*  167 */       localObject1 = new zi(this.g, d1, d2, d3, paramfw.g() / 8000.0D, paramfw.h() / 8000.0D, paramfw.i() / 8000.0D);
/*  168 */       paramfw.g(0);
/*  169 */     } else if (paramfw.l() == 66) {
/*  170 */       localObject1 = new zp(this.g, d1, d2, d3, paramfw.g() / 8000.0D, paramfw.h() / 8000.0D, paramfw.i() / 8000.0D);
/*  171 */       paramfw.g(0);
/*  172 */     } else if (paramfw.l() == 62) { localObject1 = new zl(this.g, d1, d2, d3);
/*  173 */     } else if (paramfw.l() == 73) {
/*  174 */       localObject1 = new zo(this.g, d1, d2, d3, paramfw.m());
/*  175 */       paramfw.g(0);
/*  176 */     } else if (paramfw.l() == 75) {
/*  177 */       localObject1 = new zn(this.g, d1, d2, d3);
/*  178 */       paramfw.g(0);
/*  179 */     } else if (paramfw.l() == 1) { localObject1 = new xi(this.g, d1, d2, d3);
/*  180 */     } else if (paramfw.l() == 50) { localObject1 = new xw(this.g, d1, d2, d3, null);
/*  181 */     } else if (paramfw.l() == 51) { localObject1 = new wz(this.g, d1, d2, d3);
/*  182 */     } else if (paramfw.l() == 2) { localObject1 = new xk(this.g, d1, d2, d3);
/*  183 */     } else if (paramfw.l() == 70) {
/*  184 */       localObject1 = new xj(this.g, d1, d2, d3, aji.e(paramfw.m() & 0xFFFF), paramfw.m() >> 16);
/*  185 */       paramfw.g(0);
/*      */     }
/*      */     
/*  188 */     if (localObject1 != null) {
/*  189 */       ((sa)localObject1).bZ = paramfw.d();
/*  190 */       ((sa)localObject1).ca = paramfw.e();
/*  191 */       ((sa)localObject1).cb = paramfw.f();
/*  192 */       ((sa)localObject1).z = (paramfw.j() * 360 / 256.0F);
/*  193 */       ((sa)localObject1).y = (paramfw.k() * 360 / 256.0F);
/*  194 */       localObject2 = ((sa)localObject1).at();
/*  195 */       if (localObject2 != null) {
/*  196 */         int m = paramfw.c() - ((sa)localObject1).y();
/*  197 */         for (int n = 0; n < localObject2.length; n++) {
/*  198 */           localObject2[n].d(localObject2[n].y() + m);
/*      */         }
/*      */       }
/*  201 */       ((sa)localObject1).d(paramfw.c());
/*  202 */       this.g.a(paramfw.c(), (sa)localObject1);
/*  203 */       if (paramfw.m() > 0) {
/*  204 */         if (paramfw.l() == 60) {
/*  205 */           sa localsa = this.g.a(paramfw.m());
/*  206 */           if ((localsa instanceof sv)) {
/*  207 */             zc localzc = (zc)localObject1;
/*  208 */             localzc.c = localsa;
/*      */           }
/*      */         }
/*      */         
/*  212 */         ((sa)localObject1).i(paramfw.g() / 8000.0D, paramfw.h() / 8000.0D, paramfw.i() / 8000.0D);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(fx paramfx)
/*      */   {
/*  219 */     sq localsq = new sq(this.g, paramfx.d(), paramfx.e(), paramfx.f(), paramfx.g());
/*  220 */     localsq.bZ = paramfx.d();
/*  221 */     localsq.ca = paramfx.e();
/*  222 */     localsq.cb = paramfx.f();
/*  223 */     localsq.y = 0.0F;
/*  224 */     localsq.z = 0.0F;
/*  225 */     localsq.d(paramfx.c());
/*  226 */     this.g.a(paramfx.c(), localsq);
/*      */   }
/*      */   
/*      */   public void a(fy paramfy)
/*      */   {
/*  231 */     double d1 = paramfy.d() / 32.0D;
/*  232 */     double d2 = paramfy.e() / 32.0D;
/*  233 */     double d3 = paramfy.f() / 32.0D;
/*  234 */     xh localxh = null;
/*  235 */     if (paramfy.g() == 1) localxh = new xh(this.g, d1, d2, d3);
/*  236 */     if (localxh != null) {
/*  237 */       localxh.bZ = paramfy.d();
/*  238 */       localxh.ca = paramfy.e();
/*  239 */       localxh.cb = paramfy.f();
/*  240 */       localxh.y = 0.0F;
/*  241 */       localxh.z = 0.0F;
/*  242 */       localxh.d(paramfy.c());
/*  243 */       this.g.c(localxh);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ga paramga)
/*      */   {
/*  249 */     tb localtb = new tb(this.g, paramga.d(), paramga.e(), paramga.f(), paramga.g(), paramga.h());
/*  250 */     this.g.a(paramga.c(), localtb);
/*      */   }
/*      */   
/*      */   public void a(hy paramhy)
/*      */   {
/*  255 */     sa localsa = this.g.a(paramhy.c());
/*  256 */     if (localsa == null) return;
/*  257 */     localsa.i(paramhy.d() / 8000.0D, paramhy.e() / 8000.0D, paramhy.f() / 8000.0D);
/*      */   }
/*      */   
/*      */   public void a(hw paramhw)
/*      */   {
/*  262 */     sa localsa = this.g.a(paramhw.d());
/*  263 */     if ((localsa != null) && (paramhw.c() != null)) {
/*  264 */       localsa.z().a(paramhw.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gb paramgb)
/*      */   {
/*  270 */     double d1 = paramgb.f() / 32.0D;
/*  271 */     double d2 = paramgb.g() / 32.0D;
/*  272 */     double d3 = paramgb.h() / 32.0D;
/*  273 */     float f1 = paramgb.i() * 360 / 256.0F;
/*  274 */     float f2 = paramgb.j() * 360 / 256.0F;
/*  275 */     GameProfile localGameProfile = paramgb.e();
/*      */     
/*  277 */     bll localbll = new bll(this.f.f, paramgb.e());
/*  278 */     localbll.p = (localbll.S = localbll.bZ = paramgb.f());
/*  279 */     localbll.q = (localbll.T = localbll.ca = paramgb.g());
/*  280 */     localbll.r = (localbll.U = localbll.cb = paramgb.h());
/*      */     
/*  282 */     int m = paramgb.k();
/*  283 */     if (m == 0) {
/*  284 */       localbll.bm.a[localbll.bm.c] = null;
/*      */     } else {
/*  286 */       localbll.bm.a[localbll.bm.c] = new add(adb.d(m), 1, 0);
/*      */     }
/*  288 */     localbll.a(d1, d2, d3, f1, f2);
/*  289 */     this.g.a(paramgb.d(), localbll);
/*      */     
/*  291 */     List localList = paramgb.c();
/*  292 */     if (localList != null) {
/*  293 */       localbll.z().a(localList);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ik paramik)
/*      */   {
/*  299 */     sa localsa = this.g.a(paramik.c());
/*  300 */     if (localsa == null) return;
/*  301 */     localsa.bZ = paramik.d();
/*  302 */     localsa.ca = paramik.e();
/*  303 */     localsa.cb = paramik.f();
/*  304 */     double d1 = localsa.bZ / 32.0D;
/*  305 */     double d2 = localsa.ca / 32.0D + 0.015625D;
/*  306 */     double d3 = localsa.cb / 32.0D;
/*  307 */     float f1 = paramik.g() * 360 / 256.0F;
/*  308 */     float f2 = paramik.h() * 360 / 256.0F;
/*  309 */     localsa.a(d1, d2, d3, f1, f2, 3);
/*      */   }
/*      */   
/*      */   public void a(hu paramhu)
/*      */   {
/*  314 */     if ((paramhu.c() >= 0) && (paramhu.c() < yx.i())) {
/*  315 */       this.f.h.bm.c = paramhu.c();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hf paramhf)
/*      */   {
/*  321 */     sa localsa = paramhf.a(this.g);
/*  322 */     if (localsa == null) return;
/*  323 */     localsa.bZ += paramhf.c();
/*  324 */     localsa.ca += paramhf.d();
/*  325 */     localsa.cb += paramhf.e();
/*  326 */     double d1 = localsa.bZ / 32.0D;
/*  327 */     double d2 = localsa.ca / 32.0D;
/*  328 */     double d3 = localsa.cb / 32.0D;
/*  329 */     float f1 = paramhf.h() ? paramhf.f() * 360 / 256.0F : localsa.y;
/*  330 */     float f2 = paramhf.h() ? paramhf.g() * 360 / 256.0F : localsa.z;
/*  331 */     localsa.a(d1, d2, d3, f1, f2, 3);
/*      */   }
/*      */   
/*      */   public void a(ht paramht)
/*      */   {
/*  336 */     sa localsa = paramht.a(this.g);
/*  337 */     if (localsa == null) return;
/*  338 */     float f1 = paramht.c() * 360 / 256.0F;
/*  339 */     localsa.e(f1);
/*      */   }
/*      */   
/*      */   public void a(hq paramhq)
/*      */   {
/*  344 */     for (int m = 0; m < paramhq.c().length; m++) {
/*  345 */       this.g.b(paramhq.c()[m]);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(fu paramfu)
/*      */   {
/*  351 */     bjk localbjk = this.f.h;
/*      */     
/*  353 */     double d1 = paramfu.c();
/*  354 */     double d2 = paramfu.d();
/*  355 */     double d3 = paramfu.e();
/*  356 */     float f1 = paramfu.f();
/*  357 */     float f2 = paramfu.g();
/*      */     
/*  359 */     localbjk.V = 0.0F;
/*  360 */     localbjk.v = (localbjk.w = localbjk.x = 0.0D);
/*  361 */     localbjk.a(d1, d2, d3, f1, f2);
/*      */     
/*  363 */     this.e.a(new jf(localbjk.s, localbjk.C.b, localbjk.t, localbjk.u, paramfu.f(), paramfu.g(), paramfu.h()), new GenericFutureListener[0]);
/*      */     
/*  365 */     if (!this.h) {
/*  366 */       this.f.h.p = this.f.h.s;
/*  367 */       this.f.h.q = this.f.h.t;
/*  368 */       this.f.h.r = this.f.h.u;
/*  369 */       this.h = true;
/*  370 */       this.f.a(null);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gk paramgk)
/*      */   {
/*  376 */     int m = paramgk.c().a * 16;
/*  377 */     int n = paramgk.c().b * 16;
/*  378 */     if (paramgk.d() == null) {
/*  379 */       return;
/*      */     }
/*      */     
/*      */ 
/*  383 */     DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramgk.d()));
/*      */     try
/*      */     {
/*  386 */       for (int i1 = 0; i1 < paramgk.e(); i1++) {
/*  387 */         int i2 = localDataInputStream.readShort();
/*  388 */         int i3 = localDataInputStream.readShort();
/*  389 */         int i4 = i3 >> 4 & 0xFFF;
/*  390 */         int i5 = i3 & 0xF;
/*      */         
/*  392 */         int i6 = i2 >> 12 & 0xF;
/*  393 */         int i7 = i2 >> 8 & 0xF;
/*  394 */         int i8 = i2 & 0xFF;
/*      */         
/*  396 */         this.g.c(i6 + m, i8, i7 + n, aji.e(i4), i5);
/*      */       }
/*      */     }
/*      */     catch (IOException localIOException) {}
/*      */   }
/*      */   
/*      */   public void a(gx paramgx)
/*      */   {
/*  404 */     if (paramgx.i()) {
/*  405 */       if (paramgx.g() != 0) {
/*  406 */         this.g.a(paramgx.e(), paramgx.f(), true);
/*      */       } else {
/*  408 */         this.g.a(paramgx.e(), paramgx.f(), false);
/*  409 */         return;
/*      */       }
/*      */     }
/*      */     
/*  413 */     this.g.a(paramgx.e() << 4, 0, paramgx.f() << 4, (paramgx.e() << 4) + 15, 256, (paramgx.f() << 4) + 15);
/*      */     
/*  415 */     apx localapx = this.g.e(paramgx.e(), paramgx.f());
/*      */     
/*  417 */     localapx.a(paramgx.d(), paramgx.g(), paramgx.h(), paramgx.i());
/*  418 */     this.g.c(paramgx.e() << 4, 0, paramgx.f() << 4, (paramgx.e() << 4) + 15, 256, (paramgx.f() << 4) + 15);
/*      */     
/*  420 */     if ((!paramgx.i()) || (!(this.g.t instanceof aqq))) {
/*  421 */       localapx.n();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gh paramgh)
/*      */   {
/*  427 */     this.g.c(paramgh.d(), paramgh.e(), paramgh.f(), paramgh.c(), paramgh.g());
/*      */   }
/*      */   
/*      */   public void a(gs paramgs)
/*      */   {
/*  432 */     this.e.a(paramgs.c());
/*      */   }
/*      */   
/*      */   public void a(fj paramfj)
/*      */   {
/*  437 */     this.f.a(null);
/*  438 */     if (this.j != null) {
/*  439 */       if ((this.j instanceof bcq)) {
/*  440 */         this.f.a(new DisconnectedOnlineScreen(((bcq)this.j).a(), "disconnect.lost", paramfj).getProxy());
/*      */       } else {
/*  442 */         this.f.a(new bdf(this.j, "disconnect.lost", paramfj));
/*      */       }
/*      */     } else {
/*  445 */       this.f.a(new bdf(new bfz(new bee()), "disconnect.lost", paramfj));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ft paramft) {
/*  450 */     this.e.a(paramft, new GenericFutureListener[0]);
/*      */   }
/*      */   
/*      */   public void a(ij paramij)
/*      */   {
/*  455 */     sa localsa = this.g.a(paramij.c());
/*  456 */     Object localObject = (sv)this.g.a(paramij.d());
/*  457 */     if (localObject == null) {
/*  458 */       localObject = this.f.h;
/*      */     }
/*  460 */     if (localsa != null) {
/*  461 */       if ((localsa instanceof sq)) {
/*  462 */         this.g.a(localsa, "random.orb", 0.2F, ((this.l.nextFloat() - this.l.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*      */       } else {
/*  464 */         this.g.a(localsa, "random.pop", 0.2F, ((this.l.nextFloat() - this.l.nextFloat()) * 0.7F + 1.0F) * 2.0F);
/*      */       }
/*      */       
/*  467 */       this.f.k.a(new blb(this.f.f, localsa, (sa)localObject, -0.5F));
/*  468 */       this.g.b(paramij.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gj paramgj)
/*      */   {
/*  474 */     this.f.r.b().a(paramgj.c());
/*      */   }
/*      */   
/*      */   public void a(gc paramgc)
/*      */   {
/*  479 */     sa localsa = this.g.a(paramgc.c());
/*  480 */     if (localsa == null) return;
/*  481 */     Object localObject; if (paramgc.d() == 0) {
/*  482 */       localObject = (sv)localsa;
/*  483 */       ((sv)localObject).ba();
/*  484 */     } else if (paramgc.d() == 1) {
/*  485 */       localsa.aj();
/*  486 */     } else if (paramgc.d() == 2) {
/*  487 */       localObject = (yz)localsa;
/*  488 */       ((yz)localObject).a(false, false, false);
/*  489 */     } else if (paramgc.d() == 4) {
/*  490 */       this.f.k.a(new bjw(this.f.f, localsa));
/*  491 */     } else if (paramgc.d() == 5) {
/*  492 */       localObject = new bjw(this.f.f, localsa, "magicCrit");
/*  493 */       this.f.k.a((bkm)localObject);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hp paramhp)
/*      */   {
/*  499 */     paramhp.a(this.g).a(paramhp.c(), paramhp.d(), paramhp.e());
/*      */   }
/*      */   
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   public void a(fz paramfz)
/*      */   {
/*  508 */     double d1 = paramfz.f() / 32.0D;
/*  509 */     double d2 = paramfz.g() / 32.0D;
/*  510 */     double d3 = paramfz.h() / 32.0D;
/*  511 */     float f1 = paramfz.l() * 360 / 256.0F;
/*  512 */     float f2 = paramfz.m() * 360 / 256.0F;
/*  513 */     sv localsv = (sv)sg.a(paramfz.e(), this.f.f);
/*  514 */     localsv.bZ = paramfz.f();
/*  515 */     localsv.ca = paramfz.g();
/*  516 */     localsv.cb = paramfz.h();
/*  517 */     localsv.aO = (paramfz.n() * 360 / 256.0F);
/*  518 */     sa[] arrayOfsa = localsv.at();
/*  519 */     if (arrayOfsa != null) {
/*  520 */       int m = paramfz.d() - localsv.y();
/*  521 */       for (int n = 0; n < arrayOfsa.length; n++) {
/*  522 */         arrayOfsa[n].d(arrayOfsa[n].y() + m);
/*      */       }
/*      */     }
/*      */     
/*  526 */     localsv.d(paramfz.d());
/*  527 */     localsv.a(d1, d2, d3, f1, f2);
/*  528 */     localsv.v = (paramfz.i() / 8000.0F);
/*  529 */     localsv.w = (paramfz.j() / 8000.0F);
/*  530 */     localsv.x = (paramfz.k() / 8000.0F);
/*  531 */     this.g.a(paramfz.d(), localsv);
/*      */     
/*  533 */     List localList = paramfz.c();
/*  534 */     if (localList != null) {
/*  535 */       localsv.z().a(localList);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ih paramih)
/*      */   {
/*  541 */     this.f.f.a(paramih.c());
/*  542 */     this.f.f.b(paramih.d());
/*      */   }
/*      */   
/*      */   public void a(ig paramig)
/*      */   {
/*  547 */     this.f.h.a(new r(paramig.c(), paramig.d(), paramig.e()), true);
/*  548 */     this.f.f.N().a(paramig.c(), paramig.d(), paramig.e());
/*      */   }
/*      */   
/*      */   public void a(hx paramhx)
/*      */   {
/*  553 */     Object localObject = this.g.a(paramhx.d());
/*  554 */     sa localsa = this.g.a(paramhx.e());
/*      */     
/*  556 */     if (paramhx.c() == 0) {
/*  557 */       int m = 0;
/*  558 */       if (paramhx.d() == this.f.h.y()) {
/*  559 */         localObject = this.f.h;
/*      */         
/*  561 */         if ((localsa instanceof xi)) { ((xi)localsa).a(false);
/*      */         }
/*  563 */         m = (((sa)localObject).m == null) && (localsa != null) ? 1 : 0;
/*  564 */       } else if ((localsa instanceof xi)) {
/*  565 */         ((xi)localsa).a(true);
/*      */       }
/*      */       
/*  568 */       if (localObject == null) { return;
/*      */       }
/*  570 */       ((sa)localObject).a(localsa);
/*      */       
/*  572 */       if (m != 0) {
/*  573 */         bbj localbbj = this.f.u;
/*  574 */         this.f.r.a(brp.a("mount.onboard", new Object[] { bbj.c(localbbj.Z.i()) }), false);
/*      */       }
/*  576 */     } else if ((paramhx.c() == 1) && 
/*  577 */       (localObject != null) && ((localObject instanceof sw))) {
/*  578 */       if (localsa != null) {
/*  579 */         ((sw)localObject).b(localsa, false);
/*      */       } else {
/*  581 */         ((sw)localObject).a(false, false);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(gt paramgt)
/*      */   {
/*  589 */     sa localsa = paramgt.a(this.g);
/*  590 */     if (localsa != null) localsa.a(paramgt.c());
/*      */   }
/*      */   
/*      */   public void a(ib paramib)
/*      */   {
/*  595 */     this.f.h.n(paramib.c());
/*  596 */     this.f.h.bQ().a(paramib.d());
/*  597 */     this.f.h.bQ().b(paramib.e());
/*      */   }
/*      */   
/*      */   public void a(ia paramia)
/*      */   {
/*  602 */     this.f.h.a(paramia.c(), paramia.d(), paramia.e());
/*      */   }
/*      */   
/*      */   public void a(hs paramhs)
/*      */   {
/*  607 */     if (paramhs.c() != this.f.h.ap) {
/*  608 */       this.h = false;
/*  609 */       bac localbac = this.g.W();
/*  610 */       this.g = new bjf(this, new ahj(0L, paramhs.e(), false, this.f.f.N().t(), paramhs.f()), paramhs.c(), paramhs.d(), this.f.z);
/*  611 */       this.g.a(localbac);
/*  612 */       this.g.E = true;
/*  613 */       this.f.a(this.g);
/*  614 */       this.f.h.ap = paramhs.c();
/*  615 */       this.f.a(new bdu(this));
/*      */     }
/*      */     
/*  618 */     this.f.a(paramhs.c());
/*  619 */     this.f.c.a(paramhs.e());
/*      */   }
/*      */   
/*      */   public void a(gu paramgu)
/*      */   {
/*  624 */     agw localagw = new agw(this.f.f, null, paramgu.f(), paramgu.g(), paramgu.h(), paramgu.i());
/*  625 */     localagw.h = paramgu.j();
/*  626 */     localagw.a(true);
/*      */     
/*  628 */     this.f.h.v += paramgu.c();
/*  629 */     this.f.h.w += paramgu.d();
/*  630 */     this.f.h.x += paramgu.e();
/*      */   }
/*      */   
/*      */   public void a(gn paramgn)
/*      */   {
/*  635 */     bjk localbjk = this.f.h;
/*  636 */     switch (paramgn.d()) {
/*      */     case 0: 
/*  638 */       localbjk.a(new rh(paramgn.e(), paramgn.g(), paramgn.f()));
/*  639 */       localbjk.bo.d = paramgn.c();
/*  640 */       break;
/*      */     case 9: 
/*  642 */       api localapi = new api();
/*  643 */       if (paramgn.g()) localapi.a(paramgn.e());
/*  644 */       localbjk.a(localapi);
/*  645 */       localbjk.bo.d = paramgn.c();
/*  646 */       break;
/*      */     case 2: 
/*  648 */       apg localapg = new apg();
/*  649 */       if (paramgn.g()) localapg.a(paramgn.e());
/*  650 */       localbjk.a(localapg);
/*  651 */       localbjk.bo.d = paramgn.c();
/*  652 */       break;
/*      */     case 5: 
/*  654 */       aov localaov = new aov();
/*  655 */       if (paramgn.g()) localaov.a(paramgn.e());
/*  656 */       localbjk.a(localaov);
/*  657 */       localbjk.bo.d = paramgn.c();
/*  658 */       break;
/*      */     case 10: 
/*  660 */       apc localapc = new apc();
/*  661 */       if (paramgn.g()) localapc.a(paramgn.e());
/*  662 */       localbjk.a(localapc);
/*  663 */       localbjk.bo.d = paramgn.c();
/*  664 */       break;
/*      */     case 3: 
/*  666 */       apb localapb = new apb();
/*  667 */       if (paramgn.g()) localapb.a(paramgn.e());
/*  668 */       localbjk.a(localapb);
/*  669 */       localbjk.bo.d = paramgn.c();
/*  670 */       break;
/*      */     case 1: 
/*  672 */       localbjk.b(qh.c(localbjk.s), qh.c(localbjk.t), qh.c(localbjk.u));
/*  673 */       localbjk.bo.d = paramgn.c();
/*  674 */       break;
/*      */     case 4: 
/*  676 */       localbjk.a(qh.c(localbjk.s), qh.c(localbjk.t), qh.c(localbjk.u), paramgn.g() ? paramgn.e() : null);
/*  677 */       localbjk.bo.d = paramgn.c();
/*  678 */       break;
/*      */     case 6: 
/*  680 */       localbjk.a(new yt(localbjk), paramgn.g() ? paramgn.e() : null);
/*  681 */       localbjk.bo.d = paramgn.c();
/*  682 */       break;
/*      */     case 7: 
/*  684 */       aoq localaoq = new aoq();
/*  685 */       localbjk.a(localaoq);
/*  686 */       if (paramgn.g()) localaoq.a(paramgn.e());
/*  687 */       localbjk.bo.d = paramgn.c();
/*  688 */       break;
/*      */     case 8: 
/*  690 */       localbjk.c(qh.c(localbjk.s), qh.c(localbjk.t), qh.c(localbjk.u));
/*  691 */       localbjk.bo.d = paramgn.c();
/*  692 */       break;
/*      */     case 11: 
/*  694 */       sa localsa = this.g.a(paramgn.h());
/*  695 */       if ((localsa != null) && ((localsa instanceof wi))) {
/*  696 */         localbjk.a((wi)localsa, new zt(paramgn.e(), paramgn.g(), paramgn.f()));
/*  697 */         localbjk.bo.d = paramgn.c();
/*      */       }
/*      */       break;
/*      */     }
/*      */     
/*      */   }
/*      */   
/*      */   public void a(gq paramgq)
/*      */   {
/*  706 */     bjk localbjk = this.f.h;
/*  707 */     if (paramgq.c() == -1) {
/*  708 */       localbjk.bm.b(paramgq.e());
/*      */     } else {
/*  710 */       int m = 0;
/*      */       Object localObject;
/*  712 */       if ((this.f.n instanceof bfl)) {
/*  713 */         localObject = (bfl)this.f.n;
/*      */         
/*  715 */         m = ((bfl)localObject).a() != abt.m.a() ? 1 : 0;
/*      */       }
/*      */       
/*  718 */       if ((paramgq.c() == 0) && (paramgq.d() >= 36) && (paramgq.d() < 45)) {
/*  719 */         localObject = localbjk.bn.a(paramgq.d()).d();
/*  720 */         if ((paramgq.e() != null) && (
/*  721 */           (localObject == null) || (((add)localObject).b < paramgq.e().b))) {
/*  722 */           paramgq.e().c = 5;
/*      */         }
/*      */         
/*  725 */         localbjk.bn.a(paramgq.d(), paramgq.e());
/*  726 */       } else if ((paramgq.c() == localbjk.bo.d) && ((paramgq.c() != 0) || (m == 0))) {
/*  727 */         localbjk.bo.a(paramgq.d(), paramgq.e());
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gl paramgl)
/*      */   {
/*  734 */     zs localzs = null;
/*  735 */     bjk localbjk = this.f.h;
/*  736 */     if (paramgl.c() == 0) {
/*  737 */       localzs = localbjk.bn;
/*  738 */     } else if (paramgl.c() == localbjk.bo.d) {
/*  739 */       localzs = localbjk.bo;
/*      */     }
/*  741 */     if ((localzs != null) && 
/*  742 */       (!paramgl.e())) {
/*  743 */       a(new iv(paramgl.c(), paramgl.d(), true));
/*      */     }
/*      */   }
/*      */   
/*      */ 
/*      */   public void a(go paramgo)
/*      */   {
/*  750 */     bjk localbjk = this.f.h;
/*  751 */     if (paramgo.c() == 0) {
/*  752 */       localbjk.bn.a(paramgo.d());
/*  753 */     } else if (paramgo.c() == localbjk.bo.d) {
/*  754 */       localbjk.bo.a(paramgo.d());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hj paramhj)
/*      */   {
/*  760 */     Object localObject = this.g.o(paramhj.c(), paramhj.d(), paramhj.e());
/*      */     
/*  762 */     if (localObject == null) {
/*  763 */       localObject = new apm();
/*  764 */       ((aor)localObject).a(this.g);
/*  765 */       ((aor)localObject).c = paramhj.c();
/*  766 */       ((aor)localObject).d = paramhj.d();
/*  767 */       ((aor)localObject).e = paramhj.e();
/*      */     }
/*      */     
/*  770 */     this.f.h.a((aor)localObject);
/*      */   }
/*      */   
/*      */   public void a(ii paramii)
/*      */   {
/*  775 */     int m = 0;
/*  776 */     if (this.f.f.d(paramii.c(), paramii.d(), paramii.e())) {
/*  777 */       aor localaor = this.f.f.o(paramii.c(), paramii.d(), paramii.e());
/*  778 */       if ((localaor instanceof apm)) {
/*  779 */         apm localapm = (apm)localaor;
/*  780 */         if (localapm.a()) {
/*  781 */           for (int n = 0; n < 4; n++) {
/*  782 */             localapm.a[n] = paramii.f()[n];
/*      */           }
/*  784 */           localapm.e();
/*      */         }
/*  786 */         m = 1;
/*      */       }
/*      */     }
/*  789 */     if ((m == 0) && (this.f.h != null)) {
/*  790 */       this.f.h.a(new fq("Unable to locate sign at " + paramii.c() + ", " + paramii.d() + ", " + paramii.e()));
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gf paramgf)
/*      */   {
/*  796 */     if (this.f.f.d(paramgf.c(), paramgf.d(), paramgf.e())) {
/*  797 */       aor localaor = this.f.f.o(paramgf.c(), paramgf.d(), paramgf.e());
/*      */       
/*  799 */       if (localaor != null) {
/*  800 */         if ((paramgf.f() == 1) && ((localaor instanceof apj))) {
/*  801 */           localaor.a(paramgf.g());
/*  802 */         } else if ((paramgf.f() == 2) && ((localaor instanceof aox))) {
/*  803 */           localaor.a(paramgf.g());
/*  804 */         } else if ((paramgf.f() == 3) && ((localaor instanceof aoq))) {
/*  805 */           localaor.a(paramgf.g());
/*  806 */         } else if ((paramgf.f() == 4) && ((localaor instanceof apn))) {
/*  807 */           localaor.a(paramgf.g());
/*  808 */         } else if ((paramgf.f() == 5) && ((localaor instanceof apf))) {
/*  809 */           localaor.a(paramgf.g());
/*      */         }
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gp paramgp)
/*      */   {
/*  817 */     bjk localbjk = this.f.h;
/*  818 */     if ((localbjk.bo != null) && (localbjk.bo.d == paramgp.c())) {
/*  819 */       localbjk.bo.b(paramgp.d(), paramgp.e());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hz paramhz)
/*      */   {
/*  825 */     sa localsa = this.g.a(paramhz.d());
/*  826 */     if (localsa != null) {
/*  827 */       localsa.c(paramhz.e(), paramhz.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gm paramgm)
/*      */   {
/*  833 */     this.f.h.b();
/*      */   }
/*      */   
/*      */   public void a(gg paramgg)
/*      */   {
/*  838 */     this.f.f.c(paramgg.d(), paramgg.e(), paramgg.f(), paramgg.c(), paramgg.g(), paramgg.h());
/*      */   }
/*      */   
/*      */   public void a(ge paramge)
/*      */   {
/*  843 */     this.f.f.d(paramge.c(), paramge.d(), paramge.e(), paramge.f(), paramge.g());
/*      */   }
/*      */   
/*      */   public void a(gz paramgz)
/*      */   {
/*  848 */     for (int m = 0; m < paramgz.d(); m++) {
/*  849 */       int n = paramgz.a(m);
/*  850 */       int i1 = paramgz.b(m);
/*      */       
/*  852 */       this.g.a(n, i1, true);
/*      */       
/*  854 */       this.g.a(n << 4, 0, i1 << 4, (n << 4) + 15, 256, (i1 << 4) + 15);
/*      */       
/*  856 */       apx localapx = this.g.e(n, i1);
/*      */       
/*  858 */       localapx.a(paramgz.c(m), paramgz.e()[m], paramgz.f()[m], true);
/*  859 */       this.g.c(n << 4, 0, i1 << 4, (n << 4) + 15, 256, (i1 << 4) + 15);
/*      */       
/*  861 */       if (!(this.g.t instanceof aqq)) {
/*  862 */         localapx.n();
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gv paramgv)
/*      */   {
/*  869 */     bjk localbjk = this.f.h;
/*  870 */     int m = paramgv.c();
/*  871 */     float f1 = paramgv.d();
/*  872 */     int n = qh.d(f1 + 0.5F);
/*  873 */     if ((m >= 0) && (m < gv.a.length) && 
/*  874 */       (gv.a[m] != null)) {
/*  875 */       localbjk.b(new fr(gv.a[m], new Object[0]));
/*      */     }
/*      */     
/*  878 */     if (m == 1) {
/*  879 */       this.g.N().b(true);
/*  880 */       this.g.k(0.0F);
/*  881 */     } else if (m == 2) {
/*  882 */       this.g.N().b(false);
/*  883 */       this.g.k(1.0F);
/*  884 */     } else if (m == 3) {
/*  885 */       this.f.c.a(ahk.a(n));
/*  886 */     } else if (m == 4) {
/*  887 */       this.f.a(new beg());
/*  888 */     } else if (m == 5) {
/*  889 */       bbj localbbj = this.f.u;
/*  890 */       if (f1 == 0.0F) {
/*  891 */         this.f.a(new bdd());
/*  892 */       } else if (f1 == 101.0F) {
/*  893 */         this.f.r.b().a(new fr("demo.help.movement", new Object[] { bbj.c(localbbj.U.i()), bbj.c(localbbj.V.i()), bbj.c(localbbj.W.i()), bbj.c(localbbj.X.i()) }));
/*      */       }
/*  895 */       else if (f1 == 102.0F) {
/*  896 */         this.f.r.b().a(new fr("demo.help.jump", new Object[] { bbj.c(localbbj.Y.i()) }));
/*  897 */       } else if (f1 == 103.0F) {
/*  898 */         this.f.r.b().a(new fr("demo.help.inventory", new Object[] { bbj.c(localbbj.aa.i()) }));
/*      */       }
/*  900 */     } else if (m == 6) {
/*  901 */       this.g.a(localbjk.s, localbjk.t + localbjk.g(), localbjk.u, "random.successful_hit", 0.18F, 0.45F, false);
/*  902 */     } else if (m == 7) {
/*  903 */       this.g.k(f1);
/*  904 */     } else if (m == 8) {
/*  905 */       this.g.i(f1);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(he paramhe)
/*      */   {
/*  911 */     ayi localayi = adh.a(paramhe.c(), this.f.f);
/*  912 */     localayi.a(paramhe.d());
/*  913 */     this.f.p.i().a(localayi);
/*      */   }
/*      */   
/*      */   public void a(ha paramha)
/*      */   {
/*  918 */     if (paramha.c()) {
/*  919 */       this.f.f.b(paramha.d(), paramha.f(), paramha.g(), paramha.h(), paramha.e());
/*      */     } else {
/*  921 */       this.f.f.c(paramha.d(), paramha.f(), paramha.g(), paramha.h(), paramha.e());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gd paramgd)
/*      */   {
/*  927 */     int m = 0;
/*      */     
/*  929 */     for (Map.Entry localEntry : paramgd.c().entrySet()) {
/*  930 */       ph localph = (ph)localEntry.getKey();
/*  931 */       int n = ((Integer)localEntry.getValue()).intValue();
/*      */       
/*  933 */       if ((localph.d()) && (n > 0)) {
/*  934 */         if ((this.k) && (this.f.h.m().a(localph) == 0)) {
/*  935 */           pb localpb = (pb)localph;
/*  936 */           this.f.q.a(localpb);
/*  937 */           this.f.Z().a(new btw(localpb), 0L);
/*      */           
/*  939 */           if (localph == pc.f) {
/*  940 */             this.f.u.G = false;
/*  941 */             this.f.u.b();
/*      */           }
/*      */         }
/*  944 */         m = 1;
/*      */       }
/*      */       
/*  947 */       this.f.h.m().a(this.f.h, localph, n);
/*      */     }
/*      */     
/*  950 */     if ((!this.k) && (m == 0) && (this.f.u.G)) {
/*  951 */       this.f.q.b(pc.f);
/*      */     }
/*      */     
/*  954 */     this.k = true;
/*      */     
/*  956 */     if ((this.f.n instanceof ber)) {
/*  957 */       ((ber)this.f.n).a();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(in paramin)
/*      */   {
/*  963 */     sa localsa = this.g.a(paramin.d());
/*  964 */     if (!(localsa instanceof sv)) { return;
/*      */     }
/*  966 */     rw localrw = new rw(paramin.e(), paramin.g(), paramin.f());
/*  967 */     localrw.b(paramin.c());
/*  968 */     ((sv)localsa).c(localrw);
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
/*      */   public void a(hr paramhr)
/*      */   {
/*  992 */     sa localsa = this.g.a(paramhr.c());
/*  993 */     if ((localsa instanceof sv)) {
/*  994 */       ((sv)localsa).l(paramhr.d());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ho paramho)
/*      */   {
/* 1000 */     bjl localbjl = (bjl)this.i.get(paramho.c());
/* 1001 */     if ((localbjl == null) && (paramho.d())) {
/* 1002 */       localbjl = new bjl(paramho.c());
/* 1003 */       this.i.put(paramho.c(), localbjl);
/* 1004 */       this.b.add(localbjl);
/*      */     }
/* 1006 */     if ((localbjl != null) && (!paramho.d())) {
/* 1007 */       this.i.remove(paramho.c());
/* 1008 */       this.b.remove(localbjl);
/*      */     }
/* 1010 */     if ((localbjl != null) && (paramho.d())) {
/* 1011 */       localbjl.b = paramho.e();
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(gw paramgw)
/*      */   {
/* 1017 */     a(new jc(paramgw.c()));
/*      */   }
/*      */   
/*      */   public void a(eo parameo1, eo parameo2)
/*      */   {
/* 1022 */     throw new IllegalStateException("Unexpected protocol change!");
/*      */   }
/*      */   
/*      */   public void a(hk paramhk)
/*      */   {
/* 1027 */     bjk localbjk = this.f.h;
/* 1028 */     localbjk.bE.b = paramhk.d();
/* 1029 */     localbjk.bE.d = paramhk.f();
/* 1030 */     localbjk.bE.a = paramhk.c();
/* 1031 */     localbjk.bE.c = paramhk.e();
/* 1032 */     localbjk.bE.a(paramhk.g());
/* 1033 */     localbjk.bE.b(paramhk.h());
/*      */   }
/*      */   
/*      */   public void a(gi paramgi)
/*      */   {
/* 1038 */     String[] arrayOfString = paramgi.c();
/*      */     
/* 1040 */     if ((this.f.n instanceof bct)) {
/* 1041 */       bct localbct = (bct)this.f.n;
/*      */       
/* 1043 */       localbct.a(arrayOfString);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hc paramhc)
/*      */   {
/* 1049 */     this.f.f.a(paramhc.d(), paramhc.e(), paramhc.f(), paramhc.c(), paramhc.g(), paramhc.h(), false);
/*      */   }
/*      */   
/*      */   public void a(gr paramgr) {
/*      */     Object localObject1;
/* 1054 */     if ("MC|TrList".equals(paramgr.c())) {
/* 1055 */       localObject1 = Unpooled.wrappedBuffer(paramgr.d());
/*      */       try {
/* 1057 */         int m = ((ByteBuf)localObject1).readInt();
/* 1058 */         bdw localbdw = this.f.n;
/* 1059 */         if ((localbdw != null) && ((localbdw instanceof bfv)) && (m == this.f.h.bo.d)) {
/* 1060 */           agm localagm = ((bfv)localbdw).a();
/* 1061 */           ago localago = ago.b(new et((ByteBuf)localObject1));
/* 1062 */           localagm.a(localago);
/*      */         }
/*      */       } catch (IOException localIOException) {
/* 1065 */         d.error("Couldn't load trade info", localIOException);
/*      */       } finally {
/* 1067 */         ((ByteBuf)localObject1).release();
/*      */       }
/* 1069 */     } else if ("MC|Brand".equals(paramgr.c())) {
/* 1070 */       this.f.h.b(new String(paramgr.d(), Charsets.UTF_8));
/* 1071 */     } else if ("MC|RPack".equals(paramgr.c())) {
/* 1072 */       localObject1 = new String(paramgr.d(), Charsets.UTF_8);
/*      */       
/* 1074 */       if ((this.f.E() != null) && (this.f.E().b() == bjo.a)) {
/* 1075 */         this.f.R().a((String)localObject1);
/* 1076 */       } else if ((this.f.E() == null) || (this.f.E().b() == bjo.c)) {
/* 1077 */         this.f.a(new bcw(new bjc(this, (String)localObject1), brp.a("multiplayer.texturePrompt.line1", new Object[0]), brp.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
/*      */       }
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
/*      */   public void a(ic paramic)
/*      */   {
/* 1100 */     bac localbac = this.g.W();
/*      */     azx localazx;
/* 1102 */     if (paramic.e() == 0) {
/* 1103 */       localazx = localbac.a(paramic.c(), bah.b);
/* 1104 */       localazx.a(paramic.d());
/*      */     } else {
/* 1106 */       localazx = localbac.b(paramic.c());
/*      */       
/* 1108 */       if (paramic.e() == 1) {
/* 1109 */         localbac.k(localazx);
/* 1110 */       } else if (paramic.e() == 2) {
/* 1111 */         localazx.a(paramic.d());
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(ie paramie)
/*      */   {
/* 1118 */     bac localbac = this.g.W();
/* 1119 */     azx localazx = localbac.b(paramie.d());
/*      */     
/* 1121 */     if (paramie.f() == 0) {
/* 1122 */       azz localazz = localbac.a(paramie.c(), localazx);
/*      */       
/* 1124 */       localazz.c(paramie.e());
/* 1125 */     } else if (paramie.f() == 1) {
/* 1126 */       localbac.c(paramie.c());
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hv paramhv)
/*      */   {
/* 1132 */     bac localbac = this.g.W();
/*      */     
/* 1134 */     if (paramhv.d().length() == 0) {
/* 1135 */       localbac.a(paramhv.c(), null);
/*      */     } else {
/* 1137 */       azx localazx = localbac.b(paramhv.d());
/* 1138 */       localbac.a(paramhv.c(), localazx);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(id paramid)
/*      */   {
/* 1144 */     bac localbac = this.g.W();
/*      */     
/*      */     azy localazy;
/* 1147 */     if (paramid.h() == 0) {
/* 1148 */       localazy = localbac.f(paramid.c());
/*      */     } else {
/* 1150 */       localazy = localbac.e(paramid.c());
/*      */     }
/*      */     
/* 1153 */     if ((paramid.h() == 0) || (paramid.h() == 2)) {
/* 1154 */       localazy.a(paramid.d());
/* 1155 */       localazy.b(paramid.e());
/* 1156 */       localazy.c(paramid.f());
/* 1157 */       localazy.a(paramid.i());
/*      */     }
/*      */     Iterator localIterator;
/* 1160 */     if ((paramid.h() == 0) || (paramid.h() == 3)) {
/* 1161 */       for (localIterator = paramid.g().iterator(); localIterator.hasNext();) { str = (String)localIterator.next();
/* 1162 */         localbac.a(str, paramid.c());
/*      */       }
/*      */     }
/*      */     String str;
/* 1166 */     if (paramid.h() == 4) {
/* 1167 */       for (localIterator = paramid.g().iterator(); localIterator.hasNext();) { str = (String)localIterator.next();
/* 1168 */         localbac.a(str, localazy);
/*      */       }
/*      */     }
/*      */     
/* 1172 */     if (paramid.h() == 1) {
/* 1173 */       localbac.d(localazy);
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(hb paramhb)
/*      */   {
/* 1179 */     if (paramhb.k() == 0) {
/* 1180 */       double d1 = paramhb.j() * paramhb.g();
/* 1181 */       double d3 = paramhb.j() * paramhb.h();
/* 1182 */       double d5 = paramhb.j() * paramhb.i();
/* 1183 */       this.g.a(paramhb.c(), paramhb.d(), paramhb.e(), paramhb.f(), d1, d3, d5);
/*      */     } else {
/* 1185 */       for (int m = 0; m < paramhb.k(); m++) {
/* 1186 */         double d2 = this.l.nextGaussian() * paramhb.g();
/* 1187 */         double d4 = this.l.nextGaussian() * paramhb.h();
/* 1188 */         double d6 = this.l.nextGaussian() * paramhb.i();
/* 1189 */         double d7 = this.l.nextGaussian() * paramhb.j();
/* 1190 */         double d8 = this.l.nextGaussian() * paramhb.j();
/* 1191 */         double d9 = this.l.nextGaussian() * paramhb.j();
/* 1192 */         this.g.a(paramhb.c(), paramhb.d() + d2, paramhb.e() + d4, paramhb.f() + d6, d7, d8, d9);
/*      */       }
/*      */     }
/*      */   }
/*      */   
/*      */   public void a(il paramil)
/*      */   {
/* 1199 */     sa localsa = this.g.a(paramil.c());
/* 1200 */     if (localsa == null) return;
/* 1201 */     if (!(localsa instanceof sv)) {
/* 1202 */       throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + localsa + ")");
/*      */     }
/*      */     
/* 1205 */     tl localtl = ((sv)localsa).bc();
/* 1206 */     for (im localim : paramil.d()) {
/* 1207 */       localti = localtl.a(localim.a());
/*      */       
/* 1209 */       if (localti == null) {
/* 1210 */         localti = localtl.b(new to(localim.a(), 0.0D, 2.2250738585072014E-308D, Double.MAX_VALUE));
/*      */       }
/*      */       
/* 1213 */       localti.a(localim.b());
/* 1214 */       localti.d();
/*      */       
/* 1216 */       for (tj localtj : localim.c())
/* 1217 */         localti.a(localtj);
/*      */     }
/*      */     ti localti;
/*      */   }
/*      */   
/*      */   public ej b() {
/* 1223 */     return this.e;
/*      */   }
/*      */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */