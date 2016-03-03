/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bi
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 11 */     return "save-off";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 16 */     return "commands.save-off.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 21 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 22 */     int i = 0;
/*    */     
/* 24 */     for (int j = 0; j < localMinecraftServer.c.length; j++) {
/* 25 */       if (localMinecraftServer.c[j] != null) {
/* 26 */         mt localmt = localMinecraftServer.c[j];
/* 27 */         if (!localmt.c) {
/* 28 */           localmt.c = true;
/* 29 */           i = 1;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 34 */     if (i != 0) {
/* 35 */       a(paramac, this, "commands.save.disabled", new Object[0]);
/*    */     } else {
/* 37 */       throw new cd("commands.save-off.alreadyOff", new Object[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */