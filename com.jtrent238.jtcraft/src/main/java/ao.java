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
/*    */ public class ao
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 16 */     return "enchant";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 21 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.enchant.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if (paramArrayOfString.length >= 2) {
/* 32 */       mw localmw = d(paramac, paramArrayOfString[0]);
/*    */       
/* 34 */       int i = a(paramac, paramArrayOfString[1], 0, aft.b.length - 1);
/* 35 */       int j = 1;
/*    */       
/* 37 */       add localadd = localmw.bF();
/* 38 */       if (localadd == null) {
/* 39 */         throw new cd("commands.enchant.noItem", new Object[0]);
/*    */       }
/*    */       
/* 42 */       aft localaft1 = aft.b[i];
/* 43 */       if (localaft1 == null) {
/* 44 */         throw new ce("commands.enchant.notFound", new Object[] { Integer.valueOf(i) });
/*    */       }
/*    */       
/* 47 */       if (!localaft1.a(localadd)) {
/* 48 */         throw new cd("commands.enchant.cantEnchant", new Object[0]);
/*    */       }
/*    */       
/* 51 */       if (paramArrayOfString.length >= 3) {
/* 52 */         j = a(paramac, paramArrayOfString[2], localaft1.d(), localaft1.b());
/*    */       }
/*    */       
/* 55 */       if (localadd.p()) {
/* 56 */         dq localdq = localadd.r();
/* 57 */         if (localdq != null) {
/* 58 */           for (int k = 0; k < localdq.c(); k++) {
/* 59 */             int m = localdq.b(k).e("id");
/*    */             
/* 61 */             if (aft.b[m] != null) {
/* 62 */               aft localaft2 = aft.b[m];
/* 63 */               if (!localaft2.a(localaft1)) {
/* 64 */                 throw new cd("commands.enchant.cantCombine", new Object[] { localaft1.c(j), localaft2.c(localdq.b(k).e("lvl")) });
/*    */               }
/*    */             }
/*    */           }
/*    */         }
/*    */       }
/*    */       
/*    */ 
/* 72 */       localadd.a(localaft1, j);
/*    */       
/* 74 */       a(paramac, this, "commands.enchant.success", new Object[0]);
/* 75 */       return;
/*    */     }
/*    */     
/* 78 */     throw new ci("commands.enchant.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 83 */     if (paramArrayOfString.length == 1) {
/* 84 */       return a(paramArrayOfString, d());
/*    */     }
/*    */     
/* 87 */     return null;
/*    */   }
/*    */   
/*    */   protected String[] d() {
/* 91 */     return MinecraftServer.I().E();
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 96 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */