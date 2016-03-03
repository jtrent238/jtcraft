/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bf
/*    */   extends y
/*    */ {
/*    */   public String c()
/*    */   {
/* 13 */     return "playsound";
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 18 */     return 2;
/*    */   }
/*    */   
/*    */   public String c(ac paramac)
/*    */   {
/* 23 */     return "commands.playsound.usage";
/*    */   }
/*    */   
/*    */   public void b(ac paramac, String[] paramArrayOfString)
/*    */   {
/* 28 */     if (paramArrayOfString.length < 2) {
/* 29 */       throw new ci(c(paramac), new Object[0]);
/*    */     }
/*    */     
/* 32 */     int i = 0;
/* 33 */     String str = paramArrayOfString[(i++)];
/* 34 */     mw localmw = d(paramac, paramArrayOfString[(i++)]);
/* 35 */     double d1 = localmw.f_().a;
/* 36 */     double d2 = localmw.f_().b;
/* 37 */     double d3 = localmw.f_().c;
/* 38 */     double d4 = 1.0D;
/* 39 */     double d5 = 1.0D;
/* 40 */     double d6 = 0.0D;
/*    */     
/* 42 */     if (paramArrayOfString.length > i) d1 = a(paramac, d1, paramArrayOfString[(i++)]);
/* 43 */     if (paramArrayOfString.length > i) d2 = a(paramac, d2, paramArrayOfString[(i++)], 0, 0);
/* 44 */     if (paramArrayOfString.length > i) { d3 = a(paramac, d3, paramArrayOfString[(i++)]);
/*    */     }
/* 46 */     if (paramArrayOfString.length > i) d4 = a(paramac, paramArrayOfString[(i++)], 0.0D, 3.4028234663852886E38D);
/* 47 */     if (paramArrayOfString.length > i) d5 = a(paramac, paramArrayOfString[(i++)], 0.0D, 2.0D);
/* 48 */     if (paramArrayOfString.length > i) { d6 = a(paramac, paramArrayOfString[(i++)], 0.0D, 1.0D);
/*    */     }
/* 50 */     double d7 = d4 > 1.0D ? d4 * 16.0D : 16.0D;
/* 51 */     double d8 = localmw.f(d1, d2, d3);
/*    */     
/* 53 */     if (d8 > d7) {
/* 54 */       if (d6 > 0.0D) {
/* 55 */         double d9 = d1 - localmw.s;
/* 56 */         double d10 = d2 - localmw.t;
/* 57 */         double d11 = d3 - localmw.u;
/* 58 */         double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
/* 59 */         double d13 = localmw.s;
/* 60 */         double d14 = localmw.t;
/* 61 */         double d15 = localmw.u;
/*    */         
/* 63 */         if (d12 > 0.0D) {
/* 64 */           d13 += d9 / d12 * 2.0D;
/* 65 */           d14 += d10 / d12 * 2.0D;
/* 66 */           d15 += d11 / d12 * 2.0D;
/*    */         }
/*    */         
/* 69 */         localmw.a.a(new hc(str, d13, d14, d15, (float)d6, (float)d5));
/*    */       } else {
/* 71 */         throw new cd("commands.playsound.playerTooFar", new Object[] { localmw.b_() });
/*    */       }
/*    */     } else {
/* 74 */       localmw.a.a(new hc(str, d1, d2, d3, (float)d4, (float)d5));
/*    */     }
/*    */     
/* 77 */     a(paramac, this, "commands.playsound.success", new Object[] { str, localmw.b_() });
/*    */   }
/*    */   
/*    */   public boolean a(String[] paramArrayOfString, int paramInt)
/*    */   {
/* 82 */     return paramInt == 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */