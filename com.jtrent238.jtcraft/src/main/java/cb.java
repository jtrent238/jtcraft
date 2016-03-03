/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cb
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "weather";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 25 */     return "commands.weather.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 30 */     if ((paramArrayOfString.length < 1) || (paramArrayOfString.length > 2)) {
/* 31 */       throw new ci("commands.weather.usage", new Object[0]);
/*    */     }
/*    */     
/* 34 */     int i = (300 + new Random().nextInt(600)) * 20;
/* 35 */     if (paramArrayOfString.length >= 2) {
/* 36 */       i = a(paramac, paramArrayOfString[1], 1, 1000000) * 20;
/*    */     }
/*    */     
/* 39 */     mt localmt = net.minecraft.server.MinecraftServer.I().c[0];
/* 40 */     ays localays = localmt.N();
/*    */     
/* 42 */     if ("clear".equalsIgnoreCase(paramArrayOfString[0])) {
/* 43 */       localays.g(0);
/* 44 */       localays.f(0);
/* 45 */       localays.b(false);
/* 46 */       localays.a(false);
/* 47 */       a(paramac, this, "commands.weather.clear", new Object[0]);
/* 48 */     } else if ("rain".equalsIgnoreCase(paramArrayOfString[0])) {
/* 49 */       localays.g(i);
/* 50 */       localays.b(true);
/* 51 */       localays.a(false);
/* 52 */       a(paramac, this, "commands.weather.rain", new Object[0]);
/* 53 */     } else if ("thunder".equalsIgnoreCase(paramArrayOfString[0])) {
/* 54 */       localays.g(i);
/* 55 */       localays.f(i);
/* 56 */       localays.b(true);
/* 57 */       localays.a(true);
/* 58 */       a(paramac, this, "commands.weather.thunder", new Object[0]);
/*    */     } else {
/* 60 */       throw new ci("commands.weather.usage", new Object[0]);
/*    */     }
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 66 */     if (paramArrayOfString.length == 1) {
/* 67 */       return a(paramArrayOfString, new String[] { "clear", "rain", "thunder" });
/*    */     }
/*    */     
/* 70 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */