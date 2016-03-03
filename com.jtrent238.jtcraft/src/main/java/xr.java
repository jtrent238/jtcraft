/*     */ import java.util.List;
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
/*     */ public class xr
/*     */   extends xp
/*     */   implements aph
/*     */ {
/*  19 */   private boolean a = true;
/*  20 */   private int b = -1;
/*     */   
/*     */   public xr(ahb paramahb) {
/*  23 */     super(paramahb);
/*     */   }
/*     */   
/*     */   public xr(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3) {
/*  27 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3);
/*     */   }
/*     */   
/*     */   public int m()
/*     */   {
/*  32 */     return 5;
/*     */   }
/*     */   
/*     */   public aji o()
/*     */   {
/*  37 */     return ajn.bZ;
/*     */   }
/*     */   
/*     */   public int s()
/*     */   {
/*  42 */     return 1;
/*     */   }
/*     */   
/*     */   public int a()
/*     */   {
/*  47 */     return 5;
/*     */   }
/*     */   
/*     */   public boolean c(yz paramyz)
/*     */   {
/*  52 */     if (!this.o.E) {
/*  53 */       paramyz.a(this);
/*     */     }
/*     */     
/*  56 */     return true;
/*     */   }
/*     */   
/*     */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*     */   {
/*  61 */     boolean bool = !paramBoolean;
/*     */     
/*  63 */     if (bool != v()) {
/*  64 */       f(bool);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean v() {
/*  69 */     return this.a;
/*     */   }
/*     */   
/*     */   public void f(boolean paramBoolean) {
/*  73 */     this.a = paramBoolean;
/*     */   }
/*     */   
/*     */   public ahb w()
/*     */   {
/*  78 */     return this.o;
/*     */   }
/*     */   
/*     */   public double x()
/*     */   {
/*  83 */     return this.s;
/*     */   }
/*     */   
/*     */   public double aD()
/*     */   {
/*  88 */     return this.t;
/*     */   }
/*     */   
/*     */   public double aE()
/*     */   {
/*  93 */     return this.u;
/*     */   }
/*     */   
/*     */   public void h()
/*     */   {
/*  98 */     super.h();
/*     */     
/* 100 */     if ((!this.o.E) && (Z()) && (v())) {
/* 101 */       this.b -= 1;
/* 102 */       if (!aG()) {
/* 103 */         n(0);
/*     */         
/* 105 */         if (aF()) {
/* 106 */           n(4);
/* 107 */           e();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean aF() {
/* 114 */     if (api.a(this)) { return true;
/*     */     }
/* 116 */     List localList = this.o.a(xk.class, this.C.b(0.25D, 0.0D, 0.25D), sj.a);
/*     */     
/* 118 */     if (localList.size() > 0) {
/* 119 */       api.a(this, (xk)localList.get(0));
/*     */     }
/*     */     
/* 122 */     return false;
/*     */   }
/*     */   
/*     */   public void a(ro paramro)
/*     */   {
/* 127 */     super.a(paramro);
/*     */     
/* 129 */     a(adb.a(ajn.bZ), 1, 0.0F);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 134 */     super.b(paramdh);
/* 135 */     paramdh.a("TransferCooldown", this.b);
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 140 */     super.a(paramdh);
/* 141 */     this.b = paramdh.f("TransferCooldown");
/*     */   }
/*     */   
/*     */   public void n(int paramInt) {
/* 145 */     this.b = paramInt;
/*     */   }
/*     */   
/*     */   public boolean aG() {
/* 149 */     return this.b > 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\xr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */