/*     */ import com.google.common.base.Charsets;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.io.File;
/*     */ import java.net.SocketAddress;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public abstract class oi
/*     */ {
/*  41 */   public static final File a = new File("banned-players.json");
/*  42 */   public static final File b = new File("banned-ips.json");
/*  43 */   public static final File c = new File("ops.json");
/*  44 */   public static final File d = new File("whitelist.json");
/*  45 */   private static final Logger g = LogManager.getLogger();
/*     */   
/*  47 */   private static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
/*     */   
/*     */   private final MinecraftServer i;
/*  50 */   public final List e = new ArrayList();
/*  51 */   private final op j = new op(a);
/*  52 */   private final nx k = new nx(b);
/*  53 */   private final oj l = new oj(c);
/*  54 */   private final or m = new or(d);
/*  55 */   private final Map n = Maps.newHashMap();
/*     */   private azp o;
/*     */   private boolean p;
/*     */   protected int f;
/*     */   private int q;
/*     */   private ahk r;
/*     */   private boolean s;
/*     */   private int t;
/*     */   
/*     */   public oi(MinecraftServer paramMinecraftServer) {
/*  65 */     this.i = paramMinecraftServer;
/*     */     
/*  67 */     this.j.a(false);
/*  68 */     this.k.a(false);
/*     */     
/*  70 */     this.f = 8;
/*     */   }
/*     */   
/*     */   public void a(ej paramej, mw parammw) {
/*  74 */     GameProfile localGameProfile1 = parammw.bJ();
/*     */     
/*  76 */     ns localns = this.i.ax();
/*  77 */     GameProfile localGameProfile2 = localns.a(localGameProfile1.getId());
/*  78 */     String str1 = localGameProfile2 == null ? localGameProfile1.getName() : localGameProfile2.getName();
/*  79 */     localns.a(localGameProfile1);
/*     */     
/*  81 */     dh localdh = a(parammw);
/*  82 */     parammw.a(this.i.a(parammw.ap));
/*  83 */     parammw.c.a((mt)parammw.o);
/*     */     
/*  85 */     String str2 = "local";
/*     */     
/*  87 */     if (paramej.b() != null) {
/*  88 */       str2 = paramej.b().toString();
/*     */     }
/*     */     
/*  91 */     g.info(parammw.b_() + "[" + str2 + "] logged in with entity id " + parammw.y() + " at (" + parammw.s + ", " + parammw.t + ", " + parammw.u + ")");
/*     */     
/*  93 */     mt localmt = this.i.a(parammw.ap);
/*     */     
/*  95 */     r localr = localmt.K();
/*     */     
/*  97 */     a(parammw, null, localmt);
/*     */     
/*  99 */     nh localnh = new nh(this.i, paramej, parammw);
/* 100 */     localnh.a(new hd(parammw.y(), parammw.c.b(), localmt.N().t(), localmt.t.i, localmt.r, p(), localmt.N().u()));
/* 101 */     localnh.a(new gr("MC|Brand", c().getServerModName().getBytes(Charsets.UTF_8)));
/* 102 */     localnh.a(new ig(localr.a, localr.b, localr.c));
/* 103 */     localnh.a(new hk(parammw.bE));
/* 104 */     localnh.a(new hu(parammw.bm.c));
/*     */     
/* 106 */     parammw.w().d();
/* 107 */     parammw.w().b(parammw);
/*     */     
/* 109 */     a((lp)localmt.W(), parammw);
/*     */     
/* 111 */     this.i.az();
/*     */     fr localfr;
/* 113 */     if (!parammw.b_().equalsIgnoreCase(str1)) {
/* 114 */       localfr = new fr("multiplayer.player.joined.renamed", new Object[] { parammw.c_(), str1 });
/*     */     } else {
/* 116 */       localfr = new fr("multiplayer.player.joined", new Object[] { parammw.c_() });
/*     */     }
/* 118 */     localfr.b().a(a.o);
/* 119 */     a(localfr);
/* 120 */     c(parammw);
/*     */     
/* 122 */     localnh.a(parammw.s, parammw.t, parammw.u, parammw.y, parammw.z);
/* 123 */     b(parammw, localmt);
/*     */     
/* 125 */     if (this.i.V().length() > 0) { parammw.a(this.i.V());
/*     */     }
/* 127 */     for (Object localObject = parammw.aQ().iterator(); ((Iterator)localObject).hasNext();) { rw localrw = (rw)((Iterator)localObject).next();
/* 128 */       localnh.a(new in(parammw.y(), localrw));
/*     */     }
/*     */     
/* 131 */     parammw.d_();
/*     */     
/* 133 */     if ((localdh != null) && (localdh.b("Riding", 10)))
/*     */     {
/* 135 */       localObject = sg.a(localdh.m("Riding"), localmt);
/* 136 */       if (localObject != null) {
/* 137 */         ((sa)localObject).n = true;
/* 138 */         localmt.d((sa)localObject);
/* 139 */         parammw.a((sa)localObject);
/* 140 */         ((sa)localObject).n = false;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(lp paramlp, mw parammw) {
/* 146 */     HashSet localHashSet = new HashSet();
/*     */     
/* 148 */     for (Iterator localIterator1 = paramlp.g().iterator(); localIterator1.hasNext();) { localObject = (azy)localIterator1.next();
/* 149 */       parammw.a.a(new id((azy)localObject, 0));
/*     */     }
/*     */     Object localObject;
/* 152 */     for (int i1 = 0; i1 < 3; i1++) {
/* 153 */       localObject = paramlp.a(i1);
/*     */       
/* 155 */       if ((localObject != null) && (!localHashSet.contains(localObject))) {
/* 156 */         List localList = paramlp.d((azx)localObject);
/*     */         
/* 158 */         for (ft localft : localList) {
/* 159 */           parammw.a.a(localft);
/*     */         }
/*     */         
/* 162 */         localHashSet.add(localObject);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(mt[] paramArrayOfmt) {
/* 168 */     this.o = paramArrayOfmt[0].M().e();
/*     */   }
/*     */   
/*     */   public void a(mw parammw, mt parammt) {
/* 172 */     mt localmt = parammw.r();
/*     */     
/* 174 */     if (parammt != null) parammt.t().c(parammw);
/* 175 */     localmt.t().a(parammw);
/*     */     
/* 177 */     localmt.b.c((int)parammw.s >> 4, (int)parammw.u >> 4);
/*     */   }
/*     */   
/*     */   public int d() {
/* 181 */     return mq.b(s());
/*     */   }
/*     */   
/*     */   public dh a(mw parammw) {
/* 185 */     dh localdh1 = this.i.c[0].N().i();
/*     */     
/*     */     dh localdh2;
/* 188 */     if ((parammw.b_().equals(this.i.M())) && (localdh1 != null)) {
/* 189 */       parammw.f(localdh1);
/* 190 */       localdh2 = localdh1;
/* 191 */       g.debug("loading single player");
/*     */     } else {
/* 193 */       localdh2 = this.o.b(parammw);
/*     */     }
/* 195 */     return localdh2;
/*     */   }
/*     */   
/*     */   protected void b(mw parammw) {
/* 199 */     this.o.a(parammw);
/* 200 */     pg localpg = (pg)this.n.get(parammw.aB());
/* 201 */     if (localpg != null) {
/* 202 */       localpg.b();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void c(mw parammw)
/*     */   {
/* 212 */     a(new ho(parammw.b_(), true, 1000));
/*     */     
/* 214 */     this.e.add(parammw);
/*     */     
/*     */ 
/* 217 */     mt localmt = this.i.a(parammw.ap);
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 225 */     localmt.d(parammw);
/* 226 */     a(parammw, null);
/*     */     
/* 228 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 229 */       mw localmw = (mw)this.e.get(i1);
/* 230 */       parammw.a.a(new ho(localmw.b_(), true, localmw.h));
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(mw parammw) {
/* 235 */     parammw.r().t().d(parammw);
/*     */   }
/*     */   
/*     */   public void e(mw parammw) {
/* 239 */     parammw.a(pp.f);
/* 240 */     b(parammw);
/* 241 */     mt localmt = parammw.r();
/* 242 */     if (parammw.m != null)
/*     */     {
/*     */ 
/*     */ 
/* 246 */       localmt.f(parammw.m);
/* 247 */       g.debug("removing player mount");
/*     */     }
/* 249 */     localmt.e(parammw);
/* 250 */     localmt.t().c(parammw);
/* 251 */     this.e.remove(parammw);
/* 252 */     this.n.remove(parammw.aB());
/* 253 */     a(new ho(parammw.b_(), false, 9999)); }
/*     */   
/*     */   public String a(SocketAddress paramSocketAddress, GameProfile paramGameProfile) { Object localObject;
/*     */     String str;
/* 257 */     if (this.j.a(paramGameProfile)) {
/* 258 */       localObject = (oq)this.j.b(paramGameProfile);
/* 259 */       str = "You are banned from this server!\nReason: " + ((oq)localObject).d();
/*     */       
/* 261 */       if (((oq)localObject).c() != null) {
/* 262 */         str = str + "\nYour ban will be removed on " + h.format(((oq)localObject).c());
/*     */       }
/*     */       
/* 265 */       return str;
/*     */     }
/*     */     
/* 268 */     if (!e(paramGameProfile)) {
/* 269 */       return "You are not white-listed on this server!";
/*     */     }
/*     */     
/* 272 */     if (this.k.a(paramSocketAddress)) {
/* 273 */       localObject = this.k.b(paramSocketAddress);
/* 274 */       str = "Your IP address is banned from this server!\nReason: " + ((ny)localObject).d();
/*     */       
/* 276 */       if (((ny)localObject).c() != null) {
/* 277 */         str = str + "\nYour ban will be removed on " + h.format(((ny)localObject).c());
/*     */       }
/*     */       
/* 280 */       return str;
/*     */     }
/*     */     
/* 283 */     if (this.e.size() >= this.f) {
/* 284 */       return "The server is full!";
/*     */     }
/*     */     
/* 287 */     return null;
/*     */   }
/*     */   
/*     */   public mw f(GameProfile paramGameProfile)
/*     */   {
/* 292 */     UUID localUUID = yz.a(paramGameProfile);
/* 293 */     ArrayList localArrayList = Lists.newArrayList();
/* 294 */     mw localmw; for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 295 */       localmw = (mw)this.e.get(i1);
/* 296 */       if (localmw.aB().equals(localUUID)) {
/* 297 */         localArrayList.add(localmw);
/*     */       }
/*     */     }
/* 300 */     for (Object localObject = localArrayList.iterator(); ((Iterator)localObject).hasNext();) { localmw = (mw)((Iterator)localObject).next();
/* 301 */       localmw.a.c("You logged in from another location");
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 306 */     if (this.i.R()) {
/* 307 */       localObject = new ml(this.i.a(0));
/*     */     } else {
/* 309 */       localObject = new mx(this.i.a(0));
/*     */     }
/*     */     
/* 312 */     return new mw(this.i, this.i.a(0), paramGameProfile, (mx)localObject);
/*     */   }
/*     */   
/*     */   public mw a(mw parammw, int paramInt, boolean paramBoolean) {
/* 316 */     parammw.r().r().a(parammw);
/* 317 */     parammw.r().r().b(parammw);
/* 318 */     parammw.r().t().c(parammw);
/* 319 */     this.e.remove(parammw);
/* 320 */     this.i.a(parammw.ap).f(parammw);
/*     */     
/* 322 */     r localr1 = parammw.bN();
/* 323 */     boolean bool = parammw.bO();
/*     */     
/* 325 */     parammw.ap = paramInt;
/*     */     
/*     */     Object localObject;
/*     */     
/* 329 */     if (this.i.R()) {
/* 330 */       localObject = new ml(this.i.a(parammw.ap));
/*     */     } else {
/* 332 */       localObject = new mx(this.i.a(parammw.ap));
/*     */     }
/*     */     
/* 335 */     mw localmw = new mw(this.i, this.i.a(parammw.ap), parammw.bJ(), (mx)localObject);
/* 336 */     localmw.a = parammw.a;
/* 337 */     localmw.a(parammw, paramBoolean);
/* 338 */     localmw.d(parammw.y());
/*     */     
/* 340 */     mt localmt = this.i.a(parammw.ap);
/* 341 */     a(localmw, parammw, localmt);
/*     */     
/* 343 */     if (localr1 != null) {
/* 344 */       localr2 = yz.a(this.i.a(parammw.ap), localr1, bool);
/* 345 */       if (localr2 != null) {
/* 346 */         localmw.b(localr2.a + 0.5F, localr2.b + 0.1F, localr2.c + 0.5F, 0.0F, 0.0F);
/* 347 */         localmw.a(localr1, bool);
/*     */       } else {
/* 349 */         localmw.a.a(new gv(0, 0.0F));
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 354 */     localmt.b.c((int)localmw.s >> 4, (int)localmw.u >> 4);
/*     */     
/* 356 */     while (!localmt.a(localmw, localmw.C).isEmpty()) {
/* 357 */       localmw.b(localmw.s, localmw.t + 1.0D, localmw.u);
/*     */     }
/*     */     
/* 360 */     localmw.a.a(new hs(localmw.ap, localmw.o.r, localmw.o.N().u(), localmw.c.b()));
/* 361 */     r localr2 = localmt.K();
/* 362 */     localmw.a.a(localmw.s, localmw.t, localmw.u, localmw.y, localmw.z);
/* 363 */     localmw.a.a(new ig(localr2.a, localr2.b, localr2.c));
/* 364 */     localmw.a.a(new ia(localmw.bH, localmw.bG, localmw.bF));
/* 365 */     b(localmw, localmt);
/*     */     
/* 367 */     localmt.t().a(localmw);
/* 368 */     localmt.d(localmw);
/* 369 */     this.e.add(localmw);
/*     */     
/* 371 */     localmw.d_();
/* 372 */     localmw.g(localmw.aS());
/* 373 */     return localmw;
/*     */   }
/*     */   
/*     */   public void a(mw parammw, int paramInt) {
/* 377 */     int i1 = parammw.ap;
/* 378 */     mt localmt1 = this.i.a(parammw.ap);
/* 379 */     parammw.ap = paramInt;
/*     */     
/* 381 */     mt localmt2 = this.i.a(parammw.ap);
/*     */     
/* 383 */     parammw.a.a(new hs(parammw.ap, parammw.o.r, parammw.o.N().u(), parammw.c.b()));
/*     */     
/* 385 */     localmt1.f(parammw);
/* 386 */     parammw.K = false;
/*     */     
/* 388 */     a(parammw, i1, localmt1, localmt2);
/* 389 */     a(parammw, localmt1);
/*     */     
/* 391 */     parammw.a.a(parammw.s, parammw.t, parammw.u, parammw.y, parammw.z);
/* 392 */     parammw.c.a(localmt2);
/* 393 */     b(parammw, localmt2);
/* 394 */     f(parammw);
/*     */     
/* 396 */     for (rw localrw : parammw.aQ()) {
/* 397 */       parammw.a.a(new in(parammw.y(), localrw));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sa paramsa, int paramInt, mt parammt1, mt parammt2) {
/* 402 */     double d1 = paramsa.s;
/* 403 */     double d2 = paramsa.u;
/* 404 */     double d3 = 8.0D;
/* 405 */     double d4 = paramsa.s;
/* 406 */     double d5 = paramsa.t;
/* 407 */     double d6 = paramsa.u;
/* 408 */     float f1 = paramsa.y;
/*     */     
/* 410 */     parammt1.C.a("moving");
/* 411 */     if (paramsa.ap == -1)
/*     */     {
/* 413 */       d1 /= d3;
/* 414 */       d2 /= d3;
/* 415 */       paramsa.b(d1, paramsa.t, d2, paramsa.y, paramsa.z);
/* 416 */       if (paramsa.Z()) {
/* 417 */         parammt1.a(paramsa, false);
/*     */       }
/* 419 */     } else if (paramsa.ap == 0)
/*     */     {
/* 421 */       d1 *= d3;
/* 422 */       d2 *= d3;
/* 423 */       paramsa.b(d1, paramsa.t, d2, paramsa.y, paramsa.z);
/* 424 */       if (paramsa.Z()) {
/* 425 */         parammt1.a(paramsa, false);
/*     */       }
/*     */     }
/*     */     else {
/*     */       r localr;
/* 430 */       if (paramInt == 1)
/*     */       {
/* 432 */         localr = parammt2.K();
/*     */       }
/*     */       else {
/* 435 */         localr = parammt2.l();
/*     */       }
/*     */       
/* 438 */       d1 = localr.a;
/* 439 */       paramsa.t = localr.b;
/* 440 */       d2 = localr.c;
/*     */       
/* 442 */       paramsa.b(d1, paramsa.t, d2, 90.0F, 0.0F);
/* 443 */       if (paramsa.Z()) {
/* 444 */         parammt1.a(paramsa, false);
/*     */       }
/*     */     }
/* 447 */     parammt1.C.b();
/*     */     
/* 449 */     if (paramInt != 1) {
/* 450 */       parammt1.C.a("placing");
/*     */       
/* 452 */       d1 = qh.a((int)d1, -29999872, 29999872);
/* 453 */       d2 = qh.a((int)d2, -29999872, 29999872);
/* 454 */       if (paramsa.Z()) {
/* 455 */         paramsa.b(d1, paramsa.t, d2, paramsa.y, paramsa.z);
/* 456 */         parammt2.u().a(paramsa, d4, d5, d6, f1);
/* 457 */         parammt2.d(paramsa);
/* 458 */         parammt2.a(paramsa, false);
/*     */       }
/* 460 */       parammt1.C.b();
/*     */     }
/*     */     
/* 463 */     paramsa.a(parammt2);
/*     */   }
/*     */   
/*     */ 
/*     */   public void e()
/*     */   {
/* 469 */     if (++this.t > 600) {
/* 470 */       this.t = 0;
/*     */     }
/* 472 */     if (this.t < this.e.size()) {
/* 473 */       mw localmw = (mw)this.e.get(this.t);
/* 474 */       a(new ho(localmw.b_(), true, localmw.h));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ft paramft) {
/* 479 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 480 */       ((mw)this.e.get(i1)).a.a(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ft paramft, int paramInt) {
/* 485 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 486 */       mw localmw = (mw)this.e.get(i1);
/* 487 */       if (localmw.ap == paramInt) localmw.a.a(paramft);
/*     */     }
/*     */   }
/*     */   
/*     */   public String b(boolean paramBoolean) {
/* 492 */     String str = "";
/*     */     
/* 494 */     ArrayList localArrayList = Lists.newArrayList(this.e);
/* 495 */     for (int i1 = 0; i1 < localArrayList.size(); i1++) {
/* 496 */       if (i1 > 0) str = str + ", ";
/* 497 */       str = str + ((mw)localArrayList.get(i1)).b_();
/* 498 */       if (paramBoolean) {
/* 499 */         str = str + " (" + ((mw)localArrayList.get(i1)).aB().toString() + ")";
/*     */       }
/*     */     }
/* 502 */     return str;
/*     */   }
/*     */   
/*     */   public String[] f() {
/* 506 */     String[] arrayOfString = new String[this.e.size()];
/* 507 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 508 */       arrayOfString[i1] = ((mw)this.e.get(i1)).b_();
/*     */     }
/* 510 */     return arrayOfString;
/*     */   }
/*     */   
/*     */   public GameProfile[] g() {
/* 514 */     GameProfile[] arrayOfGameProfile = new GameProfile[this.e.size()];
/* 515 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 516 */       arrayOfGameProfile[i1] = ((mw)this.e.get(i1)).bJ();
/*     */     }
/* 518 */     return arrayOfGameProfile;
/*     */   }
/*     */   
/*     */   public op h() {
/* 522 */     return this.j;
/*     */   }
/*     */   
/*     */   public nx i() {
/* 526 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(GameProfile paramGameProfile) {
/* 530 */     this.l.a(new ok(paramGameProfile, this.i.l()));
/*     */   }
/*     */   
/*     */   public void b(GameProfile paramGameProfile) {
/* 534 */     this.l.c(paramGameProfile);
/*     */   }
/*     */   
/*     */   public boolean e(GameProfile paramGameProfile) {
/* 538 */     return (!this.p) || (this.l.d(paramGameProfile)) || (this.m.d(paramGameProfile));
/*     */   }
/*     */   
/*     */   public boolean g(GameProfile paramGameProfile) {
/* 542 */     return (this.l.d(paramGameProfile)) || ((this.i.N()) && (this.i.c[0].N().v()) && (this.i.M().equalsIgnoreCase(paramGameProfile.getName()))) || (this.s);
/*     */   }
/*     */   
/*     */   public mw a(String paramString)
/*     */   {
/* 547 */     for (mw localmw : this.e) {
/* 548 */       if (localmw.b_().equalsIgnoreCase(paramString)) {
/* 549 */         return localmw;
/*     */       }
/*     */     }
/* 552 */     return null;
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
/*     */   public List a(r paramr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Map paramMap, String paramString1, String paramString2, ahb paramahb)
/*     */   {
/* 577 */     if (this.e.isEmpty()) { return Collections.emptyList();
/*     */     }
/* 579 */     Object localObject = new ArrayList();
/* 580 */     int i1 = paramInt3 < 0 ? 1 : 0;
/* 581 */     int i2 = (paramString1 != null) && (paramString1.startsWith("!")) ? 1 : 0;
/* 582 */     int i3 = (paramString2 != null) && (paramString2.startsWith("!")) ? 1 : 0;
/* 583 */     int i4 = paramInt1 * paramInt1;
/* 584 */     int i5 = paramInt2 * paramInt2;
/* 585 */     paramInt3 = qh.a(paramInt3);
/*     */     
/* 587 */     if (i2 != 0) paramString1 = paramString1.substring(1);
/* 588 */     if (i3 != 0) { paramString2 = paramString2.substring(1);
/*     */     }
/* 590 */     for (int i6 = 0; i6 < this.e.size(); i6++) {
/* 591 */       mw localmw = (mw)this.e.get(i6);
/*     */       
/* 593 */       if (((paramahb == null) || (localmw.o == paramahb)) && (
/* 594 */         (paramString1 == null) || 
/* 595 */         (i2 != paramString1.equalsIgnoreCase(localmw.b_()))))
/*     */       {
/* 597 */         if (paramString2 != null) {
/* 598 */           bae localbae = localmw.bt();
/* 599 */           String str = localbae == null ? "" : localbae.b();
/* 600 */           if (i3 == paramString2.equalsIgnoreCase(str)) {}
/*     */ 
/*     */         }
/* 603 */         else if ((paramr != null) && ((paramInt1 > 0) || (paramInt2 > 0))) {
/* 604 */           float f1 = paramr.e(localmw.f_());
/* 605 */           if (((paramInt1 > 0) && (f1 < i4)) || (
/* 606 */             (paramInt2 > 0) && (f1 > i5))) {}
/*     */ 
/*     */         }
/* 609 */         else if (a(localmw, paramMap))
/*     */         {
/* 611 */           if (((paramInt4 == ahk.a.a()) || (paramInt4 == localmw.c.b().a())) && 
/* 612 */             ((paramInt5 <= 0) || (localmw.bF >= paramInt5)) && 
/* 613 */             (localmw.bF <= paramInt6))
/*     */           {
/* 615 */             ((List)localObject).add(localmw); }
/*     */         } }
/*     */     }
/* 618 */     if (paramr != null) Collections.sort((List)localObject, new ln(paramr));
/* 619 */     if (i1 != 0) Collections.reverse((List)localObject);
/* 620 */     if (paramInt3 > 0) { localObject = ((List)localObject).subList(0, Math.min(paramInt3, ((List)localObject).size()));
/*     */     }
/* 622 */     return (List)localObject;
/*     */   }
/*     */   
/*     */   private boolean a(yz paramyz, Map paramMap) {
/* 626 */     if ((paramMap == null) || (paramMap.size() == 0)) { return true;
/*     */     }
/* 628 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 629 */       String str = (String)localEntry.getKey();
/* 630 */       int i1 = 0;
/*     */       
/* 632 */       if ((str.endsWith("_min")) && (str.length() > 4)) {
/* 633 */         i1 = 1;
/* 634 */         str = str.substring(0, str.length() - 4);
/*     */       }
/*     */       
/* 637 */       bac localbac = paramyz.bU();
/* 638 */       azx localazx = localbac.b(str);
/* 639 */       if (localazx == null) return false;
/* 640 */       azz localazz = paramyz.bU().a(paramyz.b_(), localazx);
/* 641 */       int i2 = localazz.c();
/*     */       
/* 643 */       if ((i2 < ((Integer)localEntry.getValue()).intValue()) && (i1 != 0))
/* 644 */         return false;
/* 645 */       if ((i2 > ((Integer)localEntry.getValue()).intValue()) && (i1 == 0)) {
/* 646 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 650 */     return true;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, ft paramft) {
/* 654 */     a(null, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramInt, paramft);
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt, ft paramft) {
/* 658 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 659 */       mw localmw = (mw)this.e.get(i1);
/* 660 */       if ((localmw != paramyz) && 
/* 661 */         (localmw.ap == paramInt)) {
/* 662 */         double d1 = paramDouble1 - localmw.s;
/* 663 */         double d2 = paramDouble2 - localmw.t;
/* 664 */         double d3 = paramDouble3 - localmw.u;
/* 665 */         if (d1 * d1 + d2 * d2 + d3 * d3 < paramDouble4 * paramDouble4)
/* 666 */           localmw.a.a(paramft);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void j() {
/* 672 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 673 */       b((mw)this.e.get(i1));
/*     */     }
/*     */   }
/*     */   
/*     */   public void d(GameProfile paramGameProfile) {
/* 678 */     this.m.a(new os(paramGameProfile));
/*     */   }
/*     */   
/*     */   public void c(GameProfile paramGameProfile) {
/* 682 */     this.m.c(paramGameProfile);
/*     */   }
/*     */   
/*     */   public or k() {
/* 686 */     return this.m;
/*     */   }
/*     */   
/*     */   public String[] l() {
/* 690 */     return this.m.a();
/*     */   }
/*     */   
/*     */   public oj m() {
/* 694 */     return this.l;
/*     */   }
/*     */   
/*     */   public String[] n() {
/* 698 */     return this.l.a();
/*     */   }
/*     */   
/*     */   public void a() {}
/*     */   
/*     */   public void b(mw parammw, mt parammt)
/*     */   {
/* 705 */     parammw.a.a(new ih(parammt.I(), parammt.J(), parammt.O().b("doDaylightCycle")));
/* 706 */     if (parammt.Q()) {
/* 707 */       parammw.a.a(new gv(1, 0.0F));
/* 708 */       parammw.a.a(new gv(7, parammt.j(1.0F)));
/* 709 */       parammw.a.a(new gv(8, parammt.h(1.0F)));
/*     */     }
/*     */   }
/*     */   
/*     */   public void f(mw parammw) {
/* 714 */     parammw.a(parammw.bn);
/* 715 */     parammw.o();
/* 716 */     parammw.a.a(new hu(parammw.bm.c));
/*     */   }
/*     */   
/*     */   public int o() {
/* 720 */     return this.e.size();
/*     */   }
/*     */   
/*     */   public int p() {
/* 724 */     return this.f;
/*     */   }
/*     */   
/*     */   public String[] q() {
/* 728 */     return this.i.c[0].M().e().f();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(boolean paramBoolean)
/*     */   {
/* 736 */     this.p = paramBoolean;
/*     */   }
/*     */   
/*     */   public List b(String paramString) {
/* 740 */     ArrayList localArrayList = new ArrayList();
/*     */     
/* 742 */     for (mw localmw : this.e) {
/* 743 */       if (localmw.s().equals(paramString)) {
/* 744 */         localArrayList.add(localmw);
/*     */       }
/*     */     }
/*     */     
/* 748 */     return localArrayList;
/*     */   }
/*     */   
/*     */   public int s() {
/* 752 */     return this.q;
/*     */   }
/*     */   
/*     */   public MinecraftServer c() {
/* 756 */     return this.i;
/*     */   }
/*     */   
/*     */   public dh t() {
/* 760 */     return null;
/*     */   }
/*     */   
/*     */   public void a(ahk paramahk) {
/* 764 */     this.r = paramahk;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   private void a(mw parammw1, mw parammw2, ahb paramahb)
/*     */   {
/* 771 */     if (parammw2 != null) {
/* 772 */       parammw1.c.a(parammw2.c.b());
/* 773 */     } else if (this.r != null) {
/* 774 */       parammw1.c.a(this.r);
/*     */     }
/* 776 */     parammw1.c.b(paramahb.N().r());
/*     */   }
/*     */   
/*     */   public void c(boolean paramBoolean) {
/* 780 */     this.s = paramBoolean;
/*     */   }
/*     */   
/*     */   public void u() {
/* 784 */     for (int i1 = 0; i1 < this.e.size(); i1++) {
/* 785 */       ((mw)this.e.get(i1)).a.c("Server closed");
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(fj paramfj, boolean paramBoolean) {
/* 790 */     this.i.a(paramfj);
/* 791 */     a(new gj(paramfj, paramBoolean));
/*     */   }
/*     */   
/*     */   public void a(fj paramfj) {
/* 795 */     a(paramfj, true);
/*     */   }
/*     */   
/*     */   public pg a(yz paramyz) {
/* 799 */     UUID localUUID = paramyz.aB();
/* 800 */     pg localpg = localUUID == null ? null : (pg)this.n.get(localUUID);
/*     */     
/* 802 */     if (localpg == null) {
/* 803 */       File localFile1 = new File(this.i.a(0).M().b(), "stats");
/* 804 */       File localFile2 = new File(localFile1, localUUID.toString() + ".json");
/*     */       
/* 806 */       if (!localFile2.exists())
/*     */       {
/* 808 */         File localFile3 = new File(localFile1, paramyz.b_() + ".json");
/* 809 */         if ((localFile3.exists()) && (localFile3.isFile())) {
/* 810 */           localFile3.renameTo(localFile2);
/*     */         }
/*     */       }
/*     */       
/* 814 */       localpg = new pg(this.i, localFile2);
/* 815 */       localpg.a();
/* 816 */       this.n.put(localUUID, localpg);
/*     */     }
/*     */     
/* 819 */     return localpg;
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 823 */     this.q = paramInt;
/* 824 */     if (this.i.c == null) { return;
/*     */     }
/* 826 */     for (mt localmt : this.i.c) {
/* 827 */       if (localmt != null) {
/* 828 */         localmt.t().a(paramInt);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\oi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */