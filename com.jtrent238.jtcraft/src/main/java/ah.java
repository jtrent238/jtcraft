/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ah
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "say";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 1;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 25 */     return "commands.say.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 30 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 0)) {
/* 31 */       fj localfj = a(paramac, paramArrayOfString, 0, true);
/* 32 */       MinecraftServer.I().ah().a(new fr("chat.type.announcement", new Object[] { paramac.b_(), localfj }));
/* 33 */       return;
/*    */     }
/*    */     
/* 36 */     throw new ci("commands.say.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 41 */     if (paramArrayOfString.length >= 1) {
/* 42 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 45 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */