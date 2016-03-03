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
/*    */ public class alo
/*    */   extends aji
/*    */ {
/* 18 */   private static final String[] a = { "skin_brown", "skin_red" };
/*    */   
/*    */   private final int b;
/*    */   
/*    */   private rf[] M;
/*    */   private rf N;
/*    */   private rf O;
/*    */   
/*    */   public alo(awt paramawt, int paramInt)
/*    */   {
/* 28 */     super(paramawt);
/* 29 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 37 */     if ((paramInt2 == 10) && (paramInt1 > 1)) return this.N;
/* 38 */     if ((paramInt2 >= 1) && (paramInt2 <= 9) && (paramInt1 == 1)) return this.M[this.b];
/* 39 */     if ((paramInt2 >= 1) && (paramInt2 <= 3) && (paramInt1 == 2)) return this.M[this.b];
/* 40 */     if ((paramInt2 >= 7) && (paramInt2 <= 9) && (paramInt1 == 3)) { return this.M[this.b];
/*    */     }
/* 42 */     if (((paramInt2 == 1) || (paramInt2 == 4) || (paramInt2 == 7)) && (paramInt1 == 4)) return this.M[this.b];
/* 43 */     if (((paramInt2 == 3) || (paramInt2 == 6) || (paramInt2 == 9)) && (paramInt1 == 5)) { return this.M[this.b];
/*    */     }
/*    */     
/* 46 */     if (paramInt2 == 14) {
/* 47 */       return this.M[this.b];
/*    */     }
/* 49 */     if (paramInt2 == 15) {
/* 50 */       return this.N;
/*    */     }
/*    */     
/* 53 */     return this.O;
/*    */   }
/*    */   
/*    */   public int a(Random paramRandom)
/*    */   {
/* 58 */     int i = paramRandom.nextInt(10) - 7;
/* 59 */     if (i < 0) i = 0;
/* 60 */     return i;
/*    */   }
/*    */   
/*    */ 
/*    */   public adb a(int paramInt1, Random paramRandom, int paramInt2)
/*    */   {
/* 66 */     return adb.d(aji.b(ajn.P) + this.b);
/*    */   }
/*    */   
/*    */ 
/*    */   public adb d(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 72 */     return adb.d(aji.b(ajn.P) + this.b);
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 77 */     this.M = new rf[a.length];
/*    */     
/* 79 */     for (int i = 0; i < this.M.length; i++) {
/* 80 */       this.M[i] = paramrg.a(N() + "_" + a[i]);
/*    */     }
/*    */     
/* 83 */     this.O = paramrg.a(N() + "_" + "inside");
/* 84 */     this.N = paramrg.a(N() + "_" + "skin_stem");
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\alo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */