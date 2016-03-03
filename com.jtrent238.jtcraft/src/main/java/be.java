/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class be
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "pardon";
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
/* 26 */     return "commands.unban.usage";
/*    */   }
/*    */   
/*    */   public boolean a(ac paramac)
/*    */   {
/* 31 */     return (MinecraftServer.I().ah().h().b()) && (super.a(paramac));
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 36 */     if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].length() > 0)) {
/* 37 */       MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 38 */       GameProfile localGameProfile = localMinecraftServer.ah().h().a(paramArrayOfString[0]);
/* 39 */       if (localGameProfile == null) {
/* 40 */         throw new cd("commands.unban.failed", new Object[] { paramArrayOfString[0] });
/*    */       }
/*    */       
/* 43 */       localMinecraftServer.ah().h().c(localGameProfile);
/* 44 */       a(paramac, this, "commands.unban.success", new Object[] { paramArrayOfString[0] });
/* 45 */       return;
/*    */     }
/*    */     
/* 48 */     throw new ci("commands.unban.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 53 */     if (paramArrayOfString.length == 1) {
/* 54 */       return a(paramArrayOfString, MinecraftServer.I().ah().h().a());
/*    */     }
/*    */     
/* 57 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */