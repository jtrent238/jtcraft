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
/*    */ public enum bbt
/*    */ {
/*    */   private static final Map c;
/*    */   private final String d;
/*    */   
/*    */   private bbt(String paramString1)
/*    */   {
/* 62 */     this.d = paramString1;
/*    */   }
/*    */   
/*    */   public static bbt a(String paramString)
/*    */   {
/* 67 */     return (bbt)c.get(paramString.toLowerCase());
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 58 */     c = Maps.newHashMap();
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
/* 71 */     for (bbt localbbt : values()) {
/* 72 */       c.put(localbbt.d, localbbt);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */