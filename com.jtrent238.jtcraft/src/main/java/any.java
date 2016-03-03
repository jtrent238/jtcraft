/*    */ import java.util.List;
/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class any
/*    */   extends alj
/*    */ {
/* 20 */   public static final String[] b = { "stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz" };
/*    */   
/*    */   private rf M;
/*    */   
/*    */ 
/*    */   public any(boolean paramBoolean)
/*    */   {
/* 27 */     super(paramBoolean, awt.e);
/* 28 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 33 */     int i = paramInt2 & 0x7;
/* 34 */     if ((this.a) && ((paramInt2 & 0x8) != 0)) {
/* 35 */       paramInt1 = 1;
/*    */     }
/* 37 */     if (i == 0) {
/* 38 */       if ((paramInt1 == 1) || (paramInt1 == 0)) return this.L;
/* 39 */       return this.M; }
/* 40 */     if (i == 1)
/* 41 */       return ajn.A.h(paramInt1);
/* 42 */     if (i == 2) return ajn.f.h(paramInt1);
/* 43 */     if (i == 3)
/* 44 */       return ajn.e.h(paramInt1);
/* 45 */     if (i == 4)
/* 46 */       return ajn.V.h(paramInt1);
/* 47 */     if (i == 5)
/* 48 */       return ajn.aV.a(paramInt1, 0);
/* 49 */     if (i == 6)
/* 50 */       return ajn.bj.h(1);
/* 51 */     if (i == 7) {
/* 52 */       return ajn.ca.h(paramInt1);
/*    */     }
/*    */     
/* 55 */     return this.L;
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 60 */     this.L = paramrg.a("stone_slab_top");
/* 61 */     this.M = paramrg.a("stone_slab_side");
/*    */   }
/*    */   
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 66 */     return adb.a(ajn.U);
/*    */   }
/*    */   
/*    */   protected add j(int paramInt)
/*    */   {
/* 71 */     return new add(adb.a(ajn.U), 2, paramInt & 0x7);
/*    */   }
/*    */   
/*    */   public String b(int paramInt)
/*    */   {
/* 76 */     if ((paramInt < 0) || (paramInt >= b.length)) {
/* 77 */       paramInt = 0;
/*    */     }
/* 79 */     return super.a() + "." + b[paramInt];
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 84 */     if (paramadb == adb.a(ajn.T)) { return;
/*    */     }
/* 86 */     for (int i = 0; i <= 7; i++) {
/* 87 */       if (i != 2) {
/* 88 */         paramList.add(new add(paramadb, 1, i));
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\any.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */