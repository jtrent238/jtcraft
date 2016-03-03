/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ag
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 19 */     return "ban";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 24 */     return 3;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 30 */     return "commands.ban.usage";
/*    */   }
/*    */   
/*    */   public boolean a(ac paramac)
/*    */   {
/* 35 */     return (MinecraftServer.I().ah().h().b()) && (super.a(paramac));
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 40 */     if ((paramArrayOfString.length >= 1) && (paramArrayOfString[0].length() > 0)) {
/* 41 */       MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 42 */       GameProfile localGameProfile = localMinecraftServer.ax().a(paramArrayOfString[0]);
/* 43 */       if (localGameProfile == null) {
/* 44 */         throw new cd("commands.ban.failed", new Object[] { paramArrayOfString[0] });
/*    */       }
/*    */       
/* 47 */       String str = null;
/* 48 */       if (paramArrayOfString.length >= 2) {
/* 49 */         str = a(paramac, paramArrayOfString, 1).c();
/*    */       }
/*    */       
/* 52 */       oq localoq = new oq(localGameProfile, null, paramac.b_(), null, str);
/* 53 */       localMinecraftServer.ah().h().a(localoq);
/*    */       
/* 55 */       mw localmw = localMinecraftServer.ah().a(paramArrayOfString[0]);
/* 56 */       if (localmw != null) {
/* 57 */         localmw.a.c("You are banned from this server.");
/*    */       }
/*    */       
/* 60 */       a(paramac, this, "commands.ban.success", new Object[] { paramArrayOfString[0] });
/* 61 */       return;
/*    */     }
/*    */     
/* 64 */     throw new ci("commands.ban.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 69 */     if (paramArrayOfString.length >= 1) {
/* 70 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 73 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */