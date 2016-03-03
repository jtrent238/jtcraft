/*    */ import java.lang.reflect.ParameterizedType;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.List;
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
/*    */ final class bbk
/*    */   implements ParameterizedType
/*    */ {
/*    */   public Type[] getActualTypeArguments()
/*    */   {
/* 35 */     return new Type[] { String.class };
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public Type getRawType()
/*    */   {
/* 42 */     return List.class;
/*    */   }
/*    */   
/*    */   public Type getOwnerType()
/*    */   {
/* 47 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */