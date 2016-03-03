/*    */ import java.util.List;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bd
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 14 */     return "pardon-ip";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 19 */     return 3;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ac paramac)
/*    */   {
/* 25 */     return (MinecraftServer.I().ah().i().b()) && (super.a(paramac));
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 30 */     return "commands.unbanip.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 35 */     if ((paramArrayOfString.length == 1) && (paramArrayOfString[0].length() > 1)) {
/* 36 */       Matcher localMatcher = af.a.matcher(paramArrayOfString[0]);
/*    */       
/* 38 */       if (localMatcher.matches()) {
/* 39 */         MinecraftServer.I().ah().i().c(paramArrayOfString[0]);
/* 40 */         a(paramac, this, "commands.unbanip.success", new Object[] { paramArrayOfString[0] });
/* 41 */         return;
/*    */       }
/* 43 */       throw new cf("commands.unbanip.invalid", new Object[0]);
/*    */     }
/*    */     
/*    */ 
/* 47 */     throw new ci("commands.unbanip.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 52 */     if (paramArrayOfString.length == 1) {
/* 53 */       return a(paramArrayOfString, MinecraftServer.I().ah().i().a());
/*    */     }
/*    */     
/* 56 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */