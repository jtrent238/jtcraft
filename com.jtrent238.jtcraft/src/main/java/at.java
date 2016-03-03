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
/*    */ public class at
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 16 */     return "give";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 21 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.give.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if (paramArrayOfString.length < 2) {
/* 32 */       throw new ci("commands.give.usage", new Object[0]);
/*    */     }
/*    */     
/* 35 */     mw localmw = d(paramac, paramArrayOfString[0]);
/*    */     
/* 37 */     adb localadb = f(paramac, paramArrayOfString[1]);
/* 38 */     int i = 1;
/* 39 */     int j = 0;
/*    */     
/* 41 */     if (paramArrayOfString.length >= 3) {
/* 42 */       i = a(paramac, paramArrayOfString[2], 1, 64);
/*    */     }
/*    */     
/* 45 */     if (paramArrayOfString.length >= 4) {
/* 46 */       j = a(paramac, paramArrayOfString[3]);
/*    */     }
/*    */     
/* 49 */     add localadd = new add(localadb, i, j);
/*    */     
/* 51 */     if (paramArrayOfString.length >= 5) {
/* 52 */       localObject = a(paramac, paramArrayOfString, 4).c();
/*    */       try {
/* 54 */         dy localdy = eb.a((String)localObject);
/* 55 */         if ((localdy instanceof dh)) {
/* 56 */           localadd.d((dh)localdy);
/*    */         } else {
/* 58 */           a(paramac, this, "commands.give.tagError", new Object[] { "Not a valid tag" });
/* 59 */           return;
/*    */         }
/*    */       } catch (ea localea) {
/* 62 */         a(paramac, this, "commands.give.tagError", new Object[] { localea.getMessage() });
/* 63 */         return;
/*    */       }
/*    */     }
/*    */     
/* 67 */     Object localObject = localmw.a(localadd, false);
/* 68 */     ((xk)localObject).b = 0;
/* 69 */     ((xk)localObject).a(localmw.b_());
/*    */     
/* 71 */     a(paramac, this, "commands.give.success", new Object[] { localadd.E(), Integer.valueOf(i), localmw.b_() });
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 76 */     if (paramArrayOfString.length == 1) {
/* 77 */       return a(paramArrayOfString, d());
/*    */     }
/* 79 */     if (paramArrayOfString.length == 2) {
/* 80 */       return a(paramArrayOfString, adb.e.b());
/*    */     }
/*    */     
/* 83 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 87 */     return MinecraftServer.I().E();
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 92 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */