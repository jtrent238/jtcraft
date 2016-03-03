/*     */ import com.mojang.authlib.GameProfile;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bll
/*     */   extends blg
/*     */ {
/*     */   private boolean a;
/*     */   private int c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private double g;
/*     */   private double h;
/*     */   
/*     */   public bll(ahb paramahb, GameProfile paramGameProfile)
/*     */   {
/*  23 */     super(paramahb, paramGameProfile);
/*     */     
/*  25 */     this.L = 0.0F;
/*  26 */     this.W = 0.0F;
/*  27 */     this.X = true;
/*     */     
/*  29 */     this.cc = 0.25F;
/*     */     
/*  31 */     this.j = 10.0D;
/*     */   }
/*     */   
/*     */   protected void e_()
/*     */   {
/*  36 */     this.L = 0.0F;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  41 */     return true;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2, int paramInt)
/*     */   {
/*  46 */     this.d = paramDouble1;
/*  47 */     this.e = paramDouble2;
/*  48 */     this.f = paramDouble3;
/*  49 */     this.g = paramFloat1;
/*  50 */     this.h = paramFloat2;
/*     */     
/*  52 */     this.c = paramInt;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  57 */     this.cc = 0.0F;
/*  58 */     super.h();
/*     */     
/*  60 */     this.aE = this.aF;
/*  61 */     double d1 = this.s - this.p;
/*  62 */     double d2 = this.u - this.r;
/*  63 */     float f1 = qh.a(d1 * d1 + d2 * d2) * 4.0F;
/*  64 */     if (f1 > 1.0F) f1 = 1.0F;
/*  65 */     this.aF += (f1 - this.aF) * 0.4F;
/*  66 */     this.aG += this.aF;
/*     */     
/*  68 */     if ((!this.a) && (aq()) && (this.bm.a[this.bm.c] != null)) {
/*  69 */       add localadd = this.bm.a[this.bm.c];
/*  70 */       a(this.bm.a[this.bm.c], localadd.b().d_(localadd));
/*  71 */       this.a = true;
/*  72 */     } else if ((this.a) && (!aq())) {
/*  73 */       bB();
/*  74 */       this.a = false;
/*     */     }
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/*  80 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  85 */     super.bq();
/*  86 */     if (this.c > 0) {
/*  87 */       double d1 = this.s + (this.d - this.s) / this.c;
/*  88 */       double d2 = this.t + (this.e - this.t) / this.c;
/*  89 */       double d3 = this.u + (this.f - this.u) / this.c;
/*     */       
/*  91 */       double d4 = this.g - this.y;
/*  92 */       while (d4 < -180.0D)
/*  93 */         d4 += 360.0D;
/*  94 */       while (d4 >= 180.0D) {
/*  95 */         d4 -= 360.0D;
/*     */       }
/*  97 */       this.y = ((float)(this.y + d4 / this.c));
/*  98 */       this.z = ((float)(this.z + (this.h - this.z) / this.c));
/*     */       
/* 100 */       this.c -= 1;
/* 101 */       b(d1, d2, d3);
/* 102 */       b(this.y, this.z);
/*     */     }
/* 104 */     this.br = this.bs;
/*     */     
/* 106 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/* 107 */     float f2 = (float)Math.atan(-this.w * 0.20000000298023224D) * 15.0F;
/* 108 */     if (f1 > 0.1F) f1 = 0.1F;
/* 109 */     if ((!this.D) || (aS() <= 0.0F)) f1 = 0.0F;
/* 110 */     if ((this.D) || (aS() <= 0.0F)) f2 = 0.0F;
/* 111 */     this.bs += (f1 - this.bs) * 0.4F;
/* 112 */     this.aJ += (f2 - this.aJ) * 0.8F;
/*     */   }
/*     */   
/*     */   public void c(int paramInt, add paramadd)
/*     */   {
/* 117 */     if (paramInt == 0) {
/* 118 */       this.bm.a[this.bm.c] = paramadd;
/*     */     } else {
/* 120 */       this.bm.b[(paramInt - 1)] = paramadd;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public float g()
/*     */   {
/* 127 */     return 1.82F;
/*     */   }
/*     */   
/*     */   public void a(fj paramfj)
/*     */   {
/* 132 */     bao.B().r.b().a(paramfj);
/*     */   }
/*     */   
/*     */   public boolean a(int paramInt, String paramString)
/*     */   {
/* 137 */     return false;
/*     */   }
/*     */   
/*     */   public r f_()
/*     */   {
/* 142 */     return new r(qh.c(this.s + 0.5D), qh.c(this.t + 0.5D), qh.c(this.u + 0.5D));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */