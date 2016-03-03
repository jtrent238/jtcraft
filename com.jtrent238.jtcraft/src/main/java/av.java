/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class av
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "kick";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.kick.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if ((paramArrayOfString.length > 0) && (paramArrayOfString[0].length() > 1)) {
/* 32 */       mw localmw = MinecraftServer.I().ah().a(paramArrayOfString[0]);
/* 33 */       String str = "Kicked by an operator.";
/* 34 */       int i = 0;
/*    */       
/* 36 */       if (localmw == null) {
/* 37 */         throw new cg();
/*    */       }
/*    */       
/* 40 */       if (paramArrayOfString.length >= 2) {
/* 41 */         str = a(paramac, paramArrayOfString, 1).c();
/* 42 */         i = 1;
/*    */       }
/*    */       
/* 45 */       localmw.a.c(str);
/*    */       
/* 47 */       if (i != 0) {
/* 48 */         a(paramac, this, "commands.kick.success.reason", new Object[] { localmw.b_(), str });
/*    */       } else {
/* 50 */         a(paramac, this, "commands.kick.success", new Object[] { localmw.b_() });
/*    */       }
/*    */       
/* 53 */       return;
/*    */     }
/*    */     
/* 56 */     throw new ci("commands.kick.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 61 */     if (paramArrayOfString.length >= 1) {
/* 62 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 65 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */