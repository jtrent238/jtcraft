/*    */ import java.lang.reflect.ParameterizedType;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class bgu
/*    */   implements ParameterizedType
/*    */ {
/*    */   bgu(bgt parambgt) {}
/*    */   
/*    */   public Type[] getActualTypeArguments()
/*    */   {
/* 24 */     return new Type[] { String.class };
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public Type getRawType()
/*    */   {
/* 31 */     return Collection.class;
/*    */   }
/*    */   
/*    */   public Type getOwnerType()
/*    */   {
/* 36 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */