/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qn
/*    */ {
/*  8 */   private static final Pattern a = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
/*    */   
/*    */   public static String a(int paramInt) {
/* 11 */     int i = paramInt / 20;
/* 12 */     int j = i / 60;
/* 13 */     i %= 60;
/*    */     
/* 15 */     if (i < 10) {
/* 16 */       return j + ":0" + i;
/*    */     }
/* 18 */     return j + ":" + i;
/*    */   }
/*    */   
/*    */   public static String a(String paramString) {
/* 22 */     return a.matcher(paramString).replaceAll("");
/*    */   }
/*    */   
/*    */   public static boolean b(String paramString) {
/* 26 */     return (paramString == null) || ("".equals(paramString));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */