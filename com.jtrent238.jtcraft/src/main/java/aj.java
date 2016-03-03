/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aj
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "deop";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 3;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.deop.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].length() > 0)) {
/* 32 */       MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 33 */       GameProfile localGameProfile = localMinecraftServer.ah().m().a(paramArrayOfString[0]);
/* 34 */       if (localGameProfile == null) {
/* 35 */         throw new cd("commands.deop.failed", new Object[] { paramArrayOfString[0] });
/*    */       }
/*    */       
/* 38 */       localMinecraftServer.ah().b(localGameProfile);
/* 39 */       a(paramac, this, "commands.deop.success", new Object[] { paramArrayOfString[0] });
/* 40 */       return;
/*    */     }
/*    */     
/* 43 */     throw new ci("commands.deop.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 48 */     if (paramArrayOfString.length == 1) {
/* 49 */       return a(paramArrayOfString, MinecraftServer.I().ah().n());
/*    */     }
/*    */     
/* 52 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */