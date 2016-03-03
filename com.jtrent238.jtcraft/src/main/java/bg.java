/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bg
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 10 */     return "publish";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 15 */     return "commands.publish.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 20 */     String str = MinecraftServer.I().a(ahk.b, false);
/*    */     
/* 22 */     if (str != null) {
/* 23 */       a(paramac, this, "commands.publish.started", new Object[] { str });
/*    */     } else {
/* 25 */       a(paramac, this, "commands.publish.failed", new Object[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */