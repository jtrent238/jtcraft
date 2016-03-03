/*    */ import java.util.List;
/*    */ import java.util.regex.Matcher;
/*    */ import java.util.regex.Pattern;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class af
/*    */   extends y
/*    */ {
/* 18 */   public static final Pattern a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
/*    */   
/*    */ 
/*    */   public String c()
/*    */   {
/* 23 */     return "ban-ip";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 28 */     return 3;
/*    */   }
/*    */   
/*    */   public boolean a(ac paramac)
/*    */   {
/* 33 */     return (MinecraftServer.I().ah().i().b()) && (super.a(paramac));
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 38 */     return "commands.banip.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 43 */     if ((paramArrayOfString.length >= 1) && (paramArrayOfString[0].length() > 1)) {
/* 44 */       Matcher localMatcher = a.matcher(paramArrayOfString[0]);
/* 45 */       fj localfj = null;
/*    */       
/* 47 */       if (paramArrayOfString.length >= 2) {
/* 48 */         localfj = a(paramac, paramArrayOfString, 1);
/*    */       }
/*    */       
/* 51 */       if (localMatcher.matches()) {
/* 52 */         a(paramac, paramArrayOfString[0], localfj == null ? null : localfj.c());
/*    */       } else {
/* 54 */         mw localmw = MinecraftServer.I().ah().a(paramArrayOfString[0]);
/*    */         
/* 56 */         if (localmw == null) {
/* 57 */           throw new cg("commands.banip.invalid", new Object[0]);
/*    */         }
/*    */         
/* 60 */         a(paramac, localmw.s(), localfj == null ? null : localfj.c());
/*    */       }
/*    */       
/* 63 */       return;
/*    */     }
/*    */     
/* 66 */     throw new ci("commands.banip.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 71 */     if (paramArrayOfString.length == 1) {
/* 72 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 75 */     return null;
/*    */   }
/*    */   
/*    */   protected void a(ac paramac, String paramString1, String paramString2) {
/* 79 */     ny localny = new ny(paramString1, null, paramac.b_(), null, paramString2);
/* 80 */     MinecraftServer.I().ah().i().a(localny);
/*    */     
/* 82 */     List localList = MinecraftServer.I().ah().b(paramString1);
/* 83 */     String[] arrayOfString = new String[localList.size()];
/* 84 */     int i = 0;
/*    */     
/* 86 */     for (mw localmw : localList) {
/* 87 */       localmw.a.c("You have been IP banned.");
/* 88 */       arrayOfString[(i++)] = localmw.b_();
/*    */     }
/*    */     
/* 91 */     if (localList.isEmpty()) {
/* 92 */       a(paramac, this, "commands.banip.success", new Object[] { paramString1 });
/*    */     } else {
/* 94 */       a(paramac, this, "commands.banip.success.players", new Object[] { paramString1, a(arrayOfString) });
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */