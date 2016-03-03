/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class yg
/*     */   extends td
/*     */   implements yb
/*     */ {
/*     */   public yg(ahb paramahb)
/*     */   {
/*  14 */     super(paramahb);
/*  15 */     this.b = 5;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  20 */     bb();
/*  21 */     float f = d(1.0F);
/*  22 */     if (f > 0.5F) {
/*  23 */       this.aU += 2;
/*     */     }
/*  25 */     super.e();
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  30 */     super.h();
/*  31 */     if ((!this.o.E) && (this.o.r == rd.a)) B();
/*     */   }
/*     */   
/*     */   protected String H()
/*     */   {
/*  36 */     return "game.hostile.swim";
/*     */   }
/*     */   
/*     */   protected String O()
/*     */   {
/*  41 */     return "game.hostile.swim.splash";
/*     */   }
/*     */   
/*     */   protected sa bR()
/*     */   {
/*  46 */     yz localyz = this.o.b(this, 16.0D);
/*  47 */     if ((localyz != null) && (p(localyz))) return localyz;
/*  48 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  53 */     if (aw()) return false;
/*  54 */     if (super.a(paramro, paramFloat)) {
/*  55 */       sa localsa = paramro.j();
/*  56 */       if ((this.l == localsa) || (this.m == localsa)) { return true;
/*     */       }
/*  58 */       if (localsa != this) {
/*  59 */         this.bm = localsa;
/*     */       }
/*  61 */       return true;
/*     */     }
/*  63 */     return false;
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  68 */     return "game.hostile.hurt";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  73 */     return "game.hostile.die";
/*     */   }
/*     */   
/*     */   protected String o(int paramInt)
/*     */   {
/*  78 */     if (paramInt > 4) {
/*  79 */       return "game.hostile.hurt.fall.big";
/*     */     }
/*  81 */     return "game.hostile.hurt.fall.small";
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean n(sa paramsa)
/*     */   {
/*  93 */     float f = (float)a(yj.e).e();
/*  94 */     int i = 0;
/*     */     
/*  96 */     if ((paramsa instanceof sv)) {
/*  97 */       f += afv.a(this, (sv)paramsa);
/*  98 */       i += afv.b(this, (sv)paramsa);
/*     */     }
/*     */     
/* 101 */     boolean bool = paramsa.a(ro.a(this), f);
/*     */     
/* 103 */     if (bool) {
/* 104 */       if (i > 0) {
/* 105 */         paramsa.g(-qh.a(this.y * 3.1415927F / 180.0F) * i * 0.5F, 0.1D, qh.b(this.y * 3.1415927F / 180.0F) * i * 0.5F);
/* 106 */         this.v *= 0.6D;
/* 107 */         this.x *= 0.6D;
/*     */       }
/*     */       
/* 110 */       int j = afv.a(this);
/* 111 */       if (j > 0) {
/* 112 */         paramsa.e(j * 4);
/*     */       }
/*     */       
/* 115 */       if ((paramsa instanceof sv)) afv.a((sv)paramsa, this);
/* 116 */       afv.b(this, paramsa);
/*     */     }
/*     */     
/* 119 */     return bool;
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa, float paramFloat)
/*     */   {
/* 124 */     if ((this.aB <= 0) && (paramFloat < 2.0F) && (paramsa.C.e > this.C.b) && (paramsa.C.b < this.C.e)) {
/* 125 */       this.aB = 20;
/* 126 */       n(paramsa);
/*     */     }
/*     */   }
/*     */   
/*     */   public float a(int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/* 132 */     return 0.5F - this.o.n(paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*     */   protected boolean j_() {
/* 136 */     int i = qh.c(this.s);
/* 137 */     int j = qh.c(this.C.b);
/* 138 */     int k = qh.c(this.u);
/* 139 */     if (this.o.b(ahn.a, i, j, k) > this.Z.nextInt(32)) { return false;
/*     */     }
/* 141 */     int m = this.o.k(i, j, k);
/*     */     
/* 143 */     if (this.o.P()) {
/* 144 */       int n = this.o.j;
/* 145 */       this.o.j = 10;
/* 146 */       m = this.o.k(i, j, k);
/* 147 */       this.o.j = n;
/*     */     }
/* 149 */     return m <= this.Z.nextInt(8);
/*     */   }
/*     */   
/*     */   public boolean by()
/*     */   {
/* 154 */     return (this.o.r != rd.a) && (j_()) && (super.by());
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/* 159 */     super.aD();
/*     */     
/* 161 */     bc().b(yj.e);
/*     */   }
/*     */   
/*     */   protected boolean aG()
/*     */   {
/* 166 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */