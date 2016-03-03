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
/*    */ 
/*    */ public enum fi
/*    */ {
/*    */   private static final Map f;
/*    */   private final boolean g;
/*    */   private final String h;
/*    */   
/*    */   private fi(String paramString1, boolean paramBoolean)
/*    */   {
/* 64 */     this.h = paramString1;
/* 65 */     this.g = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 69 */     return this.g;
/*    */   }
/*    */   
/*    */   public String b() {
/* 73 */     return this.h;
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 59 */     f = Maps.newHashMap();
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
/* 77 */     for (fi localfi : values()) {
/* 78 */       f.put(localfi.b(), localfi);
/*    */     }
/*    */   }
/*    */   
/*    */   public static fi a(String paramString) {
/* 83 */     return (fi)f.get(paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */