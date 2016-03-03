/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import net.minecraft.server.MinecraftServer;
/*     */ import org.apache.commons.io.Charsets;
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
/*     */ public class mw
/*     */   extends yz
/*     */   implements aac
/*     */ {
/*  47 */   private static final Logger bL = ;
/*  48 */   private String bM = "en_US";
/*     */   public nh a;
/*     */   public final MinecraftServer b;
/*     */   public final mx c;
/*     */   public double d;
/*  53 */   public double e; public final List f = new LinkedList();
/*  54 */   private final List bN = new LinkedList();
/*     */   private final pg bO;
/*  56 */   private float bP = Float.MIN_VALUE;
/*  57 */   private float bQ = -1.0E8F;
/*  58 */   private int bR = -99999999;
/*  59 */   private boolean bS = true;
/*  60 */   private int bT = -99999999;
/*  61 */   private int bU = 60;
/*     */   private zb bV;
/*  63 */   private boolean bW = true;
/*  64 */   private long bX = System.currentTimeMillis();
/*     */   private int bY;
/*     */   
/*  67 */   public mw(MinecraftServer paramMinecraftServer, mt parammt, GameProfile paramGameProfile, mx parammx) { super(parammt, paramGameProfile);
/*  68 */     parammx.b = this;
/*  69 */     this.c = parammx;
/*     */     
/*  71 */     r localr = parammt.K();
/*  72 */     int j = localr.a;
/*  73 */     int k = localr.c;
/*  74 */     int m = localr.b;
/*     */     
/*  76 */     if ((!parammt.t.g) && (parammt.N().r() != ahk.d)) {
/*  77 */       int n = Math.max(5, paramMinecraftServer.ao() - 6);
/*  78 */       j += this.Z.nextInt(n * 2) - n;
/*  79 */       k += this.Z.nextInt(n * 2) - n;
/*  80 */       m = parammt.i(j, k);
/*     */     }
/*     */     
/*  83 */     this.b = paramMinecraftServer;
/*  84 */     this.bO = paramMinecraftServer.ah().a(this);
/*  85 */     this.W = 0.0F;
/*     */     
/*  87 */     this.L = 0.0F;
/*     */     
/*  89 */     b(j + 0.5D, m, k + 0.5D, 0.0F, 0.0F);
/*  90 */     while (!parammt.a(this, this.C).isEmpty()) {
/*  91 */       b(this.s, this.t + 1.0D, this.u);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  97 */     super.a(paramdh);
/*     */     
/*  99 */     if (paramdh.b("playerGameType", 99)) {
/* 100 */       if (MinecraftServer.I().ap()) {
/* 101 */         this.c.a(MinecraftServer.I().i());
/*     */       } else {
/* 103 */         this.c.a(ahk.a(paramdh.f("playerGameType")));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 110 */     super.b(paramdh);
/*     */     
/* 112 */     paramdh.a("playerGameType", this.c.b().a());
/*     */   }
/*     */   
/*     */   public void a(int paramInt)
/*     */   {
/* 117 */     super.a(paramInt);
/* 118 */     this.bT = -1;
/*     */   }
/*     */   
/*     */   public void d_() {
/* 122 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   protected void e_()
/*     */   {
/* 127 */     this.L = 0.0F;
/*     */   }
/*     */   
/*     */   public float g()
/*     */   {
/* 132 */     return 1.62F;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 137 */     this.c.a();
/*     */     
/* 139 */     this.bU -= 1;
/* 140 */     if (this.ad > 0) this.ad -= 1;
/* 141 */     this.bo.b();
/*     */     
/* 143 */     if ((!this.o.E) && 
/* 144 */       (!this.bo.a(this))) {
/* 145 */       k();
/* 146 */       this.bo = this.bn;
/*     */     }
/*     */     Object localObject1;
/*     */     Object localObject2;
/* 150 */     while (!this.bN.isEmpty()) {
/* 151 */       int j = Math.min(this.bN.size(), 127);
/* 152 */       localObject1 = new int[j];
/* 153 */       localObject2 = this.bN.iterator();
/* 154 */       int k = 0;
/*     */       
/* 156 */       while ((((Iterator)localObject2).hasNext()) && (k < j)) {
/* 157 */         localObject1[(k++)] = ((Integer)((Iterator)localObject2).next()).intValue();
/* 158 */         ((Iterator)localObject2).remove();
/*     */       }
/*     */       
/* 161 */       this.a.a(new hq((int[])localObject1)); }
/*     */     Object localObject3;
/*     */     Object localObject4;
/* 164 */     if (!this.f.isEmpty()) {
/* 165 */       ArrayList localArrayList = new ArrayList();
/* 166 */       localObject1 = this.f.iterator();
/* 167 */       localObject2 = new ArrayList();
/*     */       
/* 169 */       while ((((Iterator)localObject1).hasNext()) && (localArrayList.size() < gz.c())) {
/* 170 */         localObject3 = (agu)((Iterator)localObject1).next();
/*     */         
/* 172 */         if (localObject3 != null) {
/* 173 */           if (this.o.d(((agu)localObject3).a << 4, 0, ((agu)localObject3).b << 4)) {
/* 174 */             localObject4 = this.o.e(((agu)localObject3).a, ((agu)localObject3).b);
/* 175 */             if (((apx)localObject4).k()) {
/* 176 */               localArrayList.add(localObject4);
/* 177 */               ((List)localObject2).addAll(((mt)this.o).a(((agu)localObject3).a * 16, 0, ((agu)localObject3).b * 16, ((agu)localObject3).a * 16 + 16, 256, ((agu)localObject3).b * 16 + 16));
/* 178 */               ((Iterator)localObject1).remove();
/*     */             }
/*     */           }
/*     */         } else {
/* 182 */           ((Iterator)localObject1).remove();
/*     */         }
/*     */       }
/*     */       
/* 186 */       if (!localArrayList.isEmpty()) {
/* 187 */         this.a.a(new gz(localArrayList));
/*     */         
/* 189 */         for (localObject3 = ((List)localObject2).iterator(); ((Iterator)localObject3).hasNext();) { localObject4 = (aor)((Iterator)localObject3).next();
/* 190 */           b((aor)localObject4);
/*     */         }
/*     */         
/* 193 */         for (localObject3 = localArrayList.iterator(); ((Iterator)localObject3).hasNext();) { localObject4 = (apx)((Iterator)localObject3).next();
/* 194 */           r().r().a(this, (apx)localObject4);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void i() {
/*     */     try {
/* 202 */       super.h();
/*     */       
/* 204 */       for (int j = 0; j < this.bm.a(); j++) {
/* 205 */         localObject1 = this.bm.a(j);
/* 206 */         if ((localObject1 != null) && 
/* 207 */           (((add)localObject1).b().h())) {
/* 208 */           localObject2 = ((abs)((add)localObject1).b()).c((add)localObject1, this.o, this);
/* 209 */           if (localObject2 != null) {
/* 210 */             this.a.a((ft)localObject2);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/*     */ 
/* 216 */       if ((aS() == this.bQ) && (this.bR == this.bp.a())) { if ((this.bp.e() == 0.0F) == this.bS) {}
/* 217 */       } else { this.a.a(new ib(aS(), this.bp.a(), this.bp.e()));
/* 218 */         this.bQ = aS();
/* 219 */         this.bR = this.bp.a();
/* 220 */         this.bS = (this.bp.e() == 0.0F);
/*     */       }
/*     */       
/*     */ 
/* 224 */       if (aS() + bs() != this.bP) {
/* 225 */         this.bP = (aS() + bs());
/*     */         
/* 227 */         Collection localCollection = bU().a(bah.f);
/* 228 */         for (localObject1 = localCollection.iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (azx)((Iterator)localObject1).next();
/* 229 */           bU().a(b_(), (azx)localObject2).a(Arrays.asList(new yz[] { this }));
/*     */         }
/*     */       }
/*     */       
/* 233 */       if (this.bG != this.bT) {
/* 234 */         this.bT = this.bG;
/* 235 */         this.a.a(new ia(this.bH, this.bG, this.bF));
/*     */       }
/*     */       
/* 238 */       if ((this.aa % 20 * 5 == 0) && (!w().a(pc.L))) {
/* 239 */         j();
/*     */       }
/*     */     } catch (Throwable localThrowable) {
/* 242 */       Object localObject1 = b.a(localThrowable, "Ticking player");
/* 243 */       Object localObject2 = ((b)localObject1).a("Player being ticked");
/*     */       
/* 245 */       a((k)localObject2);
/*     */       
/* 247 */       throw new s((b)localObject1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void j() {
/* 252 */     ahu localahu1 = this.o.a(qh.c(this.s), qh.c(this.u));
/*     */     
/* 254 */     if (localahu1 != null) {
/* 255 */       String str1 = localahu1.af;
/* 256 */       pr localpr = (pr)w().b(pc.L);
/*     */       
/* 258 */       if (localpr == null) localpr = (pr)w().a(pc.L, new pr());
/* 259 */       localpr.add(str1);
/*     */       
/* 261 */       if ((w().b(pc.L)) && (localpr.size() == ahu.n.size())) {
/* 262 */         HashSet localHashSet = Sets.newHashSet(ahu.n);
/* 263 */         for (String str2 : localpr) {
/* 264 */           Iterator localIterator2 = localHashSet.iterator();
/*     */           
/* 266 */           while (localIterator2.hasNext()) {
/* 267 */             ahu localahu2 = (ahu)localIterator2.next();
/*     */             
/* 269 */             if (localahu2.af.equals(str2)) {
/* 270 */               localIterator2.remove();
/*     */             }
/*     */           }
/*     */           
/* 274 */           if (localHashSet.isEmpty())
/*     */             break;
/*     */         }
/* 277 */         if (localHashSet.isEmpty()) {
/* 278 */           a(pc.L);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/* 286 */     this.b.ah().a(aW().b());
/* 287 */     if (!this.o.O().b("keepInventory")) {
/* 288 */       this.bm.m();
/*     */     }
/*     */     
/* 291 */     Collection localCollection = this.o.W().a(bah.c);
/*     */     
/* 293 */     for (Object localObject1 = localCollection.iterator(); ((Iterator)localObject1).hasNext();) { azx localazx = (azx)((Iterator)localObject1).next();
/* 294 */       localObject2 = bU().a(b_(), localazx);
/* 295 */       ((azz)localObject2).a();
/*     */     }
/*     */     Object localObject2;
/* 298 */     localObject1 = aX();
/* 299 */     if (localObject1 != null) {
/* 300 */       int j = sg.a((sa)localObject1);
/* 301 */       localObject2 = (sh)sg.a.get(Integer.valueOf(j));
/* 302 */       if (localObject2 != null) {
/* 303 */         a(((sh)localObject2).e, 1);
/*     */       }
/* 305 */       ((sv)localObject1).b(this, this.ba);
/*     */     }
/* 307 */     a(pp.v, 1);
/*     */     
/* 309 */     aW().g();
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 314 */     if (aw()) { return false;
/*     */     }
/* 316 */     int j = (this.b.X()) && (this.b.ab()) && ("fall".equals(paramro.o)) ? 1 : 0;
/* 317 */     if ((j == 0) && (this.bU > 0) && (paramro != ro.i)) { return false;
/*     */     }
/* 319 */     if ((paramro instanceof rp)) {
/* 320 */       sa localsa = paramro.j();
/*     */       
/* 322 */       if (((localsa instanceof yz)) && (!a((yz)localsa))) return false;
/* 323 */       if ((localsa instanceof zc)) {
/* 324 */         zc localzc = (zc)localsa;
/* 325 */         if (((localzc.c instanceof yz)) && (!a((yz)localzc.c))) {
/* 326 */           return false;
/*     */         }
/*     */       }
/*     */     }
/* 330 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 335 */     if (!this.b.ab()) return false;
/* 336 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public void b(int paramInt)
/*     */   {
/* 341 */     if ((this.ap == 1) && (paramInt == 1)) {
/* 342 */       a(pc.D);
/* 343 */       this.o.e(this);
/* 344 */       this.i = true;
/* 345 */       this.a.a(new gv(4, 0.0F));
/*     */     } else {
/* 347 */       if ((this.ap == 0) && (paramInt == 1)) {
/* 348 */         a(pc.C);
/* 349 */         r localr = this.b.a(paramInt).l();
/* 350 */         if (localr != null) {
/* 351 */           this.a.a(localr.a, localr.b, localr.c, 0.0F, 0.0F);
/*     */         }
/*     */         
/* 354 */         paramInt = 1;
/*     */       } else {
/* 356 */         a(pc.y);
/*     */       }
/*     */       
/* 359 */       this.b.ah().a(this, paramInt);
/* 360 */       this.bT = -1;
/* 361 */       this.bQ = -1.0F;
/* 362 */       this.bR = -1;
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(aor paramaor) {
/* 367 */     if (paramaor != null) {
/* 368 */       ft localft = paramaor.m();
/* 369 */       if (localft != null) {
/* 370 */         this.a.a(localft);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, int paramInt)
/*     */   {
/* 377 */     super.a(paramsa, paramInt);
/* 378 */     this.bo.b();
/*     */   }
/*     */   
/*     */   public za a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 383 */     za localza = super.a(paramInt1, paramInt2, paramInt3);
/* 384 */     if (localza == za.a) {
/* 385 */       hp localhp = new hp(this, paramInt1, paramInt2, paramInt3);
/* 386 */       r().r().a(this, localhp);
/* 387 */       this.a.a(this.s, this.t, this.u, this.y, this.z);
/* 388 */       this.a.a(localhp);
/*     */     }
/* 390 */     return localza;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
/*     */   {
/* 395 */     if (bm()) {
/* 396 */       r().r().b(this, new gc(this, 2));
/*     */     }
/* 398 */     super.a(paramBoolean1, paramBoolean2, paramBoolean3);
/* 399 */     if (this.a != null) this.a.a(this.s, this.t, this.u, this.y, this.z);
/*     */   }
/*     */   
/*     */   public void a(sa paramsa)
/*     */   {
/* 404 */     super.a(paramsa);
/* 405 */     this.a.a(new hx(0, this, this.m));
/* 406 */     this.a.a(this.s, this.t, this.u, this.y, this.z);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void a(double paramDouble, boolean paramBoolean) {}
/*     */   
/*     */   public void b(double paramDouble, boolean paramBoolean)
/*     */   {
/* 414 */     super.a(paramDouble, paramBoolean);
/*     */   }
/*     */   
/*     */   public void a(aor paramaor)
/*     */   {
/* 419 */     if ((paramaor instanceof apm)) {
/* 420 */       ((apm)paramaor).a(this);
/* 421 */       this.a.a(new hj(paramaor.c, paramaor.d, paramaor.e));
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean g;
/*     */   public int h;
/*     */   public boolean i;
/*     */   private void bV()
/*     */   {
/* 431 */     this.bY = (this.bY % 100 + 1);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 436 */     bV();
/* 437 */     this.a.a(new gn(this.bY, 1, "Crafting", 9, true));
/* 438 */     this.bo = new aaf(this.bm, this.o, paramInt1, paramInt2, paramInt3);
/* 439 */     this.bo.d = this.bY;
/* 440 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, String paramString)
/*     */   {
/* 445 */     bV();
/* 446 */     this.a.a(new gn(this.bY, 4, paramString == null ? "" : paramString, 9, paramString != null));
/* 447 */     this.bo = new aag(this.bm, this.o, paramInt1, paramInt2, paramInt3);
/* 448 */     this.bo.d = this.bY;
/* 449 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void c(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 454 */     bV();
/* 455 */     this.a.a(new gn(this.bY, 8, "Repairing", 9, true));
/* 456 */     this.bo = new zu(this.bm, this.o, paramInt1, paramInt2, paramInt3, this);
/* 457 */     this.bo.d = this.bY;
/* 458 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(rb paramrb)
/*     */   {
/* 463 */     if (this.bo != this.bn) {
/* 464 */       k();
/*     */     }
/* 466 */     bV();
/* 467 */     this.a.a(new gn(this.bY, 0, paramrb.b(), paramrb.a(), paramrb.k_()));
/* 468 */     this.bo = new aad(this.bm, paramrb);
/* 469 */     this.bo.d = this.bY;
/* 470 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(api paramapi)
/*     */   {
/* 475 */     bV();
/* 476 */     this.a.a(new gn(this.bY, 9, paramapi.b(), paramapi.a(), paramapi.k_()));
/* 477 */     this.bo = new aal(this.bm, paramapi);
/* 478 */     this.bo.d = this.bY;
/* 479 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(xr paramxr)
/*     */   {
/* 484 */     bV();
/* 485 */     this.a.a(new gn(this.bY, 9, paramxr.b(), paramxr.a(), paramxr.k_()));
/* 486 */     this.bo = new aal(this.bm, paramxr);
/* 487 */     this.bo.d = this.bY;
/* 488 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(apg paramapg)
/*     */   {
/* 493 */     bV();
/* 494 */     this.a.a(new gn(this.bY, 2, paramapg.b(), paramapg.a(), paramapg.k_()));
/* 495 */     this.bo = new aaj(this.bm, paramapg);
/* 496 */     this.bo.d = this.bY;
/* 497 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(apb paramapb)
/*     */   {
/* 502 */     bV();
/* 503 */     this.a.a(new gn(this.bY, (paramapb instanceof apc) ? 10 : 3, paramapb.b(), paramapb.a(), paramapb.k_()));
/*     */     
/* 505 */     this.bo = new aaz(this.bm, paramapb);
/* 506 */     this.bo.d = this.bY;
/* 507 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(aov paramaov)
/*     */   {
/* 512 */     bV();
/* 513 */     this.a.a(new gn(this.bY, 5, paramaov.b(), paramaov.a(), paramaov.k_()));
/*     */     
/* 515 */     this.bo = new zz(this.bm, paramaov);
/* 516 */     this.bo.d = this.bY;
/* 517 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(aoq paramaoq)
/*     */   {
/* 522 */     bV();
/* 523 */     this.a.a(new gn(this.bY, 7, paramaoq.b(), paramaoq.a(), paramaoq.k_()));
/* 524 */     this.bo = new zx(this.bm, paramaoq);
/* 525 */     this.bo.d = this.bY;
/* 526 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(agm paramagm, String paramString)
/*     */   {
/* 531 */     bV();
/* 532 */     this.bo = new aat(this.bm, paramagm, this.o);
/* 533 */     this.bo.d = this.bY;
/* 534 */     this.bo.a(this);
/* 535 */     aas localaas = ((aat)this.bo).e();
/*     */     
/* 537 */     this.a.a(new gn(this.bY, 6, paramString == null ? "" : paramString, localaas.a(), paramString != null));
/*     */     
/* 539 */     ago localago = paramagm.b(this);
/* 540 */     if (localago != null) {
/* 541 */       et localet = new et(Unpooled.buffer());
/*     */       
/*     */       try
/*     */       {
/* 545 */         localet.writeInt(this.bY);
/* 546 */         localago.a(localet);
/*     */         
/* 548 */         this.a.a(new gr("MC|TrList", localet));
/*     */       } catch (IOException localIOException) {
/* 550 */         bL.error("Couldn't send trade list", localIOException);
/*     */       } finally {
/* 552 */         localet.release();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(wi paramwi, rb paramrb)
/*     */   {
/* 559 */     if (this.bo != this.bn) {
/* 560 */       k();
/*     */     }
/* 562 */     bV();
/* 563 */     this.a.a(new gn(this.bY, 11, paramrb.b(), paramrb.a(), paramrb.k_(), paramwi.y()));
/*     */     
/* 565 */     this.bo = new aam(this.bm, paramrb, paramwi);
/* 566 */     this.bo.d = this.bY;
/* 567 */     this.bo.a(this);
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, int paramInt, add paramadd)
/*     */   {
/* 572 */     if ((paramzs.a(paramInt) instanceof aax)) {
/* 573 */       return;
/*     */     }
/*     */     
/* 576 */     if (this.g)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 581 */       return;
/*     */     }
/*     */     
/* 584 */     this.a.a(new gq(paramzs.d, paramInt, paramadd));
/*     */   }
/*     */   
/*     */   public void a(zs paramzs) {
/* 588 */     a(paramzs, paramzs.a());
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, List paramList)
/*     */   {
/* 593 */     this.a.a(new go(paramzs.d, paramList));
/* 594 */     this.a.a(new gq(-1, -1, this.bm.o()));
/*     */   }
/*     */   
/*     */   public void a(zs paramzs, int paramInt1, int paramInt2)
/*     */   {
/* 599 */     this.a.a(new gp(paramzs.d, paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public void k()
/*     */   {
/* 604 */     this.a.a(new gm(this.bo.d));
/* 605 */     m();
/*     */   }
/*     */   
/*     */   public void l() {
/* 609 */     if (this.g)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/* 614 */       return;
/*     */     }
/* 616 */     this.a.a(new gq(-1, -1, this.bm.o()));
/*     */   }
/*     */   
/*     */   public void m() {
/* 620 */     this.bo.b(this);
/* 621 */     this.bo = this.bn;
/*     */   }
/*     */   
/*     */   public void a(float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2) {
/* 625 */     if (this.m != null) {
/* 626 */       if ((paramFloat1 >= -1.0F) && (paramFloat1 <= 1.0F)) this.bd = paramFloat1;
/* 627 */       if ((paramFloat2 >= -1.0F) && (paramFloat2 <= 1.0F)) this.be = paramFloat2;
/* 628 */       this.bc = paramBoolean1;
/* 629 */       b(paramBoolean2);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ph paramph, int paramInt)
/*     */   {
/* 635 */     if (paramph == null) {
/* 636 */       return;
/*     */     }
/*     */     
/* 639 */     this.bO.b(this, paramph, paramInt);
/*     */     
/* 641 */     for (azx localazx : bU().a(paramph.k())) {
/* 642 */       bU().a(b_(), localazx).a();
/*     */     }
/*     */     
/* 645 */     if (this.bO.e()) {
/* 646 */       this.bO.a(this);
/*     */     }
/*     */   }
/*     */   
/*     */   public void n() {
/* 651 */     if (this.l != null) this.l.a(this);
/* 652 */     if (this.bA) {
/* 653 */       a(true, false, false);
/*     */     }
/*     */   }
/*     */   
/*     */   public void o() {
/* 658 */     this.bQ = -1.0E8F;
/*     */   }
/*     */   
/*     */   public void b(fj paramfj)
/*     */   {
/* 663 */     this.a.a(new gj(paramfj));
/*     */   }
/*     */   
/*     */   protected void p()
/*     */   {
/* 668 */     this.a.a(new gt(this, (byte)9));
/* 669 */     super.p();
/*     */   }
/*     */   
/*     */   public void a(add paramadd, int paramInt)
/*     */   {
/* 674 */     super.a(paramadd, paramInt);
/*     */     
/* 676 */     if ((paramadd != null) && (paramadd.b() != null) && (paramadd.b().d(paramadd) == aei.b)) {
/* 677 */       r().r().b(this, new gc(this, 3));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, boolean paramBoolean)
/*     */   {
/* 683 */     super.a(paramyz, paramBoolean);
/* 684 */     this.bT = -1;
/* 685 */     this.bQ = -1.0F;
/* 686 */     this.bR = -1;
/* 687 */     this.bN.addAll(((mw)paramyz).bN);
/*     */   }
/*     */   
/*     */   protected void a(rw paramrw)
/*     */   {
/* 692 */     super.a(paramrw);
/* 693 */     this.a.a(new in(y(), paramrw));
/*     */   }
/*     */   
/*     */   protected void a(rw paramrw, boolean paramBoolean)
/*     */   {
/* 698 */     super.a(paramrw, paramBoolean);
/* 699 */     this.a.a(new in(y(), paramrw));
/*     */   }
/*     */   
/*     */   protected void b(rw paramrw)
/*     */   {
/* 704 */     super.b(paramrw);
/* 705 */     this.a.a(new hr(y(), paramrw));
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/* 710 */     this.a.a(paramDouble1, paramDouble2, paramDouble3, this.y, this.z);
/*     */   }
/*     */   
/*     */   public void b(sa paramsa)
/*     */   {
/* 715 */     r().r().b(this, new gc(paramsa, 4));
/*     */   }
/*     */   
/*     */   public void c(sa paramsa)
/*     */   {
/* 720 */     r().r().b(this, new gc(paramsa, 5));
/*     */   }
/*     */   
/*     */   public void q()
/*     */   {
/* 725 */     if (this.a == null) return;
/* 726 */     this.a.a(new hk(this.bE));
/*     */   }
/*     */   
/*     */   public mt r() {
/* 730 */     return (mt)this.o;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk)
/*     */   {
/* 735 */     this.c.a(paramahk);
/* 736 */     this.a.a(new gv(3, paramahk.a()));
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 741 */     this.a.a(new gj(paramfj));
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, String paramString)
/*     */   {
/* 746 */     if (("seed".equals(paramString)) && (!this.b.X())) {
/* 747 */       return true;
/*     */     }
/* 749 */     if (("tell".equals(paramString)) || ("help".equals(paramString)) || ("me".equals(paramString))) return true;
/* 750 */     if (this.b.ah().g(bJ())) {
/* 751 */       ok localok = (ok)this.b.ah().m().b(bJ());
/* 752 */       if (localok != null) {
/* 753 */         return localok.a() >= paramInt;
/*     */       }
/* 755 */       return this.b.l() >= paramInt;
/*     */     }
/* 757 */     return false;
/*     */   }
/*     */   
/*     */   public String s()
/*     */   {
/* 762 */     String str = this.a.a.b().toString();
/* 763 */     str = str.substring(str.indexOf("/") + 1);
/* 764 */     str = str.substring(0, str.indexOf(":"));
/* 765 */     return str;
/*     */   }
/*     */   
/*     */   public void a(iu paramiu) {
/* 769 */     this.bM = paramiu.c();
/*     */     
/* 771 */     int j = 256 >> paramiu.d();
/* 772 */     if ((j > 3) && (j < 20)) {}
/*     */     
/*     */ 
/* 775 */     this.bV = paramiu.e();
/* 776 */     this.bW = paramiu.f();
/*     */     
/* 778 */     if ((this.b.N()) && (this.b.M().equals(b_()))) {
/* 779 */       this.b.a(paramiu.g());
/*     */     }
/*     */     
/* 782 */     b(1, !paramiu.h());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public zb u()
/*     */   {
/* 790 */     return this.bV;
/*     */   }
/*     */   
/*     */   public void a(String paramString) {
/* 794 */     this.a.a(new gr("MC|RPack", paramString.getBytes(Charsets.UTF_8)));
/*     */   }
/*     */   
/*     */   public r f_()
/*     */   {
/* 799 */     return new r(qh.c(this.s), qh.c(this.t + 0.5D), qh.c(this.u));
/*     */   }
/*     */   
/*     */   public void v() {
/* 803 */     this.bX = MinecraftServer.ar();
/*     */   }
/*     */   
/*     */   public pg w() {
/* 807 */     return this.bO;
/*     */   }
/*     */   
/*     */   public void d(sa paramsa) {
/* 811 */     if ((paramsa instanceof yz)) {
/* 812 */       this.a.a(new hq(new int[] { paramsa.y() }));
/*     */     } else {
/* 814 */       this.bN.add(Integer.valueOf(paramsa.y()));
/*     */     }
/*     */   }
/*     */   
/*     */   public long x() {
/* 819 */     return this.bX;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\mw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */