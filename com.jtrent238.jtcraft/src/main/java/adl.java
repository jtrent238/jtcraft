/*    */ 
/*    */ 
/*    */ public class adl
/*    */   extends abh
/*    */ {
/*    */   protected final aji b;
/*    */   protected final String[] c;
/*    */   
/*    */   public adl(aji paramaji1, aji paramaji2, String[] paramArrayOfString)
/*    */   {
/* 11 */     super(paramaji1);
/*    */     
/* 13 */     this.b = paramaji2;
/* 14 */     this.c = paramArrayOfString;
/*    */     
/* 16 */     f(0);
/* 17 */     a(true);
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 22 */     return this.b.a(2, paramInt);
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 27 */     return paramInt;
/*    */   }
/*    */   
/*    */   public String a(add paramadd)
/*    */   {
/* 32 */     int i = paramadd.k();
/* 33 */     if ((i < 0) || (i >= this.c.length)) {
/* 34 */       i = 0;
/*    */     }
/* 36 */     return super.a() + "." + this.c[i];
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */