/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bz
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "time";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 18 */     return 2;
/*    */   }
/*    */   
/*    */ 
/*    */   public String c(ac paramac)
/*    */   {
/* 24 */     return "commands.time.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 29 */     if (paramArrayOfString.length > 1) { int i;
/* 30 */       if (paramArrayOfString[0].equals("set"))
/*    */       {
/*    */ 
/* 33 */         if (paramArrayOfString[1].equals("day")) {
/* 34 */           i = 1000;
/* 35 */         } else if (paramArrayOfString[1].equals("night")) {
/* 36 */           i = 13000;
/*    */         } else {
/* 38 */           i = a(paramac, paramArrayOfString[1], 0);
/*    */         }
/*    */         
/* 41 */         a(paramac, i);
/* 42 */         a(paramac, this, "commands.time.set", new Object[] { Integer.valueOf(i) });
/* 43 */         return; }
/* 44 */       if (paramArrayOfString[0].equals("add")) {
/* 45 */         i = a(paramac, paramArrayOfString[1], 0);
/* 46 */         b(paramac, i);
/*    */         
/* 48 */         a(paramac, this, "commands.time.added", new Object[] { Integer.valueOf(i) });
/* 49 */         return;
/*    */       }
/*    */     }
/*    */     
/* 53 */     throw new ci("commands.time.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 58 */     if (paramArrayOfString.length == 1)
/* 59 */       return a(paramArrayOfString, new String[] { "set", "add" });
/* 60 */     if ((paramArrayOfString.length == 2) && (paramArrayOfString[0].equals("set"))) {
/* 61 */       return a(paramArrayOfString, new String[] { "day", "night" });
/*    */     }
/*    */     
/* 64 */     return null;
/*    */   }
/*    */   
/*    */   protected void a(ac paramac, int paramInt) {
/* 68 */     for (int i = 0; i < MinecraftServer.I().c.length; i++) {
/* 69 */       MinecraftServer.I().c[i].b(paramInt);
/*    */     }
/*    */   }
/*    */   
/*    */   protected void b(ac paramac, int paramInt) {
/* 74 */     for (int i = 0; i < MinecraftServer.I().c.length; i++) {
/* 75 */       mt localmt = MinecraftServer.I().c[i];
/* 76 */       localmt.b(localmt.J() + paramInt);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */