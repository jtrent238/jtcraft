/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wv
/*     */   extends tg
/*     */ {
/*     */   private float bq;
/*     */   private float br;
/*     */   private boolean bs;
/*     */   private boolean bt;
/*     */   private float bu;
/*     */   private float bv;
/*     */   
/*     */   public wv(ahb paramahb)
/*     */   {
/*  36 */     super(paramahb);
/*  37 */     a(0.6F, 0.8F);
/*     */     
/*  39 */     m().a(true);
/*  40 */     this.c.a(1, new uf(this));
/*  41 */     this.c.a(2, this.bp);
/*  42 */     this.c.a(3, new um(this, 0.4F));
/*  43 */     this.c.a(4, new uq(this, 1.0D, true));
/*  44 */     this.c.a(5, new ug(this, 1.0D, 10.0F, 2.0F));
/*  45 */     this.c.a(6, new ua(this, 1.0D));
/*  46 */     this.c.a(7, new vc(this, 1.0D));
/*  47 */     this.c.a(8, new ty(this, 8.0F));
/*  48 */     this.c.a(9, new un(this, yz.class, 8.0F));
/*  49 */     this.c.a(9, new vb(this));
/*     */     
/*  51 */     this.d.a(1, new vs(this));
/*  52 */     this.d.a(2, new vt(this));
/*  53 */     this.d.a(3, new vn(this, true));
/*  54 */     this.d.a(4, new vr(this, wp.class, 200, false));
/*     */     
/*  56 */     j(false);
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  61 */     super.aD();
/*     */     
/*  63 */     a(yj.d).a(0.30000001192092896D);
/*     */     
/*  65 */     if (bZ()) {
/*  66 */       a(yj.a).a(20.0D);
/*     */     } else {
/*  68 */       a(yj.a).a(8.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  74 */     return true;
/*     */   }
/*     */   
/*     */   public void d(sv paramsv)
/*     */   {
/*  79 */     super.d(paramsv);
/*  80 */     if (paramsv == null) {
/*  81 */       l(false);
/*  82 */     } else if (!bZ()) {
/*  83 */       l(true);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bp()
/*     */   {
/*  89 */     this.af.b(18, Float.valueOf(aS()));
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  94 */     super.c();
/*  95 */     this.af.a(18, new Float(aS()));
/*  96 */     this.af.a(19, new Byte((byte)0));
/*  97 */     this.af.a(20, new Byte((byte)aka.b(1)));
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 102 */     a("mob.wolf.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 107 */     super.b(paramdh);
/*     */     
/* 109 */     paramdh.a("Angry", ci());
/* 110 */     paramdh.a("CollarColor", (byte)cj());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 115 */     super.a(paramdh);
/*     */     
/* 117 */     l(paramdh.n("Angry"));
/* 118 */     if (paramdh.b("CollarColor", 99)) s(paramdh.d("CollarColor"));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 123 */     if (ci()) {
/* 124 */       return "mob.wolf.growl";
/*     */     }
/* 126 */     if (this.Z.nextInt(3) == 0) {
/* 127 */       if ((bZ()) && (this.af.d(18) < 10.0F)) {
/* 128 */         return "mob.wolf.whine";
/*     */       }
/* 130 */       return "mob.wolf.panting";
/*     */     }
/* 132 */     return "mob.wolf.bark";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 137 */     return "mob.wolf.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 142 */     return "mob.wolf.death";
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/* 147 */     return 0.4F;
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 152 */     return adb.d(-1);
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 157 */     super.e();
/*     */     
/* 159 */     if ((!this.o.E) && (this.bs) && (!this.bt) && (!bS()) && (this.D)) {
/* 160 */       this.bt = true;
/* 161 */       this.bu = 0.0F;
/* 162 */       this.bv = 0.0F;
/* 163 */       this.o.a(this, (byte)8);
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/* 169 */     super.h();
/*     */     
/* 171 */     this.br = this.bq;
/* 172 */     if (ck()) {
/* 173 */       this.bq += (1.0F - this.bq) * 0.4F;
/*     */     } else {
/* 175 */       this.bq += (0.0F - this.bq) * 0.4F;
/*     */     }
/* 177 */     if (ck()) {
/* 178 */       this.g = 10;
/*     */     }
/*     */     
/* 181 */     if (L()) {
/* 182 */       this.bs = true;
/* 183 */       this.bt = false;
/* 184 */       this.bu = 0.0F;
/* 185 */       this.bv = 0.0F;
/* 186 */     } else if (((this.bs) || (this.bt)) && 
/* 187 */       (this.bt))
/*     */     {
/* 189 */       if (this.bu == 0.0F) {
/* 190 */         a("mob.wolf.shake", bf(), (this.Z.nextFloat() - this.Z.nextFloat()) * 0.2F + 1.0F);
/*     */       }
/*     */       
/* 193 */       this.bv = this.bu;
/* 194 */       this.bu += 0.05F;
/*     */       
/* 196 */       if (this.bv >= 2.0F) {
/* 197 */         this.bs = false;
/* 198 */         this.bt = false;
/* 199 */         this.bv = 0.0F;
/* 200 */         this.bu = 0.0F;
/*     */       }
/*     */       
/* 203 */       if (this.bu > 0.4F) {
/* 204 */         float f1 = (float)this.C.b;
/* 205 */         int i = (int)(qh.a((this.bu - 0.4F) * 3.1415927F) * 7.0F);
/* 206 */         for (int j = 0; j < i; j++) {
/* 207 */           float f2 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
/* 208 */           float f3 = (this.Z.nextFloat() * 2.0F - 1.0F) * this.M * 0.5F;
/* 209 */           this.o.a("splash", this.s + f2, f1 + 0.8F, this.u + f3, this.v, this.w, this.x);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean cg()
/*     */   {
/* 217 */     return this.bs;
/*     */   }
/*     */   
/*     */   public float p(float paramFloat) {
/* 221 */     return 0.75F + (this.bv + (this.bu - this.bv) * paramFloat) / 2.0F * 0.25F;
/*     */   }
/*     */   
/*     */   public float g(float paramFloat1, float paramFloat2) {
/* 225 */     float f = (this.bv + (this.bu - this.bv) * paramFloat1 + paramFloat2) / 1.8F;
/* 226 */     if (f < 0.0F) {
/* 227 */       f = 0.0F;
/* 228 */     } else if (f > 1.0F) {
/* 229 */       f = 1.0F;
/*     */     }
/* 231 */     return qh.a(f * 3.1415927F) * qh.a(f * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
/*     */   }
/*     */   
/*     */   public float q(float paramFloat) {
/* 235 */     return (this.br + (this.bq - this.br) * paramFloat) * 0.15F * 3.1415927F;
/*     */   }
/*     */   
/*     */   public float g()
/*     */   {
/* 240 */     return this.N * 0.8F;
/*     */   }
/*     */   
/*     */   public int x()
/*     */   {
/* 245 */     if (ca()) {
/* 246 */       return 20;
/*     */     }
/* 248 */     return super.x();
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 253 */     if (aw()) return false;
/* 254 */     sa localsa = paramro.j();
/* 255 */     this.bp.a(false);
/*     */     
/* 257 */     if ((localsa != null) && (!(localsa instanceof yz)) && (!(localsa instanceof zc)))
/*     */     {
/* 259 */       paramFloat = (paramFloat + 1.0F) / 2.0F;
/*     */     }
/* 261 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/* 266 */     int i = bZ() ? 4 : 2;
/* 267 */     return paramsa.a(ro.a(this), i);
/*     */   }
/*     */   
/*     */   public void j(boolean paramBoolean)
/*     */   {
/* 272 */     super.j(paramBoolean);
/*     */     
/* 274 */     if (paramBoolean) {
/* 275 */       a(yj.a).a(20.0D);
/*     */     } else {
/* 277 */       a(yj.a).a(8.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 283 */     add localadd = paramyz.bm.h();
/*     */     
/* 285 */     if (bZ()) {
/* 286 */       if (localadd != null) {
/* 287 */         if ((localadd.b() instanceof acx)) {
/* 288 */           acx localacx = (acx)localadd.b();
/*     */           
/* 290 */           if ((localacx.i()) && (this.af.d(18) < 20.0F)) {
/* 291 */             if (!paramyz.bE.d) localadd.b -= 1;
/* 292 */             f(localacx.g(localadd));
/* 293 */             if (localadd.b <= 0) {
/* 294 */               paramyz.bm.a(paramyz.bm.c, null);
/*     */             }
/* 296 */             return true;
/*     */           }
/* 298 */         } else if (localadd.b() == ade.aR) {
/* 299 */           int i = aka.b(localadd.k());
/* 300 */           if (i != cj()) {
/* 301 */             s(i);
/*     */             
/* 303 */             if (!paramyz.bE.d) { if (--localadd.b <= 0) {
/* 304 */                 paramyz.bm.a(paramyz.bm.c, null);
/*     */               }
/*     */             }
/* 307 */             return true;
/*     */           }
/*     */         }
/*     */       }
/* 311 */       if ((e(paramyz)) && 
/* 312 */         (!this.o.E) && (!c(localadd))) {
/* 313 */         this.bp.a(!ca());
/* 314 */         this.bc = false;
/* 315 */         a(null);
/* 316 */         b(null);
/* 317 */         d(null);
/*     */       }
/*     */       
/*     */     }
/* 321 */     else if ((localadd != null) && (localadd.b() == ade.aS) && (!ci())) {
/* 322 */       if (!paramyz.bE.d) localadd.b -= 1;
/* 323 */       if (localadd.b <= 0) {
/* 324 */         paramyz.bm.a(paramyz.bm.c, null);
/*     */       }
/* 326 */       if (!this.o.E) {
/* 327 */         if (this.Z.nextInt(3) == 0) {
/* 328 */           j(true);
/* 329 */           a(null);
/* 330 */           d(null);
/* 331 */           this.bp.a(true);
/* 332 */           g(20.0F);
/* 333 */           b(paramyz.aB().toString());
/* 334 */           i(true);
/* 335 */           this.o.a(this, (byte)7);
/*     */         } else {
/* 337 */           i(false);
/* 338 */           this.o.a(this, (byte)6);
/*     */         }
/*     */       }
/*     */       
/* 342 */       return true;
/*     */     }
/*     */     
/* 345 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 350 */     if (paramByte == 8) {
/* 351 */       this.bt = true;
/* 352 */       this.bu = 0.0F;
/* 353 */       this.bv = 0.0F;
/*     */     } else {
/* 355 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   public float ch() {
/* 360 */     if (ci())
/* 361 */       return 1.5393804F;
/* 362 */     if (bZ()) {
/* 363 */       return (0.55F - (20.0F - this.af.d(18)) * 0.02F) * 3.1415927F;
/*     */     }
/* 365 */     return 0.62831855F;
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd)
/*     */   {
/* 370 */     if (paramadd == null) return false;
/* 371 */     if (!(paramadd.b() instanceof acx)) return false;
/* 372 */     return ((acx)paramadd.b()).i();
/*     */   }
/*     */   
/*     */   public int bB()
/*     */   {
/* 377 */     return 8;
/*     */   }
/*     */   
/*     */   public boolean ci() {
/* 381 */     return (this.af.a(16) & 0x2) != 0;
/*     */   }
/*     */   
/*     */   public void l(boolean paramBoolean) {
/* 385 */     int i = this.af.a(16);
/* 386 */     if (paramBoolean) {
/* 387 */       this.af.b(16, Byte.valueOf((byte)(i | 0x2)));
/*     */     } else {
/* 389 */       this.af.b(16, Byte.valueOf((byte)(i & 0xFFFFFFFD)));
/*     */     }
/*     */   }
/*     */   
/*     */   public int cj() {
/* 394 */     return this.af.a(20) & 0xF;
/*     */   }
/*     */   
/*     */   public void s(int paramInt) {
/* 398 */     this.af.b(20, Byte.valueOf((byte)(paramInt & 0xF)));
/*     */   }
/*     */   
/*     */   public wv b(rx paramrx)
/*     */   {
/* 403 */     wv localwv = new wv(this.o);
/* 404 */     String str = b();
/* 405 */     if ((str != null) && (str.trim().length() > 0)) {
/* 406 */       localwv.b(str);
/* 407 */       localwv.j(true);
/*     */     }
/* 409 */     return localwv;
/*     */   }
/*     */   
/*     */   public void m(boolean paramBoolean) {
/* 413 */     if (paramBoolean) {
/* 414 */       this.af.b(19, Byte.valueOf((byte)1));
/*     */     } else {
/* 416 */       this.af.b(19, Byte.valueOf((byte)0));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(wf paramwf)
/*     */   {
/* 422 */     if (paramwf == this) return false;
/* 423 */     if (!bZ()) return false;
/* 424 */     if (!(paramwf instanceof wv)) { return false;
/*     */     }
/* 426 */     wv localwv = (wv)paramwf;
/* 427 */     if (!localwv.bZ()) return false;
/* 428 */     if (localwv.ca()) { return false;
/*     */     }
/* 430 */     return (ce()) && (localwv.ce());
/*     */   }
/*     */   
/*     */   public boolean ck() {
/* 434 */     return this.af.a(19) == 1;
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/* 439 */     return (!bZ()) && (this.aa > 2400);
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean a(sv paramsv1, sv paramsv2)
/*     */   {
/* 445 */     if (((paramsv1 instanceof xz)) || ((paramsv1 instanceof yd))) {
/* 446 */       return false;
/*     */     }
/*     */     
/* 449 */     if ((paramsv1 instanceof wv)) {
/* 450 */       wv localwv = (wv)paramsv1;
/* 451 */       if ((localwv.bZ()) && (localwv.cb() == paramsv2)) {
/* 452 */         return false;
/*     */       }
/*     */     }
/* 455 */     if (((paramsv1 instanceof yz)) && ((paramsv2 instanceof yz)) && (!((yz)paramsv2).a((yz)paramsv1)))
/*     */     {
/* 457 */       return false;
/*     */     }
/*     */     
/* 460 */     if (((paramsv1 instanceof wi)) && (((wi)paramsv1).cc())) {
/* 461 */       return false;
/*     */     }
/* 463 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */