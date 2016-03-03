/*    */ public class agg
/*    */   extends aft
/*    */ {
/*    */   protected agg(int paramInt1, int paramInt2, afu paramafu)
/*    */   {
/*  6 */     super(paramInt1, paramInt2, paramafu);
/*    */     
/*  8 */     if (paramafu == afu.h) {
/*  9 */       b("lootBonusDigger");
/* 10 */     } else if (paramafu == afu.i) {
/* 11 */       b("lootBonusFishing");
/*    */     } else {
/* 13 */       b("lootBonus");
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 19 */     return 15 + (paramInt - 1) * 9;
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 24 */     return super.a(paramInt) + 50;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 29 */     return 3;
/*    */   }
/*    */   
/*    */   public boolean a(aft paramaft)
/*    */   {
/* 34 */     return (super.a(paramaft)) && (paramaft.B != s.B);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */