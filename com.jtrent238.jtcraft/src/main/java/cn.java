/*    */ 
/*    */ public class cn
/*    */   extends cw
/*    */ {
/*    */   private final String d;
/*    */   private Object e;
/*    */   
/*    */   public cn(String paramString)
/*    */   {
/* 10 */     this.d = paramString;
/*    */   }
/*    */   
/*    */   public void a(int paramInt, String paramString, Object paramObject)
/*    */   {
/* 15 */     if (this.d.equals(paramString)) {
/* 16 */       this.e = paramObject;
/*    */     }
/*    */     
/* 19 */     super.a(paramInt, paramString, paramObject);
/*    */   }
/*    */   
/*    */   public Object a(String paramString)
/*    */   {
/* 24 */     Object localObject = super.a(paramString);
/* 25 */     return localObject == null ? this.e : localObject;
/*    */   }
/*    */   
/*    */   public Object a(int paramInt)
/*    */   {
/* 30 */     Object localObject = super.a(paramInt);
/* 31 */     return localObject == null ? this.e : localObject;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */