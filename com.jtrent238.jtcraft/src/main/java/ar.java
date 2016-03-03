/*    */ import java.util.List;
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
/*    */ public class ar
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 17 */     return "gamemode";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 22 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 28 */     return "commands.gamemode.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 33 */     if (paramArrayOfString.length > 0) {
/* 34 */       ahk localahk = h(paramac, paramArrayOfString[0]);
/* 35 */       mw localmw = paramArrayOfString.length >= 2 ? d(paramac, paramArrayOfString[1]) : b(paramac);
/*    */       
/* 37 */       localmw.a(localahk);
/* 38 */       localmw.R = 0.0F;
/*    */       
/* 40 */       fr localfr = new fr("gameMode." + localahk.b(), new Object[0]);
/*    */       
/* 42 */       if (localmw != paramac) {
/* 43 */         a(paramac, this, 1, "commands.gamemode.success.other", new Object[] { localmw.b_(), localfr });
/*    */       } else {
/* 45 */         a(paramac, this, 1, "commands.gamemode.success.self", new Object[] { localfr });
/*    */       }
/*    */       
/* 48 */       return;
/*    */     }
/*    */     
/* 51 */     throw new ci("commands.gamemode.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   protected ahk h(ac paramac, String paramString) {
/* 55 */     if ((paramString.equalsIgnoreCase(ahk.b.b())) || (paramString.equalsIgnoreCase("s")))
/* 56 */       return ahk.b;
/* 57 */     if ((paramString.equalsIgnoreCase(ahk.c.b())) || (paramString.equalsIgnoreCase("c")))
/* 58 */       return ahk.c;
/* 59 */     if ((paramString.equalsIgnoreCase(ahk.d.b())) || (paramString.equalsIgnoreCase("a"))) {
/* 60 */       return ahk.d;
/*    */     }
/* 62 */     return ahj.a(a(paramac, paramString, 0, ahk.values().length - 2));
/*    */   }
/*    */   
/*    */ 
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 68 */     if (paramArrayOfString.length == 1)
/* 69 */       return a(paramArrayOfString, new String[] { "survival", "creative", "adventure" });
/* 70 */     if (paramArrayOfString.length == 2) {
/* 71 */       return a(paramArrayOfString, d());
/*    */     }
/*    */     
/* 74 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 78 */     return MinecraftServer.I().E();
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 83 */     return paramInt == 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */