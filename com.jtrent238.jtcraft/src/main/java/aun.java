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
/*     */ 
/*     */ public class aun
/*     */   extends avc
/*     */ {
/*     */   private int a;
/*     */   
/*     */   public aun() {}
/*     */   
/*     */   public aun(int paramInt1, Random paramRandom, asv paramasv, int paramInt2)
/*     */   {
/* 358 */     super(paramInt1);
/*     */     
/* 360 */     this.g = paramInt2;
/* 361 */     this.f = paramasv;
/* 362 */     this.a = ((paramInt2 == 2) || (paramInt2 == 0) ? paramasv.d() : paramasv.b());
/*     */   }
/*     */   
/*     */   protected void a(dh paramdh)
/*     */   {
/* 367 */     super.a(paramdh);
/* 368 */     paramdh.a("Steps", this.a);
/*     */   }
/*     */   
/*     */   protected void b(dh paramdh)
/*     */   {
/* 373 */     super.b(paramdh);
/* 374 */     this.a = paramdh.f("Steps");
/*     */   }
/*     */   
/*     */   public static asv a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*     */   {
/* 379 */     int i = 3;
/*     */     
/* 381 */     asv localasv = asv.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, 4, paramInt4);
/*     */     
/* 383 */     avk localavk = avk.a(paramList, localasv);
/* 384 */     if (localavk == null)
/*     */     {
/* 386 */       return null;
/*     */     }
/*     */     
/* 389 */     if (localavk.c().b == localasv.b)
/*     */     {
/* 391 */       for (int j = 3; j >= 1; j--) {
/* 392 */         localasv = asv.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, j - 1, paramInt4);
/* 393 */         if (!localavk.c().a(localasv))
/*     */         {
/*     */ 
/* 396 */           return asv.a(paramInt1, paramInt2, paramInt3, -1, -1, 0, 5, 5, j, paramInt4);
/*     */         }
/*     */       }
/*     */     }
/*     */     
/* 401 */     return null;
/*     */   }
/*     */   
/*     */   public boolean a(ahb paramahb, Random paramRandom, asv paramasv)
/*     */   {
/* 406 */     if (a(paramahb, paramasv)) {
/* 407 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 411 */     for (int i = 0; i < this.a; i++)
/*     */     {
/* 413 */       a(paramahb, ajn.aV, 0, 0, 0, i, paramasv);
/* 414 */       a(paramahb, ajn.aV, 0, 1, 0, i, paramasv);
/* 415 */       a(paramahb, ajn.aV, 0, 2, 0, i, paramasv);
/* 416 */       a(paramahb, ajn.aV, 0, 3, 0, i, paramasv);
/* 417 */       a(paramahb, ajn.aV, 0, 4, 0, i, paramasv);
/*     */       
/* 419 */       for (int j = 1; j <= 3; j++) {
/* 420 */         a(paramahb, ajn.aV, 0, 0, j, i, paramasv);
/* 421 */         a(paramahb, ajn.a, 0, 1, j, i, paramasv);
/* 422 */         a(paramahb, ajn.a, 0, 2, j, i, paramasv);
/* 423 */         a(paramahb, ajn.a, 0, 3, j, i, paramasv);
/* 424 */         a(paramahb, ajn.aV, 0, 4, j, i, paramasv);
/*     */       }
/*     */       
/* 427 */       a(paramahb, ajn.aV, 0, 0, 4, i, paramasv);
/* 428 */       a(paramahb, ajn.aV, 0, 1, 4, i, paramasv);
/* 429 */       a(paramahb, ajn.aV, 0, 2, 4, i, paramasv);
/* 430 */       a(paramahb, ajn.aV, 0, 3, 4, i, paramasv);
/* 431 */       a(paramahb, ajn.aV, 0, 4, 4, i, paramasv);
/*     */     }
/*     */     
/* 434 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */