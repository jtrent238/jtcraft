/*    */ 
/*    */ public class re
/*    */   implements rf
/*    */ {
/*    */   private final rf a;
/*    */   private final boolean b;
/*    */   private final boolean c;
/*    */   
/*    */   public re(rf paramrf, boolean paramBoolean1, boolean paramBoolean2)
/*    */   {
/* 11 */     this.a = paramrf;
/* 12 */     this.b = paramBoolean1;
/* 13 */     this.c = paramBoolean2;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 18 */     return this.a.a();
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 23 */     return this.a.b();
/*    */   }
/*    */   
/*    */   public float c()
/*    */   {
/* 28 */     if (this.b) return this.a.d();
/* 29 */     return this.a.c();
/*    */   }
/*    */   
/*    */   public float d()
/*    */   {
/* 34 */     if (this.b) return this.a.c();
/* 35 */     return this.a.d();
/*    */   }
/*    */   
/*    */   public float a(double paramDouble)
/*    */   {
/* 40 */     float f = d() - c();
/* 41 */     return c() + f * ((float)paramDouble / 16.0F);
/*    */   }
/*    */   
/*    */   public float e()
/*    */   {
/* 46 */     if (this.c) return this.a.e();
/* 47 */     return this.a.e();
/*    */   }
/*    */   
/*    */   public float f()
/*    */   {
/* 52 */     if (this.c) return this.a.e();
/* 53 */     return this.a.f();
/*    */   }
/*    */   
/*    */   public float b(double paramDouble)
/*    */   {
/* 58 */     float f = f() - e();
/* 59 */     return e() + f * ((float)paramDouble / 16.0F);
/*    */   }
/*    */   
/*    */   public String g()
/*    */   {
/* 64 */     return this.a.g();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\re.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */