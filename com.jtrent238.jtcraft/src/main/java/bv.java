/*    */ import java.util.List;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bv
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "tp";
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
/* 24 */     return "commands.tp.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 29 */     if (paramArrayOfString.length >= 1)
/*    */     {
/*    */       mw localmw1;
/* 32 */       if ((paramArrayOfString.length == 2) || (paramArrayOfString.length == 4)) {
/* 33 */         localmw1 = d(paramac, paramArrayOfString[0]);
/* 34 */         if (localmw1 == null) throw new cg();
/*    */       } else {
/* 36 */         localmw1 = b(paramac);
/*    */       }
/*    */       
/* 39 */       if ((paramArrayOfString.length == 3) || (paramArrayOfString.length == 4)) {
/* 40 */         if (localmw1.o != null) {
/* 41 */           int i = paramArrayOfString.length - 3;
/*    */           
/* 43 */           double d1 = a(paramac, localmw1.s, paramArrayOfString[(i++)]);
/* 44 */           double d2 = a(paramac, localmw1.t, paramArrayOfString[(i++)], 0, 0);
/* 45 */           double d3 = a(paramac, localmw1.u, paramArrayOfString[(i++)]);
/*    */           
/* 47 */           localmw1.a(null);
/* 48 */           localmw1.a(d1, d2, d3);
/* 49 */           a(paramac, this, "commands.tp.success.coordinates", new Object[] { localmw1.b_(), Double.valueOf(d1), Double.valueOf(d2), Double.valueOf(d3) });
/*    */         }
/* 51 */       } else if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2)) {
/* 52 */         mw localmw2 = d(paramac, paramArrayOfString[(paramArrayOfString.length - 1)]);
/* 53 */         if (localmw2 == null) throw new cg();
/* 54 */         if (localmw2.o != localmw1.o) {
/* 55 */           a(paramac, this, "commands.tp.notSameDimension", new Object[0]);
/* 56 */           return;
/*    */         }
/*    */         
/* 59 */         localmw1.a(null);
/* 60 */         localmw1.a.a(localmw2.s, localmw2.t, localmw2.u, localmw2.y, localmw2.z);
/* 61 */         a(paramac, this, "commands.tp.success", new Object[] { localmw1.b_(), localmw2.b_() });
/*    */       }
/*    */       
/* 64 */       return;
/*    */     }
/*    */     
/* 67 */     throw new ci("commands.tp.usage", new Object[0]);
/*    */   }
/*    */   
/*    */   public List a(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 72 */     if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2)) {
/* 73 */       return a(paramArrayOfString, MinecraftServer.I().E());
/*    */     }
/*    */     
/* 76 */     return null;
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 81 */     return paramInt == 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */