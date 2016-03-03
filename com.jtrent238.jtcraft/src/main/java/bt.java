/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ public class bt
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/*  9 */     return "stop";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 14 */     return "commands.stop.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 19 */     if (MinecraftServer.I().c != null) {
/* 20 */       a(paramac, this, "commands.stop.start", new Object[0]);
/*    */     }
/* 22 */     MinecraftServer.I().r();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */