/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aaz
/*    */   extends zs
/*    */ {
/*    */   private apb a;
/*    */   
/*    */   public aaz(rb paramrb, apb paramapb)
/*    */   {
/* 17 */     this.a = paramapb;
/*    */     int j;
/* 19 */     for (int i = 0; i < 3; i++) {
/* 20 */       for (j = 0; j < 3; j++) {
/* 21 */         a(new aay(paramapb, j + i * 3, 62 + j * 18, 17 + i * 18));
/*    */       }
/*    */     }
/*    */     
/* 25 */     for (i = 0; i < 3; i++) {
/* 26 */       for (j = 0; j < 9; j++) {
/* 27 */         a(new aay(paramrb, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*    */       }
/*    */     }
/* 30 */     for (i = 0; i < 9; i++) {
/* 31 */       a(new aay(paramrb, i, 8 + i * 18, 142));
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz)
/*    */   {
/* 37 */     return this.a.a(paramyz);
/*    */   }
/*    */   
/*    */   public add b(yz paramyz, int paramInt)
/*    */   {
/* 42 */     add localadd1 = null;
/* 43 */     aay localaay = (aay)this.c.get(paramInt);
/* 44 */     if ((localaay != null) && (localaay.e())) {
/* 45 */       add localadd2 = localaay.d();
/* 46 */       localadd1 = localadd2.m();
/*    */       
/* 48 */       if (paramInt < 9) {
/* 49 */         if (!a(localadd2, 9, 45, true)) {
/* 50 */           return null;
/*    */         }
/*    */       }
/* 53 */       else if (!a(localadd2, 0, 9, false)) {
/* 54 */         return null;
/*    */       }
/*    */       
/* 57 */       if (localadd2.b == 0) {
/* 58 */         localaay.c(null);
/*    */       } else {
/* 60 */         localaay.f();
/*    */       }
/* 62 */       if (localadd2.b == localadd1.b)
/*    */       {
/* 64 */         return null;
/*    */       }
/* 66 */       localaay.a(paramyz, localadd2);
/*    */     }
/*    */     
/* 69 */     return localadd1;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aaz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */