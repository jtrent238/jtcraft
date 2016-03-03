/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum adc
/*     */ {
/*     */   private final int f;
/*     */   private final int g;
/*     */   private final float h;
/*     */   private final float i;
/*     */   private final int j;
/*     */   
/*     */   private adc(int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, int paramInt4)
/*     */   {
/*  85 */     this.f = paramInt2;
/*  86 */     this.g = paramInt3;
/*  87 */     this.h = paramFloat1;
/*  88 */     this.i = paramFloat2;
/*  89 */     this.j = paramInt4;
/*     */   }
/*     */   
/*     */   public int a() {
/*  93 */     return this.g;
/*     */   }
/*     */   
/*     */   public float b() {
/*  97 */     return this.h;
/*     */   }
/*     */   
/*     */   public float c() {
/* 101 */     return this.i;
/*     */   }
/*     */   
/*     */   public int d() {
/* 105 */     return this.f;
/*     */   }
/*     */   
/*     */   public int e() {
/* 109 */     return this.j;
/*     */   }
/*     */   
/*     */   public adb f() {
/* 113 */     if (this == a)
/* 114 */       return adb.a(ajn.f);
/* 115 */     if (this == b)
/* 116 */       return adb.a(ajn.e);
/* 117 */     if (this == e)
/* 118 */       return ade.k;
/* 119 */     if (this == c)
/* 120 */       return ade.j;
/* 121 */     if (this == d) {
/* 122 */       return ade.i;
/*     */     }
/* 124 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */