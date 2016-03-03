/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bh
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 12 */     return "save-all";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 17 */     return "commands.save.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 22 */     MinecraftServer localMinecraftServer = MinecraftServer.I();
/*    */     
/* 24 */     paramac.a(new fr("commands.save.start", new Object[0]));
/*    */     
/* 26 */     if (localMinecraftServer.ah() != null)
/* 27 */       localMinecraftServer.ah().j();
/*    */     try {
/*    */       mt localmt;
/*    */       boolean bool;
/* 31 */       for (int i = 0; i < localMinecraftServer.c.length; i++) {
/* 32 */         if (localMinecraftServer.c[i] != null) {
/* 33 */           localmt = localMinecraftServer.c[i];
/* 34 */           bool = localmt.c;
/* 35 */           localmt.c = false;
/* 36 */           localmt.a(true, null);
/* 37 */           localmt.c = bool;
/*    */         }
/*    */       }
/* 40 */       if ((paramArrayOfString.length > 0) && ("flush".equals(paramArrayOfString[0]))) {
/* 41 */         paramac.a(new fr("commands.save.flushStart", new Object[0]));
/* 42 */         for (i = 0; i < localMinecraftServer.c.length; i++) {
/* 43 */           if (localMinecraftServer.c[i] != null) {
/* 44 */             localmt = localMinecraftServer.c[i];
/* 45 */             bool = localmt.c;
/* 46 */             localmt.c = false;
/* 47 */             localmt.m();
/* 48 */             localmt.c = bool;
/*    */           }
/*    */         }
/* 51 */         paramac.a(new fr("commands.save.flushEnd", new Object[0]));
/*    */       }
/*    */     } catch (ahg localahg) {
/* 54 */       a(paramac, this, "commands.save.failed", new Object[] { localahg.getMessage() });
/* 55 */       return;
/*    */     }
/*    */     
/* 58 */     a(paramac, this, "commands.save.success", new Object[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */