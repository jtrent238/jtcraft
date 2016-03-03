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
/*    */ public class bn
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 16 */     return "setworldspawn";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 21 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.setworldspawn.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if (paramArrayOfString.length == 3) {
/* 32 */       if (paramac.d() != null) {
/* 33 */         int i = 0;
/* 34 */         int j = a(paramac, paramArrayOfString[(i++)], -30000000, 30000000);
/* 35 */         int k = a(paramac, paramArrayOfString[(i++)], 0, 256);
/* 36 */         int m = a(paramac, paramArrayOfString[(i++)], -30000000, 30000000);
/*    */         
/* 38 */         paramac.d().x(j, k, m);
/* 39 */         a(paramac, this, "commands.setworldspawn.success", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
/*    */       } else {
/* 41 */         throw new ci("commands.setworldspawn.usage", new Object[0]);
/*    */       }
/* 43 */     } else if (paramArrayOfString.length == 0) {
/* 44 */       r localr = b(paramac).f_();
/* 45 */       paramac.d().x(localr.a, localr.b, localr.c);
/* 46 */       a(paramac, this, "commands.setworldspawn.success", new Object[] { Integer.valueOf(localr.a), Integer.valueOf(localr.b), Integer.valueOf(localr.c) });
/*    */     } else {
/* 48 */       throw new ci("commands.setworldspawn.usage", new Object[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */