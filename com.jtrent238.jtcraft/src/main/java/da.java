/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class da
/*    */   implements cz
/*    */ {
/* 13 */   private static final Logger a = ;
/* 14 */   protected final Map c = a();
/*    */   
/*    */   protected Map a() {
/* 17 */     return Maps.newHashMap();
/*    */   }
/*    */   
/*    */   public Object a(Object paramObject)
/*    */   {
/* 22 */     return this.c.get(paramObject);
/*    */   }
/*    */   
/*    */   public void a(Object paramObject1, Object paramObject2)
/*    */   {
/* 27 */     if (this.c.containsKey(paramObject1)) {
/* 28 */       a.debug("Adding duplicate key '" + paramObject1 + "' to registry");
/*    */     }
/* 30 */     this.c.put(paramObject1, paramObject2);
/*    */   }
/*    */   
/*    */   public Set b() {
/* 34 */     return Collections.unmodifiableSet(this.c.keySet());
/*    */   }
/*    */   
/*    */   public boolean d(Object paramObject) {
/* 38 */     return this.c.containsKey(paramObject);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */