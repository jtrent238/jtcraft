/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aq
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 15 */     return "difficulty";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 20 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 26 */     return "commands.difficulty.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 31 */     if (paramArrayOfString.length > 0) {
/* 32 */       rd localrd = h(paramac, paramArrayOfString[0]);
/*    */       
/* 34 */       MinecraftServer.I().a(localrd);
/*    */       
/* 36 */       a(paramac, this, "commands.difficulty.success", new Object[] { new fr(localrd.b(), new Object[0]) });
/*    */       
/* 38 */       return;
/*    */     }
/*    */     
/* 41 */     throw new ci("commands.difficulty.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   protected rd h(ac paramac, String paramString) {
/* 45 */     if ((paramString.equalsIgnoreCase("peaceful")) || (paramString.equalsIgnoreCase("p")))
/* 46 */       return rd.a;
/* 47 */     if ((paramString.equalsIgnoreCase("easy")) || (paramString.equalsIgnoreCase("e")))
/* 48 */       return rd.b;
/* 49 */     if ((paramString.equalsIgnoreCase("normal")) || (paramString.equalsIgnoreCase("n")))
/* 50 */       return rd.c;
/* 51 */     if ((paramString.equalsIgnoreCase("hard")) || (paramString.equalsIgnoreCase("h"))) {
/* 52 */       return rd.d;
/*    */     }
/* 54 */     return rd.a(a(paramac, paramString, 0, 3));
/*    */   }
/*    */   
/*    */ 
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 60 */     if (paramArrayOfString.length == 1) {
/* 61 */       return a(paramArrayOfString, new String[] { "peaceful", "easy", "normal", "hard" });
/*    */     }
/*    */     
/* 64 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */