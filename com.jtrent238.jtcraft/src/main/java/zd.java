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
/*     */ public class zd
/*     */   extends sa
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private int d;
/*     */   private boolean e;
/*     */   
/*     */   public zd(ahb paramahb)
/*     */   {
/*  22 */     super(paramahb);
/*  23 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void c() {}
/*     */   
/*     */ 
/*     */   public boolean a(double paramDouble)
/*     */   {
/*  32 */     double d1 = this.C.a() * 4.0D;
/*  33 */     d1 *= 64.0D;
/*  34 */     return paramDouble < d1 * d1;
/*     */   }
/*     */   
/*     */   public zd(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  38 */     super(paramahb);
/*  39 */     this.d = 0;
/*     */     
/*  41 */     a(0.25F, 0.25F);
/*     */     
/*  43 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  44 */     this.L = 0.0F;
/*     */   }
/*     */   
/*     */   public void a(double paramDouble1, int paramInt, double paramDouble2)
/*     */   {
/*  49 */     double d1 = paramDouble1 - this.s;double d2 = paramDouble2 - this.u;
/*  50 */     float f = qh.a(d1 * d1 + d2 * d2);
/*     */     
/*  52 */     if (f > 12.0F) {
/*  53 */       this.a = (this.s + d1 / f * 12.0D);
/*  54 */       this.c = (this.u + d2 / f * 12.0D);
/*  55 */       this.b = (this.t + 8.0D);
/*     */     } else {
/*  57 */       this.a = paramDouble1;
/*  58 */       this.b = paramInt;
/*  59 */       this.c = paramDouble2;
/*     */     }
/*     */     
/*  62 */     this.d = 0;
/*  63 */     this.e = (this.Z.nextInt(5) > 0);
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/*  68 */     this.v = paramDouble1;
/*  69 */     this.w = paramDouble2;
/*  70 */     this.x = paramDouble3;
/*  71 */     if ((this.B == 0.0F) && (this.A == 0.0F)) {
/*  72 */       float f = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  73 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/*  74 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.1415927410125732D));
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  80 */     this.S = this.s;
/*  81 */     this.T = this.t;
/*  82 */     this.U = this.u;
/*  83 */     super.h();
/*     */     
/*  85 */     this.s += this.v;
/*  86 */     this.t += this.w;
/*  87 */     this.u += this.x;
/*     */     
/*  89 */     float f1 = qh.a(this.v * this.v + this.x * this.x);
/*  90 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/*  91 */     this.z = ((float)(Math.atan2(this.w, f1) * 180.0D / 3.1415927410125732D));
/*     */     
/*  93 */     while (this.z - this.B < -180.0F)
/*  94 */       this.B -= 360.0F;
/*  95 */     while (this.z - this.B >= 180.0F) {
/*  96 */       this.B += 360.0F;
/*     */     }
/*  98 */     while (this.y - this.A < -180.0F)
/*  99 */       this.A -= 360.0F;
/* 100 */     while (this.y - this.A >= 180.0F) {
/* 101 */       this.A += 360.0F;
/*     */     }
/* 103 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 104 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 106 */     if (!this.o.E) {
/* 107 */       double d1 = this.a - this.s;double d2 = this.c - this.u;
/* 108 */       float f3 = (float)Math.sqrt(d1 * d1 + d2 * d2);
/* 109 */       float f4 = (float)Math.atan2(d2, d1);
/* 110 */       double d3 = f1 + (f3 - f1) * 0.0025D;
/* 111 */       if (f3 < 1.0F) {
/* 112 */         d3 *= 0.8D;
/* 113 */         this.w *= 0.8D;
/*     */       }
/* 115 */       this.v = (Math.cos(f4) * d3);
/* 116 */       this.x = (Math.sin(f4) * d3);
/*     */       
/* 118 */       if (this.t < this.b) {
/* 119 */         this.w += (1.0D - this.w) * 0.014999999664723873D;
/*     */       } else {
/* 121 */         this.w += (-1.0D - this.w) * 0.014999999664723873D;
/*     */       }
/*     */     }
/*     */     
/*     */ 
/* 126 */     float f2 = 0.25F;
/* 127 */     if (M()) {
/* 128 */       for (int i = 0; i < 4; i++) {
/* 129 */         this.o.a("bubble", this.s - this.v * f2, this.t - this.w * f2, this.u - this.x * f2, this.v, this.w, this.x);
/*     */       }
/*     */       
/*     */     } else {
/* 133 */       this.o.a("portal", this.s - this.v * f2 + this.Z.nextDouble() * 0.6D - 0.3D, this.t - this.w * f2 - 0.5D, this.u - this.x * f2 + this.Z.nextDouble() * 0.6D - 0.3D, this.v, this.w, this.x);
/*     */     }
/*     */     
/* 136 */     if (!this.o.E) {
/* 137 */       b(this.s, this.t, this.u);
/*     */       
/* 139 */       this.d += 1;
/* 140 */       if ((this.d > 80) && (!this.o.E)) {
/* 141 */         B();
/* 142 */         if (this.e) {
/* 143 */           this.o.d(new xk(this.o, this.s, this.t, this.u, new add(ade.bv)));
/*     */         } else {
/* 145 */           this.o.c(2003, (int)Math.round(this.s), (int)Math.round(this.t), (int)Math.round(this.u), 0);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void b(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public void a(dh paramdh) {}
/*     */   
/*     */ 
/*     */   public float Y()
/*     */   {
/* 161 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/* 166 */     return 1.0F;
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/* 171 */     return 15728880;
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 176 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */