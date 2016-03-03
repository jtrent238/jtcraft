/*    */ 
/*    */ 
/*    */ 
/*    */ public class abr
/*    */   extends abh
/*    */ {
/*    */   private final aji b;
/*    */   private String[] c;
/*    */   
/*    */   public abr(aji paramaji, boolean paramBoolean)
/*    */   {
/* 12 */     super(paramaji);
/* 13 */     this.b = paramaji;
/*    */     
/* 15 */     if (paramBoolean) {
/* 16 */       f(0);
/* 17 */       a(true);
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(add paramadd, int paramInt)
/*    */   {
/* 23 */     return this.b.i(paramadd.k());
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 28 */     return this.b.a(0, paramInt);
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 33 */     return paramInt;
/*    */   }
/*    */   
/*    */   public abr a(String[] paramArrayOfString) {
/* 37 */     this.c = paramArrayOfString;
/* 38 */     return this;
/*    */   }
/*    */   
/*    */   public String a(add paramadd)
/*    */   {
/* 43 */     if (this.c == null) {
/* 44 */       return super.a(paramadd);
/*    */     }
/* 46 */     int i = paramadd.k();
/* 47 */     if ((i >= 0) && (i < this.c.length)) {
/* 48 */       return super.a(paramadd) + "." + this.c[i];
/*    */     }
/* 50 */     return super.a(paramadd);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\abr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */