/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ws
/*     */   extends wu
/*     */ {
/*     */   public float bp;
/*     */   public float bq;
/*     */   public float br;
/*     */   public float bs;
/*     */   public float bt;
/*     */   public float bu;
/*     */   public float bv;
/*     */   public float bw;
/*     */   private float bx;
/*     */   private float by;
/*     */   private float bz;
/*     */   private float bA;
/*     */   private float bB;
/*     */   private float bC;
/*     */   
/*     */   public ws(ahb paramahb)
/*     */   {
/*  25 */     super(paramahb);
/*  26 */     a(0.95F, 0.95F);
/*  27 */     this.by = (1.0F / (this.Z.nextFloat() + 1.0F) * 0.2F);
/*     */   }
/*     */   
/*     */   protected void aD()
/*     */   {
/*  32 */     super.aD();
/*     */     
/*  34 */     a(yj.a).a(10.0D);
/*     */   }
/*     */   
/*     */   protected String t()
/*     */   {
/*  39 */     return null;
/*     */   }
/*     */   
/*     */   protected String aT()
/*     */   {
/*  44 */     return null;
/*     */   }
/*     */   
/*     */   protected String aU()
/*     */   {
/*  49 */     return null;
/*     */   }
/*     */   
/*     */   protected float bf()
/*     */   {
/*  54 */     return 0.4F;
/*     */   }
/*     */   
/*     */   protected adb u()
/*     */   {
/*  59 */     return adb.d(0);
/*     */   }
/*     */   
/*     */   protected boolean g_()
/*     */   {
/*  64 */     return false;
/*     */   }
/*     */   
/*     */   protected void b(boolean paramBoolean, int paramInt)
/*     */   {
/*  69 */     int i = this.Z.nextInt(3 + paramInt) + 1;
/*  70 */     for (int j = 0; j < i; j++) {
/*  71 */       a(new add(ade.aR, 1, 0), 0.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean M()
/*     */   {
/*  77 */     return this.o.a(this.C.b(0.0D, -0.6000000238418579D, 0.0D), awt.h, this);
/*     */   }
/*     */   
/*     */ 
/*     */   public void e()
/*     */   {
/*  83 */     super.e();
/*     */     
/*  85 */     this.bq = this.bp;
/*  86 */     this.bs = this.br;
/*     */     
/*  88 */     this.bu = this.bt;
/*  89 */     this.bw = this.bv;
/*     */     
/*  91 */     this.bt += this.by;
/*  92 */     if (this.bt > 6.2831855F) {
/*  93 */       this.bt -= 6.2831855F;
/*  94 */       if (this.Z.nextInt(10) == 0) { this.by = (1.0F / (this.Z.nextFloat() + 1.0F) * 0.2F);
/*     */       }
/*     */     }
/*  97 */     if (M()) {
/*  98 */       if (this.bt < 3.1415927F) {
/*  99 */         f = this.bt / 3.1415927F;
/* 100 */         this.bv = (qh.a(f * f * 3.1415927F) * 3.1415927F * 0.25F);
/*     */         
/* 102 */         if (f > 0.75D) {
/* 103 */           this.bx = 1.0F;
/* 104 */           this.bz = 1.0F;
/*     */         } else {
/* 106 */           this.bz *= 0.8F;
/*     */         }
/*     */       } else {
/* 109 */         this.bv = 0.0F;
/* 110 */         this.bx *= 0.9F;
/* 111 */         this.bz *= 0.99F;
/*     */       }
/*     */       
/* 114 */       if (!this.o.E) {
/* 115 */         this.v = (this.bA * this.bx);
/* 116 */         this.w = (this.bB * this.bx);
/* 117 */         this.x = (this.bC * this.bx);
/*     */       }
/*     */       
/* 120 */       float f = qh.a(this.v * this.v + this.x * this.x);
/*     */       
/* 122 */       this.aM += (-(float)Math.atan2(this.v, this.x) * 180.0F / 3.1415927F - this.aM) * 0.1F;
/* 123 */       this.y = this.aM;
/* 124 */       this.br += 3.1415927F * this.bz * 1.5F;
/* 125 */       this.bp += (-(float)Math.atan2(f, this.w) * 180.0F / 3.1415927F - this.bp) * 0.1F;
/*     */     } else {
/* 127 */       this.bv = (qh.e(qh.a(this.bt)) * 3.1415927F * 0.25F);
/*     */       
/* 129 */       if (!this.o.E)
/*     */       {
/* 131 */         this.v = 0.0D;
/* 132 */         this.w -= 0.08D;
/* 133 */         this.w *= 0.9800000190734863D;
/* 134 */         this.x = 0.0D;
/*     */       }
/*     */       
/*     */ 
/* 138 */       this.bp = ((float)(this.bp + (-90.0F - this.bp) * 0.02D));
/*     */     }
/*     */   }
/*     */   
/*     */   public void e(float paramFloat1, float paramFloat2)
/*     */   {
/* 144 */     d(this.v, this.w, this.x);
/*     */   }
/*     */   
/*     */ 
/*     */   protected void bq()
/*     */   {
/* 150 */     this.aU += 1;
/*     */     
/*     */ 
/* 153 */     if (this.aU > 100) {
/* 154 */       this.bA = (this.bB = this.bC = 0.0F);
/* 155 */     } else if ((this.Z.nextInt(50) == 0) || (!this.ac) || ((this.bA == 0.0F) && (this.bB == 0.0F) && (this.bC == 0.0F))) {
/* 156 */       float f = this.Z.nextFloat() * 3.1415927F * 2.0F;
/* 157 */       this.bA = (qh.b(f) * 0.2F);
/* 158 */       this.bB = (-0.1F + this.Z.nextFloat() * 0.2F);
/* 159 */       this.bC = (qh.a(f) * 0.2F);
/*     */     }
/*     */     
/* 162 */     w();
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean by()
/*     */   {
/* 168 */     return (this.t > 45.0D) && (this.t < 63.0D) && (super.by());
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ws.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */