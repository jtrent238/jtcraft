/*    */ 
/*    */ 
/*    */ 
/*    */ public class adg
/*    */   extends abh
/*    */ {
/*    */   private final alt b;
/*    */   
/*    */   public adg(alt paramalt)
/*    */   {
/* 11 */     super(paramalt);
/* 12 */     this.b = paramalt;
/*    */     
/* 14 */     f(0);
/* 15 */     a(true);
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 20 */     return paramInt | 0x4;
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 25 */     return this.b.a(0, paramInt);
/*    */   }
/*    */   
/*    */   public int a(add paramadd, int paramInt)
/*    */   {
/* 30 */     return this.b.i(paramadd.k());
/*    */   }
/*    */   
/*    */   public String a(add paramadd)
/*    */   {
/* 35 */     int i = paramadd.k();
/* 36 */     if ((i < 0) || (i >= this.b.e().length)) {
/* 37 */       i = 0;
/*    */     }
/* 39 */     return super.a() + "." + this.b.e()[i];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */