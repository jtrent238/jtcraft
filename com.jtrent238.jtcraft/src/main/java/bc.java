/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bc
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "op";
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
/* 26 */     return "commands.op.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].length() > 0)) {
/* 32 */       MinecraftServer localMinecraftServer = MinecraftServer.I();
/* 33 */       GameProfile localGameProfile = localMinecraftServer.ax().a(paramArrayOfString[0]);
/* 34 */       if (localGameProfile == null) {
/* 35 */         throw new cd("commands.op.failed", new Object[] { paramArrayOfString[0] });
/*    */       }
/*    */       
/* 38 */       localMinecraftServer.ah().a(localGameProfile);
/* 39 */       a(paramac, this, "commands.op.success", new Object[] { paramArrayOfString[0] });
/* 40 */       return;
/*    */     }
/*    */     
/* 43 */     throw new ci("commands.op.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 48 */     if (paramArrayOfString.length == 1) {
/* 49 */       String str = paramArrayOfString[(paramArrayOfString.length - 1)];
/* 50 */       ArrayList localArrayList = new ArrayList();
/*    */       
/* 52 */       for (GameProfile localGameProfile : MinecraftServer.I().F()) {
/* 53 */         if ((!MinecraftServer.I().ah().g(localGameProfile)) && (a(str, localGameProfile.getName()))) {
/* 54 */           localArrayList.add(localGameProfile.getName());
/*    */         }
/*    */       }
/*    */       
/* 58 */       return localArrayList;
/*    */     }
/*    */     
/* 61 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */