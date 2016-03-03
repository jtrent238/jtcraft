/*    */ import java.lang.reflect.ParameterizedType;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Map;
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
/*    */ public final class bgt
/*    */   implements ParameterizedType
/*    */ {
/*    */   public Type[] getActualTypeArguments()
/*    */   {
/* 20 */     return new Type[] { String.class, new bgu(this) };
/*    */   }
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
/*    */   public Type getRawType()
/*    */   {
/* 44 */     return Map.class;
/*    */   }
/*    */   
/*    */   public Type getOwnerType()
/*    */   {
/* 49 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */