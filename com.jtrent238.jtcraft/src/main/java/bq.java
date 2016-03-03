/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bq
/*    */   extends y
/*    */ {
/*    */   public boolean a(ac paramac)
/*    */   {
/* 12 */     return (MinecraftServer.I().N()) || (super.a(paramac));
/*    */   }
/*    */   
/*    */   public String c()
/*    */   {
/* 17 */     return "seed";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 22 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 27 */     return "commands.seed.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 32 */     mt localmt = (paramac instanceof yz) ? ((yz)paramac).o : MinecraftServer.I().a(0);
/* 33 */     paramac.a(new fr("commands.seed.success", new Object[] { Long.valueOf(localmt.H()) }));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */