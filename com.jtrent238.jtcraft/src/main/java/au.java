/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class au
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 17 */     return "help";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 28 */     return "commands.help.usage";
/*    */   }
/*    */   
/*    */   public List b()
/*    */   {
/* 33 */     return Arrays.asList(new String[] { "?" });
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 38 */     List localList = d(paramac);
/* 39 */     int i = 7;
/* 40 */     int j = (localList.size() - 1) / i;
/* 41 */     int k = 0;
/*    */     try
/*    */     {
/* 44 */       k = paramArrayOfString.length == 0 ? 0 : a(paramac, paramArrayOfString[0], 1, j + 1) - 1;
/*    */     }
/*    */     catch (ce localce) {
/* 47 */       localObject = d();
/* 48 */       aa localaa1 = (aa)((Map)localObject).get(paramArrayOfString[0]);
/*    */       
/* 50 */       if (localaa1 != null)
/*    */       {
/* 52 */         throw new ci(localaa1.c(paramac), new Object[0]); }
/* 53 */       if (qh.a(paramArrayOfString[0], -1) != -1) {
/* 54 */         throw localce;
/*    */       }
/* 56 */       throw new ch();
/*    */     }
/*    */     
/*    */ 
/*    */ 
/* 61 */     int m = Math.min((k + 1) * i, localList.size());
/*    */     
/* 63 */     Object localObject = new fr("commands.help.header", new Object[] { Integer.valueOf(k + 1), Integer.valueOf(j + 1) });
/* 64 */     ((fr)localObject).b().a(a.c);
/* 65 */     paramac.a((fj)localObject);
/*    */     
/* 67 */     for (int n = k * i; n < m; n++) {
/* 68 */       aa localaa2 = (aa)localList.get(n);
/*    */       
/* 70 */       fr localfr2 = new fr(localaa2.c(paramac), new Object[0]);
/* 71 */       localfr2.b().a(new fh(fi.e, "/" + localaa2.c() + " "));
/* 72 */       paramac.a(localfr2);
/*    */     }
/*    */     
/* 75 */     if ((k == 0) && ((paramac instanceof yz))) {
/* 76 */       fr localfr1 = new fr("commands.help.footer", new Object[0]);
/* 77 */       localfr1.b().a(a.k);
/* 78 */       paramac.a(localfr1);
/*    */     }
/*    */   }
/*    */   
/*    */   protected List d(ac paramac) {
/* 83 */     List localList = MinecraftServer.I().J().a(paramac);
/* 84 */     Collections.sort(localList);
/* 85 */     return localList;
/*    */   }
/*    */   
/*    */   protected Map d() {
/* 89 */     return MinecraftServer.I().J().a();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */