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
/*    */ public abstract class ang
/*    */   extends aji
/*    */ {
/*    */   protected rf N;
/*    */   
/*    */   protected ang(awt paramawt)
/*    */   {
/* 21 */     super(paramawt);
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 26 */     return 31;
/*    */   }
/*    */   
/*    */   public int a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt5)
/*    */   {
/* 31 */     int i = paramInt5 & 0x3;
/* 32 */     int j = 0;
/*    */     
/* 34 */     switch (paramInt4) {
/*    */     case 2: 
/*    */     case 3: 
/* 37 */       j = 8;
/* 38 */       break;
/*    */     case 4: 
/*    */     case 5: 
/* 41 */       j = 4;
/* 42 */       break;
/*    */     case 0: 
/*    */     case 1: 
/* 45 */       j = 0;
/*    */     }
/*    */     
/*    */     
/* 49 */     return i | j;
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 54 */     int i = paramInt2 & 0xC;
/* 55 */     int j = paramInt2 & 0x3;
/*    */     
/* 57 */     if ((i == 0) && ((paramInt1 == 1) || (paramInt1 == 0)))
/* 58 */       return d(j);
/* 59 */     if ((i == 4) && ((paramInt1 == 5) || (paramInt1 == 4)))
/* 60 */       return d(j);
/* 61 */     if ((i == 8) && ((paramInt1 == 2) || (paramInt1 == 3))) {
/* 62 */       return d(j);
/*    */     }
/*    */     
/* 65 */     return b(j);
/*    */   }
/*    */   
/*    */   protected abstract rf b(int paramInt);
/*    */   
/*    */   protected rf d(int paramInt) {
/* 71 */     return this.N;
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 76 */     return paramInt & 0x3;
/*    */   }
/*    */   
/*    */   public int k(int paramInt) {
/* 80 */     return paramInt & 0x3;
/*    */   }
/*    */   
/*    */   protected add j(int paramInt)
/*    */   {
/* 85 */     return new add(adb.a(this), 1, k(paramInt));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ang.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */