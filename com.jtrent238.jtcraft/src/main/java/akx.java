/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class akx
/*    */   extends aji
/*    */ {
/*    */   public static boolean M;
/*    */   
/*    */   public akx()
/*    */   {
/* 14 */     super(awt.p);
/* 15 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public akx(awt paramawt) {
/* 19 */     super(paramawt);
/*    */   }
/*    */   
/*    */   public void b(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 24 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, aji paramaji)
/*    */   {
/* 29 */     paramahb.a(paramInt1, paramInt2, paramInt3, this, a(paramahb));
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, Random paramRandom)
/*    */   {
/* 34 */     if (!paramahb.E) {
/* 35 */       m(paramahb, paramInt1, paramInt2, paramInt3);
/*    */     }
/*    */   }
/*    */   
/*    */   private void m(ahb paramahb, int paramInt1, int paramInt2, int paramInt3) {
/* 40 */     int i = paramInt1;
/* 41 */     int j = paramInt2;
/* 42 */     int k = paramInt3;
/* 43 */     if ((e(paramahb, i, j - 1, k)) && (j >= 0)) {
/* 44 */       int m = 32;
/* 45 */       if ((M) || (!paramahb.b(paramInt1 - m, paramInt2 - m, paramInt3 - m, paramInt1 + m, paramInt2 + m, paramInt3 + m))) {
/* 46 */         paramahb.f(paramInt1, paramInt2, paramInt3);
/* 47 */         while ((e(paramahb, paramInt1, paramInt2 - 1, paramInt3)) && (paramInt2 > 0))
/* 48 */           paramInt2--;
/* 49 */         if (paramInt2 > 0) {
/* 50 */           paramahb.b(paramInt1, paramInt2, paramInt3, this);
/*    */         }
/* 52 */       } else if (!paramahb.E) {
/* 53 */         xj localxj = new xj(paramahb, paramInt1 + 0.5F, paramInt2 + 0.5F, paramInt3 + 0.5F, this, paramahb.e(paramInt1, paramInt2, paramInt3));
/* 54 */         a(localxj);
/* 55 */         paramahb.d(localxj);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   protected void a(xj paramxj) {}
/*    */   
/*    */   public int a(ahb paramahb)
/*    */   {
/* 65 */     return 2;
/*    */   }
/*    */   
/*    */   public static boolean e(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 70 */     aji localaji = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 71 */     if (localaji.J == awt.a) return true;
/* 72 */     if (localaji == ajn.ab) return true;
/* 73 */     awt localawt = localaji.J;
/* 74 */     if (localawt == awt.h) return true;
/* 75 */     if (localawt == awt.i) return true;
/* 76 */     return false;
/*    */   }
/*    */   
/*    */   public void a(ahb paramahb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */