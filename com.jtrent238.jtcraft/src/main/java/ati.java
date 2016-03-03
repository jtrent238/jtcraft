/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ati
/*     */   extends ats
/*     */ {
/*     */   public ati() {}
/*     */   
/*     */   public ati(int paramInt1, Random paramRandom, asv paramasv, int paramInt2)
/*     */   {
/* 355 */     super(paramInt1);
/*     */     
/* 357 */     this.g = paramInt2;
/* 358 */     this.f = paramasv;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void a(avk paramavk, List paramList, Random paramRandom)
/*     */   {
/* 365 */     a((atw)paramavk, paramList, paramRandom, 1, 3, false);
/*     */   }
/*     */   
/*     */ 
/*     */   public static ati a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
/*     */   {
/* 371 */     asv localasv = asv.a(paramInt1, paramInt2, paramInt3, -1, -3, 0, 5, 10, 19, paramInt4);
/*     */     
/* 373 */     if ((!a(localasv)) || (avk.a(paramList, localasv) != null)) {
/* 374 */       return null;
/*     */     }
/*     */     
/* 377 */     return new ati(paramInt5, paramRandom, localasv, paramInt4);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public boolean a(ahb paramahb, Random paramRandom, asv paramasv)
/*     */   {
/* 384 */     a(paramahb, paramasv, 0, 3, 0, 4, 4, 18, ajn.bj, ajn.bj, false);
/*     */     
/* 386 */     a(paramahb, paramasv, 1, 5, 0, 3, 7, 18, ajn.a, ajn.a, false);
/*     */     
/*     */ 
/* 389 */     a(paramahb, paramasv, 0, 5, 0, 0, 5, 18, ajn.bj, ajn.bj, false);
/* 390 */     a(paramahb, paramasv, 4, 5, 0, 4, 5, 18, ajn.bj, ajn.bj, false);
/*     */     
/*     */ 
/* 393 */     a(paramahb, paramasv, 0, 2, 0, 4, 2, 5, ajn.bj, ajn.bj, false);
/* 394 */     a(paramahb, paramasv, 0, 2, 13, 4, 2, 18, ajn.bj, ajn.bj, false);
/* 395 */     a(paramahb, paramasv, 0, 0, 0, 4, 1, 3, ajn.bj, ajn.bj, false);
/* 396 */     a(paramahb, paramasv, 0, 0, 15, 4, 1, 18, ajn.bj, ajn.bj, false);
/*     */     
/* 398 */     for (int i = 0; i <= 4; i++) {
/* 399 */       for (int j = 0; j <= 2; j++) {
/* 400 */         b(paramahb, ajn.bj, 0, i, -1, j, paramasv);
/* 401 */         b(paramahb, ajn.bj, 0, i, -1, 18 - j, paramasv);
/*     */       }
/*     */     }
/*     */     
/* 405 */     a(paramahb, paramasv, 0, 1, 1, 0, 4, 1, ajn.bk, ajn.bk, false);
/* 406 */     a(paramahb, paramasv, 0, 3, 4, 0, 4, 4, ajn.bk, ajn.bk, false);
/* 407 */     a(paramahb, paramasv, 0, 3, 14, 0, 4, 14, ajn.bk, ajn.bk, false);
/* 408 */     a(paramahb, paramasv, 0, 1, 17, 0, 4, 17, ajn.bk, ajn.bk, false);
/* 409 */     a(paramahb, paramasv, 4, 1, 1, 4, 4, 1, ajn.bk, ajn.bk, false);
/* 410 */     a(paramahb, paramasv, 4, 3, 4, 4, 4, 4, ajn.bk, ajn.bk, false);
/* 411 */     a(paramahb, paramasv, 4, 3, 14, 4, 4, 14, ajn.bk, ajn.bk, false);
/* 412 */     a(paramahb, paramasv, 4, 1, 17, 4, 4, 17, ajn.bk, ajn.bk, false);
/*     */     
/* 414 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ati.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */