/*    */ import com.google.gson.JsonObject;
/*    */ import java.io.File;
/*    */ import java.net.SocketAddress;
/*    */ 
/*    */ 
/*    */ public class nx
/*    */   extends om
/*    */ {
/*    */   public nx(File paramFile)
/*    */   {
/* 11 */     super(paramFile);
/*    */   }
/*    */   
/*    */   protected ol a(JsonObject paramJsonObject)
/*    */   {
/* 16 */     return new ny(paramJsonObject);
/*    */   }
/*    */   
/*    */   public boolean a(SocketAddress paramSocketAddress) {
/* 20 */     String str = c(paramSocketAddress);
/* 21 */     return d(str);
/*    */   }
/*    */   
/*    */   public ny b(SocketAddress paramSocketAddress) {
/* 25 */     String str = c(paramSocketAddress);
/* 26 */     return (ny)b(str);
/*    */   }
/*    */   
/*    */   private String c(SocketAddress paramSocketAddress) {
/* 30 */     String str = paramSocketAddress.toString();
/* 31 */     if (str.contains("/")) {
/* 32 */       str = str.substring(str.indexOf('/') + 1);
/*    */     }
/* 34 */     if (str.contains(":")) {
/* 35 */       str = str.substring(0, str.indexOf(':'));
/*    */     }
/* 37 */     return str;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\nx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */