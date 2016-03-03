/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bo
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 11 */     return "setidletimeout";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 16 */     return 3;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 21 */     return "commands.setidletimeout.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 26 */     if (paramArrayOfString.length == 1) {
/* 27 */       int i = a(paramac, paramArrayOfString[0], 0);
/* 28 */       MinecraftServer.I().d(i);
/* 29 */       a(paramac, this, "commands.setidletimeout.success", new Object[] { Integer.valueOf(i) });
/* 30 */       return;
/*    */     }
/*    */     
/* 33 */     throw new ci("commands.setidletimeout.usage", new Object[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */