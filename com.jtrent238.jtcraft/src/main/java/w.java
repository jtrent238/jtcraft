/*    */ import com.google.common.collect.Maps;
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
/*    */ 
/*    */ public enum w
/*    */ {
/*    */   private static final Map j;
/*    */   private static final Map k;
/*    */   private final String l;
/*    */   private final int m;
/*    */   
/*    */   private w(String paramString1, int paramInt1)
/*    */   {
/* 24 */     this.l = paramString1;
/* 25 */     this.m = paramInt1;
/*    */   }
/*    */   
/*    */   public String a() {
/* 29 */     return this.l;
/*    */   }
/*    */   
/*    */   public int b() {
/* 33 */     return this.m;
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 18 */     j = Maps.newHashMap();
/* 19 */     k = Maps.newHashMap();
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
/* 37 */     for (w localw : values()) {
/* 38 */       if ((j.containsKey(localw.a())) || (k.containsKey(Integer.valueOf(localw.b())))) {
/* 39 */         throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + localw);
/*    */       }
/* 41 */       j.put(localw.a(), localw);
/* 42 */       k.put(Integer.valueOf(localw.b()), localw);
/*    */     }
/*    */   }
/*    */   
/*    */   public static w a(String paramString) {
/* 47 */     return (w)j.get(paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */