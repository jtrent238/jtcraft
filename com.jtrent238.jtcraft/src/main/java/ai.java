/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ai
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "clear";
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 20 */     return "commands.clear.usage";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 25 */     return 2;
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 30 */     mw localmw = paramArrayOfString.length == 0 ? b(paramac) : d(paramac, paramArrayOfString[0]);
/*    */     
/* 32 */     adb localadb = paramArrayOfString.length >= 2 ? f(paramac, paramArrayOfString[1]) : null;
/* 33 */     int i = paramArrayOfString.length >= 3 ? a(paramac, paramArrayOfString[2], 0) : -1;
/*    */     
/* 35 */     if ((paramArrayOfString.length >= 2) && (localadb == null)) {
/* 36 */       throw new cd("commands.clear.failure", new Object[] { localmw.b_() });
/*    */     }
/*    */     
/* 39 */     int j = localmw.bm.a(localadb, i);
/* 40 */     localmw.bn.b();
/* 41 */     if (!localmw.bE.d) { localmw.l();
/*    */     }
/* 43 */     if (j == 0) {
/* 44 */       throw new cd("commands.clear.failure", new Object[] { localmw.b_() });
/*    */     }
/*    */     
/* 47 */     a(paramac, this, "commands.clear.success", new Object[] { localmw.b_(), Integer.valueOf(j) });
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 52 */     if (paramArrayOfString.length == 1) {
/* 53 */       return a(paramArrayOfString, d());
/*    */     }
/* 55 */     if (paramArrayOfString.length == 2) {
/* 56 */       return a(paramArrayOfString, adb.e.b());
/*    */     }
/*    */     
/* 59 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 63 */     return MinecraftServer.I().E();
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 68 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */