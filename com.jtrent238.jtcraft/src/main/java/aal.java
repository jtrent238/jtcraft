/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aal
/*    */   extends zs
/*    */ {
/*    */   private final rb a;
/*    */   
/*    */   public aal(yx paramyx, rb paramrb)
/*    */   {
/* 12 */     this.a = paramrb;
/* 13 */     paramrb.f();
/* 14 */     int i = 51;
/*    */     
/* 16 */     for (int j = 0; j < paramrb.a(); j++) {
/* 17 */       a(new aay(paramrb, j, 44 + j * 18, 20));
/*    */     }
/*    */     
/* 20 */     for (j = 0; j < 3; j++) {
/* 21 */       for (int k = 0; k < 9; k++) {
/* 22 */         a(new aay(paramyx, k + j * 9 + 9, 8 + k * 18, j * 18 + i));
/*    */       }
/*    */     }
/* 25 */     for (j = 0; j < 9; j++) {
/* 26 */       a(new aay(paramyx, j, 8 + j * 18, 58 + i));
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 32 */     return this.a.a(paramyz);
/*    */   }
/*    */   
/*    */   public add b(yz paramyz, int paramInt)
/*    */   {
/* 37 */     add localadd1 = null;
/* 38 */     aay localaay = (aay)this.c.get(paramInt);
/* 39 */     if ((localaay != null) && (localaay.e())) {
/* 40 */       add localadd2 = localaay.d();
/* 41 */       localadd1 = localadd2.m();
/*    */       
/* 43 */       if (paramInt < this.a.a()) {
/* 44 */         if (!a(localadd2, this.a.a(), this.c.size(), true)) {
/* 45 */           return null;
/*    */         }
/*    */       }
/* 48 */       else if (!a(localadd2, 0, this.a.a(), false)) {
/* 49 */         return null;
/*    */       }
/*    */       
/* 52 */       if (localadd2.b == 0) {
/* 53 */         localaay.c(null);
/*    */       } else {
/* 55 */         localaay.f();
/*    */       }
/*    */     }
/* 58 */     return localadd1;
/*    */   }
/*    */   
/*    */   public void b(yz paramyz)
/*    */   {
/* 63 */     super.b(paramyz);
/* 64 */     this.a.l_();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */