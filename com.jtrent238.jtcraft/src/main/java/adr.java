/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adr
/*    */   extends adb
/*    */ {
/* 14 */   private static final Map b = new HashMap();
/*    */   public final String a;
/*    */   
/*    */   protected adr(String paramString)
/*    */   {
/* 19 */     this.a = paramString;
/* 20 */     this.h = 1;
/* 21 */     a(abt.f);
/*    */     
/* 23 */     b.put(paramString, this);
/*    */   }
/*    */   
/*    */   public rf b_(int paramInt)
/*    */   {
/* 28 */     return this.k;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, yz paramyz, ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 33 */     if ((paramahb.a(paramInt1, paramInt2, paramInt3) == ajn.aI) && (paramahb.e(paramInt1, paramInt2, paramInt3) == 0)) {
/* 34 */       if (paramahb.E) { return true;
/*    */       }
/* 36 */       ((alq)ajn.aI).b(paramahb, paramInt1, paramInt2, paramInt3, paramadd);
/* 37 */       paramahb.a(null, 1005, paramInt1, paramInt2, paramInt3, adb.b(this));
/* 38 */       paramadd.b -= 1;
/* 39 */       return true;
/*    */     }
/* 41 */     return false;
/*    */   }
/*    */   
/*    */   public void a(add paramadd, yz paramyz, List paramList, boolean paramBoolean)
/*    */   {
/* 46 */     paramList.add(i());
/*    */   }
/*    */   
/*    */   public String i() {
/* 50 */     return dd.a("item.record." + this.a + ".desc");
/*    */   }
/*    */   
/*    */   public adq f(add paramadd)
/*    */   {
/* 55 */     return adq.c;
/*    */   }
/*    */   
/*    */   public static adr b(String paramString) {
/* 59 */     return (adr)b.get(paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */