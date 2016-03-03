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
/*     */ public class xv
/*     */   extends xl
/*     */ {
/*  16 */   private int a = -1;
/*     */   
/*     */   public xv(ahb paramahb) {
/*  19 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public xv(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  23 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public int m()
/*     */   {
/*  28 */     return 3;
/*     */   }
/*     */   
/*     */   public aji o()
/*     */   {
/*  33 */     return ajn.W;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  38 */     super.h();
/*     */     
/*  40 */     if (this.a > 0) {
/*  41 */       this.a -= 1;
/*  42 */       this.o.a("smoke", this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D);
/*  43 */     } else if (this.a == 0) {
/*  44 */       c(this.v * this.v + this.x * this.x);
/*     */     }
/*     */     
/*  47 */     if (this.E) {
/*  48 */       double d = this.v * this.v + this.x * this.x;
/*     */       
/*  50 */       if (d >= 0.009999999776482582D) {
/*  51 */         c(d);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/*  58 */     super.a(paramro);
/*     */     
/*  60 */     double d = this.v * this.v + this.x * this.x;
/*     */     
/*  62 */     if (!paramro.c()) {
/*  63 */       a(new add(ajn.W, 1), 0.0F);
/*     */     }
/*     */     
/*  66 */     if ((paramro.o()) || (paramro.c()) || (d >= 0.009999999776482582D)) {
/*  67 */       c(d);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void c(double paramDouble) {
/*  72 */     if (!this.o.E) {
/*  73 */       double d = Math.sqrt(paramDouble);
/*  74 */       if (d > 5.0D) d = 5.0D;
/*  75 */       this.o.a(this, this.s, this.t, this.u, (float)(4.0D + this.Z.nextDouble() * 1.5D * d), true);
/*  76 */       B();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void b(float paramFloat)
/*     */   {
/*  82 */     if (paramFloat >= 3.0F) {
/*  83 */       float f = paramFloat / 10.0F;
/*  84 */       c(f * f);
/*     */     }
/*     */     
/*  87 */     super.b(paramFloat);
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/*  92 */     if ((paramBoolean) && (this.a < 0)) {
/*  93 */       e();
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(byte paramByte)
/*     */   {
/*  99 */     if (paramByte == 10) {
/* 100 */       e();
/*     */     } else {
/* 102 */       super.a(paramByte);
/*     */     }
/*     */   }
/*     */   
/*     */   public void e() {
/* 107 */     this.a = 80;
/*     */     
/* 109 */     if (!this.o.E) {
/* 110 */       this.o.a(this, (byte)10);
/* 111 */       this.o.a(this, "game.tnt.primed", 1.0F, 1.0F);
/*     */     }
/*     */   }
/*     */   
/*     */   public int f() {
/* 116 */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean v() {
/* 120 */     return this.a > -1;
/*     */   }
/*     */   
/*     */   public float a(agw paramagw, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*     */   {
/* 125 */     if ((v()) && ((aje.a(paramaji)) || (aje.b_(paramahb, paramInt1, paramInt2 + 1, paramInt3)))) {
/* 126 */       return 0.0F;
/*     */     }
/*     */     
/* 129 */     return super.a(paramagw, paramahb, paramInt1, paramInt2, paramInt3, paramaji);
/*     */   }
/*     */   
/*     */   public boolean a(agw paramagw, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji, float paramFloat)
/*     */   {
/* 134 */     if ((v()) && ((aje.a(paramaji)) || (aje.b_(paramahb, paramInt1, paramInt2 + 1, paramInt3)))) { return false;
/*     */     }
/* 136 */     return super.a(paramagw, paramahb, paramInt1, paramInt2, paramInt3, paramaji, paramFloat);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 141 */     super.a(paramdh);
/* 142 */     if (paramdh.b("TNTFuse", 99)) this.a = paramdh.f("TNTFuse");
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 147 */     super.b(paramdh);
/* 148 */     paramdh.a("TNTFuse", this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */