/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class aad
/*    */   extends zs
/*    */ {
/*    */   private rb a;
/*    */   private int f;
/*    */   
/*    */   public aad(rb paramrb1, rb paramrb2)
/*    */   {
/* 12 */     this.a = paramrb2;
/* 13 */     this.f = (paramrb2.a() / 9);
/* 14 */     paramrb2.f();
/*    */     
/* 16 */     int i = (this.f - 4) * 18;
/*    */     int k;
/* 18 */     for (int j = 0; j < this.f; j++) {
/* 19 */       for (k = 0; k < 9; k++) {
/* 20 */         a(new aay(paramrb2, k + j * 9, 8 + k * 18, 18 + j * 18));
/*    */       }
/*    */     }
/*    */     
/* 24 */     for (j = 0; j < 3; j++) {
/* 25 */       for (k = 0; k < 9; k++) {
/* 26 */         a(new aay(paramrb1, k + j * 9 + 9, 8 + k * 18, 103 + j * 18 + i));
/*    */       }
/*    */     }
/* 29 */     for (j = 0; j < 9; j++) {
/* 30 */       a(new aay(paramrb1, j, 8 + j * 18, 161 + i));
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 36 */     return this.a.a(paramyz);
/*    */   }
/*    */   
/*    */   public add b(yz paramyz, int paramInt)
/*    */   {
/* 41 */     add localadd1 = null;
/* 42 */     aay localaay = (aay)this.c.get(paramInt);
/* 43 */     if ((localaay != null) && (localaay.e())) {
/* 44 */       add localadd2 = localaay.d();
/* 45 */       localadd1 = localadd2.m();
/*    */       
/* 47 */       if (paramInt < this.f * 9) {
/* 48 */         if (!a(localadd2, this.f * 9, this.c.size(), true)) {
/* 49 */           return null;
/*    */         }
/*    */       }
/* 52 */       else if (!a(localadd2, 0, this.f * 9, false)) {
/* 53 */         return null;
/*    */       }
/*    */       
/* 56 */       if (localadd2.b == 0) {
/* 57 */         localaay.c(null);
/*    */       } else {
/* 59 */         localaay.f();
/*    */       }
/*    */     }
/* 62 */     return localadd1;
/*    */   }
/*    */   
/*    */   public void b(yz paramyz)
/*    */   {
/* 67 */     super.b(paramyz);
/* 68 */     this.a.l_();
/*    */   }
/*    */   
/*    */   public rb e() {
/* 72 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */