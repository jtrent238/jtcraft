/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class amr
/*    */   extends akf
/*    */ {
/*    */   private rf[] a;
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 13 */     if (paramInt2 < 7) {
/* 14 */       if (paramInt2 == 6) {
/* 15 */         paramInt2 = 5;
/*    */       }
/* 17 */       return this.a[(paramInt2 >> 1)];
/*    */     }
/* 19 */     return this.a[3];
/*    */   }
/*    */   
/*    */ 
/*    */   protected adb i()
/*    */   {
/* 25 */     return ade.bG;
/*    */   }
/*    */   
/*    */   protected adb P()
/*    */   {
/* 30 */     return ade.bG;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
/*    */   {
/* 35 */     super.a(paramahb, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramInt5);
/*    */     
/* 37 */     if (paramahb.E) {
/* 38 */       return;
/*    */     }
/* 40 */     if ((paramInt4 >= 7) && 
/* 41 */       (paramahb.s.nextInt(50) == 0)) {
/* 42 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.bI));
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   public void a(rg paramrg)
/*    */   {
/* 49 */     this.a = new rf[4];
/*    */     
/* 51 */     for (int i = 0; i < this.a.length; i++) {
/* 52 */       this.a[i] = paramrg.a(N() + "_stage_" + i);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */