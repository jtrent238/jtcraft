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
/*    */ public class bp
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 16 */     return "spawnpoint";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 21 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.spawnpoint.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     mw localmw = paramArrayOfString.length == 0 ? b(paramac) : d(paramac, paramArrayOfString[0]);
/*    */     
/* 33 */     if (paramArrayOfString.length == 4) {
/* 34 */       if (localmw.o != null) {
/* 35 */         int i = 1;
/* 36 */         int j = 30000000;
/* 37 */         int k = a(paramac, paramArrayOfString[(i++)], -j, j);
/* 38 */         int m = a(paramac, paramArrayOfString[(i++)], 0, 256);
/* 39 */         int n = a(paramac, paramArrayOfString[(i++)], -j, j);
/*    */         
/* 41 */         localmw.a(new r(k, m, n), true);
/* 42 */         a(paramac, this, "commands.spawnpoint.success", new Object[] { localmw.b_(), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n) });
/*    */       }
/* 44 */     } else if (paramArrayOfString.length <= 1) {
/* 45 */       r localr = localmw.f_();
/* 46 */       localmw.a(localr, true);
/* 47 */       a(paramac, this, "commands.spawnpoint.success", new Object[] { localmw.b_(), Integer.valueOf(localr.a), Integer.valueOf(localr.b), Integer.valueOf(localr.c) });
/*    */     } else {
/* 49 */       throw new ci("commands.spawnpoint.usage", new Object[0]);
/*    */     }
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 55 */     if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2)) {
/* 56 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 59 */     return null;
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 64 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */