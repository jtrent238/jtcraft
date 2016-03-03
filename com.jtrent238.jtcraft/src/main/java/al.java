/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class al
/*    */   extends ar
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "defaultgamemode";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 18 */     return "commands.defaultgamemode.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 23 */     if (paramArrayOfString.length > 0) {
/* 24 */       ahk localahk = h(paramac, paramArrayOfString[0]);
/* 25 */       a(localahk);
/*    */       
/* 27 */       a(paramac, this, "commands.defaultgamemode.success", new Object[] { new fr("gameMode." + localahk.b(), new Object[0]) });
/*    */       
/* 29 */       return;
/*    */     }
/*    */     
/* 32 */     throw new ci("commands.defaultgamemode.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   protected void a(ahk paramahk) {
/* 36 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 37 */     localMinecraftServer.a(paramahk);
/*    */     
/* 39 */     if (localMinecraftServer.ap()) {
/* 40 */       for (mw localmw : MinecraftServer.I().ah().e) {
/* 41 */         localmw.a(paramahk);
/* 42 */         localmw.R = 0.0F;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */