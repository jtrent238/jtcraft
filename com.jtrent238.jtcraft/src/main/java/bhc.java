/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bhc
/*     */   extends bhr
/*     */ {
/*     */   private bix a;
/*     */   private bix b;
/*     */   private bix c;
/*     */   private bix d;
/*     */   private bix e;
/*     */   private bix f;
/*     */   
/*     */   public bhc()
/*     */   {
/*  19 */     this.t = 64;
/*  20 */     this.u = 64;
/*     */     
/*  22 */     this.a = new bix(this, 0, 0);
/*  23 */     this.a.a(-3.0F, -3.0F, -3.0F, 6, 6, 6);
/*     */     
/*  25 */     bix localbix1 = new bix(this, 24, 0);
/*  26 */     localbix1.a(-4.0F, -6.0F, -2.0F, 3, 4, 1);
/*  27 */     this.a.a(localbix1);
/*  28 */     bix localbix2 = new bix(this, 24, 0);
/*  29 */     localbix2.i = true;
/*  30 */     localbix2.a(1.0F, -6.0F, -2.0F, 3, 4, 1);
/*  31 */     this.a.a(localbix2);
/*     */     
/*  33 */     this.b = new bix(this, 0, 16);
/*  34 */     this.b.a(-3.0F, 4.0F, -3.0F, 6, 12, 6);
/*  35 */     this.b.a(0, 34).a(-5.0F, 16.0F, 0.0F, 10, 6, 1);
/*     */     
/*  37 */     this.c = new bix(this, 42, 0);
/*  38 */     this.c.a(-12.0F, 1.0F, 1.5F, 10, 16, 1);
/*  39 */     this.e = new bix(this, 24, 16);
/*  40 */     this.e.a(-12.0F, 1.0F, 1.5F);
/*  41 */     this.e.a(-8.0F, 1.0F, 0.0F, 8, 12, 1);
/*     */     
/*  43 */     this.d = new bix(this, 42, 0);
/*  44 */     this.d.i = true;
/*  45 */     this.d.a(2.0F, 1.0F, 1.5F, 10, 16, 1);
/*  46 */     this.f = new bix(this, 24, 16);
/*  47 */     this.f.i = true;
/*  48 */     this.f.a(12.0F, 1.0F, 1.5F);
/*  49 */     this.f.a(0.0F, 1.0F, 0.0F, 8, 12, 1);
/*     */     
/*  51 */     this.b.a(this.c);
/*  52 */     this.b.a(this.d);
/*  53 */     this.c.a(this.e);
/*  54 */     this.d.a(this.f);
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  59 */     return 36;
/*     */   }
/*     */   
/*     */ 
/*     */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
/*     */   {
/*  65 */     we localwe = (we)paramsa;
/*  66 */     float f1; if (localwe.bP()) {
/*  67 */       f1 = 57.295776F;
/*  68 */       this.a.f = (paramFloat5 / 57.295776F);
/*  69 */       this.a.g = (3.1415927F - paramFloat4 / 57.295776F);
/*  70 */       this.a.h = 3.1415927F;
/*     */       
/*  72 */       this.a.a(0.0F, -2.0F, 0.0F);
/*  73 */       this.c.a(-3.0F, 0.0F, 3.0F);
/*  74 */       this.d.a(3.0F, 0.0F, 3.0F);
/*     */       
/*  76 */       this.b.f = 3.1415927F;
/*     */       
/*  78 */       this.c.f = -0.15707964F;
/*  79 */       this.c.g = -1.2566371F;
/*  80 */       this.e.g = -1.7278761F;
/*  81 */       this.d.f = this.c.f;
/*  82 */       this.d.g = (-this.c.g);
/*  83 */       this.f.g = (-this.e.g);
/*     */     } else {
/*  85 */       f1 = 57.295776F;
/*  86 */       this.a.f = (paramFloat5 / 57.295776F);
/*  87 */       this.a.g = (paramFloat4 / 57.295776F);
/*  88 */       this.a.h = 0.0F;
/*     */       
/*  90 */       this.a.a(0.0F, 0.0F, 0.0F);
/*  91 */       this.c.a(0.0F, 0.0F, 0.0F);
/*  92 */       this.d.a(0.0F, 0.0F, 0.0F);
/*     */       
/*  94 */       this.b.f = (0.7853982F + qh.b(paramFloat3 * 0.1F) * 0.15F);
/*  95 */       this.b.g = 0.0F;
/*     */       
/*  97 */       this.c.g = (qh.b(paramFloat3 * 1.3F) * 3.1415927F * 0.25F);
/*  98 */       this.d.g = (-this.c.g);
/*  99 */       this.e.g = (this.c.g * 0.5F);
/* 100 */       this.f.g = (-this.c.g * 0.5F);
/*     */     }
/*     */     
/* 103 */     this.a.a(paramFloat6);
/* 104 */     this.b.a(paramFloat6);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */