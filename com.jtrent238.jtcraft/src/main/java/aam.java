/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aam
/*    */   extends zs
/*    */ {
/*    */   private rb a;
/*    */   private wi f;
/*    */   
/*    */   public aam(rb paramrb1, rb paramrb2, wi paramwi)
/*    */   {
/* 13 */     this.a = paramrb2;
/* 14 */     this.f = paramwi;
/* 15 */     int i = 3;
/* 16 */     paramrb2.f();
/*    */     
/* 18 */     int j = (i - 4) * 18;
/*    */     
/*    */ 
/* 21 */     a(new aan(this, paramrb2, 0, 8, 18));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 27 */     a(new aao(this, paramrb2, 1, 8, 36, paramwi));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     int m;
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 39 */     if (paramwi.ck()) {
/* 40 */       for (k = 0; k < i; k++) {
/* 41 */         for (m = 0; m < 5; m++) {
/* 42 */           a(new aay(paramrb2, 2 + m + k * 5, 80 + m * 18, 18 + k * 18));
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 47 */     for (int k = 0; k < 3; k++) {
/* 48 */       for (m = 0; m < 9; m++) {
/* 49 */         a(new aay(paramrb1, m + k * 9 + 9, 8 + m * 18, 102 + k * 18 + j));
/*    */       }
/*    */     }
/* 52 */     for (k = 0; k < 9; k++) {
/* 53 */       a(new aay(paramrb1, k, 8 + k * 18, 160 + j));
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 59 */     return (this.a.a(paramyz)) && (this.f.Z()) && (this.f.e(paramyz) < 8.0F);
/*    */   }
/*    */   
/*    */   public add b(yz paramyz, int paramInt)
/*    */   {
/* 64 */     add localadd1 = null;
/* 65 */     aay localaay = (aay)this.c.get(paramInt);
/* 66 */     if ((localaay != null) && (localaay.e())) {
/* 67 */       add localadd2 = localaay.d();
/* 68 */       localadd1 = localadd2.m();
/*    */       
/* 70 */       if (paramInt < this.a.a()) {
/* 71 */         if (!a(localadd2, this.a.a(), this.c.size(), true)) {
/* 72 */           return null;
/*    */         }
/*    */       }
/* 75 */       else if ((a(1).a(localadd2)) && (!a(1).e())) {
/* 76 */         if (!a(localadd2, 1, 2, false)) {
/* 77 */           return null;
/*    */         }
/* 79 */       } else if (a(0).a(localadd2)) {
/* 80 */         if (!a(localadd2, 0, 1, false)) {
/* 81 */           return null;
/*    */         }
/* 83 */       } else if ((this.a.a() <= 2) || (!a(localadd2, 2, this.a.a(), false))) {
/* 84 */         return null;
/*    */       }
/*    */       
/* 87 */       if (localadd2.b == 0) {
/* 88 */         localaay.c(null);
/*    */       } else {
/* 90 */         localaay.f();
/*    */       }
/*    */     }
/* 93 */     return localadd1;
/*    */   }
/*    */   
/*    */   public void b(yz paramyz)
/*    */   {
/* 98 */     super.b(paramyz);
/* 99 */     this.a.l_();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */