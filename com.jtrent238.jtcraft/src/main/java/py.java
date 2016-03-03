/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class py implements Map
/*    */ {
/*  7 */   private final Map a = new java.util.LinkedHashMap();
/*    */   
/*    */   public int size()
/*    */   {
/* 11 */     return this.a.size();
/*    */   }
/*    */   
/*    */   public boolean isEmpty()
/*    */   {
/* 16 */     return this.a.isEmpty();
/*    */   }
/*    */   
/*    */   public boolean containsKey(Object paramObject)
/*    */   {
/* 21 */     return this.a.containsKey(paramObject.toString().toLowerCase());
/*    */   }
/*    */   
/*    */   public boolean containsValue(Object paramObject)
/*    */   {
/* 26 */     return this.a.containsKey(paramObject);
/*    */   }
/*    */   
/*    */   public Object get(Object paramObject)
/*    */   {
/* 31 */     return this.a.get(paramObject.toString().toLowerCase());
/*    */   }
/*    */   
/*    */   public Object a(String paramString, Object paramObject)
/*    */   {
/* 36 */     return this.a.put(paramString.toLowerCase(), paramObject);
/*    */   }
/*    */   
/*    */   public Object remove(Object paramObject)
/*    */   {
/* 41 */     return this.a.remove(paramObject.toString().toLowerCase());
/*    */   }
/*    */   
/*    */   public void putAll(Map paramMap)
/*    */   {
/* 46 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 47 */       a((String)localEntry.getKey(), localEntry.getValue());
/*    */     }
/*    */   }
/*    */   
/*    */   public void clear()
/*    */   {
/* 53 */     this.a.clear();
/*    */   }
/*    */   
/*    */ 
/*    */   public Set keySet()
/*    */   {
/* 59 */     return this.a.keySet();
/*    */   }
/*    */   
/*    */ 
/*    */   public java.util.Collection values()
/*    */   {
/* 65 */     return this.a.values();
/*    */   }
/*    */   
/*    */ 
/*    */   public Set entrySet()
/*    */   {
/* 71 */     return this.a.entrySet();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\py.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */