/*    */ import com.google.gson.JsonParseException;
/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import org.apache.commons.lang3.exception.ExceptionUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ba
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 18 */     return "tellraw";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 23 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 28 */     return "commands.tellraw.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 33 */     if (paramArrayOfString.length < 2) { throw new ci("commands.tellraw.usage", new Object[0]);
/*    */     }
/* 35 */     mw localmw = d(paramac, paramArrayOfString[0]);
/* 36 */     String str = b(paramac, paramArrayOfString, 1);
/*    */     try
/*    */     {
/* 39 */       fj localfj = fk.a(str);
/* 40 */       localmw.a(localfj);
/*    */     } catch (JsonParseException localJsonParseException) {
/* 42 */       Throwable localThrowable = ExceptionUtils.getRootCause(localJsonParseException);
/* 43 */       throw new cf("commands.tellraw.jsonException", new Object[] { localThrowable == null ? "" : localThrowable.getMessage() });
/*    */     }
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 49 */     if (paramArrayOfString.length == 1) {
/* 50 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 53 */     return null;
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 58 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */