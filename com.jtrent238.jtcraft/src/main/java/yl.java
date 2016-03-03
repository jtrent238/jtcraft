/*     */ import java.util.Calendar;
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
/*     */ public class yl
/*     */   extends yg
/*     */   implements yi
/*     */ {
/*  30 */   private vd bp = new vd(this, 1.0D, 20, 60, 15.0F);
/*  31 */   private uq bq = new uq(this, yz.class, 1.2D, false);
/*     */   
/*     */   public yl(ahb paramahb) {
/*  34 */     super(paramahb);
/*     */     
/*  36 */     this.c.a(1, new uf(this));
/*  37 */     this.c.a(2, new vf(this));
/*  38 */     this.c.a(3, new ue(this, 1.0D));
/*     */     
/*  40 */     this.c.a(5, new vc(this, 1.0D));
/*  41 */     this.c.a(6, new un(this, yz.class, 8.0F));
/*  42 */     this.c.a(6, new vb(this));
/*     */     
/*  44 */     this.d.a(1, new vn(this, false));
/*  45 */     this.d.a(2, new vo(this, yz.class, 0, true));
/*     */     
/*  47 */     if ((paramahb != null) && (!paramahb.E)) bZ();
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  52 */     super.aD();
/*     */     
/*  54 */     a(yj.d).a(0.25D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  59 */     super.c();
/*     */     
/*  61 */     this.af.a(13, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  66 */     return true;
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  71 */     return "mob.skeleton.say";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  76 */     return "mob.skeleton.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  81 */     return "mob.skeleton.death";
/*     */   }
/*     */   
/*     */   protected void a(int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  86 */     a("mob.skeleton.step", 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/*  91 */     if (super.n(paramsa)) {
/*  92 */       if ((cb() == 1) && ((paramsa instanceof sv))) {
/*  93 */         ((sv)paramsa).c(new rw(rv.v.H, 200));
/*     */       }
/*  95 */       return true;
/*     */     }
/*  97 */     return false;
/*     */   }
/*     */   
/*     */   public sz bd()
/*     */   {
/* 102 */     return sz.b;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 107 */     if ((this.o.w()) && (!this.o.E)) {
/* 108 */       float f = d(1.0F);
/* 109 */       if ((f > 0.5F) && (this.Z.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) && (this.o.i(qh.c(this.s), qh.c(this.t), qh.c(this.u)))) {
/* 110 */         int i = 1;
/*     */         
/* 112 */         add localadd = q(4);
/* 113 */         if (localadd != null) {
/* 114 */           if (localadd.g()) {
/* 115 */             localadd.b(localadd.j() + this.Z.nextInt(2));
/* 116 */             if (localadd.j() >= localadd.l()) {
/* 117 */               a(localadd);
/* 118 */               c(4, null);
/*     */             }
/*     */           }
/*     */           
/* 122 */           i = 0;
/*     */         }
/*     */         
/* 125 */         if (i != 0) {
/* 126 */           e(8);
/*     */         }
/*     */       }
/*     */     }
/* 130 */     if ((this.o.E) && 
/* 131 */       (cb() == 1)) {
/* 132 */       a(0.72F, 2.34F);
/*     */     }
/*     */     
/*     */ 
/* 136 */     super.e();
/*     */   }
/*     */   
/*     */   public void ab()
/*     */   {
/* 141 */     super.ab();
/*     */     
/* 143 */     if ((this.m instanceof td)) {
/* 144 */       td localtd = (td)this.m;
/* 145 */       this.aM = localtd.aM;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(ro paramro)
/*     */   {
/* 152 */     super.a(paramro);
/* 153 */     if (((paramro.i() instanceof zc)) && ((paramro.j() instanceof yz))) {
/* 154 */       yz localyz = (yz)paramro.j();
/* 155 */       double d1 = localyz.s - this.s;
/* 156 */       double d2 = localyz.u - this.u;
/* 157 */       if (d1 * d1 + d2 * d2 >= 2500.0D) {
/* 158 */         localyz.a(pc.v);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 165 */     return ade.g;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 170 */     if (cb() == 1)
/*     */     {
/* 172 */       i = this.Z.nextInt(3 + paramInt) - 1;
/* 173 */       for (j = 0; j < i; j++) {
/* 174 */         a(ade.h, 1);
/*     */       }
/*     */     }
/*     */     else {
/* 178 */       i = this.Z.nextInt(3 + paramInt);
/* 179 */       for (j = 0; j < i; j++) {
/* 180 */         a(ade.g, 1);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 185 */     int i = this.Z.nextInt(3 + paramInt);
/* 186 */     for (int j = 0; j < i; j++) {
/* 187 */       a(ade.aS, 1);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void n(int paramInt)
/*     */   {
/* 193 */     if (cb() == 1) {
/* 194 */       a(new add(ade.bL, 1, 1), 0.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void bC()
/*     */   {
/* 200 */     super.bC();
/*     */     
/* 202 */     c(0, new add(ade.f));
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 207 */     paramsy = super.a(paramsy);
/*     */     
/* 209 */     if (((this.o.t instanceof aqp)) && (aI().nextInt(5) > 0)) {
/* 210 */       this.c.a(4, this.bq);
/*     */       
/* 212 */       a(1);
/* 213 */       c(0, new add(ade.q));
/* 214 */       a(yj.e).a(4.0D);
/*     */     } else {
/* 216 */       this.c.a(4, this.bp);
/*     */       
/* 218 */       bC();
/* 219 */       bD();
/*     */     }
/*     */     
/* 222 */     h(this.Z.nextFloat() < 0.55F * this.o.b(this.s, this.t, this.u));
/*     */     
/* 224 */     if (q(4) == null) {
/* 225 */       Calendar localCalendar = this.o.V();
/*     */       
/* 227 */       if ((localCalendar.get(2) + 1 == 10) && (localCalendar.get(5) == 31) && (this.Z.nextFloat() < 0.25F))
/*     */       {
/* 229 */         c(4, new add(this.Z.nextFloat() < 0.1F ? ajn.aP : ajn.aK));
/* 230 */         this.e[4] = 0.0F;
/*     */       }
/*     */     }
/* 233 */     return paramsy;
/*     */   }
/*     */   
/*     */   public void bZ() {
/* 237 */     this.c.a(this.bq);
/* 238 */     this.c.a(this.bp);
/*     */     
/* 240 */     add localadd = be();
/*     */     
/* 242 */     if ((localadd != null) && (localadd.b() == ade.f)) {
/* 243 */       this.c.a(4, this.bp);
/*     */     } else {
/* 245 */       this.c.a(4, this.bq);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(sv paramsv, float paramFloat)
/*     */   {
/* 251 */     zc localzc = new zc(this.o, this, paramsv, 1.6F, 14 - this.o.r.a() * 4);
/* 252 */     int i = afv.a(aft.v.B, be());
/* 253 */     int j = afv.a(aft.w.B, be());
/*     */     
/* 255 */     localzc.b(paramFloat * 2.0F + (this.Z.nextGaussian() * 0.25D + this.o.r.a() * 0.11F));
/*     */     
/* 257 */     if (i > 0) {
/* 258 */       localzc.b(localzc.e() + i * 0.5D + 0.5D);
/*     */     }
/* 260 */     if (j > 0) {
/* 261 */       localzc.a(j);
/*     */     }
/* 263 */     if ((afv.a(aft.x.B, be()) > 0) || (cb() == 1)) {
/* 264 */       localzc.e(100);
/*     */     }
/*     */     
/* 267 */     a("random.bow", 1.0F, 1.0F / (aI().nextFloat() * 0.4F + 0.8F));
/* 268 */     this.o.d(localzc);
/*     */   }
/*     */   
/*     */   public int cb() {
/* 272 */     return this.af.a(13);
/*     */   }
/*     */   
/*     */   public void a(int paramInt) {
/* 276 */     this.af.b(13, Byte.valueOf((byte)paramInt));
/*     */     
/* 278 */     this.ae = (paramInt == 1);
/* 279 */     if (paramInt == 1) {
/* 280 */       a(0.72F, 2.34F);
/*     */     } else {
/* 282 */       a(0.6F, 1.8F);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 288 */     super.a(paramdh);
/*     */     
/* 290 */     if (paramdh.b("SkeletonType", 99)) {
/* 291 */       int i = paramdh.d("SkeletonType");
/* 292 */       a(i);
/*     */     }
/*     */     
/* 295 */     bZ();
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 300 */     super.b(paramdh);
/* 301 */     paramdh.a("SkeletonType", (byte)cb());
/*     */   }
/*     */   
/*     */   public void c(int paramInt, add paramadd)
/*     */   {
/* 306 */     super.c(paramInt, paramadd);
/*     */     
/* 308 */     if ((!this.o.E) && (paramInt == 0)) {
/* 309 */       bZ();
/*     */     }
/*     */   }
/*     */   
/*     */   public double ad()
/*     */   {
/* 315 */     return super.ad() - 0.5D;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */