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
/*    */ public class t
/*    */ {
/*    */   public static boolean a(char paramChar)
/*    */   {
/* 34 */     return (paramChar != '§') && (paramChar >= ' ') && (paramChar != '');
/*    */   }
/*    */   
/* 37 */   public static final char[] a = { '/', '\n', '\r', '\t', '\000', '\f', '`', '?', '*', '\\', '<', '>', '|', '"', ':' };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static String a(String paramString)
/*    */   {
/* 46 */     StringBuilder localStringBuilder = new StringBuilder();
/*    */     
/* 48 */     for (char c : paramString.toCharArray()) {
/* 49 */       if (a(c)) {
/* 50 */         localStringBuilder.append(c);
/*    */       }
/*    */     }
/*    */     
/* 54 */     return localStringBuilder.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */