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
/*     */ public class zp
/*     */   extends ze
/*     */ {
/*     */   public zp(ahb paramahb)
/*     */   {
/*  21 */     super(paramahb);
/*  22 */     a(0.3125F, 0.3125F);
/*     */   }
/*     */   
/*     */   public zp(ahb paramahb, sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  26 */     super(paramahb, paramsv, paramDouble1, paramDouble2, paramDouble3);
/*     */     
/*  28 */     a(0.3125F, 0.3125F);
/*     */   }
/*     */   
/*     */   protected float e()
/*     */   {
/*  33 */     return f() ? 0.73F : super.e();
/*     */   }
/*     */   
/*     */   public zp(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/*  37 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/*  38 */     a(0.3125F, 0.3125F);
/*     */   }
/*     */   
/*     */   public boolean al()
/*     */   {
/*  43 */     return false;
/*     */   }
/*     */   
/*     */   public float a(agw paramagw, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/*  48 */     float f = super.a(paramagw, paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */     
/*  50 */     if ((f()) && (paramaji != ajn.h) && (paramaji != ajn.bq) && (paramaji != ajn.br) && (paramaji != ajn.bI)) {
/*  51 */       f = Math.min(0.8F, f);
/*     */     }
/*     */     
/*  54 */     return f;
/*     */   }
/*     */   
/*     */   protected void a(azu paramazu)
/*     */   {
/*  59 */     if (!this.o.E) {
/*  60 */       if (paramazu.g != null) {
/*  61 */         if (this.a != null) {
/*  62 */           if ((paramazu.g.a(ro.a(this.a), 8.0F)) && 
/*  63 */             (!paramazu.g.Z())) {
/*  64 */             this.a.f(5.0F);
/*     */           }
/*     */         }
/*     */         else {
/*  68 */           paramazu.g.a(ro.k, 5.0F);
/*     */         }
/*  70 */         if ((paramazu.g instanceof sv)) {
/*  71 */           int i = 0;
/*  72 */           if (this.o.r == rd.c) {
/*  73 */             i = 10;
/*  74 */           } else if (this.o.r == rd.d) {
/*  75 */             i = 40;
/*     */           }
/*  77 */           if (i > 0) {
/*  78 */             ((sv)paramazu.g).c(new rw(rv.v.H, 20 * i, 1));
/*     */           }
/*     */         }
/*     */       }
/*  82 */       this.o.a(this, this.s, this.t, this.u, 1.0F, false, this.o.O().b("mobGriefing"));
/*  83 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean R()
/*     */   {
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(ro paramro, float paramFloat)
/*     */   {
/*  94 */     return false;
/*     */   }
/*     */   
/*     */   protected void c()
/*     */   {
/*  99 */     this.af.a(10, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 103 */     return this.af.a(10) == 1;
/*     */   }
/*     */   
/*     */   public void a(boolean paramBoolean) {
/* 107 */     this.af.b(10, Byte.valueOf((byte)(paramBoolean ? 1 : 0)));
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */