/*    */ 
/*    */ public class bhg
/*    */   extends bhr
/*    */ {
/*    */   public bix a;
/*    */   public bix b;
/*    */   public bix c;
/*    */   
/*    */   public bhg()
/*    */   {
/* 11 */     this.a = new bix(this, 0, 0).b(64, 64);
/* 12 */     this.a.a(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
/* 13 */     this.a.c = 1.0F;
/* 14 */     this.a.d = 7.0F;
/* 15 */     this.a.e = 15.0F;
/*    */     
/* 17 */     this.c = new bix(this, 0, 0).b(64, 64);
/* 18 */     this.c.a(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
/* 19 */     this.c.c = 8.0F;
/* 20 */     this.c.d = 7.0F;
/* 21 */     this.c.e = 15.0F;
/*    */     
/* 23 */     this.b = new bix(this, 0, 19).b(64, 64);
/* 24 */     this.b.a(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
/* 25 */     this.b.c = 1.0F;
/* 26 */     this.b.d = 6.0F;
/* 27 */     this.b.e = 1.0F;
/*    */   }
/*    */   
/*    */   public void a() {
/* 31 */     this.c.f = this.a.f;
/*    */     
/* 33 */     this.a.a(0.0625F);
/* 34 */     this.c.a(0.0625F);
/* 35 */     this.b.a(0.0625F);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */