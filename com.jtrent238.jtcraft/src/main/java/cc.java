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
/*    */ public class cc
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 16 */     return "whitelist";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 21 */     return 3;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 27 */     return "commands.whitelist.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 32 */     if (paramArrayOfString.length >= 1) {
/* 33 */       MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 34 */       if (paramArrayOfString[0].equals("on")) {
/* 35 */         localMinecraftServer.ah().a(true);
/* 36 */         a(paramac, this, "commands.whitelist.enabled", new Object[0]);
/* 37 */         return; }
/* 38 */       if (paramArrayOfString[0].equals("off")) {
/* 39 */         localMinecraftServer.ah().a(false);
/* 40 */         a(paramac, this, "commands.whitelist.disabled", new Object[0]); return; }
/*    */       Object localObject;
/* 42 */       if (paramArrayOfString[0].equals("list")) {
/* 43 */         paramac.a(new fr("commands.whitelist.list", new Object[] { Integer.valueOf(localMinecraftServer.ah().l().length), Integer.valueOf(localMinecraftServer.ah().q().length) }));
/*    */         
/* 45 */         localObject = localMinecraftServer.ah().l();
/* 46 */         paramac.a(new fq(a((Object[])localObject)));
/* 47 */         return; }
/* 48 */       if (paramArrayOfString[0].equals("add")) {
/* 49 */         if (paramArrayOfString.length < 2) {
/* 50 */           throw new ci("commands.whitelist.add.usage", new Object[0]);
/*    */         }
/*    */         
/* 53 */         localObject = localMinecraftServer.ax().a(paramArrayOfString[1]);
/* 54 */         if (localObject == null) {
/* 55 */           throw new cd("commands.whitelist.add.failed", new Object[] { paramArrayOfString[1] });
/*    */         }
/* 57 */         localMinecraftServer.ah().d((GameProfile)localObject);
/* 58 */         a(paramac, this, "commands.whitelist.add.success", new Object[] { paramArrayOfString[1] });
/* 59 */         return; }
/* 60 */       if (paramArrayOfString[0].equals("remove")) {
/* 61 */         if (paramArrayOfString.length < 2) {
/* 62 */           throw new ci("commands.whitelist.remove.usage", new Object[0]);
/*    */         }
/*    */         
/* 65 */         localObject = localMinecraftServer.ah().k().a(paramArrayOfString[1]);
/* 66 */         if (localObject == null) {
/* 67 */           throw new cd("commands.whitelist.remove.failed", new Object[] { paramArrayOfString[1] });
/*    */         }
/* 69 */         localMinecraftServer.ah().c((GameProfile)localObject);
/* 70 */         a(paramac, this, "commands.whitelist.remove.success", new Object[] { paramArrayOfString[1] });
/* 71 */         return; }
/* 72 */       if (paramArrayOfString[0].equals("reload")) {
/* 73 */         localMinecraftServer.ah().a();
/* 74 */         a(paramac, this, "commands.whitelist.reloaded", new Object[0]);
/* 75 */         return;
/*    */       }
/*    */     }
/*    */     
/* 79 */     throw new ci("commands.whitelist.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 84 */     if (paramArrayOfString.length == 1) {
/* 85 */       return a(paramArrayOfString, new String[] { "on", "off", "list", "add", "remove", "reload" });
/*    */     }
/*    */     
/* 88 */     if (paramArrayOfString.length == 2) {
/* 89 */       if (paramArrayOfString[0].equals("remove"))
/* 90 */         return a(paramArrayOfString, MinecraftServer.I().ah().l());
/* 91 */       if (paramArrayOfString[0].equals("add")) {
/* 92 */         return a(paramArrayOfString, MinecraftServer.I().ax().a());
/*    */       }
/*    */     }
/*    */     
/* 96 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */