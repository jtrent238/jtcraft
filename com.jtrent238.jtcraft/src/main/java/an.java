/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class an
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "me";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.me.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if (paramArrayOfString.length > 0) {
/* 32 */       fj localfj = a(paramac, paramArrayOfString, 0, paramac.a(1, "me"));
/* 33 */       MinecraftServer.I().ah().a(new fr("chat.type.emote", new Object[] { paramac.c_(), localfj }));
/* 34 */       return;
/*    */     }
/*    */     
/* 37 */     throw new ci("commands.me.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 42 */     return a(paramArrayOfString, MinecraftServer.I().E());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */