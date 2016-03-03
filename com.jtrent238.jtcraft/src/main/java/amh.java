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
/*    */ public class amh
/*    */   extends alt
/*    */ {
/* 17 */   public static final String[][] N = { { "leaves_acacia", "leaves_big_oak" }, { "leaves_acacia_opaque", "leaves_big_oak_opaque" } };
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 24 */   public static final String[] O = { "acacia", "big_oak" };
/*    */   
/*    */ 
/*    */ 
/*    */   protected void c(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*    */   {
/* 30 */     if (((paramInt4 & 0x3) == 1) && (paramahb.s.nextInt(paramInt5) == 0)) {
/* 31 */       a(paramahb, paramInt1, paramInt2, paramInt3, new add(ade.e, 1, 0));
/*    */     }
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 37 */     return super.a(paramInt) + 4;
/*    */   }
/*    */   
/*    */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 42 */     return paramahb.e(paramInt1, paramInt2, paramInt3) & 0x3;
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 47 */     if ((paramInt2 & 0x3) == 1) {
/* 48 */       return this.M[this.b][1];
/*    */     }
/* 50 */     return this.M[this.b][0];
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 55 */     paramList.add(new add(paramadb, 1, 0));
/* 56 */     paramList.add(new add(paramadb, 1, 1));
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 61 */     for (int i = 0; i < N.length; i++) {
/* 62 */       this.M[i] = new rf[N[i].length];
/*    */       
/* 64 */       for (int j = 0; j < N[i].length; j++) {
/* 65 */         this.M[i][j] = paramrg.a(N[i][j]);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public String[] e()
/*    */   {
/* 72 */     return O;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\amh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */