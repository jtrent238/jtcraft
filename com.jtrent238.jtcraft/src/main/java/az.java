/*    */ import java.util.Arrays;
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
/*    */ 
/*    */ 
/*    */ public class az
/*    */   extends y
/*    */ {
/*    */   public List b()
/*    */   {
/* 19 */     return Arrays.asList(new String[] { "w", "msg" });
/*    */   }
/*    */   
/*    */   public String c()
/*    */   {
/* 24 */     return "tell";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 29 */     return 0;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 34 */     return "commands.message.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 39 */     if (paramArrayOfString.length < 2) { throw new ci("commands.message.usage", new Object[0]);
/*    */     }
/* 41 */     mw localmw = d(paramac, paramArrayOfString[0]);
/*    */     
/* 43 */     if (localmw == null) throw new cg();
/* 44 */     if (localmw == paramac) { throw new cg("commands.message.sameTarget", new Object[0]);
/*    */     }
/* 46 */     fj localfj = a(paramac, paramArrayOfString, 1, !(paramac instanceof yz));
/* 47 */     fr localfr1 = new fr("commands.message.display.incoming", new Object[] { paramac.c_(), localfj.f() });
/* 48 */     fr localfr2 = new fr("commands.message.display.outgoing", new Object[] { localmw.c_(), localfj.f() });
/* 49 */     localfr1.b().a(a.h).b(Boolean.valueOf(true));
/* 50 */     localfr2.b().a(a.h).b(Boolean.valueOf(true));
/* 51 */     localmw.a(localfr1);
/* 52 */     paramac.a(localfr2);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 57 */     return a(paramArrayOfString, MinecraftServer.I().E());
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 62 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */