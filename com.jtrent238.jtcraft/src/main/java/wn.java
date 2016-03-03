/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class wn
/*     */   extends tg
/*     */ {
/*     */   private vk bq;
/*     */   
/*     */   public wn(ahb paramahb)
/*     */   {
/*  37 */     super(paramahb);
/*  38 */     a(0.6F, 0.8F);
/*     */     
/*  40 */     m().a(true);
/*  41 */     this.c.a(1, new uf(this));
/*  42 */     this.c.a(2, this.bp);
/*  43 */     this.c.a(3, this.bq = new vk(this, 0.6D, ade.aP, true));
/*  44 */     this.c.a(4, new tw(this, yz.class, 16.0F, 0.8D, 1.33D));
/*  45 */     this.c.a(5, new ug(this, 1.0D, 10.0F, 5.0F));
/*  46 */     this.c.a(6, new uw(this, 1.33D));
/*  47 */     this.c.a(7, new um(this, 0.3F));
/*  48 */     this.c.a(8, new uv(this));
/*  49 */     this.c.a(9, new ua(this, 0.8D));
/*  50 */     this.c.a(10, new vc(this, 0.8D));
/*  51 */     this.c.a(11, new un(this, yz.class, 10.0F));
/*     */     
/*  53 */     this.d.a(1, new vr(this, wg.class, 750, false));
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  58 */     super.c();
/*     */     
/*  60 */     this.af.a(18, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public void bp()
/*     */   {
/*  65 */     if (k().a()) {
/*  66 */       double d = k().b();
/*  67 */       if (d == 0.6D) {
/*  68 */         b(true);
/*  69 */         c(false);
/*  70 */       } else if (d == 1.33D) {
/*  71 */         b(false);
/*  72 */         c(true);
/*     */       } else {
/*  74 */         b(false);
/*  75 */         c(false);
/*     */       }
/*     */     } else {
/*  78 */       b(false);
/*  79 */       c(false);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/*  85 */     return (!bZ()) && (this.aa > 2400);
/*     */   }
/*     */   
/*     */   public boolean bk()
/*     */   {
/*  90 */     return true;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  95 */     super.aD();
/*     */     
/*  97 */     a(yj.a).a(10.0D);
/*  98 */     a(yj.d).a(0.30000001192092896D);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */   public void b(dh paramdh)
/*     */   {
/* 108 */     super.b(paramdh);
/* 109 */     paramdh.a("CatType", cg());
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 114 */     super.a(paramdh);
/* 115 */     s(paramdh.f("CatType"));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/* 120 */     if (bZ()) {
/* 121 */       if (ce()) {
/* 122 */         return "mob.cat.purr";
/*     */       }
/* 124 */       if (this.Z.nextInt(4) == 0) {
/* 125 */         return "mob.cat.purreow";
/*     */       }
/* 127 */       return "mob.cat.meow";
/*     */     }
/*     */     
/* 130 */     return "";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/* 135 */     return "mob.cat.hitt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/* 140 */     return "mob.cat.hitt";
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/* 145 */     return 0.4F;
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/* 150 */     return ade.aA;
/*     */   }
/*     */   
/*     */   public boolean n(sa paramsa)
/*     */   {
/* 155 */     return paramsa.a(ro.a(this), 3.0F);
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 160 */     if (aw()) return false;
/* 161 */     this.bp.a(false);
/* 162 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(boolean paramBoolean, int paramInt) {}
/*     */   
/*     */ 
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 171 */     add localadd = paramyz.bm.h();
/* 172 */     if (bZ()) {
/* 173 */       if ((e(paramyz)) && 
/* 174 */         (!this.o.E) && (!c(localadd))) {
/* 175 */         this.bp.a(!ca());
/*     */       }
/*     */       
/*     */     }
/* 179 */     else if ((this.bq.f()) && (localadd != null) && (localadd.b() == ade.aP) && (paramyz.f(this) < 9.0D)) {
/* 180 */       if (!paramyz.bE.d) localadd.b -= 1;
/* 181 */       if (localadd.b <= 0) {
/* 182 */         paramyz.bm.a(paramyz.bm.c, null);
/*     */       }
/*     */       
/* 185 */       if (!this.o.E) {
/* 186 */         if (this.Z.nextInt(3) == 0) {
/* 187 */           j(true);
/* 188 */           s(1 + this.o.s.nextInt(3));
/* 189 */           b(paramyz.aB().toString());
/* 190 */           i(true);
/* 191 */           this.bp.a(true);
/* 192 */           this.o.a(this, (byte)7);
/*     */         } else {
/* 194 */           i(false);
/* 195 */           this.o.a(this, (byte)6);
/*     */         }
/*     */       }
/* 198 */       return true;
/*     */     }
/*     */     
/* 201 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public wn b(rx paramrx)
/*     */   {
/* 206 */     wn localwn = new wn(this.o);
/* 207 */     if (bZ()) {
/* 208 */       localwn.b(b());
/* 209 */       localwn.j(true);
/* 210 */       localwn.s(cg());
/*     */     }
/* 212 */     return localwn;
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd)
/*     */   {
/* 217 */     return (paramadd != null) && (paramadd.b() == ade.aP);
/*     */   }
/*     */   
/*     */   public boolean a(wf paramwf)
/*     */   {
/* 222 */     if (paramwf == this) return false;
/* 223 */     if (!bZ()) return false;
/* 224 */     if (!(paramwf instanceof wn)) { return false;
/*     */     }
/* 226 */     wn localwn = (wn)paramwf;
/* 227 */     if (!localwn.bZ()) { return false;
/*     */     }
/* 229 */     return (ce()) && (localwn.ce());
/*     */   }
/*     */   
/*     */   public int cg() {
/* 233 */     return this.af.a(18);
/*     */   }
/*     */   
/*     */   public void s(int paramInt) {
/* 237 */     this.af.b(18, Byte.valueOf((byte)paramInt));
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean by()
/*     */   {
/* 243 */     if (this.o.s.nextInt(3) == 0) {
/* 244 */       return false;
/*     */     }
/* 246 */     if ((this.o.b(this.C)) && (this.o.a(this, this.C).isEmpty()) && (!this.o.d(this.C))) {
/* 247 */       int i = qh.c(this.s);
/* 248 */       int j = qh.c(this.C.b);
/* 249 */       int k = qh.c(this.u);
/* 250 */       if (j < 63) {
/* 251 */         return false;
/*     */       }
/*     */       
/* 254 */       aji localaji = this.o.a(i, j - 1, k);
/* 255 */       if ((localaji == ajn.c) || (localaji.o() == awt.j)) {
/* 256 */         return true;
/*     */       }
/*     */     }
/* 259 */     return false;
/*     */   }
/*     */   
/*     */ 
/*     */   public String b_()
/*     */   {
/* 265 */     if (bH()) return bG();
/* 266 */     if (bZ()) {
/* 267 */       return dd.a("entity.Cat.name");
/*     */     }
/* 269 */     return super.b_();
/*     */   }
/*     */   
/*     */   public sy a(sy paramsy)
/*     */   {
/* 274 */     paramsy = super.a(paramsy);
/*     */     
/* 276 */     if (this.o.s.nextInt(7) == 0) {
/* 277 */       for (int i = 0; i < 2; i++) {
/* 278 */         wn localwn = new wn(this.o);
/* 279 */         localwn.b(this.s, this.t, this.u, this.y, 0.0F);
/* 280 */         localwn.c(41536);
/* 281 */         this.o.d(localwn);
/*     */       }
/*     */     }
/* 284 */     return paramsy;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */