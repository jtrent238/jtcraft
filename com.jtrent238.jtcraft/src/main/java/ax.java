/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ax
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "banlist";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 18 */     return 3;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ac paramac)
/*    */   {
/* 24 */     return ((MinecraftServer.I().ah().i().b()) || (MinecraftServer.I().ah().h().b())) && (super.a(paramac));
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 29 */     return "commands.banlist.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 34 */     if ((paramArrayOfString.length >= 1) && (paramArrayOfString[0].equalsIgnoreCase("ips"))) {
/* 35 */       paramac.a(new fr("commands.banlist.ips", new Object[] { Integer.valueOf(MinecraftServer.I().ah().i().a().length) }));
/* 36 */       paramac.a(new fq(a(MinecraftServer.I().ah().i().a())));
/*    */     } else {
/* 38 */       paramac.a(new fr("commands.banlist.players", new Object[] { Integer.valueOf(MinecraftServer.I().ah().h().a().length) }));
/* 39 */       paramac.a(new fq(a(MinecraftServer.I().ah().h().a())));
/*    */     }
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 45 */     if (paramArrayOfString.length == 1) {
/* 46 */       return a(paramArrayOfString, new String[] { "players", "ips" });
/*    */     }
/*    */     
/* 49 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */