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
/*     */ public class zf
/*     */   extends sa
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   
/*     */   public zf(ahb paramahb)
/*     */   {
/*  21 */     super(paramahb);
/*  22 */     a(0.25F, 0.25F);
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  27 */     this.af.a(8, 5);
/*     */   }
/*     */   
/*     */   public boolean a(double paramDouble)
/*     */   {
/*  32 */     return paramDouble < 4096.0D;
/*     */   }
/*     */   
/*     */   public zf(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, add paramadd) {
/*  36 */     super(paramahb);
/*  37 */     this.a = 0;
/*     */     
/*  39 */     a(0.25F, 0.25F);
/*     */     
/*  41 */     b(paramDouble1, paramDouble2, paramDouble3);
/*  42 */     this.L = 0.0F;
/*     */     
/*  44 */     int i = 1;
/*  45 */     if ((paramadd != null) && (paramadd.p())) {
/*  46 */       this.af.b(8, paramadd);
/*     */       
/*  48 */       dh localdh1 = paramadd.q();
/*  49 */       dh localdh2 = localdh1.m("Fireworks");
/*  50 */       if (localdh2 != null) {
/*  51 */         i += localdh2.d("Flight");
/*     */       }
/*     */     }
/*  54 */     this.v = (this.Z.nextGaussian() * 0.001D);
/*  55 */     this.x = (this.Z.nextGaussian() * 0.001D);
/*  56 */     this.w = 0.05D;
/*     */     
/*  58 */     this.b = (10 * i + this.Z.nextInt(6) + this.Z.nextInt(7));
/*     */   }
/*     */   
/*     */   public void i(double paramDouble1, double paramDouble2, double paramDouble3)
/*     */   {
/*  63 */     this.v = paramDouble1;
/*  64 */     this.w = paramDouble2;
/*  65 */     this.x = paramDouble3;
/*  66 */     if ((this.B == 0.0F) && (this.A == 0.0F)) {
/*  67 */       float f = qh.a(paramDouble1 * paramDouble1 + paramDouble3 * paramDouble3);
/*  68 */       this.A = (this.y = (float)(Math.atan2(paramDouble1, paramDouble3) * 180.0D / 3.1415927410125732D));
/*  69 */       this.B = (this.z = (float)(Math.atan2(paramDouble2, f) * 180.0D / 3.1415927410125732D));
/*     */     }
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  75 */     this.S = this.s;
/*  76 */     this.T = this.t;
/*  77 */     this.U = this.u;
/*  78 */     super.h();
/*     */     
/*  80 */     this.v *= 1.15D;
/*  81 */     this.x *= 1.15D;
/*  82 */     this.w += 0.04D;
/*  83 */     d(this.v, this.w, this.x);
/*     */     
/*  85 */     float f = qh.a(this.v * this.v + this.x * this.x);
/*  86 */     this.y = ((float)(Math.atan2(this.v, this.x) * 180.0D / 3.1415927410125732D));
/*  87 */     this.z = ((float)(Math.atan2(this.w, f) * 180.0D / 3.1415927410125732D));
/*     */     
/*  89 */     while (this.z - this.B < -180.0F)
/*  90 */       this.B -= 360.0F;
/*  91 */     while (this.z - this.B >= 180.0F) {
/*  92 */       this.B += 360.0F;
/*     */     }
/*  94 */     while (this.y - this.A < -180.0F)
/*  95 */       this.A -= 360.0F;
/*  96 */     while (this.y - this.A >= 180.0F) {
/*  97 */       this.A += 360.0F;
/*     */     }
/*  99 */     this.z = (this.B + (this.z - this.B) * 0.2F);
/* 100 */     this.y = (this.A + (this.y - this.A) * 0.2F);
/*     */     
/* 102 */     if (this.a == 0) {
/* 103 */       this.o.a(this, "fireworks.launch", 3.0F, 1.0F);
/*     */     }
/*     */     
/* 106 */     this.a += 1;
/* 107 */     if ((this.o.E) && (this.a % 2 < 2)) {
/* 108 */       this.o.a("fireworksSpark", this.s, this.t - 0.3D, this.u, this.Z.nextGaussian() * 0.05D, -this.w * 0.5D, this.Z.nextGaussian() * 0.05D);
/*     */     }
/* 110 */     if ((!this.o.E) && (this.a > this.b)) {
/* 111 */       this.o.a(this, (byte)17);
/* 112 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/* 118 */     if ((paramByte == 17) && (this.o.E)) {
/* 119 */       add localadd = this.af.f(8);
/* 120 */       dh localdh = null;
/* 121 */       if ((localadd != null) && (localadd.p())) {
/* 122 */         localdh = localadd.q().m("Fireworks");
/*     */       }
/* 124 */       this.o.a(this.s, this.t, this.u, this.v, this.w, this.x, localdh);
/*     */     }
/* 126 */     super.a(paramByte);
/*     */   }
/*     */   
/*     */ 
/*     */   public void b(dh paramdh)
/*     */   {
/* 132 */     paramdh.a("Life", this.a);
/* 133 */     paramdh.a("LifeTime", this.b);
/* 134 */     add localadd = this.af.f(8);
/* 135 */     if (localadd != null) {
/* 136 */       dh localdh = new dh();
/* 137 */       localadd.b(localdh);
/* 138 */       paramdh.a("FireworksItem", localdh);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(dh paramdh)
/*     */   {
/* 145 */     this.a = paramdh.f("Life");
/* 146 */     this.b = paramdh.f("LifeTime");
/*     */     
/* 148 */     dh localdh = paramdh.m("FireworksItem");
/* 149 */     if (localdh != null) {
/* 150 */       add localadd = add.a(localdh);
/* 151 */       if (localadd != null) {
/* 152 */         this.af.b(8, localadd);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public float Y()
/*     */   {
/* 159 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public float d(float paramFloat)
/*     */   {
/* 164 */     return super.d(paramFloat);
/*     */   }
/*     */   
/*     */   public int c(float paramFloat)
/*     */   {
/* 169 */     return super.c(paramFloat);
/*     */   }
/*     */   
/*     */   public boolean av()
/*     */   {
/* 174 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */