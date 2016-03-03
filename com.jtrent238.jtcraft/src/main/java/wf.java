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
/*     */ public abstract class wf
/*     */   extends rx
/*     */   implements ry
/*     */ {
/*     */   private int bp;
/*     */   private int bq;
/*     */   private yz br;
/*     */   
/*     */   public wf(ahb paramahb)
/*     */   {
/*  26 */     super(paramahb);
/*     */   }
/*     */   
/*     */   protected void bp()
/*     */   {
/*  31 */     if (d() != 0) this.bp = 0;
/*  32 */     super.bp();
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  37 */     super.e();
/*     */     
/*  39 */     if (d() != 0) { this.bp = 0;
/*     */     }
/*  41 */     if (this.bp > 0) {
/*  42 */       this.bp -= 1;
/*  43 */       String str = "heart";
/*  44 */       if (this.bp % 10 == 0) {
/*  45 */         double d1 = this.Z.nextGaussian() * 0.02D;
/*  46 */         double d2 = this.Z.nextGaussian() * 0.02D;
/*  47 */         double d3 = this.Z.nextGaussian() * 0.02D;
/*  48 */         this.o.a(str, this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*     */       }
/*     */     } else {
/*  51 */       this.bq = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa, float paramFloat) {
/*     */     Object localObject;
/*  57 */     if ((paramsa instanceof yz)) {
/*  58 */       if (paramFloat < 3.0F) {
/*  59 */         double d1 = paramsa.s - this.s;
/*  60 */         double d2 = paramsa.u - this.u;
/*  61 */         this.y = ((float)(Math.atan2(d2, d1) * 180.0D / 3.1415927410125732D) - 90.0F);
/*     */         
/*  63 */         this.bn = true;
/*     */       }
/*     */       
/*  66 */       localObject = (yz)paramsa;
/*  67 */       if ((((yz)localObject).bF() == null) || (!c(((yz)localObject).bF()))) {
/*  68 */         this.bm = null;
/*     */       }
/*  70 */     } else if ((paramsa instanceof wf)) {
/*  71 */       localObject = (wf)paramsa;
/*  72 */       if ((d() > 0) && (((wf)localObject).d() < 0)) {
/*  73 */         if (paramFloat < 2.5D) {
/*  74 */           this.bn = true;
/*     */         }
/*  76 */       } else if ((this.bp > 0) && (((wf)localObject).bp > 0)) {
/*  77 */         if (((wf)localObject).bm == null) { ((wf)localObject).bm = this;
/*     */         }
/*  79 */         if ((((wf)localObject).bm == this) && (paramFloat < 3.5D)) {
/*  80 */           localObject.bp += 1;
/*  81 */           this.bp += 1;
/*  82 */           this.bq += 1;
/*  83 */           if (this.bq % 4 == 0) {
/*  84 */             this.o.a("heart", this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, 0.0D, 0.0D, 0.0D);
/*     */           }
/*     */           
/*  87 */           if (this.bq == 60) b((wf)paramsa);
/*  88 */         } else { this.bq = 0;
/*     */         }
/*  90 */       } else { this.bq = 0;
/*  91 */         this.bm = null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(wf paramwf) {
/*  97 */     rx localrx = a(paramwf);
/*  98 */     if (localrx != null) {
/*  99 */       if ((this.br == null) && (paramwf.cd() != null)) {
/* 100 */         this.br = paramwf.cd();
/*     */       }
/*     */       
/* 103 */       if (this.br != null) {
/* 104 */         this.br.a(pp.x);
/*     */         
/* 106 */         if ((this instanceof wh)) {
/* 107 */           this.br.a(pc.H);
/*     */         }
/*     */       }
/*     */       
/* 111 */       c(6000);
/* 112 */       paramwf.c(6000);
/* 113 */       this.bp = 0;
/* 114 */       this.bq = 0;
/* 115 */       this.bm = null;
/* 116 */       paramwf.bm = null;
/* 117 */       paramwf.bq = 0;
/* 118 */       paramwf.bp = 0;
/* 119 */       localrx.c(41536);
/* 120 */       localrx.b(this.s, this.t, this.u, this.y, this.z);
/* 121 */       for (int i = 0; i < 7; i++) {
/* 122 */         double d1 = this.Z.nextGaussian() * 0.02D;
/* 123 */         double d2 = this.Z.nextGaussian() * 0.02D;
/* 124 */         double d3 = this.Z.nextGaussian() * 0.02D;
/* 125 */         this.o.a("heart", this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*     */       }
/* 127 */       this.o.d(localrx);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/* 133 */     if (aw()) return false;
/* 134 */     this.bo = 60;
/*     */     
/* 136 */     if (!bk()) {
/* 137 */       ti localti = a(yj.d);
/* 138 */       if (localti.a(h) == null) {
/* 139 */         localti.a(i);
/*     */       }
/*     */     }
/*     */     
/* 143 */     this.bm = null;
/* 144 */     this.bp = 0;
/* 145 */     return super.a(paramro, paramFloat);
/*     */   }
/*     */   
/*     */   public float a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 150 */     if (this.o.a(paramInt1, paramInt2 - 1, paramInt3) == ajn.c) return 10.0F;
/* 151 */     return this.o.n(paramInt1, paramInt2, paramInt3) - 0.5F;
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 156 */     super.b(paramdh);
/* 157 */     paramdh.a("InLove", this.bp);
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 162 */     super.a(paramdh);
/* 163 */     this.bp = paramdh.f("InLove");
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/* 168 */     if (this.bo > 0) { return null;
/*     */     }
/* 170 */     float f = 8.0F;
/* 171 */     List localList; int i; Object localObject; if (this.bp > 0) {
/* 172 */       localList = this.o.a(getClass(), this.C.b(f, f, f));
/* 173 */       for (i = 0; i < localList.size(); i++) {
/* 174 */         localObject = (wf)localList.get(i);
/* 175 */         if ((localObject != this) && (((wf)localObject).bp > 0)) {
/* 176 */           return (sa)localObject;
/*     */         }
/*     */       }
/*     */     }
/* 180 */     else if (d() == 0) {
/* 181 */       localList = this.o.a(yz.class, this.C.b(f, f, f));
/* 182 */       for (i = 0; i < localList.size(); i++) {
/* 183 */         localObject = (yz)localList.get(i);
/* 184 */         if ((((yz)localObject).bF() != null) && (c(((yz)localObject).bF()))) {
/* 185 */           return (sa)localObject;
/*     */         }
/*     */       }
/* 188 */     } else if (d() > 0) {
/* 189 */       localList = this.o.a(getClass(), this.C.b(f, f, f));
/* 190 */       for (i = 0; i < localList.size(); i++) {
/* 191 */         localObject = (wf)localList.get(i);
/* 192 */         if ((localObject != this) && (((wf)localObject).d() < 0)) {
/* 193 */           return (sa)localObject;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 198 */     return null;
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 203 */     int i = qh.c(this.s);
/* 204 */     int j = qh.c(this.C.b);
/* 205 */     int k = qh.c(this.u);
/* 206 */     return (this.o.a(i, j - 1, k) == ajn.c) && (this.o.j(i, j, k) > 8) && (super.by());
/*     */   }
/*     */   
/*     */   public int q()
/*     */   {
/* 211 */     return 120;
/*     */   }
/*     */   
/*     */   protected boolean v()
/*     */   {
/* 216 */     return false;
/*     */   }
/*     */   
/*     */   protected int e(yz paramyz)
/*     */   {
/* 221 */     return 1 + this.o.s.nextInt(3);
/*     */   }
/*     */   
/*     */   public boolean c(add paramadd) {
/* 225 */     return paramadd.b() == ade.O;
/*     */   }
/*     */   
/*     */   public boolean a(yz paramyz)
/*     */   {
/* 230 */     add localadd = paramyz.bm.h();
/* 231 */     if ((localadd != null) && (c(localadd)) && (d() == 0) && (this.bp <= 0)) {
/* 232 */       if (!paramyz.bE.d) {
/* 233 */         localadd.b -= 1;
/* 234 */         if (localadd.b <= 0) {
/* 235 */           paramyz.bm.a(paramyz.bm.c, null);
/*     */         }
/*     */       }
/* 238 */       f(paramyz);
/* 239 */       return true;
/*     */     }
/* 241 */     return super.a(paramyz);
/*     */   }
/*     */   
/*     */   public void f(yz paramyz) {
/* 245 */     this.bp = 600;
/* 246 */     this.br = paramyz;
/*     */     
/* 248 */     this.bm = null;
/* 249 */     this.o.a(this, (byte)18);
/*     */   }
/*     */   
/*     */   public yz cd() {
/* 253 */     return this.br;
/*     */   }
/*     */   
/*     */   public boolean ce() {
/* 257 */     return this.bp > 0;
/*     */   }
/*     */   
/*     */   public void cf() {
/* 261 */     this.bp = 0;
/*     */   }
/*     */   
/*     */   public boolean a(wf paramwf) {
/* 265 */     if (paramwf == this) return false;
/* 266 */     if (paramwf.getClass() != getClass()) return false;
/* 267 */     return (ce()) && (paramwf.ce());
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 272 */     if (paramByte == 18) {
/* 273 */       for (int i = 0; i < 7; i++) {
/* 274 */         double d1 = this.Z.nextGaussian() * 0.02D;
/* 275 */         double d2 = this.Z.nextGaussian() * 0.02D;
/* 276 */         double d3 = this.Z.nextGaussian() * 0.02D;
/* 277 */         this.o.a("heart", this.s + this.Z.nextFloat() * this.M * 2.0F - this.M, this.t + 0.5D + this.Z.nextFloat() * this.N, this.u + this.Z.nextFloat() * this.M * 2.0F - this.M, d1, d2, d3);
/*     */       }
/*     */     } else {
/* 280 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */