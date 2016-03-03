/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.TypeAdapterFactory;
/*    */ import com.google.gson.reflect.TypeToken;
/*    */ import java.util.HashMap;
/*    */ import java.util.Locale;
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
/*    */ public class qf
/*    */   implements TypeAdapterFactory
/*    */ {
/*    */   public TypeAdapter create(Gson paramGson, TypeToken paramTypeToken)
/*    */   {
/* 23 */     Class localClass = paramTypeToken.getRawType();
/* 24 */     if (!localClass.isEnum()) {
/* 25 */       return null;
/*    */     }
/*    */     
/* 28 */     HashMap localHashMap = new HashMap();
/* 29 */     for (Object localObject : localClass.getEnumConstants()) {
/* 30 */       localHashMap.put(a(localObject), localObject);
/*    */     }
/*    */     
/* 33 */     return new qg(this, localHashMap);
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
/*    */   private String a(Object paramObject)
/*    */   {
/* 56 */     if ((paramObject instanceof Enum)) return ((Enum)paramObject).name().toLowerCase(Locale.US);
/* 57 */     return paramObject.toString().toLowerCase(Locale.US);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */