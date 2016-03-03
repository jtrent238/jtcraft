/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bj
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 11 */     return "save-on";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 16 */     return "commands.save-on.usage";
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
/* 27 */         if (localmt.c) {
/* 28 */           localmt.c = false;
/* 29 */           i = 1;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 34 */     if (i != 0) {
/* 35 */       a(paramac, this, "commands.save.enabled", new Object[0]);
/*    */     } else {
/* 37 */       throw new cd("commands.save-on.alreadyOn", new Object[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */