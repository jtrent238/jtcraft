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
/*    */ public enum fm
/*    */ {
/*    */   private static final Map d;
/*    */   private final boolean e;
/*    */   private final String f;
/*    */   
/*    */   private fm(String paramString1, boolean paramBoolean)
/*    */   {
/* 62 */     this.f = paramString1;
/* 63 */     this.e = paramBoolean;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 67 */     return this.e;
/*    */   }
/*    */   
/*    */   public String b() {
/* 71 */     return this.f;
/*    */   }
/*    */   
/*    */   static
/*    */   {
/* 57 */     d = Maps.newHashMap();
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
/* 75 */     for (fm localfm : values()) {
/* 76 */       d.put(localfm.b(), localfm);
/*    */     }
/*    */   }
/*    */   
/*    */   public static fm a(String paramString) {
/* 81 */     return (fm)d.get(paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */