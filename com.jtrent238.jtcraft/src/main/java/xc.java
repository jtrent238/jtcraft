/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class xc
/*     */   extends yg
/*     */   implements ww, yi
/*     */ {
/*  33 */   private float[] bp = new float[2];
/*  34 */   private float[] bq = new float[2];
/*  35 */   private float[] br = new float[2];
/*  36 */   private float[] bs = new float[2];
/*  37 */   private int[] bt = new int[2];
/*  38 */   private int[] bu = new int[2];
/*     */   
/*     */   private int bv;
/*  41 */   private static final sj bw = new xd();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public xc(ahb paramahb)
/*     */   {
/*  49 */     super(paramahb);
/*     */     
/*  51 */     g(aY());
/*     */     
/*  53 */     a(0.9F, 4.0F);
/*     */     
/*     */ 
/*  56 */     this.ae = true;
/*     */     
/*     */ 
/*     */ 
/*  60 */     m().e(true);
/*     */     
/*  62 */     this.c.a(0, new uf(this));
/*  63 */     this.c.a(2, new vd(this, 1.0D, 40, 20.0F));
/*     */     
/*  65 */     this.c.a(5, new vc(this, 1.0D));
/*  66 */     this.c.a(6, new un(this, yz.class, 8.0F));
/*  67 */     this.c.a(7, new vb(this));
/*     */     
/*  69 */     this.d.a(1, new vn(this, false));
/*  70 */     this.d.a(2, new vo(this, sw.class, 0, false, false, bw));
/*     */     
/*  72 */     this.b = 50;
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  77 */     super.c();
/*     */     
/*  79 */     this.af.a(17, new Integer(0));
/*  80 */     this.af.a(18, new Integer(0));
/*  81 */     this.af.a(19, new Integer(0));
/*  82 */     this.af.a(20, new Integer(0));
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/*  87 */     super.b(paramdh);
/*     */     
/*  89 */     paramdh.a("Invul", ca());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/*  94 */     super.a(paramdh);
/*     */     
/*  96 */     s(paramdh.f("Invul"));
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 101 */     return this.N / 8.0F;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 106 */     return "mob.wither.idle";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 111 */     return "mob.wither.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 116 */     return "mob.wither.death";
/*     */   }
/*     */   
/*     */ 
/*     */   public void e()
/*     */   {
/* 122 */     this.w *= 0.6000000238418579D;
/*     */     double d3;
/* 124 */     double d5; double d7; if ((!this.o.E) && (t(0) > 0)) {
/* 125 */       sa localsa1 = this.o.a(t(0));
/* 126 */       if (localsa1 != null) {
/* 127 */         if ((this.t < localsa1.t) || ((!cb()) && (this.t < localsa1.t + 5.0D))) {
/* 128 */           if (this.w < 0.0D) {
/* 129 */             this.w = 0.0D;
/*     */           }
/* 131 */           this.w += (0.5D - this.w) * 0.6000000238418579D;
/*     */         }
/*     */         
/* 134 */         double d1 = localsa1.s - this.s;
/* 135 */         d3 = localsa1.u - this.u;
/* 136 */         d5 = d1 * d1 + d3 * d3;
/* 137 */         if (d5 > 9.0D) {
/* 138 */           d7 = qh.a(d5);
/* 139 */           this.v += (d1 / d7 * 0.5D - this.v) * 0.6000000238418579D;
/* 140 */           this.x += (d3 / d7 * 0.5D - this.x) * 0.6000000238418579D;
/*     */         }
/*     */       }
/*     */     }
/* 144 */     if (this.v * this.v + this.x * this.x > 0.05000000074505806D) {
/* 145 */       this.y = ((float)Math.atan2(this.x, this.v) * 57.295776F - 90.0F);
/*     */     }
/* 147 */     super.e();
/*     */     
/*     */ 
/* 150 */     for (boolean bool = false; bool < true; bool++) {
/* 151 */       this.bs[bool] = this.bq[bool];
/* 152 */       this.br[bool] = this.bp[bool];
/*     */     }
/*     */     
/* 155 */     for (bool = false; bool < true; bool++) {
/* 156 */       i = t(bool + true);
/* 157 */       sa localsa2 = null;
/* 158 */       if (i > 0) {
/* 159 */         localsa2 = this.o.a(i);
/*     */       }
/* 161 */       if (localsa2 != null) {
/* 162 */         d3 = u(bool + true);
/* 163 */         d5 = v(bool + true);
/* 164 */         d7 = w(bool + true);
/*     */         
/* 166 */         double d8 = localsa2.s - d3;
/* 167 */         double d9 = localsa2.t + localsa2.g() - d5;
/* 168 */         double d10 = localsa2.u - d7;
/* 169 */         double d11 = qh.a(d8 * d8 + d10 * d10);
/*     */         
/* 171 */         float f1 = (float)(Math.atan2(d10, d8) * 180.0D / 3.1415927410125732D) - 90.0F;
/* 172 */         float f2 = (float)-(Math.atan2(d9, d11) * 180.0D / 3.1415927410125732D);
/* 173 */         this.bp[bool] = b(this.bp[bool], f2, 40.0F);
/* 174 */         this.bq[bool] = b(this.bq[bool], f1, 10.0F);
/*     */       }
/*     */       else
/*     */       {
/* 178 */         this.bq[bool] = b(this.bq[bool], this.aM, 10.0F);
/*     */       }
/*     */     }
/* 181 */     bool = cb();
/* 182 */     for (int i = 0; i < 3; i++) {
/* 183 */       double d2 = u(i);
/* 184 */       double d4 = v(i);
/* 185 */       double d6 = w(i);
/*     */       
/* 187 */       this.o.a("smoke", d2 + this.Z.nextGaussian() * 0.30000001192092896D, d4 + this.Z.nextGaussian() * 0.30000001192092896D, d6 + this.Z.nextGaussian() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D);
/* 188 */       if ((bool) && (this.o.s.nextInt(4) == 0)) {
/* 189 */         this.o.a("mobSpell", d2 + this.Z.nextGaussian() * 0.30000001192092896D, d4 + this.Z.nextGaussian() * 0.30000001192092896D, d6 + this.Z.nextGaussian() * 0.30000001192092896D, 0.699999988079071D, 0.699999988079071D, 0.5D);
/*     */       }
/*     */     }
/* 192 */     if (ca() > 0) {
/* 193 */       for (i = 0; i < 3; i++) {
/* 194 */         this.o.a("mobSpell", this.s + this.Z.nextGaussian() * 1.0D, this.t + this.Z.nextFloat() * 3.3F, this.u + this.Z.nextGaussian() * 1.0D, 0.699999988079071D, 0.699999988079071D, 0.8999999761581421D);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bn()
/*     */   {
/* 201 */     if (ca() > 0) {
/* 202 */       i = ca() - 1;
/*     */       
/* 204 */       if (i <= 0) {
/* 205 */         this.o.a(this, this.s, this.t + g(), this.u, 7.0F, false, this.o.O().b("mobGriefing"));
/* 206 */         this.o.b(1013, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */       }
/*     */       
/* 209 */       s(i);
/* 210 */       if (this.aa % 10 == 0) {
/* 211 */         f(10.0F);
/*     */       }
/*     */       
/* 214 */       return;
/*     */     }
/*     */     
/* 217 */     super.bn();
/*     */     int j;
/* 219 */     int m; for (int i = 1; i < 3; i++) {
/* 220 */       if (this.aa >= this.bt[(i - 1)]) {
/* 221 */         this.bt[(i - 1)] = (this.aa + 10 + this.Z.nextInt(10));
/*     */         
/* 223 */         if ((this.o.r == rd.c) || (this.o.r == rd.d)) { int tmp192_191 = (i - 1); int[] tmp192_186 = this.bu; int tmp194_193 = tmp192_186[tmp192_191];tmp192_186[tmp192_191] = (tmp194_193 + 1); if (tmp194_193 > 15) {
/* 224 */             float f1 = 10.0F;
/* 225 */             float f2 = 5.0F;
/* 226 */             double d1 = qh.a(this.Z, this.s - f1, this.s + f1);
/* 227 */             double d2 = qh.a(this.Z, this.t - f2, this.t + f2);
/* 228 */             double d3 = qh.a(this.Z, this.u - f1, this.u + f1);
/* 229 */             a(i + 1, d1, d2, d3, true);
/* 230 */             this.bu[(i - 1)] = 0;
/*     */           }
/*     */         }
/* 233 */         j = t(i);
/* 234 */         Object localObject; if (j > 0) {
/* 235 */           localObject = this.o.a(j);
/* 236 */           if ((localObject == null) || (!((sa)localObject).Z()) || (f((sa)localObject) > 900.0D) || (!p((sa)localObject))) {
/* 237 */             b(i, 0);
/*     */           } else {
/* 239 */             a(i + 1, (sv)localObject);
/* 240 */             this.bt[(i - 1)] = (this.aa + 40 + this.Z.nextInt(20));
/* 241 */             this.bu[(i - 1)] = 0;
/*     */           }
/*     */         } else {
/* 244 */           localObject = this.o.a(sv.class, this.C.b(20.0D, 8.0D, 20.0D), bw);
/*     */           
/* 246 */           for (m = 0; (m < 10) && (!((List)localObject).isEmpty()); m++) {
/* 247 */             sv localsv = (sv)((List)localObject).get(this.Z.nextInt(((List)localObject).size()));
/*     */             
/* 249 */             if ((localsv != this) && (localsv.Z()) && (p(localsv))) {
/* 250 */               if ((localsv instanceof yz)) {
/* 251 */                 if (((yz)localsv).bE.a) break;
/* 252 */                 b(i, localsv.y()); break;
/*     */               }
/*     */               
/*     */ 
/* 256 */               b(i, localsv.y());
/* 257 */               break;
/*     */             }
/*     */             
/*     */ 
/* 261 */             ((List)localObject).remove(localsv);
/*     */           }
/*     */         }
/*     */       }
/*     */     }
/* 266 */     if (o() != null) {
/* 267 */       b(0, o().y());
/*     */     } else {
/* 269 */       b(0, 0);
/*     */     }
/*     */     
/* 272 */     if (this.bv > 0) {
/* 273 */       this.bv -= 1;
/*     */       
/* 275 */       if ((this.bv == 0) && (this.o.O().b("mobGriefing")))
/*     */       {
/*     */ 
/*     */ 
/* 279 */         i = qh.c(this.t);
/* 280 */         j = qh.c(this.s);
/* 281 */         int k = qh.c(this.u);
/* 282 */         m = 0;
/*     */         
/* 284 */         for (int n = -1; n <= 1; n++) {
/* 285 */           for (int i1 = -1; i1 <= 1; i1++) {
/* 286 */             for (int i2 = 0; i2 <= 3; i2++) {
/* 287 */               int i3 = j + n;
/* 288 */               int i4 = i + i2;
/* 289 */               int i5 = k + i1;
/* 290 */               aji localaji = this.o.a(i3, i4, i5);
/* 291 */               if ((localaji.o() != awt.a) && (localaji != ajn.h) && (localaji != ajn.bq) && (localaji != ajn.br) && (localaji != ajn.bI)) {
/* 292 */                 m = (this.o.a(i3, i4, i5, true)) || (m != 0) ? 1 : 0;
/*     */               }
/*     */             }
/*     */           }
/*     */         }
/* 297 */         if (m != 0) {
/* 298 */           this.o.a(null, 1012, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 303 */     if (this.aa % 20 == 0) {
/* 304 */       f(1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void bZ() {
/* 309 */     s(220);
/* 310 */     g(aY() / 3.0F);
/*     */   }
/*     */   
/*     */ 
/*     */   public void as() {}
/*     */   
/*     */ 
/*     */   public int aV()
/*     */   {
/* 319 */     return 4;
/*     */   }
/*     */   
/*     */   private double u(int paramInt) {
/* 323 */     if (paramInt <= 0) {
/* 324 */       return this.s;
/*     */     }
/* 326 */     float f1 = (this.aM + 180 * (paramInt - 1)) / 180.0F * 3.1415927F;
/* 327 */     float f2 = qh.b(f1);
/* 328 */     return this.s + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private double v(int paramInt) {
/* 332 */     if (paramInt <= 0) {
/* 333 */       return this.t + 3.0D;
/*     */     }
/* 335 */     return this.t + 2.2D;
/*     */   }
/*     */   
/*     */   private double w(int paramInt)
/*     */   {
/* 340 */     if (paramInt <= 0) {
/* 341 */       return this.u;
/*     */     }
/* 343 */     float f1 = (this.aM + 180 * (paramInt - 1)) / 180.0F * 3.1415927F;
/* 344 */     float f2 = qh.a(f1);
/* 345 */     return this.u + f2 * 1.3D;
/*     */   }
/*     */   
/*     */   private float b(float paramFloat1, float paramFloat2, float paramFloat3) {
/* 349 */     float f = qh.g(paramFloat2 - paramFloat1);
/* 350 */     if (f > paramFloat3) {
/* 351 */       f = paramFloat3;
/*     */     }
/* 353 */     if (f < -paramFloat3) {
/* 354 */       f = -paramFloat3;
/*     */     }
/* 356 */     return paramFloat1 + f;
/*     */   }
/*     */   
/*     */   private void a(int paramInt, sv paramsv) {
/* 360 */     a(paramInt, paramsv.s, paramsv.t + paramsv.g() * 0.5D, paramsv.u, (paramInt == 0) && (this.Z.nextFloat() < 0.001F));
/*     */   }
/*     */   
/*     */   private void a(int paramInt, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean) {
/* 364 */     this.o.a(null, 1014, (int)this.s, (int)this.t, (int)this.u, 0);
/*     */     
/* 366 */     double d1 = u(paramInt);
/* 367 */     double d2 = v(paramInt);
/* 368 */     double d3 = w(paramInt);
/*     */     
/* 370 */     double d4 = paramDouble1 - d1;
/* 371 */     double d5 = paramDouble2 - d2;
/* 372 */     double d6 = paramDouble3 - d3;
/*     */     
/* 374 */     zp localzp = new zp(this.o, this, d4, d5, d6);
/* 375 */     if (paramBoolean) localzp.a(true);
/* 376 */     localzp.t = d2;
/* 377 */     localzp.s = d1;
/* 378 */     localzp.u = d3;
/* 379 */     this.o.d(localzp);
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat)
/*     */   {
/* 384 */     a(0, paramsv);
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 389 */     if (aw()) return false;
/* 390 */     if (paramro == ro.e) return false;
/* 391 */     if (ca() > 0) {
/* 392 */       return false;
/*     */     }
/*     */     
/* 395 */     if (cb()) {
/* 396 */       localsa = paramro.i();
/* 397 */       if ((localsa instanceof zc)) {
/* 398 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 402 */     sa localsa = paramro.j();
/* 403 */     if ((localsa != null) && 
/* 404 */       (!(localsa instanceof yz)) && 
/* 405 */       ((localsa instanceof sv)) && (((sv)localsa).bd() == bd()))
/*     */     {
/* 407 */       return false;
/*     */     }
/*     */     
/* 410 */     if (this.bv <= 0) {
/* 411 */       this.bv = 20;
/*     */     }
/*     */     
/* 414 */     for (int i = 0; i < this.bu.length; i++) {
/* 415 */       this.bu[i] += 3;
/*     */     }
/*     */     
/* 418 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 423 */     a(ade.bN, 1);
/*     */     
/* 425 */     if (!this.o.E) {
/* 426 */       for (yz localyz : this.o.a(yz.class, this.C.b(50.0D, 100.0D, 50.0D))) {
/* 427 */         localyz.a(pc.J);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void w()
/*     */   {
/* 434 */     this.aU = 0;
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/* 439 */     return 15728880;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */ 
/*     */   public void c(rw paramrw) {}
/*     */   
/*     */ 
/*     */   protected boolean bk()
/*     */   {
/* 453 */     return true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/* 458 */     super.aD();
/*     */     
/* 460 */     a(yj.a).a(300.0D);
/* 461 */     a(yj.d).a(0.6000000238418579D);
/* 462 */     a(yj.b).a(40.0D);
/*     */   }
/*     */   
/*     */   public float a(int paramInt) {
/* 466 */     return this.bq[paramInt];
/*     */   }
/*     */   
/*     */   public float c(int paramInt) {
/* 470 */     return this.bp[paramInt];
/*     */   }
/*     */   
/*     */   public int ca() {
/* 474 */     return this.af.c(20);
/*     */   }
/*     */   
/*     */   public void s(int paramInt) {
/* 478 */     this.af.b(20, Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public int t(int paramInt) {
/* 482 */     return this.af.c(17 + paramInt);
/*     */   }
/*     */   
/*     */   public void b(int paramInt1, int paramInt2) {
/* 486 */     this.af.b(17 + paramInt1, Integer.valueOf(paramInt2));
/*     */   }
/*     */   
/*     */   public boolean cb() {
/* 490 */     return aS() <= aY() / 2.0F;
/*     */   }
/*     */   
/*     */   public sz bd()
/*     */   {
/* 495 */     return sz.b;
/*     */   }
/*     */   
/*     */   public void a(sa paramsa)
/*     */   {
/* 500 */     this.m = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */