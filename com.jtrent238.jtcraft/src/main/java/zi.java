/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zi
/*    */   extends ze
/*    */ {
/*    */   public zi(ahb paramahb)
/*    */   {
/* 15 */     super(paramahb);
/* 16 */     a(0.3125F, 0.3125F);
/*    */   }
/*    */   
/*    */   public zi(ahb paramahb, sv paramsv, double paramDouble1, double paramDouble2, double paramDouble3) {
/* 20 */     super(paramahb, paramsv, paramDouble1, paramDouble2, paramDouble3);
/*    */     
/* 22 */     a(0.3125F, 0.3125F);
/*    */   }
/*    */   
/*    */   public zi(ahb paramahb, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
/* 26 */     super(paramahb, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6);
/* 27 */     a(0.3125F, 0.3125F);
/*    */   }
/*    */   
/*    */   protected void a(azu paramazu)
/*    */   {
/* 32 */     if (!this.o.E) {
/* 33 */       if (paramazu.g != null) {
/* 34 */         if ((!paramazu.g.K()) && (paramazu.g.a(ro.a(this, this.a), 5.0F))) {
/* 35 */           paramazu.g.e(5);
/*    */         }
/*    */       } else {
/* 38 */         int i = paramazu.b;
/* 39 */         int j = paramazu.c;
/* 40 */         int k = paramazu.d;
/* 41 */         switch (paramazu.e) {
/*    */         case 1: 
/* 43 */           j++;
/* 44 */           break;
/*    */         case 0: 
/* 46 */           j--;
/* 47 */           break;
/*    */         case 2: 
/* 49 */           k--;
/* 50 */           break;
/*    */         case 3: 
/* 52 */           k++;
/* 53 */           break;
/*    */         case 5: 
/* 55 */           i++;
/* 56 */           break;
/*    */         case 4: 
/* 58 */           i--;
/*    */         }
/*    */         
/* 61 */         if (this.o.c(i, j, k)) {
/* 62 */           this.o.b(i, j, k, ajn.ab);
/*    */         }
/*    */       }
/* 65 */       B();
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean R()
/*    */   {
/* 71 */     return false;
/*    */   }
/*    */   
/*    */   public boolean a(ro paramro, float paramFloat)
/*    */   {
/* 76 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */