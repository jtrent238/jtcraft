/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amj
/*    */   extends ajc
/*    */ {
/*    */   public amj()
/*    */   {
/* 11 */     super(awt.d);
/* 12 */     a(abt.d);
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 18 */     boolean bool = paramahb.v(paramInt1, paramInt2, paramInt3);
/* 19 */     apl localapl = (apl)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 20 */     if ((localapl != null) && (localapl.i != bool)) {
/* 21 */       if (bool) {
/* 22 */         localapl.a(paramahb, paramInt1, paramInt2, paramInt3);
/*    */       }
/* 24 */       localapl.i = bool;
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 31 */     if (paramahb.E) return true;
/* 32 */     apl localapl = (apl)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 33 */     if (localapl != null) {
/* 34 */       localapl.a();
/* 35 */       localapl.a(paramahb, paramInt1, paramInt2, paramInt3);
/*    */     }
/* 37 */     return true;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, yz paramyz)
/*    */   {
/* 42 */     if (paramahb.E) return;
/* 43 */     apl localapl = (apl)paramahb.o(paramInt1, paramInt2, paramInt3);
/* 44 */     if (localapl != null) localapl.a(paramahb, paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public aor a(ahb paramahb, int paramInt)
/*    */   {
/* 49 */     return new apl();
/*    */   }
/*    */   
/*    */   public boolean a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 54 */     float f = (float)Math.pow(2.0D, (paramInt5 - 12) / 12.0D);
/*    */     
/* 56 */     String str = "harp";
/* 57 */     if (paramInt4 == 1) str = "bd";
/* 58 */     if (paramInt4 == 2) str = "snare";
/* 59 */     if (paramInt4 == 3) str = "hat";
/* 60 */     if (paramInt4 == 4) { str = "bassattack";
/*    */     }
/* 62 */     paramahb.a(paramInt1 + 0.5D, paramInt2 + 0.5D, paramInt3 + 0.5D, "note." + str, 3.0F, f);
/* 63 */     paramahb.a("note", paramInt1 + 0.5D, paramInt2 + 1.2D, paramInt3 + 0.5D, paramInt5 / 24.0D, 0.0D, 0.0D);
/* 64 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */