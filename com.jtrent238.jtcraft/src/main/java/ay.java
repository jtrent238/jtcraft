/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ay
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 11 */     return "list";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 16 */     return 0;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 21 */     return "commands.players.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 26 */     paramac.a(new fr("commands.players.list", new Object[] { Integer.valueOf(MinecraftServer.I().C()), Integer.valueOf(MinecraftServer.I().D()) }));
/* 27 */     paramac.a(new fq(MinecraftServer.I().ah().b((paramArrayOfString.length > 0) && ("uuids".equalsIgnoreCase(paramArrayOfString[0])))));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */