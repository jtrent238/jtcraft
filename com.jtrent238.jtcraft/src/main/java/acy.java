/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acy
/*    */   extends acx
/*    */ {
/*    */   public acy(int paramInt, float paramFloat, boolean paramBoolean)
/*    */   {
/* 12 */     super(paramInt, paramFloat, paramBoolean);
/*    */     
/* 14 */     a(true);
/*    */   }
/*    */   
/*    */   public boolean e(add paramadd)
/*    */   {
/* 19 */     return paramadd.k() > 0;
/*    */   }
/*    */   
/*    */   public adq f(add paramadd)
/*    */   {
/* 24 */     if (paramadd.k() == 0) {
/* 25 */       return adq.c;
/*    */     }
/* 27 */     return adq.d;
/*    */   }
/*    */   
/*    */   protected void c(add paramadd, ahb paramahb, yz paramyz)
/*    */   {
/* 32 */     if (!paramahb.E) { paramyz.c(new rw(rv.x.H, 2400, 0));
/*    */     }
/* 34 */     if (paramadd.k() > 0) {
/* 35 */       if (!paramahb.E) {
/* 36 */         paramyz.c(new rw(rv.l.H, 600, 4));
/* 37 */         paramyz.c(new rw(rv.m.H, 6000, 0));
/* 38 */         paramyz.c(new rw(rv.n.H, 6000, 0));
/*    */       }
/*    */     } else {
/* 41 */       super.c(paramadd, paramahb, paramyz);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 47 */     paramList.add(new add(paramadb, 1, 0));
/* 48 */     paramList.add(new add(paramadb, 1, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */