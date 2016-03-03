/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class apf
/*    */   extends aor
/*    */ {
/*    */   private adb a;
/*    */   private int i;
/*    */   
/*    */   public apf() {}
/*    */   
/*    */   public apf(adb paramadb, int paramInt)
/*    */   {
/* 18 */     this.a = paramadb;
/* 19 */     this.i = paramInt;
/*    */   }
/*    */   
/*    */ 
/*    */   public void b(dh paramdh)
/*    */   {
/* 25 */     super.b(paramdh);
/* 26 */     paramdh.a("Item", adb.b(this.a));
/* 27 */     paramdh.a("Data", this.i);
/*    */   }
/*    */   
/*    */   public void a(dh paramdh)
/*    */   {
/* 32 */     super.a(paramdh);
/* 33 */     this.a = adb.d(paramdh.f("Item"));
/* 34 */     this.i = paramdh.f("Data");
/*    */   }
/*    */   
/*    */   public ft m()
/*    */   {
/* 39 */     dh localdh = new dh();
/* 40 */     b(localdh);
/* 41 */     return new gf(this.c, this.d, this.e, 5, localdh);
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, int paramInt) {
/* 45 */     this.a = paramadb;
/* 46 */     this.i = paramInt;
/*    */   }
/*    */   
/*    */   public adb a() {
/* 50 */     return this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 54 */     return this.i;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\apf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */