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
/*     */ class zw
/*     */   extends aay
/*     */ {
/*     */   zw(zu paramzu, rb paramrb, int paramInt1, int paramInt2, int paramInt3, ahb paramahb, int paramInt4, int paramInt5, int paramInt6)
/*     */   {
/*  61 */     super(paramrb, paramInt1, paramInt2, paramInt3);
/*     */   }
/*     */   
/*  64 */   public boolean a(add paramadd) { return false; }
/*     */   
/*     */ 
/*     */   public boolean a(yz paramyz)
/*     */   {
/*  69 */     return ((paramyz.bE.d) || (paramyz.bF >= this.e.a)) && (this.e.a > 0) && (e());
/*     */   }
/*     */   
/*     */   public void a(yz paramyz, add paramadd)
/*     */   {
/*  74 */     if (!paramyz.bE.d) paramyz.a(-this.e.a);
/*  75 */     zu.a(this.e).a(0, null);
/*  76 */     if (zu.b(this.e) > 0) {
/*  77 */       add localadd = zu.a(this.e).a(1);
/*  78 */       if ((localadd != null) && (localadd.b > zu.b(this.e))) {
/*  79 */         localadd.b -= zu.b(this.e);
/*  80 */         zu.a(this.e).a(1, localadd);
/*     */       } else {
/*  82 */         zu.a(this.e).a(1, null);
/*     */       }
/*     */     } else {
/*  85 */       zu.a(this.e).a(1, null);
/*     */     }
/*  87 */     this.e.a = 0;
/*     */     
/*  89 */     if ((!paramyz.bE.d) && (!this.a.E) && (this.a.a(this.b, this.c, this.d) == ajn.bQ) && (paramyz.aI().nextFloat() < 0.12F)) {
/*  90 */       int i = this.a.e(this.b, this.c, this.d);
/*  91 */       int j = i & 0x3;
/*  92 */       int k = i >> 2;
/*     */       
/*  94 */       k++; if (k > 2) {
/*  95 */         this.a.f(this.b, this.c, this.d);
/*  96 */         this.a.c(1020, this.b, this.c, this.d, 0);
/*     */       } else {
/*  98 */         this.a.a(this.b, this.c, this.d, j | k << 2, 2);
/*  99 */         this.a.c(1021, this.b, this.c, this.d, 0);
/*     */       }
/* 101 */     } else if (!this.a.E) {
/* 102 */       this.a.c(1021, this.b, this.c, this.d, 0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */