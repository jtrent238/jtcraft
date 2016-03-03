/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ap
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 14 */     return "xp";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 19 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 25 */     return "commands.xp.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 30 */     if (paramArrayOfString.length > 0)
/*    */     {
/* 32 */       String str = paramArrayOfString[0];
/*    */       
/* 34 */       int i = (str.endsWith("l")) || (str.endsWith("L")) ? 1 : 0;
/* 35 */       if ((i != 0) && (str.length() > 1)) { str = str.substring(0, str.length() - 1);
/*    */       }
/* 37 */       int j = a(paramac, str);
/* 38 */       int k = j < 0 ? 1 : 0;
/*    */       
/* 40 */       if (k != 0) j *= -1;
/*    */       mw localmw;
/* 42 */       if (paramArrayOfString.length > 1) {
/* 43 */         localmw = d(paramac, paramArrayOfString[1]);
/*    */       } else {
/* 45 */         localmw = b(paramac);
/*    */       }
/*    */       
/* 48 */       if (i != 0) {
/* 49 */         if (k != 0) {
/* 50 */           localmw.a(-j);
/* 51 */           a(paramac, this, "commands.xp.success.negative.levels", new Object[] { Integer.valueOf(j), localmw.b_() });
/*    */         } else {
/* 53 */           localmw.a(j);
/* 54 */           a(paramac, this, "commands.xp.success.levels", new Object[] { Integer.valueOf(j), localmw.b_() });
/*    */         }
/*    */       } else {
/* 57 */         if (k != 0) {
/* 58 */           throw new ci("commands.xp.failure.widthdrawXp", new Object[0]);
/*    */         }
/* 60 */         localmw.v(j);
/* 61 */         a(paramac, this, "commands.xp.success", new Object[] { Integer.valueOf(j), localmw.b_() });
/*    */       }
/*    */       
/*    */ 
/* 65 */       return;
/*    */     }
/*    */     
/* 68 */     throw new ci("commands.xp.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 73 */     if (paramArrayOfString.length == 2) {
/* 74 */       return a(paramArrayOfString, d());
/*    */     }
/*    */     
/* 77 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 81 */     return MinecraftServer.I().E();
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 86 */     return paramInt == 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */