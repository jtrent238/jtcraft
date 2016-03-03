/*    */ 
/*    */ 
/*    */ public abstract class uc
/*    */   extends ui
/*    */ {
/*    */   protected sw a;
/*    */   protected int b;
/*    */   protected int c;
/*    */   protected int d;
/*    */   protected akn e;
/*    */   boolean f;
/*    */   float g;
/*    */   float h;
/*    */   
/*    */   public uc(sw paramsw)
/*    */   {
/* 17 */     this.a = paramsw;
/*    */   }
/*    */   
/*    */   public boolean a()
/*    */   {
/* 22 */     if (!this.a.E) return false;
/* 23 */     vv localvv = this.a.m();
/* 24 */     ayf localayf = localvv.e();
/* 25 */     if ((localayf == null) || (localayf.b()) || (!localvv.c())) { return false;
/*    */     }
/* 27 */     for (int i = 0; i < Math.min(localayf.e() + 2, localayf.d()); i++) {
/* 28 */       aye localaye = localayf.a(i);
/* 29 */       this.b = localaye.a;
/* 30 */       this.c = (localaye.b + 1);
/* 31 */       this.d = localaye.c;
/* 32 */       if (this.a.e(this.b, this.a.t, this.d) <= 2.25D) {
/* 33 */         this.e = a(this.b, this.c, this.d);
/* 34 */         if (this.e != null)
/* 35 */           return true;
/*    */       }
/*    */     }
/* 38 */     this.b = qh.c(this.a.s);
/* 39 */     this.c = qh.c(this.a.t + 1.0D);
/* 40 */     this.d = qh.c(this.a.u);
/* 41 */     this.e = a(this.b, this.c, this.d);
/* 42 */     return this.e != null;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 47 */     return !this.f;
/*    */   }
/*    */   
/*    */   public void c()
/*    */   {
/* 52 */     this.f = false;
/* 53 */     this.g = ((float)(this.b + 0.5F - this.a.s));
/* 54 */     this.h = ((float)(this.d + 0.5F - this.a.u));
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 59 */     float f1 = (float)(this.b + 0.5F - this.a.s);
/* 60 */     float f2 = (float)(this.d + 0.5F - this.a.u);
/* 61 */     float f3 = this.g * f1 + this.h * f2;
/* 62 */     if (f3 < 0.0F) {
/* 63 */       this.f = true;
/*    */     }
/*    */   }
/*    */   
/*    */   private akn a(int paramInt1, int paramInt2, int paramInt3) {
/* 68 */     aji localaji = this.a.o.a(paramInt1, paramInt2, paramInt3);
/* 69 */     if (localaji != ajn.ao) return null;
/* 70 */     return (akn)localaji;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */