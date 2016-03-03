/*    */ 
/*    */ public class ra
/*    */   implements rb
/*    */ {
/*    */   private String a;
/*    */   private rb b;
/*    */   private rb c;
/*    */   
/*    */   public ra(String paramString, rb paramrb1, rb paramrb2)
/*    */   {
/* 11 */     this.a = paramString;
/* 12 */     if (paramrb1 == null) paramrb1 = paramrb2;
/* 13 */     if (paramrb2 == null) paramrb2 = paramrb1;
/* 14 */     this.b = paramrb1;
/* 15 */     this.c = paramrb2;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return this.b.a() + this.c.a();
/*    */   }
/*    */   
/*    */   public boolean a(rb paramrb) {
/* 24 */     return (this.b == paramrb) || (this.c == paramrb);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 29 */     if (this.b.k_()) return this.b.b();
/* 30 */     if (this.c.k_()) return this.c.b();
/* 31 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean k_()
/*    */   {
/* 36 */     return (this.b.k_()) || (this.c.k_());
/*    */   }
/*    */   
/*    */   public add a(int paramInt)
/*    */   {
/* 41 */     if (paramInt >= this.b.a()) return this.c.a(paramInt - this.b.a());
/* 42 */     return this.b.a(paramInt);
/*    */   }
/*    */   
/*    */   public add a(int paramInt1, int paramInt2)
/*    */   {
/* 47 */     if (paramInt1 >= this.b.a()) return this.c.a(paramInt1 - this.b.a(), paramInt2);
/* 48 */     return this.b.a(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public add a_(int paramInt)
/*    */   {
/* 53 */     if (paramInt >= this.b.a()) return this.c.a_(paramInt - this.b.a());
/* 54 */     return this.b.a_(paramInt);
/*    */   }
/*    */   
/*    */   public void a(int paramInt, add paramadd)
/*    */   {
/* 59 */     if (paramInt >= this.b.a()) this.c.a(paramInt - this.b.a(), paramadd); else {
/* 60 */       this.b.a(paramInt, paramadd);
/*    */     }
/*    */   }
/*    */   
/*    */   public int d() {
/* 65 */     return this.b.d();
/*    */   }
/*    */   
/*    */   public void e()
/*    */   {
/* 70 */     this.b.e();
/* 71 */     this.c.e();
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 76 */     return (this.b.a(paramyz)) && (this.c.a(paramyz));
/*    */   }
/*    */   
/*    */   public void f()
/*    */   {
/* 81 */     this.b.f();
/* 82 */     this.c.f();
/*    */   }
/*    */   
/*    */   public void l_()
/*    */   {
/* 87 */     this.b.l_();
/* 88 */     this.c.l_();
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt, add paramadd)
/*    */   {
/* 93 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */