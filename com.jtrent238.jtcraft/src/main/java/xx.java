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
/*     */ public class xx
/*     */   extends yg
/*     */ {
/*  14 */   private float bp = 0.5F;
/*     */   
/*     */   private int bq;
/*     */   private int br;
/*     */   
/*     */   public xx(ahb paramahb)
/*     */   {
/*  21 */     super(paramahb);
/*     */     
/*  23 */     this.ae = true;
/*  24 */     this.b = 10;
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  29 */     super.aD();
/*  30 */     a(yj.e).a(6.0D);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  35 */     super.c();
/*     */     
/*  37 */     this.af.a(16, new Byte((byte)0));
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  42 */     return "mob.blaze.breathe";
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  47 */     return "mob.blaze.hit";
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  52 */     return "mob.blaze.death";
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/*  57 */     return 15728880;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/*  62 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/*  67 */     if (!this.o.E)
/*     */     {
/*  69 */       if (L()) {
/*  70 */         a(ro.e, 1.0F);
/*     */       }
/*     */       
/*  73 */       this.bq -= 1;
/*  74 */       if (this.bq <= 0) {
/*  75 */         this.bq = 100;
/*  76 */         this.bp = (0.5F + (float)this.Z.nextGaussian() * 3.0F);
/*     */       }
/*     */       
/*  79 */       if ((bT() != null) && (bT().t + bT().g() > this.t + g() + this.bp)) {
/*  80 */         this.w += (0.30000001192092896D - this.w) * 0.30000001192092896D;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*  85 */     if (this.Z.nextInt(24) == 0) {
/*  86 */       this.o.a(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D, "fire.fire", 1.0F + this.Z.nextFloat(), this.Z.nextFloat() * 0.7F + 0.3F);
/*     */     }
/*     */     
/*     */ 
/*  90 */     if ((!this.D) && (this.w < 0.0D)) {
/*  91 */       this.w *= 0.6D;
/*     */     }
/*     */     
/*  94 */     for (int i = 0; i < 2; i++) {
/*  95 */       this.o.a("largesmoke", this.s + (this.Z.nextDouble() - 0.5D) * this.M, this.t + this.Z.nextDouble() * this.N, this.u + (this.Z.nextDouble() - 0.5D) * this.M, 0.0D, 0.0D, 0.0D);
/*     */     }
/*     */     
/*  98 */     super.e();
/*     */   }
/*     */   
/*     */   protected void a(sa paramsa, float paramFloat)
/*     */   {
/* 103 */     if ((this.aB <= 0) && (paramFloat < 2.0F) && (paramsa.C.e > this.C.b) && (paramsa.C.b < this.C.e)) {
/* 104 */       this.aB = 20;
/* 105 */       n(paramsa);
/* 106 */     } else if (paramFloat < 30.0F) {
/* 107 */       double d1 = paramsa.s - this.s;
/* 108 */       double d2 = paramsa.C.b + paramsa.N / 2.0F - (this.t + this.N / 2.0F);
/* 109 */       double d3 = paramsa.u - this.u;
/*     */       
/* 111 */       if (this.aB == 0) {
/* 112 */         this.br += 1;
/* 113 */         if (this.br == 1) {
/* 114 */           this.aB = 60;
/* 115 */           a(true);
/* 116 */         } else if (this.br <= 4) {
/* 117 */           this.aB = 6;
/*     */         } else {
/* 119 */           this.aB = 100;
/* 120 */           this.br = 0;
/* 121 */           a(false);
/*     */         }
/*     */         
/* 124 */         if (this.br > 1) {
/* 125 */           float f = qh.c(paramFloat) * 0.5F;
/*     */           
/* 127 */           this.o.a(null, 1009, (int)this.s, (int)this.t, (int)this.u, 0);
/* 128 */           for (int i = 0; i < 1; i++) {
/* 129 */             zi localzi = new zi(this.o, this, d1 + this.Z.nextGaussian() * f, d2, d3 + this.Z.nextGaussian() * f);
/* 130 */             localzi.t = (this.t + this.N / 2.0F + 0.5D);
/* 131 */             this.o.d(localzi);
/*     */           }
/*     */         }
/*     */       }
/*     */       
/* 136 */       this.y = ((float)(Math.atan2(d3, d1) * 180.0D / 3.1415927410125732D) - 90.0F);
/*     */       
/* 138 */       this.bn = true;
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   protected void b(float paramFloat) {}
/*     */   
/*     */ 
/*     */   protected adb u()
/*     */   {
/* 148 */     return ade.bj;
/*     */   }
/*     */   
/*     */   public boolean al()
/*     */   {
/* 153 */     return bZ();
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/* 158 */     if (paramBoolean) {
/* 159 */       int i = this.Z.nextInt(2 + paramInt);
/* 160 */       for (int j = 0; j < i; j++) {
/* 161 */         a(ade.bj, 1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean bZ() {
/* 167 */     return (this.af.a(16) & 0x1) != 0;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 171 */     byte b = this.af.a(16);
/* 172 */     if (paramBoolean) {
/* 173 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 175 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     }
/* 177 */     this.af.b(16, Byte.valueOf(b));
/*     */   }
/*     */   
/*     */   protected boolean j_()
/*     */   {
/* 182 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */